import de.hybris.platform.cronjob.model.CronJobModel
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery
import de.hybris.platform.servicelayer.search.SearchResult
import java.time.Duration

def query = """
    SELECT {job.pk} 
    FROM {ImpExImportCronJob AS job} 
    WHERE {job.creationtime} >= '2025-07-28 00:00:00'
"""

def fsq = new FlexibleSearchQuery(query)
SearchResult<CronJobModel> result = flexibleSearchService.search(fsq)

def totalMillis = 0L
def mediaCount = 0
def jobCount = 0

result.result.each { job ->
    if (job.startTime && job.endTime) {
        def duration = Duration.between(job.startTime.toInstant(), job.endTime.toInstant())
        def durationMillis = duration.toMillis()
        def durationSeconds = (long)(durationMillis / 1000)
        def hours = durationSeconds.intdiv(3600)
        def minutes = (durationSeconds % 3600).intdiv(60)
        def seconds = durationSeconds % 60

        def mediaCollection = job.externalDataCollection
        if (mediaCollection) {
            mediaCollection.each { media ->
                def code = media.code
                def matcher = code =~ /-(.*?).csv/
                if (matcher.find()) {
                    def type = matcher.group(1)
                    println "${job.pk} ${type} → Time taken: ${hours}h ${minutes}m ${seconds}s"
                    mediaCount++
                } else {
                    println "Unrecognized media code format: ${code}"
                }
            }
        }

        totalMillis += durationMillis // ✅ Add only once per job
        jobCount++
    } else {
        println "Skipping job ${job.code} - missing startTime or endTime"
    }
}

// Summary
def totalSeconds = (long)(totalMillis / 1000)
def totalHours = totalSeconds.intdiv(3600)
def totalMinutes = (totalSeconds % 3600).intdiv(60)
def totalRemainingSeconds = totalSeconds % 60

println "\nTotal execution time for ${jobCount} cron jobs (${mediaCount} media files): ${totalHours}h ${totalMinutes}m ${totalRemainingSeconds}s"

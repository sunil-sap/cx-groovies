UPDATE u
SET
    p_uid = CONCAT('fake-uid', v.rand1, v.rand2, '@anonmail.com'),
    p_name = 'Anonymized User',
    p_originaluid = CONCAT('fake-uid', v.rand1, v.rand2, '@anonmail.com'),
    p_customerid = CONCAT('fake-uid', v.rand1, v.rand2, '@anonmail.com'),
    p_undecoratedUid = CONCAT('fake-uid', v.rand1, v.rand2, '@anonmail.com'),
    p_description = 'Anonymized Description',
    p_passwordencoding = 'plaintext',
    passwd = 'FakeP@ssword123456'
FROM users u
CROSS APPLY (
    SELECT ABS(CHECKSUM(NEWID()) % 10000000000) AS rand1,
           ABS(CHECKSUM(NEWID()) % 100) AS rand2
) v
WHERE TypePKString IN (
    SELECT CAST(pk AS VARCHAR(255))
    FROM composedtypes
    WHERE InternalCode = 'Customer'
)
AND p_uid NOT IN ('admin', 'anonymous');
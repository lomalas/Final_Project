SELECT * FROM CHARACTER;
INSERT INTO CHARACTER VALUES ('123456789', 'KETH', 4, 0,45, 45, 21, 2, 'Lawful Good');
INSERT INTO CHARACTER VALUES ('012345678', 'VERDRA', 11, 0, 89, 87, 18, 4,'Chaotic Evil');
INSERT INTO CHARACTER VALUES ('000000000', 'CYRUS', 7, 0, 54, 34, 14, 3, 'Nutral Good');
INSERT INTO CHARACTER VALUES ('000000001', 'AKAI', 4, 0, 40, 40, 21, 5, 'Lawful Evil');

SELECT * FROM CHARACTER
WHERE Level = 4;

DELETE FROM CHARACTER WHERE LEVEL = 4 AND ALIGNMENT = 'Chaotic Evil';

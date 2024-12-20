DROP TABLE IF EXISTS CHARACTER;

CREATE TABLE CHARACTER
(
    CHAR_ID VARCHAR(30) NOT NULL CONSTRAINT PK_CHARACTER_ID PRIMARY KEY,
    CHAR_NAME VARCHAR(99) NOT NULL DEFAULT 'Gary Gygax',
    CHAR_LEVEL INT NOT NULL CONSTRAINT CK_CHARACTER_TOTAL_LEVEL CHECK (CHAR_LEVEL > 0 AND CHAR_LEVEL <= 20) DEFAULT 1,
    EXP INT NOT NULL CONSTRAINT CK_CHARACTER_EXP CHECK (EXP >= 0) DEFAULT 0,
    HITPOINTS INT NOT NULL CONSTRAINT CK_CHARACTER_HITPOINTS CHECK (HITPOINTS >= 0) DEFAULT 0,
    CURRENT_HITPOINTS INT NOT NULL CONSTRAINT CK_CHARACTER_CUR_HITPOINTS CHECK (CURRENT_HITPOINTS >= 0),
    ARMOR_CLASS INT NOT NULL CONSTRAINT CK_CHARACTER_AC CHECK (ARMOR_CLASS >= 0) DEFAULT 10,
    PROFICENCYBONUS INT NOT NULL CONSTRAINT CK_CHARACTER_PROF_BNS CHECK (PROFICENCYBONUS >= 2 AND PROFICENCYBONUS <= 6) DEFAULT 2,
    ALIGNMENT VARCHAR(30) NOT NULL,
);

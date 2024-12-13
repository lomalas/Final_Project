DROP TABLE IF EXISTS STATISTIC;

CREATE TABLE STATISTIC (
    CHAR_ID VARCHAR(30) NOT NULL,  -- Foreign key from the CHARACTER table
    STRENGTH INT CHECK (STRENGTH >= 0 AND STRENGTH <= 30) NOT NULL,
    DEXTERITY INT CHECK (DEXTERITY >= 0 AND DEXTERITY <= 30) NOT NULL,
    CONSTITUTION INT CHECK (CONSTITUTION >= 0 AND CONSTITUTION <= 30) NOT NULL,
    INTELLIGENCE INT CHECK (INTELLIGENCE >= 0 AND INTELLIGENCE <= 30) NOT NULL,
    WISDOM INT CHECK (WISDOM >= 0 AND WISDOM <= 30) NOT NULL,
    CHARISMA INT CHECK (CHARISMA >= 0 AND CHARISMA <= 30) NOT NULL,

    STR_MODIFIER INT NOT NULL,
    DEX_MODIFIER INT NOT NULL,
    CON_MODIFIER INT NOT NULL,
    INT_MODIFIER INT NOT NULL,
    WIS_MODIFIER INT NOT NULL,
    CHAR_MODIFIER INT NOT NULL,

    CONSTRAINT FK_STATISTIC_CHAR FOREIGN KEY (CHAR_ID) REFERENCES CHARACTER(CHAR_ID)
);

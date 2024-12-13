DROP TABLE IF EXISTS CLASS;

CREATE TABLE CLASS (
    CLASS_ID INT IDENTITY(1,1) PRIMARY KEY,             -- Unique identifier for each class
    NAME VARCHAR(100) NOT NULL,                         -- Name of the class (e.g., Wizard, Fighter)
    HITDICE VARCHAR(10) NOT NULL,                       -- Hit dice (e.g., "1d8", "1d10", etc.)
    PRIMARY_ABILITY_SCORES VARCHAR(100) NOT NULL,       -- Primary ability scores (e.g., "Strength, Dexterity")
    SAVE_PROFICIENCIES VARCHAR(255) NOT NULL,           -- Save proficiencies (e.g., "Strength, Constitution")
    STARTING_PROFICIENCIES TEXT NOT NULL,               -- Starting proficiencies (e.g., weapons, armor, skills)
    LEVELS INT  -- Number of levels in the class (e.g., 20)
);

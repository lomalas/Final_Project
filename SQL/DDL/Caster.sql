DROP TABLE IF EXISTS CASTER;

CREATE TABLE CASTER (
    CASTER_ID INT IDENTITY(1,1) PRIMARY KEY,  -- Unique identifier for each caster entry
    CLASS_ID INT NOT NULL,                    -- Foreign key to the CLASS table
    TYPE VARCHAR(50) NOT NULL,               -- Type of caster (e.g., Full, Half, Third, None)
    SPELL_SLOTS VARCHAR(50) NOT NULL,         -- Available spell slots in the format '4/3/2/1'
    SPELLS_KNOWN INT,                         -- Number of spells known by the caster
    PREPARED_SPELLS INT,                      -- Number of spells the caster can prepare
    SPELL_ATTACK VARCHAR(50),                 -- The spell attack attribute, e.g., "INT + Proficiency"
    FOREIGN KEY (CLASS_ID) REFERENCES CLASS(CLASS_ID)  -- Relationship to CLASS table
);

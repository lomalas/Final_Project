DROP TABLE IF EXISTS SUBCLASS;

CREATE TABLE SUBCLASS (
    SUBCLASS_ID INT IDENTITY(1,1) PRIMARY KEY,        -- Unique identifier for each subclass
    CLASS_ID INT NOT NULL,                             -- Foreign key to the CLASS table
    SUBCLASS_NAME VARCHAR(100) NOT NULL,               -- Name of the subclass (e.g., "Battle Master", "Necromancy")
    DESCRIPTION TEXT NOT NULL,                        -- Description of the subclass
    LEVEL_REQUIREMENTS VARCHAR(100) NOT NULL,          -- Level requirements to take this subclass (e.g., "Level 3", "Level 6")
    SUBCLASS_FEATURES TEXT NOT NULL,                    -- List of subclass features (e.g., "Combat Superiority", "Undead Thralls")
    FOREIGN KEY (CLASS_ID) REFERENCES CLASS(CLASS_ID)   -- Foreign key to the CLASS table
);

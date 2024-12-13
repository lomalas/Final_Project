DROP TABLE IF EXISTS SPELL;

CREATE TABLE SPELL (
    SPELL_ID INT IDENTITY(1,1) PRIMARY KEY, -- Unique identifier for each spell
    SPELL_NAME VARCHAR(100) NOT NULL,       -- Name of the spell
    SPELL_LEVEL INT NOT NULL,              -- Level of the spell (e.g., 1, 2, 3...)
    SCHOOL VARCHAR(50) NOT NULL,          -- School of magic (e.g., Evocation, Necromancy)
    CASTING_TIME VARCHAR(50) NOT NULL,     -- Time required to cast the spell
    RANGE VARCHAR(50) NOT NULL,           -- Range of the spell (e.g., 30 feet, Touch)
    COMPONENTS VARCHAR(255) NOT NULL,     -- Spell components (e.g., V, S, M)
    DURATION VARCHAR(50) NOT NULL,        -- Duration of the spell (e.g., Instantaneous, Concentration)
    DAMAGE VARCHAR(50),                   -- Damage dealt by the spell, if applicable
    EFFECT TEXT NOT NULL,                 -- Description of the spell's effect
    LEVEL_REQUIREMENTS VARCHAR(50)         -- Minimum level required to cast the spell
);

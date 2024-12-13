DROP TABLE IF EXISTS INVENTORY;

CREATE TABLE INVENTORY (
    INVENTORY_ID INT IDENTITY(1,1) PRIMARY KEY,        -- Unique identifier for the inventory
    CHAR_ID VARCHAR(30) NOT NULL,                       -- Foreign key to link inventory with a character
    GOLD INT NOT NULL DEFAULT 0,                        -- Amount of gold the character has
    ATTUNEMENT_SLOTS INT NOT NULL DEFAULT 3,            -- Total number of attunement slots available
    USED_ATTUNEMENT_SLOTS INT NOT NULL DEFAULT 0,       -- Number of attunement slots currently used
    CONSTRAINT CK_ATTUNEMENT_SLOTS CHECK (USED_ATTUNEMENT_SLOTS <= ATTUNEMENT_SLOTS), -- Prevent overuse of attunement slots
    FOREIGN KEY (CHAR_ID) REFERENCES CHARACTER(CHAR_ID) -- Link to the character's ID
);

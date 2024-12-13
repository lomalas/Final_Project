DROP TABLE IF EXISTS ITEM;

CREATE TABLE ITEM (
    ITEM_ID INT IDENTITY(1,1) PRIMARY KEY,           -- Unique identifier for each item
    ITEM_NAME VARCHAR(100) NOT NULL,                       -- Name of the item (primary key)
    WEIGHT DECIMAL(5,2) NOT NULL,                     -- Weight of the item
    RARITY VARCHAR(50) NOT NULL,                      -- Rarity of the item
    TYPE VARCHAR(50) NOT NULL,                        -- Type of the item (e.g., weapon, armor, etc.)
    VALUE INT NOT NULL,                               -- Value of the item in gold or equivalent
    EFFECT TEXT,                                      -- Description of the item's effect
    ATTUNEMENT VARCHAR(3) NULL,                       -- Whether the item requires attunement ('Yes', 'No', or NULL)
    QUANTITY INT NOT NULL DEFAULT 1,                  -- Quantity of the item (in case the player has multiples)
    MAGIC VARCHAR(3) NULL,                            -- Whether the item is magical ('Yes', 'No', or NULL)
    DESCRIPTION TEXT NOT NULL                         -- Detailed description of the item
);

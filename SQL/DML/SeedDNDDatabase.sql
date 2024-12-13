-- Insert data into CAMPAIGN
INSERT INTO CAMPAIGN VALUES (00001, 'Athercorss', '08/15/2023', '12/15/2024', 'A D&D campaign follows a group of adventurers in a vibrant fantasy world, guided by a Dungeon Master (DM) who weaves the story. The players embody unique characters with their own skills, backstories, and goals. Together, they embark on quests, battling monsters, solving puzzles, and making choices that shape the narrative. Campaigns can range from uncovering ancient mysteries in forgotten ruins, thwarting a villains apocalyptic plans, or navigating political intrigue in a sprawling city. Every decision carries consequences, and the story evolves through teamwork, creativity, and the roll of the dice. The journey is epic, unpredictable, and fueled by imagination.');
INSERT INTO CAMPAIGN VALUES (00002, 'Etherios', '11/24/2021', '12/15/2024', '600 years ago the Gods disappeared from the world of Etherios, and the world descended into chaos. Demons erupted from the ground in Rilith. Undead took over the continent of Calthrope, and abominations started to appear across the world. Monsters ransacking villages in the dead of night. Orc tribes growing in strength, and seizing the land of entire nations. Dragons razing the land, and brazenly taking over hundreds of miles of land. The world formerly structured was suddenly thrust into chaos.');

GO

-- Inserting data into the ATTRACTION table with attraction names from theme parks

-- Insert data into PLAYER
INSERT INTO PLAYER VALUES (00001, 'Ailomalas', 'Nathan Dunifer', 'Dungeon Master');
INSERT INTO PLAYER VALUES (00002, 'Meterias', 'Dimitri', 'Player Character');
INSERT INTO PLAYER VALUES (00003, 'Kale-B', 'Kaleb', 'Player Character');

GO

-- Inserting records into ATTRACTIONHISTORY table
-- Insert data into PLAYER_CHARACTER
INSERT INTO CHARACTER VALUES ('123456789', 'KETH', 4, 0,45, 45, 21, 2, 'Lawful Good');
INSERT INTO CHARACTER VALUES ('012345678', 'VERDRA', 11, 0, 89, 87, 18, 4,'Chaotic Evil');
INSERT INTO CHARACTER VALUES ('000000000', 'CYRUS', 7, 0, 54, 34, 14, 3, 'Nutral Good');
INSERT INTO CHARACTER VALUES ('000000001', 'AKAI', 4, 0, 40, 40, 21, 5, 'Lawful Evil');
INSERT INTO CHARACTER VALUES ('000000002', 'ALAIOUS', 20, 0, 141, 141, 23, 6, 'Neutral Neutral');

GO

-- Inserting records into RESTRICTION table
INSERT INTO STATISTIC (CHAR_ID, STRENGTH, DEXTERITY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA, STR_MODIFIER, DEX_MODIFIER, CON_MODIFIER, INT_MODIFIER, WIS_MODIFIER, CHAR_MODIFIER)
VALUES
('123456789', 15, 14, 16, 13, 12, 8, 2, 2, 3, 1, 1, -1),
('012345678', 18, 16, 14, 12, 10, 14, 4, 3, 2, 1, 0, 2),
('000000000', 10, 12, 13, 15, 14, 9, 0, 1, 2, 2, 2, 0),
('000000001', 16, 10, 15, 11, 13, 7, 3, 1, 2, 0, 1, -2),
('000000002', 20, 18, 18, 17, 19, 15, 5, 4, 3, 3, 2, 3);

GO

-- Insert sample data into the SKILL table
INSERT INTO SKILL (SKILL_NAME, RELATED_ABILITY_SCORE, PROFICIENCY_LEVEL, MODIFIER, TOTAL_BONUS, CHAR_ID)
VALUES
('Athletics', 'Strength', 'Proficient', 2, 5, '123456789'),
('Acrobatics', 'Dexterity', 'Expertise', 3, 8, '012345678'),
('Insight', 'Wisdom', 'Proficient', 1, 4, '000000000'),
('Deception', 'Charisma', 'Proficient', -1, 3, '000000001'),
('Arcana', 'Intelligence', NULL, 1, 2, '000000002'),
('Stealth', 'Dexterity', 'Proficient', 2, 4, '123456789'),
('Sleight of Hand', 'Dexterity', 'Proficient', 2, 4, '123456789'),
('History', 'Intelligence', 'Proficient', 1, 2, '000000000'),
('Persuasion', 'Charisma', 'Proficient', 3, 6, '000000002'),
('Religion', 'Intelligence', 'Proficient', 1, 2, '000000001');

GO

-- Insert data into SPECIES
INSERT INTO SPECIES VALUES ('Reborn', 'Medium', 30, 'Reborn suffer from some manner of discontinuity, an interruption of their lives or physical state that their minds are ill equipped to deal with. Their memories of events before this interruption are often vague or absent. Occasionally, the most unexpected experiences might cause sensations or visions of the past to come rushing back. Rather than sleeping, reborn regularly sit and dwell on the past, hoping for some revelation of what came before. Most of the time, these are dark, silent stretches. Occasionally, though, in a moment of peace, stress, or excitement, a reborn gains a glimpse of what came before. When you desire to have such a dreamlike vision, roll on the Lost Memories table to inspire its details.');
INSERT INTO SPECIES VALUES ('Human', 'Medium', 30, 'In the reckonings of most worlds, humans are the youngest of the common races, late to arrive on the world scene and short-lived in comparison to dwarves, elves, and dragons. Perhaps it is because of their shorter lives that they strive to achieve as much as they can in the years they are given. Or maybe they feel they have something to prove to the elder races, and thats why they build their mighty empires on the foundation of conquest and trade. Whatever drives them, humans are the innovators, the achievers, and the pioneers of the worlds.');
INSERT INTO SPECIES VALUES ('Orc', 'Medium', 30, 'Orcs trace their creation to the one-eyed god Gruumsh, an unstoppable warrior and powerful leader. The divine qualities of Gruumsh resonate within orcs, granting them a reflection of his toughness and tenacity that can’t be matched, and the god equipped his children to be able to live above or below ground. On some worlds, such as Eberron, orcs were among the first defenders of the natural order from the encroachments of Fiends and other extraplanar threats. Gruumsh’s blessings have made orcs tireless guardians and mighty allies wherever they are found, even when they turn their devotion to other gods.');
INSERT INTO SPECIES VALUES ('Drow', 'Medium', 30, 'Descended from an earlier subrace of dark-skinned elves, the drow were banished from the surface world for following the goddess Lolth down the path to evil and corruption. Now they have built their own civilization in the depths of the Underdark, patterned after the Way of Lolth. Also called dark elves. The drow have black skin that resembles polished obsidian and stark white or pale yellow hair. They commonly have very pale eyes (so pale as to be mistaken for white) in shades of lilac, silver, pink, red, and blue. They lend to be smaller and thinner than most elves.');
INSERT INTO SPECIES VALUES ('Tiefling', 'Medium', 30, 'To be greeted with stares and whispers, to suffer violence and insult on the street, to see mistrust and fear in every eye: this is the lot of the tiefling. And to twist the knife, tieflings know that this is because a pact struck generations ago infused the essence of Asmodeus, overlord of the Nine Hells (and many of the other powerful devils serving under him) into their bloodline. Their appearance and their nature are not their fault but the result of an ancient sin, for which they and their children and their childrens children will always be held accountable.');


GO

-- Inserting records into RIDER table
INSERT INTO TRAIT (Trait_ID, RACE, NAME, DESCRIPTION)
VALUES
(1, 'Reborn', 'Ancestral Legacy', 'If you replace a race with this lineage, you can keep the following elements of that race: any skill proficiencies you gained from it and any climbing, flying, or swimming speed you gained from it. If you don’t keep any of those elements or you choose this lineage at character creation, you gain proficiency in two skills of your choice.'),
(2, 'Reborn', 'Deathless Nature', 'You have escaped death, a fact represented by the following benefits: You have advantage on saving throws against disease and being poisoned, and you have resistance to poison damage. You have advantage on death saving throws. You don’t need to eat, drink, or breathe. You don’t need to sleep, and magic can’t put you to sleep. You can finish a long rest in 4 hours if you spend those hours in an inactive, motionless state, during which you retain consciousness.'),
(3, 'Reborn', 'Knowledge from a Past Life', 'You temporarily remember glimpses of the past, perhaps faded memories from ages ago or a previous life. When you make an ability check that uses a skill, you can roll a d6 immediately after seeing the number on the d20 and add the number on the d6 to the check. You can use this feature a number of times equal to your proficiency bonus, and you regain all expended uses when you finish a long rest.'),
(4, 'Reborn', 'Languages', 'You can speak, read, and write Common and one other language that you and your DM agree is appropriate for the character. If you are replacing your race with this lineage, you retain any languages you had and gain no new languages.'),
(5, 'Tiefling', 'Darkvision', 'Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.'),
(6, 'Teifling', 'Hellish Resistance', 'You have resistance to fire damage.'),
(7, 'Teifling', 'Languages', 'You can speak, read, and write Common and Infernal.'),
(8, 'Drow', 'Superior Darkvision.', 'Your darkvision has a range of 120 feet, instead of 60.'),
(9, 'Drow', 'Sunlight Sensitivity', 'You have disadvantage on attack rolls and Wisdom (Perception) checks that rely on sight when you, the target of the attack, or whatever you are trying to perceive is in direct sunlight.'),
(10, 'Drow', 'Drow Magic', 'You know the Dancing Lights cantrip. When you reach 3rd level, you can cast the Faerie Fire spell once with this trait and regain the ability to do so when you finish a long rest. When you reach 5th level, you can cast the Darkness spell once and regain the ability to do so when you finish a long rest. Charisma is your spellcasting ability for these spells.'),
(11, 'Drow', 'Drow Weapon Training.', 'You have proficiency with rapiers, shortswords, and hand crossbows.'),
(12, 'Orc', 'Darkvision', 'You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You discern colors in that darkness only as shades of gray.'),
(13, 'Orc', 'Powerful Build', 'You count as one size larger when determining your carrying capacity and the weight you can push, drag, or lift.'),
(14, 'Orc', 'Relentless Endurance', 'When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. Once you use this trait, you can’t do so again until you finish a long rest.'),
(15, 'Orc', 'Languages', 'Your character can speak, read, and write Common and one other language that you and your DM agree is appropriate for the character. The Player’s Handbook offers a list of languages to choose from. The DM is free to modify that list for a campaign.'),
(16, 'Human', 'Languages', 'You can speak, read, and write Common and one extra language of your choice. Humans typically learn the languages of other peoples they deal with, including obscure dialects. They are fond of sprinkling their speech with words borrowed from other tongues: Orc curses, Elvish musical expressions, Dwarvish military phrases, and so on.');

GO


INSERT INTO BACKGROUND (BACKGROUND_NAME, TOOL_PROFICIENCIES, LANGUAGE, STARTING_EQUIPMENT, DESCRIPTION, FEATURES, PERSONALITY_TRAITS, IDEALS, BONDS, FLAWS)
VALUES
('Criminal', 'Gaming set, Thieves tools', NULL, 'Crowbar, dark common clothes with a hood, pouch containing 15gp',
 'You are an experienced criminal with a history of breaking the law. You have spent a lot of time among other criminals and still have contacts within the criminal underworld. You are far closer than most people to the world of murder, theft, and violence that pervades the underbelly of civilization, and you have survived up to this point by flouting the rules and regulations of society.',
 'Criminal Specialty: Choose your criminal role or roll on the table. Options: Blackmailer, Burglar, Enforcer, Fence, Highway robber, Hired killer, Pickpocket, Smuggler; Criminal Contact: A reliable contact helps you navigate the criminal network.',
 '1. I always have a plan for what to do when things go wrong.\n2. I am always calm, no matter what the situation.\n3. The first thing I do in a new place is note the locations of everything valuable.\n4. I would rather make a new friend than a new enemy.\n5. I am incredibly slow to trust.\n6. I don''t pay attention to risks in a situation.\n7. The best way to get me to do something is to tell me I can''t do it.\n8. I blow up at the slightest insult.',
 '1. Honor: I don''t steal from others in the trade (Lawful).\n2. Freedom: Chains are meant to be broken (Chaotic).\n3. Charity: I steal from the wealthy to help those in need (Good).\n4. Greed: I will do whatever it takes to become wealthy (Evil).\n5. People: I am loyal to my friends, not ideals (Neutral).\n6. Redemption: There''s a spark of good in everyone (Good).',
 '1. I''m trying to pay off an old debt I owe to a generous benefactor.\n2. My ill-gotten gains go to support my family.\n3. Something important was taken from me, and I aim to steal it back.\n4. I will become the greatest thief that ever lived.\n5. I''m guilty of a terrible crime. I hope I can redeem myself for it.\n6. Someone I loved died because of a mistake I made. That will never happen again.',
 '1. When I see something valuable, I can''t think about anything but how to steal it.\n2. When faced with a choice between money and my friends, I usually choose the money.\n3. If there''s a plan, I''ll forget it. If I don''t forget it, I''ll ignore it.\n4. I have a "tell" that reveals when I''m lying.\n5. I turn tail and run when things look bad.\n6. An innocent person is in prison for a crime that I committed. I''m okay with that.'),

('Urchin', 'Disguise kit, Thieves'' tools', NULL, 'A small knife, a map of the city you grew up in, a pet mouse, a token to remember your parents by, a set of common clothes, and a pouch containing 10gp',
 'You grew up on the streets alone, orphaned, and poor. You had no one to watch over you or provide for you, so you learned to provide for yourself. You fought fiercely over food, kept a constant watch for thieves, and slept on rooftops or in alleyways, exposed to the elements. You survived through cunning, strength, or speed, and now you start your adventuring career with enough money to live modestly for ten days. What allowed you to break free from these circumstances?',
 'City Secrets: You know the secret patterns and flows of cities, allowing you to find faster routes through urban sprawl. When not in combat, you and your companions can travel between locations in a city twice as fast as usual.',
 '1. I hide scraps of food and trinkets in my pockets.\n2. I ask a lot of questions.\n3. I like to squeeze into small places where no one else can get to me.\n4. I sleep with my back to a wall or tree, with all my belongings wrapped in my arms.\n5. I eat like a pig and have bad manners.\n6. I think anyone who''s nice to me is hiding evil intent.\n7. I don''t like to bathe.\n8. I bluntly say what others are hinting at or hiding.',
 '1. Respect: All people, rich or poor, deserve respect (Good).\n2. Community: We must take care of each other because no one else will (Lawful).\n3. Change: The low are lifted up, and the mighty are brought down (Chaotic).\n4. Retribution: The rich need to see what life in the gutters is like (Evil).\n5. People: I help those who help me (Neutral).\n6. Aspiration: I will prove I am worthy of a better life (Any).',
 '1. My city is my home, and I will fight to defend it.\n2. I sponsor an orphanage to prevent others from enduring my hardships.\n3. I owe my survival to another urchin who taught me to live on the streets.\n4. I owe a debt I can never repay to someone who took pity on me.\n5. I escaped poverty by robbing an important person, and I am wanted for it.\n6. No one else should endure the hardships I have faced.',
 '1. If I''m outnumbered, I will run from a fight.\n2. Gold seems like a lot of money, and I will do almost anything for it.\n3. I will never fully trust anyone but myself.\n4. I''d rather kill someone in their sleep than fight fair.\n5. It''s not stealing if I need it more than they do.\n6. People who can''t take care of themselves get what they deserve.'),

('Noble', 'One type of gaming set', 'One language of your choice', 'A set of fine clothes, a signet ring, a scroll of pedigree, and a purse containing 25gp',
 'You understand wealth, power, and privilege. You carry a noble title, and your family owns land, collects taxes, and wields significant political influence. Work with your DM to determine your title, family influence, and the responsibilities tied to your position. Your noble title doesn’t stand alone but is part of a family legacy that you may pass down to your children.',
 'Position of Privilege: Thanks to your noble birth, people think highly of you. You are welcome in high society, and others assume you belong wherever you go. Common folk make efforts to accommodate you, and high-born individuals treat you as a peer. You can secure an audience with a local noble if needed.\n\nVariant Feature: Retainers: You have the service of three retainers loyal to your family. They perform mundane tasks but will not fight or follow you into danger. Retainers will leave if endangered or mistreated.',
 '1. My eloquent flattery makes everyone I talk to feel important.\n2. The common folk love me for my kindness and generosity.\n3. My regal bearing makes it clear that I am a cut above the masses.\n4. I always strive to look my best and follow the latest fashions.\n5. I refuse to dirty my hands or endure poor accommodations.\n6. Despite my noble birth, I see everyone as equals.\n7. Once my favor is lost, it is lost forever.\n8. If you injure me, I will crush you and ruin your name.',
 '1. Respect: All people deserve to be treated with dignity (Good).\n2. Responsibility: Respect authority above and below me (Lawful).\n3. Independence: I must prove I can manage without my family (Chaotic).\n4. Power: More power means freedom from control (Evil).\n5. Family: Blood ties are most important (Any).\n6. Noble Obligation: I must protect and care for my people (Good).',
 '1. I will face any challenge to gain my family’s approval.\n2. My house’s alliance with another noble family must be maintained.\n3. My family is my top priority.\n4. I am in love with someone my family despises.\n5. My loyalty to my sovereign is unwavering.\n6. The common folk must see me as their hero.',
 '1. I secretly believe everyone is beneath me.\n2. I hide a scandalous secret that could ruin my family.\n3. I often misinterpret words as veiled insults or threats.\n4. I believe anyone beneath me must obey me without question.\n5. I despise commoners and treat them poorly.\n6. I do whatever I must to maintain my family’s good name.'),

('Acolyte', 'None', 'Two languages of your choice', 'A holy symbol, a prayer book or prayer wheel, 5 sticks of incense, vestments, a set of common clothes, and a pouch containing 15gp',
 'You have spent your life in the service of a temple to a specific god or pantheon of gods. As an intermediary between the holy and mortal worlds, you performed sacred rites and guided worshipers. Whether a devout priest or a reformed cultist, your faith has shaped your life.',
 'Shelter of the Faithful: As an acolyte, you command respect among those who share your faith and can perform religious ceremonies for your deity. You and your companions can receive free care at temples of your faith (material components not included). You may also have ties to a temple where you can request non-hazardous assistance if you remain in good standing.',
 '1. I idolize a hero of my faith and constantly refer to their deeds.\n2. I find common ground between enemies and work toward peace.\n3. I see omens in every event and believe the gods are communicating.\n4. Nothing can shake my optimism.\n5. I quote (or misquote) sacred texts in all situations.\n6. I am tolerant (or intolerant) of other faiths, respecting (or condemning) them.\n7. I am accustomed to high society and find rough living grating.\n8. I lack practical experience outside the temple.',
 '1. Tradition: Ancient worship traditions must be preserved. (Lawful)\n2. Charity: Helping those in need is my highest priority. (Good)\n3. Change: We must assist the gods'' constant changes in the world. (Chaotic)\n4. Power: I aspire to rise in my faith’s hierarchy. (Lawful)\n5. Faith: My deity’s guidance shapes my actions. (Lawful)\n6. Aspiration: I seek to prove my worth to my god. (Any)',
 '1. I would die to recover an ancient relic of my faith.\n2. I will avenge the corrupt hierarchy that branded me a heretic.\n3. A priest saved my life after my parents died, and I owe them everything.\n4. My actions are dedicated to the common people.\n5. I will protect my temple at all costs.\n6. I preserve a sacred text my enemies seek to destroy.',
 '1. I judge others harshly and hold myself to even stricter standards.\n2. I trust too much in the temple’s hierarchy.\n3. My faith makes me blindly trust others who profess it.\n4. I am inflexible in my thinking.\n5. I am suspicious of strangers and expect the worst of them.\n6. I obsess over goals to the detriment of all else.'
);

GO

INSERT INTO BACKGROUND_SKILL (BACKGROUND_NAME, SKILL_NAME)
VALUES
('Urchin', 'Stealth'),
('Urchin', 'Sleight of Hand'),
('Criminal', 'Stealth'),
('Criminal', 'Deception'),
('Noble', 'History'),
('Noble', 'Persuasion'),
('Acolyte', 'Insight'),
('Acolyte', 'Religion');

GO

-- Insert data into Feat
INSERT INTO FEAT (FEAT_NAME, PREREQUISITE, FEATURE)
VALUES
    ('Great Weapon Master',
     'Strength 13 or higher',
     'Powerful Attack: You can choose to take a -5 penalty to your attack roll to add +10 to your damage roll.; Killing Blow: You can make a melee attack as a bonus action after reducing a creature to 0 hit points with a melee weapon attack.'),

    ('Sharpshooter',
     'Dexterity 13 or higher',
     'Long Range: You can shoot long-range attacks without disadvantage, even in extreme ranges.; Ignore Cover: You can ignore half cover and three-quarters cover when attacking a target.'),

    ('Tough',
     'None',
     'Increased HP: Your hit point maximum increases by an amount equal to twice your level.'),

    ('Lucky',
     'None',
     'Reroll: You have 3 luck points that allow you to reroll attacks, saving throws, or ability checks.'),

    ('Alert',
     'None',
     'Initiative Boost: You gain a +5 bonus to initiative rolls.');

GO

INSERT INTO INVENTORY (CHAR_ID, GOLD, ATTUNEMENT_SLOTS, USED_ATTUNEMENT_SLOTS)
VALUES
    ('123456789', 150, 3, 1),   -- Inventory for character with CHAR_ID '123456789'
    ('012345678', 200, 3, 0),   -- Inventory for character with CHAR_ID '012345678'
    ('000000000', 50, 3, 2),    -- Inventory for character with CHAR_ID '000000000'
    ('000000001', 75, 3, 1),    -- Inventory for character with CHAR_ID '000000001'
    ('000000002', 100, 3, 0);   -- Inventory for character with CHAR_ID '000000002'

GO

INSERT INTO Item (ITEM_NAME, WEIGHT, RARITY, TYPE, VALUE, EFFECT, ATTUNEMENT, QUANTITY, MAGIC, DESCRIPTION)
VALUES
('Greatsword', 6.0, 'Uncommon', 'Weapon', 50, 'A large, two-handed sword.', 'Yes', 1, 'Yes', 'A massive blade, requiring great strength to wield.'),
('Potion of Healing', 0.5, 'Common', 'Potion', 10, 'Restores 2d4+2 hit points when consumed.', 'No', 10, 'No', 'A vial of red liquid that heals minor wounds.');

GO

-- Inserting items into the InventoryItems table
INSERT INTO InventoryItems (INVENTORY_ID , ITEM_ID, EQUIPPED_ITEMS)
VALUES (1, 1, 'Yes'),  -- Equip the Greatsword
       (1, 2, 'No');  -- Potion of Healing is in inventory but not equipped

GO

INSERT INTO CLASS (NAME, HITDICE, PRIMARY_ABILITY_SCORES, SAVE_PROFICIENCIES, STARTING_PROFICIENCIES)
VALUES
('Wizard', '1d6', 'Intelligence', 'Intelligence, Wisdom', 'Arcana, History, Investigation, Insight'),
('Paladin', '1d10', 'Strength, Charisma', 'Wisdom, Charisma', 'Athletics, Persuasion, Religion'),
('Fighter', '1d10', 'Strength, Dexterity', 'Strength, Constitution', 'Athletics, Intimidation'),
('Sorcerer', '1d6', 'Charisma', 'Charisma, Constitution', 'Arcana, Persuasion');

GO


-- Insert subclasses related to Wizard
INSERT INTO SUBCLASS (CLASS_ID, SUBCLASS_NAME, DESCRIPTION, LEVEL_REQUIREMENTS, SUBCLASS_FEATURES)
VALUES
(1, 'Necromancy',
 'Necromancers focus on controlling the forces of death and the undead.',
 'Level 2',
 'Undead Thralls, Dark Blessing, Grim Harvest'),
(1, 'Evocation',
 'Evokers specialize in harnessing raw elemental magic to unleash powerful spells.',
 'Level 2',
 'Sculpt Spells, Potent Cantrip, Empowered Evocation');

-- Insert subclasses related to Paladin
INSERT INTO SUBCLASS (CLASS_ID, SUBCLASS_NAME, DESCRIPTION, LEVEL_REQUIREMENTS, SUBCLASS_FEATURES)
VALUES
(2, 'Oath of Devotion',
 'Paladins who swear the Oath of Devotion are the epitome of virtue and righteousness.',
 'Level 3',
 'Sacred Weapon, Turn the Unholy, Aura of Devotion'),
(2, 'Oath of Vengeance',
 'Paladins who swear the Oath of Vengeance channel divine wrath against foes who have wronged them.',
 'Level 3',
 'Abjure Enemy, Vow of Enmity, Relentless Avenger');

-- Insert subclasses related to Fighter
INSERT INTO SUBCLASS (CLASS_ID, SUBCLASS_NAME, DESCRIPTION, LEVEL_REQUIREMENTS, SUBCLASS_FEATURES)
VALUES
(3, 'Battle Master',
 'Battle Masters are martial combatants who use combat maneuvers to outwit their enemies.',
 'Level 3',
 'Combat Superiority, Tactical Maneuvering, Commanding Presence'),
(3, 'Champion',
 'Champions focus on physical excellence and improving critical hit chances.',
 'Level 3',
 'Improved Critical, Remarkable Athlete, Survivor');

-- Insert subclasses related to Sorcerer
INSERT INTO SUBCLASS (CLASS_ID, SUBCLASS_NAME, DESCRIPTION, LEVEL_REQUIREMENTS, SUBCLASS_FEATURES)
VALUES
(4, 'Draconic Bloodline',
 'Your innate magic comes from draconic ancestry, granting you dragon-like abilities.',
 'Level 1',
 'Dragon Resilience, Elemental Affinity, Draconic Presence'),
(4, 'Wild Magic',
 'Wild Magic sorcerers harness unpredictable surges of magical energy.',
 'Level 1',
 'Wild Magic Surge, Tides of Chaos, Bend Luck');

GO

INSERT INTO CASTER (CLASS_ID, TYPE, SPELL_SLOTS, SPELLS_KNOWN, PREPARED_SPELLS, SPELL_ATTACK)
VALUES
(1, 'Full', '4/3/2/1', 10, NULL, 'INT + Proficiency'),   -- Wizard
(2, 'Half', '2/2/1', NULL, 5, 'WIS + Proficiency'),      -- Paladin
(3, 'None', '0', NULL, NULL, NULL),                     -- Fighter
(4, 'Full', '4/3/2', 5, NULL, 'CHA + Proficiency');      -- Sorcerer

GO

INSERT INTO SPELL (SPELL_NAME, SPELL_LEVEL, SCHOOL, CASTING_TIME, RANGE, COMPONENTS, DURATION, DAMAGE, EFFECT, LEVEL_REQUIREMENTS)
VALUES
    ('Fireball', 3, 'Evocation', '1 action', '150 feet', 'V, S, M', 'Instantaneous', '8d6 fire damage', 'A bright streak flashes from your pointing finger to a point you choose, exploding in a fireball.', 'Level 5'),
    ('Cure Wounds', 1, 'Evocation', '1 action', 'Touch', 'V, S', 'Instantaneous', '1d8 + spellcasting ability modifier healing', 'A creature you touch regains hit points.', 'None'),
    ('Mage Armor', 1, 'Abjuration', '1 action', 'Touch', 'V, S, M', '8 hours', 'None', 'You touch a willing creature who isn’t wearing armor, granting it a base AC of 13 + Dexterity modifier.', 'None');


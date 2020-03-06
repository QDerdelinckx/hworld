-- FACTION

INSERT INTO FACTION(FACTION_NAME, FACTION_ALIGNMENT, FACTION_SKIN)
VALUES('Inter Omnes', 'VIR', 'fpch.png');

INSERT INTO FACTION(FACTION_NAME, FACTION_ALIGNMENT, FACTION_SKIN)
VALUES('Milice de Scarowl', 'CHA', 'fpch2.png');

INSERT INTO FACTION(FACTION_NAME, FACTION_ALIGNMENT, FACTION_SKIN)
VALUES('Sa Majesté Aux Cornes', 'CHA', 'fpch3.png');

INSERT INTO FACTION(FACTION_NAME, FACTION_ALIGNMENT, FACTION_SKIN)
VALUES('Extrémistes', 'REB', 'fpch4.png');

-- PERSONNAGES

INSERT INTO HERO(NAME, SKIN, DESCRIPTION, LEVEL, STRENGTH, INTELLIGENCE, CHARISMA, LUCK, FACTION_ID, PRICE)
VALUES('Hector', 'hector.png', 'Illustre Commandant', 1, 2, 6, 8, 4, 1, 25000);

INSERT INTO HERO(NAME, SKIN, DESCRIPTION, LEVEL, STRENGTH, INTELLIGENCE, CHARISMA, LUCK, FACTION_ID, PRICE)
VALUES('Lewie Scarowl', 'lewies.png', 'Contrebandier Illusionniste', 1, 4, 10, 3, 3, 2, 25000);

INSERT INTO HERO(NAME, SKIN, DESCRIPTION, LEVEL, STRENGTH, INTELLIGENCE, CHARISMA, LUCK, FACTION_ID, PRICE)
VALUES('Reine Caprite', 'capriq.png', 'Magicienne Tyrannique', 1, 4, 7, 7, 2, 3, 25000);

INSERT INTO HERO(NAME, SKIN, DESCRIPTION, LEVEL, STRENGTH, INTELLIGENCE, CHARISMA, LUCK, FACTION_ID, PRICE)
VALUES('VK-250', 'vk250.png', 'Androïde Impitoyable', 1, 10, 7, 0, 3, 4, 25000);

INSERT INTO HERO(NAME, SKIN, DESCRIPTION, LEVEL, STRENGTH, INTELLIGENCE, CHARISMA, LUCK, FACTION_ID, PRICE)
VALUES('Unisaur', 'unis.png', 'Brute Écaillée', 1, 8, 4, 1, 1, 3, 10000);

INSERT INTO HERO(NAME, SKIN, DESCRIPTION, LEVEL, STRENGTH, INTELLIGENCE, CHARISMA, LUCK, FACTION_ID, PRICE)
VALUES('Gaudrius 1.0', 'gaudrius.png', 'Preux Androïde', 1, 6, 5, 1, 4, 1, 10000);

-- SKILLS

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('Encourager', 'spch.png', 5, 'DPC', 'INP');

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('Tactiques Avancées', 'spch.png', 3, 'CAD', 'AUT');

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('Passe-passe Maléfique', 'spch.png', 2, 'ILL', 'IMD');

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('Magie Interdite', 'spch.png', 6, 'AMG', 'CAD');

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('Peur de Rien', 'spch.png', 4, 'COU', 'CCC');

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('Database Linguistique', 'spch.png', 4, 'LGE', 'DPC');

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('"À mes pieds !"', 'spch.png', 3, 'IMD', 'AUT');

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('Sortilèges', 'spch.png', 5, 'EMG', 'CAD');

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('Instinct de chasseur', 'spch.png', 5, 'CCC', 'ORI');

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('Rallier la meute', 'spch.png', 3, 'IMD', 'COU');

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('Manufacture militaire', 'spch.png', 2, 'CCC', 'ATH');

INSERT INTO SKILL(NAME, SKIN, SCORE, ARCHETYPE1, ARCHETYPE2)
VALUES('Vengeance aérienne', 'spch.png', 6, 'PIL', 'CAD');

-- BONUS

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('DPC', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('DPC', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('DPC', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('DPC', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('CCC', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('CCC', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('CCC', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('CCC', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('CAD', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('CAD', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('CAD', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('CAD', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('IMD', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('IMD', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('IMD', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('IMD', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('EMG', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('EMG', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('EMG', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('EMG', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ILL', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ILL', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ILL', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ILL', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('COU', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('COU', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('COU', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('COU', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('INP', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('INP', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('INP', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('INP', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('AUT', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('AUT', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('AUT', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('AUT', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('AMG', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('AMG', -1);


INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('AMG', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('AMG', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('LGE', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('LGE', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('LGE', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('LGE', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ARC', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ARC', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ARC', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ARC', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('COM', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('COM', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('COM', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('COM', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('PIR', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('PIR', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('PIR', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('PIR', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('PIL', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('PIL', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('PIL', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('PIL', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ORI', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ORI', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ORI', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ORI', 2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ATH', -2);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ATH', -1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ATH', 1);

INSERT INTO BONUS(AFFECTED, BONUS)
VALUES('ATH', 2);

-- ITEMS

INSERT INTO ITEM(NAME, SKIN)
VALUES('Badge Inter Omnes', 'ipch.png');

INSERT INTO ITEM(NAME, SKIN)
VALUES('Monocle à Spirale', 'ipch.png');

INSERT INTO ITEM(NAME, SKIN)
VALUES('Disque de Données', 'ipch.png');

INSERT INTO ITEM(NAME, SKIN)
VALUES('Collier de Davon', 'ipch.png');

INSERT INTO ITEM(NAME, SKIN)
VALUES('Bague Caprite', 'ipch.png');

INSERT INTO ITEM(NAME, SKIN)
VALUES('Cheveux de Reine', 'ipch.png');

INSERT INTO ITEM(NAME, SKIN)
VALUES('Brosse à Moustache', 'ipch.png');

INSERT INTO ITEM(NAME, SKIN)
VALUES('Baguette Magique', 'ipch.png');

INSERT INTO ITEM(NAME, SKIN)
VALUES('Chapeau de Magicien', 'ipch.png');

INSERT INTO ITEM(NAME, SKIN)
VALUES('Cyber-Casque', 'ipch.png');

-- LIAISON ITEM + BONUS
INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(1, 35);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(1, 3);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(2, 24);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(2, 2);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(3, 51);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(3, 55);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(4, 59);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(4, 63);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(5, 1);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(5, 20);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(5, 15);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(6, 35);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(7, 4);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(7, 47);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(7, 6);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(8, 24);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(8, 40);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(8, 17);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(9, 23);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(9, 31);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(10, 52);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(10, 63);

INSERT INTO ITEM_BONUS(ITEM_ID, BONUS_ID)
VALUES(10, 65);

-- LIAISON HERO + SKILL
INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(1,1);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(1,2);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(2,3);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(2,4);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(3,7);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(3,8);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(4,11);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(4,12);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(5,9);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(5,10);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(6,5);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(6,6);

-- ROLE Equipage
INSERT INTO ROLE_CREW (NAME, SINGLED, ALIGNMENT_BONUS) VALUES
('Capitaine', true, 10),
('Officier Second', true, 5),
('Navigateur en Chef', true, 5),
('Pilote', false, 3),
('Cartographe', true, 3),
('Ingénieur en chef', true, 5),
('Ingénieur', false, 3),
('Médecin en chef', true, 5),
('Médecin', false, 3),
('Tacticien', true, 5),
('Général', false, 4),
('Soldat', false, 2),
('Stagiaire', false, 1);

-- BONUS Role
INSERT INTO ROLE_CREW_BONUS (ROLE_CREW_ID_ROLE, BONUS_ID) VALUES
(1, 4),
(1, 36),
(1, 32),
(2, 36),
(2, 27),
(2, 3),
(3, 64),
(3, 60),
(4, 63),
(4, 59),
(5, 64),
(5, 31),
(6, 52),
(6, 56),
(6, 67),
(7, 51),
(7, 67);

-- EPISODES
INSERT INTO EPISODE (ID, QUEST_SEQUENCE, STORY) VALUES
(1, 1, 'Nous avons découvert une nouvelle civilisation !'),
(2, 1, 'Une transmission cryptée nous est parvenue.');

-- EPISODE OPTIONS
INSERT INTO EPISODE_OPTION (ID, DESCRIPTION) VALUES
(1, 'Dialoguer avec eux pour former une alliance'),
(2, 'Les asservir et piller leurs richesses'),
(3, 'Décrypter le code avec les machines'),
(4, 'Envoyer un détecteur de vie suivre la source du signal');

-- EPISODE + EPISODE OPTIONS
INSERT INTO EPISODE_EPISODE_OPTIONS (EPISODE_ID, EPISODE_OPTIONS_ID) VALUES
(1, 1),
(1, 2),
(2, 3),
(2, 4);

-- REQUIREMENTS
INSERT INTO REQUIREMENT (ID, ARCHETYPE, REQUIRED_SCORE) VALUES
(1, 'DPC', 12),
(2, 'IMD', 12),
(3, 'COM', 8),
(4, 'AMG', 10);

 --EPISODE OPTIONS + REQUIREMENTS
INSERT INTO EPISODE_OPTION_REQUIREMENTS (EPISODE_OPTION_ID, REQUIREMENTS_ID) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4);
-- USERS

INSERT INTO USER(NICKNAME, PASSWORD, EMAIL)
VALUES('qderdelinckx', 'spiraleyes27', 'quentin.derdelinckx@gmail.com');

INSERT INTO USER(NICKNAME, PASSWORD, EMAIL)
VALUES('ddevito', 'trashman128', 'danny.devito@gmail.com');

INSERT INTO USER(NICKNAME, PASSWORD, EMAIL)
VALUES('eggman', 'cemeralds96', 'eggman.robotnik@gmail.com');

-- FACTION 

INSERT INTO FACTION(FACTION_NAME, FACTION_ALIGNMENT, FACTION_SKIN)
VALUES('Inter Omnes', 'VIR', 'fpch.png');

INSERT INTO FACTION(FACTION_NAME, FACTION_ALIGNMENT, FACTION_SKIN)
VALUES('Milice de Scarowl', 'CHA', 'fpch2.png');

-- PERSONNAGES

INSERT INTO HERO(NAME, SKIN, DESCRIPTION, LEVEL, STRENGTH, INTELLIGENCE, CHARISMA, LUCK, FACTION_ID)
VALUES('Hector', 'hector.png', 'Illustre Commandant', 1, 2, 5, 6, 2, 1);

INSERT INTO HERO(NAME, SKIN, DESCRIPTION, LEVEL, STRENGTH, INTELLIGENCE, CHARISMA, LUCK, FACTION_ID)
VALUES('Lewie Scarowl', 'lewies.png', 'Contrebandier Illusionniste', 1, 4, 8, 1, 3, 2);

INSERT INTO HERO(NAME, SKIN, DESCRIPTION, LEVEL, STRENGTH, INTELLIGENCE, CHARISMA, LUCK, FACTION_ID)
VALUES('Gaudrius 1.0', 'gaudrius.png', 'Preux Androïde', 1, 6, 5, 1, 4, 1);

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
VALUES(3,5);

INSERT INTO HERO_SKILLS(HERO_ID, SKILLS_ID)
VALUES(3,6);
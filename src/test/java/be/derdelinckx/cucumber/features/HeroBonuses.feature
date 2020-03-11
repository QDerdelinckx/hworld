Feature: Calculate the skill score of my heroes

    Scenario: testing the skill implementation
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        And the hero has a skill named "Aventure" with "ORI" and "ARC" bonuses and a base score of 3
        Then the skill named "Test" has a score of 5
        Then the skill named "Aventure" has a score of 3

    Scenario: the bonus provided by the role doesn't share an archetype with the hero
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        And the hero has a skill named "Aventure" with "ORI" and "ARC" bonuses and a base score of 3
        When the hero is assigned a role
        And said role has a bonus of 2 on archetype "AMG"
        And said role has a bonus of 1 on archetype "CCC"
        And said role has a bonus of 1 on archetype "EMG"
        Then the skill named "Test" has a score of 5
        Then the skill named "Aventure" has a score of 3

    Scenario: the hero has a role that affects an archetype related to one of his skills
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        And the hero has a skill named "Aventure" with "ORI" and "ARC" bonuses and a base score of 3
    	When the hero is assigned a role
    	And said role has a bonus of 2 on archetype "DPC"
        Then the skill named "Test" has a score of 7
        Then the skill named "Aventure" has a score of 3

    Scenario: the hero has a role that affects both archetypes in one of his skills
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        And the hero has a skill named "Aventure" with "ORI" and "ARC" bonuses and a base score of 3
        When the hero is assigned a role
        And said role has a bonus of 2 on archetype "DPC"
        And said role has a bonus of 1 on archetype "CAD"
        And said role has a bonus of 1 on archetype "EMG"
        Then the skill named "Test" has a score of 8
        Then the skill named "Aventure" has a score of 3

    Scenario: the hero has a role that affects a single archetype in each of his skills
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        And the hero has a skill named "Aventure" with "ORI" and "ARC" bonuses and a base score of 3
        When the hero is assigned a role
        And said role has a bonus of 2 on archetype "DPC"
        And said role has a bonus of 1 on archetype "ARC"
        And the hero is powered Up
        Then the skill named "Test" has a score of 7
        Then the skill named "Aventure" has a score of 4


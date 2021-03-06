Feature: Calculate the skill score of my heroes

    Scenario: the hero doesn't have a role attributed to him
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
        And the hero is powered Up
        Then the skill named "Test" has a score of 5
        Then the skill named "Aventure" has a score of 3

    Scenario: the hero has a role that affects an archetype related to one of his skills
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        And the hero has a skill named "Aventure" with "ORI" and "ARC" bonuses and a base score of 3
    	When the hero is assigned a role
    	And said role has a bonus of 2 on archetype "DPC"
        And the hero is powered Up
        Then the skill named "Test" has a score of 7
        Then the skill named "Aventure" has a score of 3

    Scenario: the hero has a role that affects both archetypes in one of his skills
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        And the hero has a skill named "Aventure" with "ORI" and "ARC" bonuses and a base score of 3
        When the hero is assigned a role
        And said role has a bonus of 2 on archetype "DPC"
        And said role has a bonus of 1 on archetype "CAD"
        And said role has a bonus of 1 on archetype "EMG"
        And the hero is powered Up
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

    Scenario: the hero has a role with negative effects on his skills
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        And the hero has a skill named "Aventure" with "ORI" and "ARC" bonuses and a base score of 3
        When the hero is assigned a role
        And said role has a bonus of -2 on archetype "DPC"
        And said role has a bonus of -1 on archetype "ORI"
        And the hero is powered Up
        Then the skill named "Test" has a score of 3
        Then the skill named "Aventure" has a score of 2

    Scenario: a hero without a role goes on a mission
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        When the hero is trying to accomplish a mission
        And the chosen solution requires a score of 4 on archetype "DPC"
        Then the mission is succesful

    Scenario: a hero gets assigned a role and goes on a mission
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        And the hero has a skill named "Aventure" with "ORI" and "ARC" bonuses and a base score of 3
        When the hero is assigned a role
        And said role has a bonus of 2 on archetype "DPC"
        And said role has a bonus of 2 on archetype "ORI"
        And the hero is powered Up
        And the hero is trying to accomplish a mission
        And the chosen solution requires a score of 6 on archetype "DPC"
        And the chosen solution requires a score of 5 on archetype "ORI"
        Then the mission is succesful

    Scenario: a hero gets assigned a role with negative effects and goes on a mission
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        And the hero has a skill named "Aventure" with "ORI" and "ARC" bonuses and a base score of 1
        When the hero is assigned a role
        And said role has a bonus of 3 on archetype "DPC"
        And said role has a bonus of -2 on archetype "ORI"
        And the hero is powered Up
        And the hero is trying to accomplish a mission
        And the chosen solution requires a score of 7 on archetype "DPC"
        And the chosen solution requires a score of 5 on archetype "ORI"
        Then the mission is a failure

    Scenario: a hero with a role goes on a mission that doesn't have the same archetypes
        Given the hero has a skill named "Test" with "DPC" and "CAD" bonuses and a base score of 5
        And the hero has a skill named "Aventure" with "ORI" and "ARC" bonuses and a base score of 3
        When the hero is assigned a role
        And said role has a bonus of 3 on archetype "DPC"
        And said role has a bonus of 2 on archetype "ORI"
        And the hero is powered Up
        And the hero is trying to accomplish a mission
        And the chosen solution requires a score of 5 on archetype "IMD"
        And the chosen solution requires a score of 3 on archetype "EMG"
        Then the mission is a failure


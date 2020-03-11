Feature: How will my purchase affect my balance ?

    Scenario: the user has more than enough
	    Given a user with a budget of 45000 crystals
	    And a hero with the name "Hector" and cost of 25000 crystals
	    When the hero is evaluated for purchase
	    Then the user has a balance of 20000 crystals
    	Then the user has a roster of 1 characters

	Scenario: the user has just enough
    	Given a user with a budget of 25000 crystals
    	And a hero with the name "Hector" and cost of 25000 crystals
    	When the hero is evaluated for purchase
    	Then the user has a balance of 0 crystals
    	Then the user has a roster of 1 characters

    Scenario: the user has not enough
    	Given a user with a budget of 12000 crystals
    	And a hero with the name "Hector" and cost of 25000 crystals
    	When the hero is evaluated for purchase
    	Then the user has a balance of 12000 crystals
    	Then the user has a roster of 0 characters

    Scenario: the user doesn't have the hero yet and has a collection of > 0
        Given a user with a budget of 25000 crystals
        And the user owns the hero named "Lewie Scarowl"
        And a hero with the name "Hector" and cost of 25000 crystals
        When the hero is evaluated for purchase
        Then the user has a balance of 0 crystals
        Then the user has a roster of 2 characters

    Scenario: the user doesn't have the hero yet and has a collection of > 1
         Given a user with a budget of 25000 crystals
         And the user owns the hero named "Lewie Scarowl"
         And the user owns the hero named "Reine Caprite"
         And a hero with the name "Hector" and cost of 25000 crystals
         When the hero is evaluated for purchase
         Then the user has a balance of 0 crystals
         Then the user has a roster of 3 characters

    Scenario: the user already owns the hero and has a collection of == 1
        Given a user with a budget of 25000 crystals
        And the user owns the hero named "Hector"
        And a hero with the name "Hector" and cost of 25000 crystals
        When the hero is evaluated for purchase
        Then the user has a balance of 25000 crystals
        Then the user has a roster of 1 characters

    Scenario: the user already owns the hero and has a collection of > 1
    	Given a user with a budget of 45000 crystals
    	And the user owns the hero named "Lewie Scarowl"
    	And the user owns the hero named "Reine Caprite"
    	And the user owns the hero named "Hector"
    	And a hero with the name "Reine Caprite" and cost of 25000 crystals
    	When the hero is evaluated for purchase
    	Then the user has a balance of 45000 crystals
    	Then the user has a roster of 3 characters

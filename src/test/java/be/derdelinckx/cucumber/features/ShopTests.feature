Feature: Can I buy this character ?
    
    Scenario: The user has more than enough
        Given a user with a budget of 45000 crystals
        And a hero with the name "Hector" and cost of 25000 crystals
        Then the hero can be bought

    Scenario: The user has the right amount
        Given a user with a budget of 25000 crystals
        And a hero with the name "Hector" and cost of 25000 crystals
        Then the hero can be bought

    Scenario: The user doesn't have enough
        Given a user with a budget of 12500 crystals
        And a hero with the name "Hector" and cost of 25000 crystals
        Then the hero cannot be bought
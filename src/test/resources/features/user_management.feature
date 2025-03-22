Feature: User Management

  Scenario: Add and Delete a User
    Given I navigate to "https://opensource-demo.orangehrmlive.com/"
    When I enter "Admin" as username
    And I enter "admin123" as password
    And I click on the login button
    And I click on the Admin tab on the left side menu
    Then I note the number of records
    When I click on add button
    And I fill in user details with "Ahmed143", "Asd@123", "Admin", "Enabled", "Charles", "Charles  Carter"
    And I click on save button
    Then the number of records should increase by 1
    When I search for the username "Ahmed143"
    And I delete the found user
    Then the number of records should decrease by 1

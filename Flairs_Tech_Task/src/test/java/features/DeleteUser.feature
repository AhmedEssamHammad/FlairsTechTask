@smoke
Feature: Admin user can delete user
  Scenario: Admin user search for user and delete it
    When Admin user login with "Admin" and "admin123"
    And Click on Admin tab to delete user
    And Get the number of records
    And Search with the username "Ahmed_Essam_123" for the new user
    And Delete the new user
    And Reset the search values
    Then Verify that the number of records decreased by one
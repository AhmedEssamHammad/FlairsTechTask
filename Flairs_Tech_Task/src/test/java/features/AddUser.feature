@smoke
Feature: Admin user can add new user
  Scenario: Admin user add new user with valid data
    When user Login with "Admin" and "admin123"
    And Click on Admin tab
    And Get the number of records found
    And Click on add button
    And Fill the required data "Ranga  Akunuri" and "Ahmed_Essam_123" and "1234567A"
    And Click on save button
    Then Verify that the number of records increased by one

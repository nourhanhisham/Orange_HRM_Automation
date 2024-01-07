@test
Feature: Add and delete users

  @test @Run
  Scenario: User add new user then delete the added one
    Given User Opens Home Page Insert "Admin" And "admin123"
    And User get the number of records found as an admin
    And Add new Employee "A" with username "Nourhan@9" Role "ESS" Status "Enabled" and Password "P@$$w0rd" then Confirm password "P@$$w0rd"
    Then get new record number and verify records increased
    And Search for "Nourhan@9" and Delete user
    Then get new record number and verify records decreased


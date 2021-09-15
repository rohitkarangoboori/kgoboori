Feature: Golden Record Rules

  Background: User is on the home page of Helix Application
    Given User pass all the required Data for Login

  @FirstName
  Scenario: Add New Tiebreaker for FirstName
    Given User Click on the Add new Tiebreaker for FirstName
    Then User Select the Attribut and Order for FirstName
    Then User Click on the Save for New TieBreaker for FirstName

  @LastName
  Scenario: Add New Tiebreaker for LastName
    Given User Click on the Add new Tiebreaker for LastName
    Then User Select the Attribut and Order for LastName
    Then User Click on the Save for New TieBreaker for LastName

  @Email
  Scenario: Add New Tiebreaker for Email
    Given User Click on the Add new Tiebreaker for Email
    Then User Select the Attribut and Order for Email
    Then User Click on the Save for New TieBreaker for Email

  @CompanyName
  Scenario: Add New Tiebreaker for CompanyName
    Given User Click on the Add new Tiebreaker for CompanyName
    Then User Select the Attribut and Order for CompanyName
    Then User Click on the Save for New TieBreaker for CompanyName

  @WorkPhone
  Scenario: Add New Tiebreaker for WorkPhone
    Given User Click on the Add new Tiebreaker for WorkPhone
    Then User Select the Attribut and Order for WorkPhone
    Then User Click on the Save for New TieBreaker for WorkPhone

  @HomePhone
  Scenario: Add New Tiebreaker for HomePhone
    Given User Click on the Add new Tiebreaker for HomePhone
    Then User Select the Attribut and Order for HomePhone
    Then User Click on the Save for New TieBreaker for HomePhone

  @CellPhone
  Scenario: Add New Tiebreaker for CellPhone
    Given User Click on the Add new Tiebreaker for CellPhone
    Then User Select the Attribut and Order for CellPhone
    Then User Click on the Save for New TieBreaker for CellPhone

  @AddressLine1
  Scenario: Add New Tiebreaker for AddressLine1
    Given User Click on the Add new Tiebreaker for AddressLine1
    Then User Select the Attribut and Order for AddressLine1
    Then User Click on the Save for New TieBreaker for AddressLine1

  @AddressLine2
  Scenario: Add New Tiebreaker for AddressLine2
    Given User Click on the Add new Tiebreaker for AddressLine2
    Then User Select the Attribut and Order for AddressLine2
    Then User Click on the Save for New TieBreaker for AddressLine2

  @City
  Scenario: Add New Tiebreaker for City
    Given User Click on the Add new Tiebreaker for City
    Then User Select the Attribut and Order for City
    Then User Click on the Save for New TieBreaker for City

  @State
  Scenario: Add New Tiebreaker for State
    Given User Click on the Add new Tiebreaker for State
    Then User Select the Attribut and Order for State
    Then User Click on the Save for New TieBreaker for State

  @Country
  Scenario: Add New Tiebreaker for Country
    Given User Click on the Add new Tiebreaker for Country
    Then User Select the Attribut and Order for Country
    Then User Click on the Save for New TieBreaker for Country

  @Zip
  Scenario: Add New Tiebreaker for Zip
    Given User Click on the Add new Tiebreaker for Zip
    Then User Select the Attribut and Order for Zip
    Then User Click on the Save for New TieBreaker for Zip

  @GRDM1
  Scenario Outline: User is able to configure entity record matching rules
    Given User click on the Add Rules to configure entity record matching rules
    Then User Pass the "<name>" to configure entity record matching rules
    Then User click on the ok Button to configure entity record matching rules

    Examples: 
      | name |
      | AUT  |

Feature: Helix Audience Builder

  Background: User on the Home page of Audience Builder
    Given User is on the Home Page  of Audience Builder

  @ABTC1-1
  Scenario: Verify the Audience Builder is Clickable
    Given User is on the Home Page after Signin and Click on the Audience Builder Side Bar

  @ABTC1-2
  Scenario: Verify the refresh is workable
    Given User on the home page of Attribute Builder page to check the Refresh is working
    Then User click on the Refresh of Attribute Builder

  @ABTC1-3
  Scenario Outline: Verify the Search Feild
    Given User on the home Page  of Attribute to check the Search Feild is working
    Then User pass info "<SearchBar>" of Attribute Builder

    Examples: 
      | SearchBar |
      | all fans  |

  @ABTC1-4
  Scenario: Verify all columns in matrix can be sorted asc, then desc, then default
    Given User on the Home page of AB to Verify sorted asc and then desc and then default
    Then User click on the Acc
    Then User click on the Desc
    Then User click on the default

  @ABTC1-5
  Scenario Outline: Verify value in field Total matches the number of records in matrix
    Given User is on the Attribute Builder Page to verfiy the total number
    Then Verify the TotalNumber of records from "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | NewTag    |         0 |

  @ABTC1-6
  Scenario: Verify New Audience button is functional
    Given User is on the new attribute home page
    Then User click on the new attribute

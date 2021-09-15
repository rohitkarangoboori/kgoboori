Feature: Attribute Automation for create , Edit and Delete

  Background: User in on the Attribute Page
    Given Make sure you are logged in with correct credentails

  @ATC6-1,ATC6-2,ATC6-3,ATC6-4,ATC6-5,ATC6-6,ATC4-1,ATC5-1,ATC3-1
  Scenario Outline: Creat a new Attribute with sql
    Given User select the Attributes selection
    Then User click on the new Attributes
    Then User pass the displayname for Attributes with help of excel "<SheetName>" And <RowNumber>
    Then User pass the APIname for the Attributes with help of Excel Sheet "<SheetName>" And <RowNumber>
    Then User Selects the Category and Attribute Type Dropdown of new Attribute with help of Excel Sheet "<SheetName>" And <RowNumber>
    Then User Selects the DataType and Aggregate Dropdown of new Attribute with help of Excel Sheet "<SheetName>" And <RowNumber>
    Then User Fill in the Attribute Description "<SheetName>" And <RowNumber>
    Then User selects the Source and Schedule of new Attribute with help of Excel Sheet "<SheetName>" And <RowNumber>
    Then User Pass SQL For New Attribute"<SheetName>" And <RowNumber>
    And Click on the Save Attribute Button

    Examples: 
      | SheetName | RowNumber |
      | Attribute |         0 |

  @ATC1-1,ATC2-1,ATC2-2,ATC2-3,ATC3-1,ATC4-2
  Scenario Outline: Creat a new Attribute
    Given User select the new Attribute option
    Then User Pass Disname through excel sheet "<SheetName>" And <RowNumber>
    Then User Pass API through excel sheet "<SheetName>" And <RowNumber>
    Then User Select the Category and Attribute "<SheetName>" And <RowNumber>
    Then User Select the DataType and Aggregate  "<SheetName>" And <RowNumber>
    Then User Pass the Attribute decscription through excel sheet "<SheetName>" And <RowNumber>
    And Click on the Save the non sql Attribute

    Examples: 
      | SheetName | RowNumber |
      | Attribute |         1 |

  @ATC7-1,ATC9-1
  Scenario Outline: Edit the newly created Attribute
    Given User Select the newly added Attribute from excel "<SheetName>" And <RowNumber>
    Then User changes the Attribute description with help of excel sheet  "<SheetName>" And <RowNumber>
   Then  Save the edited Attribute  

    Examples: 
      | SheetName | RowNumber |
      | Attribute |         0 |

  @ACTC8-1,ATC11,ATC12
   Scenario Outline: Delete the Attribute
    Given User click on the Scearch and Pass the data from excel sheet "<SheetName>" and <RowNumber> Attribute
    Then Click on the Searched iteam Attribute 
    Then Click on Delete the Attribute

    Examples: 
      | SheetName | RowNumber |
      | NewTag    |         0 |

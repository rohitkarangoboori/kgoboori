Feature: Helix 172  Categories

  Background: User on the Home page of Categories
    Given User is on the Home Page Categories

  @CTC1-1,CTC2-1,CTC2-2,CTC3-1,CTC3-2,CTC4-1,CTC4-2,CTC4-3
  Scenario Outline: Create a new tag
    Given User Select Category option
    Then User click on the New Category
    Then Display data is passed from Excel "<SheetName>" and <RowNumber>
    Then API Name is passed from Excel "<SheetName>" and <RowNumber>
    Then Colour is been Choosen "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName     | RowNumber |
      | NewCategories |         0 |

  @CTC3-3
  Scenario Outline: Create a  new tag with out display name
    Given User Select Category option
    Then User click on the New Category
    Then Display data is passed from Excel "<SheetName>" and <RowNumber>
    Then API Name is passed from Excel "<SheetName>" and <RowNumber>
    Then Colour is been Choosen "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName     | RowNumber |
      | NewCategories |         0 |

  @CTC3-3,CTC4-3,CTC5-1
  Scenario Outline: Edit the Categories
    Given User will the info from excel sheet Categories"<SheetName>" and <RowNumber>
    Then User Select the tag to be edited Categories
    Then User changes info from excel sheet Categories "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName     | RowNumber |
      | NewCategories |         0 |

  @CTC6-1,CTC6-2,CTC6-3,CTC6-4,CTC6-5,CTC8,CTC9
  Scenario Outline: Delete the Categories
    Given User click on the Scearch Categories and Pass the data from excel sheet "<SheetName>" and <RowNumber>
    Then Click on the Searched Categories iteam
    Then Click on Delete Categories

    Examples: 
      | SheetName     | RowNumber |
      | NewCategories |         0 |

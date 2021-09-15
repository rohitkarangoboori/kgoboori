Feature: Helix 171 Tag

  Background: User on the Home page
    Given User is on the Home Page

  @TTC1
  Scenario: Button is active and functional
    Given User click on the New Tag Button

  @TTC4-1
  Scenario Outline: Automation of Create a new tag to Verify is a display name is required
    Given Click user on Side Tag Menu to Verify is a display name is required
    Then User Clicks on the New Tag Option  to Verify is a display name is required
    Then User Selects the Category and Tag Type  to Verify is a display name is required
    Then User Enter the Description from excel sheet "<SheetName>" and <RowNumber> and will click on the save  to Verify is a display name is required
    Then User Verifies the Error "<DisplayMassage>"

    Examples: 
      | SheetName | RowNumber | DisplayMassage         |
      | NewTag    |         0 | This field is required |

  @TTC4-2,TCC5-2,TCC13-1,TCC13-3
  Scenario Outline: Automation of Create a new tag
    Given Click user Click on Side Tag Menu
    Then User Clicks on the New Tag Option
    Then User Enters DisplayName from excel sheet "<SheetName>" and <RowNumber>
    Then User Selects the Category and Tag Type
    Then User Enter the Description from excel sheet "<SheetName>" and <RowNumber> and will click on the save

    Examples: 
      | SheetName | RowNumber |
      | NewTag    |         0 |

  @TTC5-1
  Scenario Outline: Automation of Create a new tag to Verify is a API name is required
    Given Click user on Side Tag Menu to Verify is a  API nameis required
    Then User Clicks on the New Tag Option  to Verify is a  API name is required
    Then User Enter the Display name from excel sheet "<SheetName>" and <RowNumber> to verify API Name
    Then User Selects the Category and Tag Type  to Verify is a  API name is required
    Then User Enter the Description from excel sheet "<SheetName>" and <RowNumber> and will click on the save  to Verify is a  API name is required

    Examples: 
      | SheetName | RowNumber | APIMessage             |
      | NewTag    |         0 | This field is required |

  @TTC2
  Scenario Outline: We Need to Star a Tag
    Given User click on the Scearch and Pass the data from excel sheet "<SheetName>" and <RowNumber> for Star tag
    Then Click on the Searched iteam for star tag
    Then User select the Star

    Examples: 
      | SheetName | RowNumber |
      | NewTag    |         0 |

  @TTC3
  Scenario Outline: We Need to UnStar a Tag
    Given User click on the Scearch and Pass the data from excel sheet "<SheetName>" and <RowNumber> for UnStar a tag
    Then Click on the Searched iteam for Unstar a tag
    Then User select the UnStar a tag

    Examples: 
      | SheetName | RowNumber |
      | NewTag    |         0 |

  @TTC4-3
  Scenario Outline: Automation of Create a new tag Duplicated tag name
    Given Click user Click on Side Tag Menu Duplicated tag name
    Then User Clicks on the New Tag Option Duplicated tag name
    Then User Enters DisplayName from excel sheet "<SheetName>" and <RowNumber> Duplicated tag name
    Then User Selects the Category and Tag Type Duplicated tag name
    Then User Enter the Description from excel sheet "<SheetName>" and <RowNumber> and will click on the save Duplicated tag name
    Then Verfiy the Status "<Message>"

    Examples: 
      | SheetName | RowNumber | Message                 |
      | NewTag    |         1 | This tag already exists |

  @TTC12-1,TCC12-2,TCC12-3,TCC12-4,TCC12-5,TCC12-6,TCC12-7,TCC13-3
  Scenario Outline: Creat New Tag Using SQL
    Given Click user Click on Side Tag Menu for new Tag with SQL
    Then User Clicks on the New Tag Option with SQK
    Then User Enters DisplayName  from excel sheet "<SheetName>" and <RowNumber> for SQL
    Then User Selects the Category  and  Source  and Schedule
    Then User Enter the Description for sql from excel sheet "<SheetName>" and <RowNumber>
    Then User pass sql for new tag from excel "<SheetName>" and <RowNumber> and will click on the save

    Examples: 
      | SheetName | RowNumber |
      | SQLNewTag |         0 |

  @TTC16-1,TTC16-2,TTC16-3,TTC16-4,TTC16-5,TTC16-6
  Scenario Outline: Edit the Tag
    Given User will the info from excel sheet "<SheetName>" and <RowNumber>
    Then User Select the tag to be edited
    Then User changes info from excel sheet "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | NewTag    |         0 |

  @TTC17-1,TCC13-2,TTC19-1,TCC19-2
  Scenario Outline: Delete the Tag
    Given User click on the Scearch and Pass the data from excel sheet "<SheetName>" and <RowNumber>
    Then Click on the Searched iteam
    Then Click on Delete

    Examples: 
      | SheetName | RowNumber |
      | NewTag    |         0 |

  @TTC13-2 @TTC13-3
  Scenario Outline: Dynamic and Static
    Given User click on the Scearch bar for "<Dyanmic>" Dynamic
    Then Check the "<DyamicStatus>" Dynamic
    Then User click on the Scearch bar for "<Static>" Static
    Then Check the "<StaticStatus>" Static

    Examples: 
      | Dyanmic | DyamicStatus | Static | StaticStatus |
      | Email   | Processed    | Super  | Static       |

  @TTC21-1
  Scenario Outline: Verify recalculation at interval time
    Given User Click on Tag Bar recalculation at interval time
    Then User Click on the New Tag Bar recalculation at interval time
    Then User pass the name "<SheetName>" and <RowNumber> recalculation at interval time
    Then User pass the discription "<SheetName>" and <RowNumber> recalculation at interval time
    Then User pass the SQL data from excel "<SheetName>" and <RowNumber> recalculation  at interval time
    Then User click on the save Button recalculation at interval time

    Examples: 
      | SheetName     | RowNumber |
      | Recalculation |         0 |

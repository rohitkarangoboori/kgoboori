Feature: Export Manager

  Background: User is on Export Manager Page
    Given User Enter the Correct Credentials to Login and Land on Export Manager Page

  @GREM1-1
  Scenario: User has the ability to select Export Manager
    Given User click on the Golden Record Export Feild

  @GREM1-2
  Scenario: User has the ability to select the help icon
    Given User click on the Export Manger Help

  @GREM1-3
  Scenario: User has the ability to activate New Export button
    Given User click on the new Export Button


  @GREM1-5
  Scenario Outline: New Export record inserted has field values Records & Status is In Progress
    Given User check the "<Records>" of new Export
    Then User check the "<Status>"

    Examples: 
      | Record    | Status      |
      | 3,800,783 | In Progress |

  @GREM1-7
  Scenario: New Export modal window can be closed
  Given User Click on the closed X of new Export

Feature: Login Page Automation

  @SSO
 Scenario Outline: Single Sign on 
  Given User pass the url
  Then User pass the email from excel sheet with "<SheetName>" And <RowNumber>
  Then User click on the next button
  Then User fill the user name from excel "<SheetName>" And <RowNumber>
  Then User fill the password from  excel "<SheetName>" And <RowNumber>
  Then User click on the Submit Button 
    Examples: 
      | SheetName | RowNumber |
      | SSO   |         0 |

package testcases_stepdef;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import BaseClass.browsersetup;
import PageObjectory.HelixLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.Dropdown;
import utility.utility;

public class GoldenRecordsRules {
    WebDriver driver;
	HelixLogin HL;
    Dropdown DD;
    utility ut ;
    static String filepath = System.getProperty("user.dir") + "//config//file.properties";
    String excelpath = System.getProperty("user.dir") + "//ExcelData//Testdata.xlsx";
    static File file;
    static FileInputStream inputfile;
    static Properties prop;
	static FileInputStream fileInput;
	@Given("^User pass all the required Data for Login$")
	public void user_pass_all_the_required_Data_for_Login() throws Throwable {
		 file = new File(filepath); 
			inputfile = new FileInputStream(file);
		        prop = new Properties();
		        prop.load(inputfile);
		        driver = browsersetup.setup(prop.getProperty("Browsername"), prop.getProperty("Url"));
		    	 HL = new HelixLogin(driver);
		        ut = new utility(driver);
		        ut.pause(1000);
		        HL.strEmail(prop.getProperty("Email"));
		        ut.pause(1000);
		        HL.clickNext();
		        ut.pause(1000);
		        HL.clickAC();
		        ut.pause(1000);
		        HL.strMSEmail(prop.getProperty("MSEmail"));
		        ut.pause(1000);
		        HL.clickMSNext();
		        ut.pause(1000);
		        HL.strMSPassword(prop.getProperty("Password"));
		        ut.pause(1000);
		        HL.clickMSSignin();
		        ut.pause(1000);
		        HL.clickMSyes();
		        ut.pause(1000);
		        HL.clickOrganization();
		        ut.pause(1000);
	}

	@Given("^User Click on the Add new Tiebreaker for FirstName$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_FirstName() throws Throwable {
		HL.clickFN();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);
	 
	}

	@Then("^User Select the Attribut and Order for FirstName$")
	public void user_Select_the_Attribut_and_Order_for_FirstName() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");
	}

	@Then("^User Click on the Save for New TieBreaker for FirstName$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_FirstName() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
	 
	}

	@Given("^User Click on the Add new Tiebreaker for LastName$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_LastName() throws Throwable {
		HL.clickLN();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);
	}

	@Then("^User Select the Attribut and Order for LastName$")
	public void user_Select_the_Attribut_and_Order_for_LastName() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");
	}

	@Then("^User Click on the Save for New TieBreaker for LastName$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_LastName() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
	}

	@Given("^User Click on the Add new Tiebreaker for Email$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_Email() throws Throwable {
		HL.clickGRE();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);
	}
	

	@Then("^User Select the Attribut and Order for Email$")
	public void user_Select_the_Attribut_and_Order_for_Email() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");
	}

	@Then("^User Click on the Save for New TieBreaker for Email$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_Email() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
	}

	@Given("^User Click on the Add new Tiebreaker for CompanyName$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_CompanyName() throws Throwable {
		HL.clickCN();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);
	}

	@Then("^User Select the Attribut and Order for CompanyName$")
	public void user_Select_the_Attribut_and_Order_for_CompanyName() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");
	}

	@Then("^User Click on the Save for New TieBreaker for CompanyName$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_CompanyName() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
	}

	@Given("^User Click on the Add new Tiebreaker for WorkPhone$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_WorkPhone() throws Throwable {
		HL.clickWP();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);
	}

	@Then("^User Select the Attribut and Order for WorkPhone$")
	public void user_Select_the_Attribut_and_Order_for_WorkPhone() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");
	}

	@Then("^User Click on the Save for New TieBreaker for WorkPhone$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_WorkPhone() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
	}

	@Given("^User Click on the Add new Tiebreaker for HomePhone$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_HomePhone() throws Throwable {
		HL.clickHP();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);
	}

	@Then("^User Select the Attribut and Order for HomePhone$")
	public void user_Select_the_Attribut_and_Order_for_HomePhone() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");
	}

	@Then("^User Click on the Save for New TieBreaker for HomePhone$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_HomePhone() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
	}

	@Given("^User Click on the Add new Tiebreaker for CellPhone$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_CellPhone() throws Throwable {
		HL.clickCP();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);
	}

	@Then("^User Select the Attribut and Order for CellPhone$")
	public void user_Select_the_Attribut_and_Order_for_CellPhone() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");
	}

	@Then("^User Click on the Save for New TieBreaker for CellPhone$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_CellPhone() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
	}

	@Given("^User Click on the Add new Tiebreaker for AddressLine(\\d+)$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_AddressLine(int arg1) throws Throwable {
		HL.clickAdd1();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);
	}

	@Then("^User Select the Attribut and Order for AddressLine(\\d+)$")
	public void user_Select_the_Attribut_and_Order_for_AddressLine(int arg1) throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");
	}

	@Then("^User Click on the Save for New TieBreaker for AddressLine(\\d+)$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_AddressLine(int arg1) throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
	}

	@Given("^User Click on the Add new Tiebreaker for City$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_City() throws Throwable {
		HL.clickCity();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);
	}

	@Then("^User Select the Attribut and Order for City$")
	public void user_Select_the_Attribut_and_Order_for_City() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");
	}

	@Then("^User Click on the Save for New TieBreaker for City$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_City() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
	}

	@Given("^User Click on the Add new Tiebreaker for State$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_State() throws Throwable {
		HL.clickState();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);
	}

	@Then("^User Select the Attribut and Order for State$")
	public void user_Select_the_Attribut_and_Order_for_State() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");
	}

	@Then("^User Click on the Save for New TieBreaker for State$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_State() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
	}

	@Given("^User Click on the Add new Tiebreaker for Country$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_Country() throws Throwable {
		HL.clickCountry();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);

	}

	@Then("^User Select the Attribut and Order for Country$")
	public void user_Select_the_Attribut_and_Order_for_Country() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");

	}

	@Then("^User Click on the Save for New TieBreaker for Country$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_Country() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();

	}

	@Given("^User Click on the Add new Tiebreaker for Zip$")
	public void user_Click_on_the_Add_new_Tiebreaker_for_Zip() throws Throwable {
		HL.clickZip();
		ut.pause(1000);
		HL.clickATB();
		ut.pause(1000);
	}

	@Then("^User Select the Attribut and Order for Zip$")
	public void user_Select_the_Attribut_and_Order_for_Zip() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setAttribute(), "0: CreatedOn");
	}

	@Then("^User Click on the Save for New TieBreaker for Zip$")
	public void user_Click_on_the_Save_for_New_TieBreaker_for_Zip() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
	}
}

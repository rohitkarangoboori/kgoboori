package testcases_stepdef;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import BaseClass.browsersetup;
import PageObjectory.HelixLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.Dropdown;
import utility.ExcelReader;
import utility.utility;

public class AudienceBuilder {
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

	@Given("^User is on the Home Page  of Audience Builder$")
	public void user_is_on_the_Home_Page_of_Audience_Builder() throws Throwable {
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

	@Given("^User is on the Home Page after Signin and Click on the Audience Builder Side Bar$")
	public void user_is_on_the_Home_Page_after_Signin_and_Click_on_the_Audience_Builder_Side_Bar() throws Throwable {
	HL.clickAudienceBuilder();
	ut.pause(1000);
	}

	@Given("^User on the home page of Attribute Builder page to check the Refresh is working$")
	public void user_on_the_home_page_of_Attribute_Builder_page_to_check_the_Refresh_is_working() throws Throwable {
	 ut.pause(1000);
	 HL.clickAudienceBuilder();
	 ut.pause(1000);
	}

	@Then("^User click on the Refresh of Attribute Builder$")
	public void user_click_on_the_Refresh_of_Attribute_Builder() throws Throwable {
    HL.clickABR();
    ut.pause(1000);
	}
	@Given("^User on the home Page  of Attribute to check the Search Feild is working$")
	public void user_on_the_home_Page_of_Attribute_to_check_the_Search_Feild_is_working() throws Throwable {
	 
		 ut.pause(1000);
		 HL.clickAudienceBuilder();
		 ut.pause(1000);
	}

	@Then("^User pass info \"([^\"]*)\" of Attribute Builder$")
	public void user_pass_info_of_Attribute_Builder(String SearchBar) throws Throwable {
	  
  HL.strABQS(SearchBar);
  ut.pause(1000);
	}

@Given("^User on the Home page of AB to Verify sorted asc and then desc and then default$")
public void user_on_the_Home_page_of_AB_to_Verify_sorted_asc_and_then_desc_and_then_default() throws Throwable {
	 ut.pause(1000);
	 HL.clickAudienceBuilder();
	 ut.pause(1000);
}

@Then("^User click on the Acc$")
public void user_click_on_the_Acc() throws Throwable {
  HL.clickABAcc();
  ut.pause(1000);
}

@Then("^User click on the Desc$")
public void user_click_on_the_Desc() throws Throwable {
	  HL.clickABAcc();
	  ut.pause(1000);
}

@Then("^User click on the default$")
public void user_click_on_the_default() throws Throwable {
	  HL.clickABAcc();
	  ut.pause(1000);
}
@Given("^User is on the Attribute Builder Page to verfiy the total number$")
public void user_is_on_the_Attribute_Builder_Page_to_verfiy_the_total_number() throws Throwable {
	 ut.pause(1000);
	 HL.clickAudienceBuilder();
	 ut.pause(1000);
}

@Then("^Verify the TotalNumber of records from \"([^\"]*)\" and (\\d+)$")
public void verify_the_TotalNumber_of_records_from_and(String SheetName, int RowNumber) throws Throwable {
	ut.pause(1000);
	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
	String TN = testData.get(RowNumber).get("TotalNumber");
	HL.isPresent(TN);
	ut.pause(1000);
	
	
}
@Given("^User is on the new attribute home page$")
public void user_is_on_the_new_attribute_home_page() throws Throwable {
	ut.pause(1000);
	 HL.clickAudienceBuilder();
	 ut.pause(1000);
}

@Then("^User click on the new attribute$")
public void user_click_on_the_new_attribute() throws Throwable {
 HL.clickNA();
 ut.pause(1000);
}


}

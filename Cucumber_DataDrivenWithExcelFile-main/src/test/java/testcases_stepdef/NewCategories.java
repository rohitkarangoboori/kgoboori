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

public class NewCategories {
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
	@Given("^User is on the Home Page Categories$")
	public void user_is_on_the_Home_Page_Categories() throws Throwable {
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
	        HL.clickTag();
	}

	@Given("^User Select Category option$")
	public void user_Select_Category_option() throws Throwable {
		HL.clickCAT();
		ut.pause(1000);
	   
	}

	@Then("^User click on the New Category$")
	public void user_click_on_the_New_Category() throws Throwable {
		HL.clickNC();
		ut.pause(1000);
	}

	@Then("^Display data is passed from Excel \"([^\"]*)\" and (\\d+)$")
	public void display_data_is_passed_from_Excel_and(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DN = testData.get(RowNumber).get("DisplayName");
		HL.strDisplayName(DN);
	   
	}

	@Then("^API Name is passed from Excel \"([^\"]*)\" and (\\d+)$")
	public void api_Name_is_passed_from_Excel_and(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String AN = testData.get(RowNumber).get("APIName");
		HL.strAPIName(AN);
	
	}

	@Then("^Colour is been Choosen \"([^\"]*)\" and (\\d+)$")
	public void colour_is_been_Choosen_and(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String CL = testData.get(RowNumber).get("Color");
		HL.strColour(CL);
		ut.pause(1000);
		HL.clickSaveTag();
		ut.pause(1000);
		driver.close();
	   
	}

	@Given("^User will the info from excel sheet Categories\"([^\"]*)\" and (\\d+)$")
	public void user_will_the_info_from_excel_sheet_Categories_and(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		HL.clickCAT();
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String SF = testData.get(RowNumber).get("SearchFilter");
		HL.strSF(SF);
	}

	@Then("^User Select the tag to be edited Categories$")
	public void user_Select_the_tag_to_be_edited_Categories() throws Throwable {
		ut.pause(1000);
		HL.clickEC();
	   
	}

	@Then("^User changes info from excel sheet Categories \"([^\"]*)\" and (\\d+)$")
	public void user_changes_info_from_excel_sheet_Categories_and(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String CL = testData.get(RowNumber).get("NewColor");
		HL.strColour(CL);
		ut.pause(1000);
		HL.clickSaveTag();
		ut.pause(1000);
		driver.close();
	}
	@Given("^User click on the Scearch Categories and Pass the data from excel sheet \"([^\"]*)\" and (\\d+)$")
	public void user_click_on_the_Scearch_Categories_and_Pass_the_data_from_excel_sheet_and(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		HL.clickCAT();
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String SF = testData.get(RowNumber).get("SearchFilter");
		HL.strSF(SF);
	}

	@Then("^Click on the Searched Categories iteam$")
	public void click_on_the_Searched_Categories_iteam() throws Throwable {
		HL.clickEC();
		ut.pause(1000);
		HL.clickSB();
	 
	}

	@Then("^Click on Delete Categories$")
	public void click_on_Delete_Categories() throws Throwable {
		ut.pause(1000);
		HL.clickDel();
		ut.pause(2000);
		HL.clickDB();
		driver.close();
	}
}

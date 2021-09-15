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

public class Attribute {
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
	@Given("^Make sure you are logged in with correct credentails$")
	public void make_sure_you_are_logged_in_with_correct_credentails() throws Throwable {
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

	@Given("^User select the Attributes selection$")
	public void user_select_the_Attributes_selection() throws Throwable {
	   HL.clickAttributeTab();
	}

	@Then("^User click on the new Attributes$")
	public void user_click_on_the_new_Attributes() throws Throwable {
	ut.pause(1000);
	HL.clickNewAttribute();
	ut.pause(1000);
	}

	@Then("^User pass the displayname for Attributes with help of excel \"([^\"]*)\" And (\\d+)$")
	public void user_pass_the_displayname_for_Attributes_with_help_of_excel_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DN = testData.get(RowNumber).get("DisplayName");
		HL.strDisplayName(DN);
	   
	}

	@Then("^User pass the APIname for the Attributes with help of Excel Sheet \"([^\"]*)\" And (\\d+)$")
	public void user_pass_the_APIname_for_the_Attributes_with_help_of_Excel_Sheet_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String APIN= testData.get(RowNumber).get("APIName");
		HL.strAPIName(APIN);
	}

	@Then("^User Selects the Category and Attribute Type Dropdown of new Attribute with help of Excel Sheet \"([^\"]*)\" And (\\d+)$")
	public void user_Selects_the_Category_and_Attribute_Type_Dropdown_of_new_Attribute_with_help_of_Excel_Sheet_And(String SheetName, int RowNumber) throws Throwable {
		DD =new Dropdown(driver);
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String Cat= testData.get(RowNumber).get("Category");
		ut.pause(2000);
	    DD.selectDropdownByValue(HL.setCategory(),Cat);
	    ut.pause(2000);
	    String at= testData.get(RowNumber).get("AttributeType");
	    DD.selectDropdownText(HL.setTagType(),at);
	}

	@Then("^User Selects the DataType and Aggregate Dropdown of new Attribute with help of Excel Sheet \"([^\"]*)\" And (\\d+)$")
	public void user_Selects_the_DataType_and_Aggregate_Dropdown_of_new_Attribute_with_help_of_Excel_Sheet_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DT= testData.get(RowNumber).get("DataType");
		ut.pause(1000);
	    DD.selectDropdownText(HL.setDataType(),DT);
	    ut.pause(1000);
	    String AG= testData.get(RowNumber).get("Aggregate");
	    DD.selectDropdownText(HL.setAggregate(), AG);

	}


	@Then("^User Fill in the Attribute Description \"([^\"]*)\" And (\\d+)$")
	public void user_Fill_in_the_Attribute_Description_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DES= testData.get(RowNumber).get("Description");
		ut.pause(1000);
		HL.strDescription(DES);
	
	}

	@Then("^User selects the Source and Schedule of new Attribute with help of Excel Sheet \"([^\"]*)\" And (\\d+)$")
	public void user_selects_the_Source_and_Schedule_of_new_Attribute_with_help_of_Excel_Sheet_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String ST= testData.get(RowNumber).get("Source");
		ut.pause(1000);
	    DD.selectDropdownByValue(HL.setSource(),ST);
	    ut.pause(1000);
	    String SCH= testData.get(RowNumber).get("Schedule");
	    DD.selectDropdownByValue(HL.setSchedule(), SCH);
	}

	@Then("^User Pass SQL For New Attribute\"([^\"]*)\" And (\\d+)$")
	public void user_Pass_SQL_For_New_Attribute_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String sql= testData.get(RowNumber).get("SQL");
		ut.pause(1000);
		HL.strSQL(sql);;
	}

	@Then("^Click on the Save Attribute Button$")
	public void click_on_the_Save_Attribute_Button() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
		ut.pause(1000);
		driver.close();
	}

	@Given("^User select the new Attribute option$")
	public void user_select_the_new_Attribute_option() throws Throwable {
		  HL.clickAttributeTab();
			ut.pause(1000);
			HL.clickNewAttribute();
			ut.pause(1000);
	}

	@Then("^User Pass Disname through excel sheet \"([^\"]*)\" And (\\d+)$")
	public void user_Pass_Disname_through_excel_sheet_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DN = testData.get(RowNumber).get("DisplayName");
		HL.strDisplayName(DN);
	}

	@Then("^User Pass API through excel sheet \"([^\"]*)\" And (\\d+)$")
	public void user_Pass_API_through_excel_sheet_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String APIN= testData.get(RowNumber).get("APIName");
		HL.strAPIName(APIN);
	}

	@Then("^User Select the Category and Attribute \"([^\"]*)\" And (\\d+)$")
	public void user_Select_the_Category_and_Attribute_And(String SheetName, int RowNumber) throws Throwable {
		DD =new Dropdown(driver);
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String Cat= testData.get(RowNumber).get("Category");
		ut.pause(1000);
	    DD.selectDropdownText(HL.setCategory(),Cat);
	    ut.pause(1000);
	    String at= testData.get(RowNumber).get("AttributeType");
	    DD.selectDropdownText(HL.setTagType(),at);
	}

	@Then("^User Select the DataType and Aggregate  \"([^\"]*)\" And (\\d+)$")
	public void user_Select_the_DataType_and_Aggregate_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DT= testData.get(RowNumber).get("DataType");
		ut.pause(1000);
	    DD.selectDropdownText(HL.setDataType(),DT);
	    ut.pause(1000);
	    String AG= testData.get(RowNumber).get("Aggregate");
	    DD.selectDropdownText(HL.setAggregate(), AG);

	}

	@Then("^User Pass the Attribute decscription through excel sheet \"([^\"]*)\" And (\\d+)$")
	public void user_Pass_the_Attribute_decscription_through_excel_sheet_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DES= testData.get(RowNumber).get("Description");
		ut.pause(1000);
		HL.strDescription(DES);
	}

	@Then("^Click on the Save the non sql Attribute$")
	public void click_on_the_Save_the_non_sql_Attribute() throws Throwable {
		ut.pause(1000);
		HL.clickSaveTag();
		ut.pause(1000);
		driver.close();

	}

	@Given("^User Select the newly added Attribute from excel \"([^\"]*)\" And (\\d+)$")
	public void user_Select_the_newly_added_Attribute_from_excel_And(String SheetName, int RowNumber) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   HL.clickAttributeTab();
	   ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String SF = testData.get(RowNumber).get("Search");
		HL.strSF(SF);
		HL.clickSelectAttribute();
	}

	@Then("^User changes the Attribute description with help of excel sheet  \"([^\"]*)\" And (\\d+)$")
	public void user_changes_the_Attribute_description_with_help_of_excel_sheet_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DES= testData.get(RowNumber).get("Description1");
		ut.pause(1000);
		HL.strDescription(DES);
	}

	@Then("^Save the edited Attribute$")
	public void save_the_edited_Attribute() throws Throwable {
	    ut.pause(1000);
	    HL.clickSaveTag();
	}

	@Given("^User click on the Scearch and Pass the data from excel sheet \"([^\"]*)\" and (\\d+) Attribute$")
	public void user_click_on_the_Scearch_and_Pass_the_data_from_excel_sheet_and_Attribute(String SheetName, int RowNumber) throws Throwable {
		HL.clickAttributeTab();
		   ut.pause(1000);
			ExcelReader reader = new ExcelReader();
			List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
			String SF = testData.get(RowNumber).get("Search");
			HL.strSF(SF);
	}

	@Then("^Click on the Searched iteam Attribute$")
	public void click_on_the_Searched_iteam_Attribute() throws Throwable {
		ut.pause(1000);
		HL.clickSelectAttribute();
	}

	@Then("^Click on Delete the Attribute$")
	public void click_on_Delete_the_Attribute() throws Throwable {
	 ut.pause(1000);
	 HL.clickSB();
		ut.pause(1000);
		HL.clickDel();
		ut.pause(1000);
		HL.clickDB();
		ut.pause(1000);
		driver.close();
	}



}

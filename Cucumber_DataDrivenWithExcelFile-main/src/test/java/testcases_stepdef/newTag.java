package testcases_stepdef;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BaseClass.browsersetup;
import PageObjectory.HelixLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.Dropdown;
import utility.ExcelReader;
import utility.utility;

public class newTag {
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

	@Given("^User is on the Home Page$")
	public void user_is_on_the_Home_Page() throws Throwable {
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
	@Given("^User click on the New Tag Button$")
	public void user_click_on_the_New_Tag_Button() throws Throwable {
		HL.clickTag();
		ut.pause(1000);
		HL.clickNewTag();
	}



	@Given("^Click user Click on Side Tag Menu$")  
	public void click_user_Click_on_Side_Tag_Menu() throws Throwable {
		HL.clickTag();
	}

	@Then("^User Clicks on the New Tag Option$")
	public void user_Clicks_on_the_New_Tag_Option() throws Throwable {
		ut.pause(1000);
		HL.clickNewTag();
	}

	@Then("^User Enters DisplayName from excel sheet \"([^\"]*)\" and (\\d+)$")
	public void user_Enters_DisplayName_from_excel_sheet_and(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DN = testData.get(RowNumber).get("DisplayName");
		HL.strDisplayName(DN);

	}

	@Then("^User Selects the Category and Tag Type$")
	public void user_Selects_the_Category_and_Tag_Type() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setCategory(), "qa-test-01");
	    ut.pause(1000);
		DD.selectDropdownText(HL.setTagType(), "Static");
	}

	@Then("^User Enter the Description from excel sheet \"([^\"]*)\" and (\\d+) and will click on the save$")
	public void user_Enter_the_Description_from_excel_sheet_and_and_will_click_on_the_save(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String Dis = testData.get(RowNumber).get("Description");
		HL.strDescription(Dis);
		ut.pause(1000);
		HL.clickSaveTag();
		ut.pause(1000);
		driver.close();
	}
	@Given("^User click on the Scearch and Pass the data from excel sheet \"([^\"]*)\" and (\\d+) for Star tag$")
	public void user_click_on_the_Scearch_and_Pass_the_data_from_excel_sheet_and_for_Star_tag(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		HL.clickTag();
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String SF = testData.get(RowNumber).get("Search");
		HL.strSF(SF);
		
	}

	@Then("^Click on the Searched iteam for star tag$")
	public void click_on_the_Searched_iteam_for_star_tag() throws Throwable {
    ut.pause(1000);
    HL.clickSelectTag();
	}

	@Then("^User select the Star$")
	public void user_select_the_Star() throws Throwable {
		ut.pause(1000);
		HL.clickstar();
		ut.pause(1000);
		HL.clickSaveTag();
	 
	}

	@Given("^User click on the Scearch and Pass the data from excel sheet \"([^\"]*)\" and (\\d+) for UnStar a tag$")
	public void user_click_on_the_Scearch_and_Pass_the_data_from_excel_sheet_and_for_UnStar_a_tag(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		HL.clickTag();
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String SF = testData.get(RowNumber).get("Search");
		HL.strSF(SF);
		
	}

	@Then("^Click on the Searched iteam for Unstar a tag$")
	public void click_on_the_Searched_iteam_for_Unstar_a_tag() throws Throwable {
		ut.pause(1000);
		HL.clickSelectTag();
	}

	@Then("^User select the UnStar a tag$")
	public void user_select_the_UnStar_a_tag() throws Throwable {
		ut.pause(1000);
		HL.clickstar();
		ut.pause(1000);
		HL.clickSaveTag();
	 
	}


	@Given("^Click user on Side Tag Menu to Verify is a display name is required$")
	public void click_user_on_Side_Tag_Menu_to_Verify_is_a_display_name_is_required() throws Throwable {
			HL.clickTag();
		}

		@Then("^User Clicks on the New Tag Option  to Verify is a display name is required$")
		public void user_Clicks_on_the_New_Tag_Option_to_Verify_is_a_display_name_is_required() throws Throwable {
			ut.pause(1000);
			HL.clickNewTag();
		}

		@Then("^User Selects the Category and Tag Type  to Verify is a display name is required$")
		public void user_Selects_the_Category_and_Tag_Type_to_Verify_is_a_display_name_is_required() throws Throwable {
			DD  = new Dropdown(driver);
		    ut.pause(1000);
			DD.selectDropdownByValue(HL.setCategory(), "qa-test-01");
		    ut.pause(1000);
			DD.selectDropdownText(HL.setTagType(), "Static");
		}

		@Then("^User Enter the Description from excel sheet \"([^\"]*)\" and (\\d+) and will click on the save  to Verify is a display name is required$")
		public void user_Enter_the_Description_from_excel_sheet_and_and_will_click_on_the_save_to_Verify_is_a_display_name_is_required(String SheetName, int RowNumber) throws Throwable {
			ut.pause(1000);
			ExcelReader reader = new ExcelReader();
			List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
			String Dis = testData.get(RowNumber).get("Description");
			HL.strDescription(Dis);
			ut.pause(1000);
			HL.clickSaveTag();
			ut.pause(1000);
			
		
		}
		@Then("^User Verifies the Error \"([^\"]*)\"$")
		public void user_Verifies_the_Error(String DisplayMessage) throws Throwable {
		  Assert.assertEquals(DisplayMessage, HL.getDisplayname());
		}


		@Given("^Click user Click on Side Tag Menu Duplicated tag name$")
		public void click_user_Click_on_Side_Tag_Menu_Duplicated_tag_name() throws Throwable {
			HL.clickTag();
		}

		@Then("^User Clicks on the New Tag Option Duplicated tag name$")
		public void user_Clicks_on_the_New_Tag_Option_Duplicated_tag_name() throws Throwable {
			ut.pause(1000);
			HL.clickNewTag();
		}

		@Then("^User Enters DisplayName from excel sheet \"([^\"]*)\" and (\\d+) Duplicated tag name$")
		public void user_Enters_DisplayName_from_excel_sheet_and_Duplicated_tag_name(String SheetName, int RowNumber) throws Throwable {
			ut.pause(1000);
			ExcelReader reader = new ExcelReader();
			List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
			String DN = testData.get(RowNumber).get("DisplayName");
			HL.strDisplayName(DN);
		}

		@Then("^User Selects the Category and Tag Type Duplicated tag name$")
		public void user_Selects_the_Category_and_Tag_Type_Duplicated_tag_name() throws Throwable {
			DD  = new Dropdown(driver);
		    ut.pause(1000);
			DD.selectDropdownByValue(HL.setCategory(), "qa-test-01");
		    ut.pause(1000);
			DD.selectDropdownText(HL.setTagType(), "Static");
		}

		@Then("^User Enter the Description from excel sheet \"([^\"]*)\" and (\\d+) and will click on the save Duplicated tag name$")
		public void user_Enter_the_Description_from_excel_sheet_and_and_will_click_on_the_save_Duplicated_tag_name(String SheetName, int RowNumber) throws Throwable {
			ut.pause(1000);
			ExcelReader reader = new ExcelReader();
			List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
			String Dis = testData.get(RowNumber).get("Description");
			HL.strDescription(Dis);
			ut.pause(1000);
			HL.clickSaveTag();
			ut.pause(1000);
		}

		@Then("^Verfiy the Status \"([^\"]*)\"$")
		public void verfiy_the_Status(String Message) throws Throwable {
			Assert.assertEquals(Message,HL.getTagAlreadyExist());
			driver.close();
		}


		
	@Given("^User will the info from excel sheet \"([^\"]*)\" and (\\d+)$")
	public void user_will_the_info_from_excel_sheet_and(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		HL.clickTag();
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String SF = testData.get(RowNumber).get("Search");
		HL.strSF(SF);
		
	}

	@Then("^User Select the tag to be edited$")
	public void user_Select_the_tag_to_be_edited() throws Throwable {
		ut.pause(1000);
		HL.clickEdit();
	
	}

	@Then("^User changes info from excel sheet \"([^\"]*)\" and (\\d+)$")
	public void user_changes_info_from_excel_sheet_and(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String ND = testData.get(RowNumber).get("Description1");
		HL.strDescription(ND);
		ut.pause(1000);
		HL.clickSaveTag();
		ut.pause(1000);
		driver.close();
		
	}
	@Given("^User click on the Scearch and Pass the data from excel sheet \"([^\"]*)\" and (\\d+)$")
	public void user_click_on_the_Scearch_and_Pass_the_data_from_excel_sheet_and(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		HL.clickTag();
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String SF = testData.get(RowNumber).get("Search");
		HL.strSF(SF);
	}

	@Then("^Click on the Searched iteam$")
	public void click_on_the_Searched_iteam() throws Throwable {
		HL.clickEdit();
		ut.pause(1000);
		HL.clickSB();

	}

	@Then("^Click on Delete$")
	public void click_on_Delete() throws Throwable {
	ut.pause(1000);
	HL.clickDel();
	ut.pause(1000);
	HL.clickDB();
	ut.pause(1000);
	driver.close();
	
	
	}

	@Given("^User click on the Scearch bar for \"([^\"]*)\" Dynamic$")
	public void user_click_on_the_Scearch_bar_for_Dynamic(String Dyanmic) throws Throwable {
		ut.pause(1000);
		HL.clickTag();
		ut.pause(1000);
		HL.strSF(Dyanmic);
	}

	@Then("^Check the \"([^\"]*)\" Dynamic$")
	public void check_the_Dynamic(String DyamicStatus ) throws Throwable {
 Assert.assertEquals(DyamicStatus , HL.getProcessed());
	}

	@Then("^User click on the Scearch bar for \"([^\"]*)\" Static$")
	public void user_click_on_the_Scearch_bar_for_Static(String Static) throws Throwable {
		ut.pause(1000);
		HL.clickTag();
		ut.pause(1000);
		HL.strSF(Static);
	}

	@Then("^Check the \"([^\"]*)\" Static$")
	public void check_the_Static(String StaticStatus) throws Throwable {
	 Assert.assertEquals(StaticStatus, HL.getStatic());
	}


	@Given("^Click user Click on Side Tag Menu for new Tag with SQL$")
	public void click_user_Click_on_Side_Tag_Menu_for_new_Tag_with_SQL() throws Throwable {
		HL.clickTag();
	}

	@Then("^User Clicks on the New Tag Option with SQK$")
	public void user_Clicks_on_the_New_Tag_Option_with_SQK() throws Throwable {
		ut.pause(1000);
		HL.clickNewTag();
	}

	@Then("^User Enters DisplayName  from excel sheet \"([^\"]*)\" and (\\d+) for SQL$")
	public void user_Enters_DisplayName_from_excel_sheet_and_for_SQL(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DN = testData.get(RowNumber).get("DisplayName");
		HL.strDisplayName(DN);
	}

	@Then("^User Selects the Category  and  Source  and Schedule$")
	public void user_Selects_the_Category_and_Source_and_Schedule() throws Throwable {
		DD  = new Dropdown(driver);
		DD.selectDropdownByValue(HL.setCategory(), "qa-test-01");
	    ut.pause(1000);
	    DD.selectDropdownByValue(HL.setSource(),"marketo");
	    ut.pause(1000);
	}

	@Then("^User Enter the Description for sql from excel sheet \"([^\"]*)\" and (\\d+)$")
	public void user_Enter_the_Description_for_sql_from_excel_sheet_and(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String Dis = testData.get(RowNumber).get("Description");
		HL.strDescription(Dis);
		ut.pause(1000);
		
	    
	}

	@Then("^User pass sql for new tag from excel \"([^\"]*)\" and (\\d+) and will click on the save$")
	public void user_pass_sql_for_new_tag_from_excel_and_and_will_click_on_the_save(String SheetName, int RowNumber) throws Throwable {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String sql = testData.get(RowNumber).get("SQL");
		HL.strSQL(sql);
		ut.pause(1000);
		HL.clickSaveTag();
		ut.pause(1000);
		driver.close();
	}
	@Given("^Click user on Side Tag Menu to Verify is a  API nameis required$")
	public void click_user_on_Side_Tag_Menu_to_Verify_is_a_API_nameis_required() throws Throwable {
		HL.clickTag();
	}

	@Then("^User Clicks on the New Tag Option  to Verify is a  API name is required$")
	public void user_Clicks_on_the_New_Tag_Option_to_Verify_is_a_API_name_is_required() throws Throwable {
		ut.pause(1000);
		HL.clickNewTag();
	}

	@Then("^User Enter the Display name from excel sheet \"([^\"]*)\" and (\\d+) to verify API Name$")
	public void user_Enter_the_Display_name_from_excel_sheet_and_to_verify_API_Name(String SheetName, int RowNumber) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DN = testData.get(RowNumber).get("DisplayName");
		HL.strDisplayName(DN);
		ut.pause(1000);
		HL.clickAPIName();
	}

	@Then("^User Selects the Category and Tag Type  to Verify is a  API name is required$")
	public void user_Selects_the_Category_and_Tag_Type_to_Verify_is_a_API_name_is_required() throws Throwable {
		DD  = new Dropdown(driver);
	    ut.pause(1000);
		DD.selectDropdownByValue(HL.setCategory(), "qa-test-01");
	    ut.pause(1000);
		DD.selectDropdownText(HL.setTagType(), "Static");
	}

	@Then("^User Enter the Description from excel sheet \"([^\"]*)\" and (\\d+) and will click on the save  to Verify is a  API name is required$")
	public void user_Enter_the_Description_from_excel_sheet_and_and_will_click_on_the_save_to_Verify_is_a_API_name_is_required(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String Dis = testData.get(RowNumber).get("Description");
		HL.strDescription(Dis);
		ut.pause(1000);
		HL.clickSaveTag();
	}

	@Then("^User Verifies the Error \"([^\"]*)\"  if APIName is required$")
	public void user_Verifies_the_Error_if_APIName_is_required(String APIMessage) throws Throwable {
	    Assert.assertEquals(APIMessage, HL.getDisplayname());
	}

	@Given("^User Click on Tag Bar recalculation at interval time$")
	public void user_Click_on_Tag_Bar_recalculation_at_interval_time() throws Throwable {
		HL.clicKNTB();
		ut.pause(1000);
	}

	@Then("^User Click on the New Tag Bar recalculation at interval time$")
	public void user_Click_on_the_New_Tag_Bar_recalculation_at_interval_time() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HL.clickANTB();
		ut.pause(1000);
	}

	@Then("^User pass the name \"([^\"]*)\" and (\\d+) recalculation at interval time$")
	public void user_pass_the_name_and_recalculation_at_interval_time(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String DN = testData.get(RowNumber).get("Name");
		HL.strAPIName(DN);
	}

	@Then("^User pass the discription \"([^\"]*)\" and (\\d+) recalculation at interval time$")
	public void user_pass_the_discription_and_recalculation_at_interval_time(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String Dis = testData.get(RowNumber).get("Description");
		HL.strDescription(Dis);
		ut.pause(1000);
	}

	@Then("^User pass the SQL data from excel \"([^\"]*)\" and (\\d+) recalculation  at interval time$")
	public void user_pass_the_SQL_data_from_excel_and_recalculation_at_interval_time(String SheetName, int RowNumber) throws Throwable {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String sql = testData.get(RowNumber).get("SQL");
		HL.strSQL(sql);
		ut.pause(1000);
		
	}

	@Then("^User click on the save Button recalculation at interval time$")
	public void user_click_on_the_save_Button_recalculation_at_interval_time() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	      HL.clickSaveTag(); 
	}


}

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

public class ExportManager {
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
	
	@Given("^User Enter the Correct Credentials to Login and Land on Export Manager Page$")
	public void user_Enter_the_Correct_Credentials_to_Login_and_Land_on_Export_Manager_Page() throws Throwable {
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
		        HL.clickGoldenRecordsContact();
	}

	@Given("^User click on the Golden Record Export Feild$")
	public void user_click_on_the_Golden_Record_Export_Feild() throws Throwable {
		HL.clickGRDownload();
		ut.pause(1000);
	   
	}

@Given("^User click on the Export Manger Help$")
public void user_click_on_the_Export_Manger_Help() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	HL.clickGRDownload();
	ut.pause(1000);
	HL.clickHelp();
   ut.pause(1000);
}
@Given("^User click on the new Export Button$")
public void user_click_on_the_new_Export_Button() throws Throwable {
	HL.clickGRDownload();
	ut.pause(1000);
	HL.clicKMDMExport();
    
    
}

@Given("^User check the \"([^\"]*)\" of new Export$")
public void user_check_the_of_new_Export(String arg1) throws Throwable {
 
}

@Then("^User check the \"([^\"]*)\"$")
public void user_check_the(String arg1) throws Throwable {
  
}


@Given("^User Click on the closed X of new Export$")
public void user_Click_on_the_closed_X_of_new_Export() throws Throwable {
	HL.clickGRDownload();
	ut.pause(1000);
	HL.clickclose();
}




}

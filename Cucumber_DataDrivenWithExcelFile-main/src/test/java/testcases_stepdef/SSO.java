package testcases_stepdef;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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

public class SSO {
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

	@Given("^User pass the url$")
	public void user_pass_the_url() throws IOException {
		 file = new File(filepath);   
		inputfile = new FileInputStream(file);
	        prop = new Properties();
	        prop.load(inputfile);
	        driver = browsersetup.setup(prop.getProperty("Browsername"), prop.getProperty("Url"));
	   
	}

	@Then("^User pass the email from excel sheet with \"([^\"]*)\" And (\\d+)$")
	public void user_pass_the_email_from_excel_sheet_with_And(String SheetName, int RowNumber) throws Throwable {
	 	 HL = new HelixLogin(driver);
         ut = new utility(driver);
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String email = testData.get(RowNumber).get("Email");
		HL.strEmail(email);
	}

	@Then("^User click on the next button$")
	public void user_click_on_the_next_button() throws Throwable {
		ut.pause(1000);
		HL.clickNext();
	    ut.pause(1000);
	}


@Then("^User fill the user name from excel \"([^\"]*)\" And (\\d+)$")
public void user_fill_the_user_name_from_excel_And(String SheetName, int RowNumber) throws Throwable {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String un = testData.get(RowNumber).get("Username");
		HL.strMSEmail(un);
		ut.pause(1000);
        HL.clickMSNext();
        HL.strOktaEmail(un);
	}

@Then("^User fill the password from  excel \"([^\"]*)\" And (\\d+)$")
public void user_fill_the_password_from_excel_And(String SheetName, int RowNumber) throws Throwable {
		ut.pause(1000);
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(excelpath, SheetName);
		String pw = testData.get(RowNumber).get("Password");
		HL.strOktaPassword(pw);
	}

	@Then("^User click on the Submit Button$")
	public void user_click_on_the_Submit_Button() throws Throwable {
	   ut.pause(1000);
	   HL.clickOktaSigin();
       ut.pause(1000);
       HL.clickSP();
       ut.pause(1000);
       HL.clickMSyes();
	}


}

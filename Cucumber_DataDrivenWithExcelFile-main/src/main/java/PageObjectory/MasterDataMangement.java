package PageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterDataMangement {
	
	  WebDriver driver;

	    public MasterDataMangement(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    @FindBy(xpath="//a[@id='sidebar_HELIX_QA_ORG/dwa-data-management']")
	    WebElement MDDTab;
	    @FindBy(xpath="//span[contains(text(),'Field Mapping')]")
	    WebElement FieldMapping;
	    @FindBy(xpath="//select[@name='sys']")
	    WebElement SourceSystem;
	    @FindBy(xpath="//*[normalize-space(text()) and normalize-space(.)='KORE Entity'])[1]/following::select[1]")
	    WebElement KoreEntity;
	    @FindBy(xpath="//span[contains(text(),'Matching Rules')]")
	    WebElement MatchingRules;
	    @FindBy(xpath="//button[@id='add-rule']")
	    WebElement AddRule;
	    

}

package PageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelixLogin {
    WebDriver driver;

    public HelixLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//input[@type='email']")
    private WebElement MSEmail;
    @FindBy(xpath = "//input[@id='Email']")
    private WebElement EmailField;
    @FindBy(xpath = "//button[contains(text(),'Next')]")
    private WebElement NextButton;
    @FindBy(xpath = "//label[contains(text(),'Remember me')]")
    private WebElement RememberMe;
    @FindBy(xpath = "//input[@id='userNameInput']")
    private WebElement UserNameField;
    @FindBy(xpath = "//input[@id='passwordInput']")
    private WebElement PasswordField;
    @FindBy(xpath = "//span[@id='submitButton']")
    private WebElement Submit;
    @FindBy(xpath = "//span[contains(text(),'Golden Record Rules')]")
    private WebElement GoldenRecords;
    @FindBy(xpath="//button[@id='refresh-grid']")
    private WebElement Refresh;
    @FindBy(xpath="//body[1]/app-root[1]/kore-full-shell[1]/div[1]/kore-shell-body[1]/div[1]/div[1]/app-organizations[1]/app-root[1]/div[1]/div[1]/div[1]/span[1]/button[2]/k-ui-icon[1]/svg[1]/g[1]/rect[2]")
    private WebElement SetColumnsDisplay;
    @FindBy(xpath="//a[@id='sidebar_HELIX_QA_ORG/dwa-data-management']")
    private WebElement MasterDataManagement;
    @FindBy(xpath="//span[contains(text(),'Field Mapping')]")
    private WebElement FieldMapping;
    @FindBy(xpath="//kore-shell-body/div[1]/div[1]/app-organizations[1]/app-root[1]/div[1]/div[1]/app-data-management-template[1]/div[1]/div[2]/app-field-mapping[1]/div[1]/div[1]/div[1]/select[1]")
    private WebElement SourceSystem;
    @FindBy(xpath ="//kore-shell-body/div[1]/div[1]/app-organizations[1]/app-root[1]/div[1]/div[1]/app-data-management-template[1]/div[1]/div[1]/select[1]")
    private WebElement Type;
    @FindBy(xpath ="//kore-shell-body/div[1]/div[1]/app-organizations[1]/app-root[1]/div[1]/div[1]/app-data-management-template[1]/div[1]/div[2]/app-field-mapping[1]/div[1]/div[1]/div[2]/select[1]" )
    private WebElement KoreEquity;
    @FindBy(xpath="//span[contains(text(),'Matching Rules')]")
    private WebElement MatchingRules;
    @FindBy(xpath="//button[@id='add-rule']")
    private WebElement AddRules;
    @FindBy(xpath ="//button[@id='add-field']")
    private WebElement AddField;
    @FindBy(xpath = "//kore-shell-body/div[1]/div[1]/app-organizations[1]/app-root[1]/div[1]/div[1]/app-data-management-template[1]/div[1]/div[2]/app-matching-rules[1]/div[2]/div[1]/div[1]")
    private WebElement ExactEmailMatching;
    @FindBy(xpath= "//body[1]/app-root[1]/kore-full-shell[1]/div[1]/kore-shell-body[1]/div[1]/div[1]/app-organizations[1]/app-root[1]/div[1]/div[1]/app-data-management-template[1]/div[1]/div[2]/app-matching-rules[1]/div[2]/div[1]/div[1]/span[1]/k-ui-icon[1]/svg[1]/g[1]/g[1]/rect[1]")
    private WebElement ExactEmailMatchingPencil;
    @FindBy(xpath="//k-ui-slider-modal-header/div[1]/div[2]/k-ui-dropdown-action-menu[1]/div[1]/span[1]/*[1]")
    private WebElement EditRuleEmail;
    @FindBy(xpath = "//k-ui-slider-modal-header/div[1]/div[2]/k-ui-dropdown-action-menu[1]/div[1]/ul[1]/li[1]/button[1]")
    private WebElement EditRuleEmailDelete;
    @FindBy(xpath="//kore-shell-body/k-ui-slider-modal[1]/div[1]/app-rule-editor[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement EmailNameField;
    @FindBy(xpath="//k-ui-slider-modal-header/div[1]/div[2]/button[2]/*[1]")
    private WebElement SlideInEmailEditRules;
    @FindBy(xpath="//body[1]/app-root[1]/kore-full-shell[1]/div[1]/kore-shell-body[1]/div[1]/div[1]/app-organizations[1]/app-root[1]/div[1]/div[1]/app-data-management-template[1]/div[1]/div[2]/app-matching-rules[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/span[1]/k-ui-icon[1]/svg[1]/g[1]/g[1]/rect[1]")
    private WebElement EditExactEmailMatch;
    @FindBy(xpath = "//li//h3[contains(text(),'Helix QA Org')]")
    private WebElement ChooseOrganization;
    @FindBy(id="sidebar_HELIX_QA_ORG/tags")
    private WebElement tag;
  @FindBy(xpath="//button[@id='new-item']")
  private WebElement newTag;
@FindBy(xpath="//input[@id='title-input']")
private WebElement displayName;
@FindBy(xpath="//input[@id='name-input']")
private WebElement APIName;
@FindBy(xpath = "//select[@id='category-input']")
private WebElement Category;
@FindBy(id = "dynamic-input")
private WebElement TagType;
@FindBy(xpath="//textarea[@id='description-area']")
private WebElement Description;
@FindBy(xpath ="//button[@id='header_save']")
private WebElement SaveTag;
@FindBy(xpath="//input[@placeholder='Quick Search....']")
private WebElement SearchFilter;
@FindBy(xpath="//div[contains(text(),'Testing')]")
private WebElement Edit;
@FindBy(xpath="(//button[@title='Delete'])")
private WebElement Delete;
@FindBy(xpath="//k-ui-slider-modal-header/div[1]/div[2]/k-ui-dropdown-action-menu[1]/div[1]/span[1]/*[1]")
private WebElement sideBar;
@FindBy(xpath="//button[contains(text(),'Delete')]")
private WebElement DeleteButton;
@FindBy(xpath="//a[contains(text(),'Categories')]")
private WebElement Categories;
@FindBy(xpath="//button[@id='new-item']")
private WebElement NewCategory;
@FindBy(xpath="//input[@id='name-input']")
private WebElement APIname;
@FindBy(xpath="//input[@id='color-input']")
private WebElement Colour;
@FindBy(xpath="//div[contains(text(),'AUT')]")
private WebElement EditCat;
@FindBy(xpath="//select[@id='source-input']")
private WebElement Source;
@FindBy(xpath="//textarea[@id='sql-area']")
private WebElement SQL;
@FindBy(xpath="//span[contains(text(),'Golden Record Rules')]")
private WebElement GoldRecordRules;
@FindBy(xpath="//button[contains(text(),'Add Tie Breaker')]")
private WebElement AddTieBreaker;
@FindBy(xpath="//button[@id='add-tiebreaker']")
private WebElement AddNewTieBreaker;
@FindBy(xpath="//select[@formcontrolname='attribute_id']")
private WebElement Attribute;
@FindBy(xpath="//select[@formcontrolname='order']")
private WebElement Order;
@FindBy(xpath="//h4[contains(text(),'FirstName')]")
private WebElement FirstName;
@FindBy(xpath="//h4[contains(text(),'LastName')]")
private WebElement LastName;
@FindBy(xpath="//h4[contains(text(),'Email')]")
private WebElement GREmail;
@FindBy(xpath="//h4[contains(text(),'CompanyName')]")
private WebElement CompanyName;
@FindBy(xpath="//h4[contains(text(),'WorkPhone')]")
private WebElement WorkPhone;
@FindBy(xpath="//h4[contains(text(),'HomePhone')]")
private WebElement HomePhone;
@FindBy(xpath="//h4[contains(text(),'CellPhone')]")
private WebElement CellPhone;
@FindBy(xpath="//h4[contains(text(),'AddressLine1')]")
private WebElement Address1;
@FindBy(xpath="//h4[contains(text(),'AddressLine2')]")
private WebElement Address2;
@FindBy(xpath="//h4[contains(text(),'City')]")
private WebElement City;
@FindBy(xpath="//h4[contains(text(),'State')]")
private WebElement State;
@FindBy(xpath="//h4[contains(text(),'Country')]")
private WebElement Country;
@FindBy(xpath="//h4[contains(text(),'Zip')]")
private WebElement Zip;
@FindBy(xpath="//a[contains(text(),'Attributes')]")
private WebElement AttributeTab;
@FindBy(xpath="//button[@id='new-item']")
private WebElement NewAttribute;
@FindBy(xpath="//select[@id='datatype-input']")
private WebElement DataType;
@FindBy(xpath="//select[@id='aggregate-input']")
private WebElement Aggregate;
@FindBy(xpath="//select[@id='schedule-input']")
private WebElement Schedule;
@FindBy(xpath="(//div[@col-id='dataType'])[2]")
private WebElement AttributeEdit;
@FindBy(xpath="//input[@id='idSIButton9']")
private WebElement MSNext;
@FindBy(id="idSIButton9")
private WebElement MSYes;
@FindBy(xpath="//div[contains(text(),'This tag already exists')]")
private WebElement TagAlreadyExist;
@FindBy(xpath="//input[@id='okta-signin-username']")
private WebElement OktaEmail;
@FindBy(xpath="//input[@id='okta-signin-password']")
private WebElement OktaPassword;
@FindBy(xpath="//input[@id='okta-signin-submit']")
private WebElement OKtaSignin;
@FindBy(xpath="//div[@class='k-action-button ng-star-inserted']")
private WebElement star;
@FindBy(xpath="//div[contains(text(),'Demo123')]")
private WebElement selecttag;
@FindBy(xpath="//input[@value='Send Push']")
private WebElement SendPush;
@FindBy(xpath="//a[@id='sidebar_HELIX_QA_ORG/data-management']")
private WebElement DataManagement;
@FindBy(xpath="//button[contains(text(),'Add Rule')]")
private WebElement AddRule;
@FindBy(xpath="//button[@id='save-all']")
private WebElement SaveAll;
@FindBy(xpath="//input[@formcontrolname='name']")
private WebElement Name;
@FindBy(xpath="//button[@id='header_save']")
private WebElement Ok;
@FindBy(xpath="//h3[contains(text(),'New Tag')]")
private WebElement NewTagMessage;
@FindBy(xpath="//span[contains(text(),'This field is required')]")
private WebElement DisplayNameErrorMessage;
@FindBy(xpath="//span[contains(text(),'Static')]")
private WebElement Static;
@FindBy(xpath="//span[contains(text(),'Processed')]")
private WebElement Processed;
@FindBy(xpath="//a[@id='sidebar_HELIX_QA_ORG/dwatags']")
private WebElement NewTagBar;
@FindBy(xpath="//button[@id='new-tag']")
private WebElement AddNewTagBar;
@FindBy(xpath="//div[contains(text(),'Tag Updated')]")
private WebElement TagUpdatedMessage;
@FindBy(xpath="//span[contains(text(),'Matching Rules')]")
private WebElement MatchingRules1;
@FindBy(xpath="//div[contains(text(),'AUTDemo')]")
private WebElement SelectAttribute;
@FindBy(xpath="//a[@id='sidebar_HELIX_QA_ORG/contacts']")
private WebElement GoldenRecordsContacts;
@FindBy(xpath="//*[@class='k-btn k-btn-clear']//*[@name='refresh']")
private WebElement GRCRefresh;
@FindBy(xpath="//*[@class='k-btn k-btn-clear']//*[@name='column']")
private WebElement GRCColoum;
@FindBy(xpath="//*[@class='k-btn k-btn-clear']//*[@name='download']")
private WebElement GRCDownload;
@FindBy(xpath="//input[@id='name']")
private WebElement GRCAllTags;
@FindBy(xpath="//a[@id='sidebar_HELIX_QA_ORG/audience-builder']")
private WebElement AudienceBuilder;
@FindBy(xpath="//button[@id='new-item']")
private WebElement NewAudienceBuilder;
@FindBy(xpath="//button[@id='refresh-grid']")
private WebElement RefreshGridAB;
@FindBy(xpath="//input[@placeholder='Quick Search....']")
private WebElement ABQuickSearch;
@FindBy(xpath="//span[contains(text(),'Description')]")
private WebElement ABAcc;
@FindBy(xpath="//span[contains(text(),'Total: 9')]")
private WebElement ABV;
@FindBy(xpath="//button[@id='new-item']")
private WebElement NewAudience;
@FindBy(xpath="//a[@id='sidebar_HELIX_QA_ORG/contacts']")
private WebElement MDataManagement;
@FindBy(xpath="//button[contains(text(),'New Export')]")
private WebElement MDMEport;
@FindBy(xpath="//k-ui-icon[@name='close']")
private WebElement MDMClose;
@FindBy(xpath="//k-ui-icon[@name='refresh']")
private WebElement MDMRefresh;
@FindBy(xpath="//k-ui-icon[@name='column']")
private WebElement MDMColumn;
@FindBy(xpath="//input[@id='name']")
private WebElement MDMAllTags;
@FindBy(xpath="//*[@placeholder='Quick Search....']")
private WebElement MDMSearch;
@FindBy(xpath="//button[contains(text(),'azure-connect')]")
private WebElement AzureConnect;
@FindBy(xpath="//input[@name='passwd']")
private WebElement MSPassword;
@FindBy(xpath="//input[@id='idSIButton9']")
private WebElement MSSignin;
@FindBy(xpath="//*[@mask='url(#download-b)']")
private WebElement GRDownload;
@FindBy(xpath="//body/k-ui-modal[1]/div[2]/div[1]/div[1]/app-export-modal[1]/div[1]/div[1]/h5[1]/span[1]/*[1]")
private WebElement GRHelp;
@FindBy(xpath="//*[@name='close']")
private WebElement close;
@FindBy(xpath="//tbody/tr[1]/td[1]")
private WebElement Records;

public String getRecord() {
	return Records.getText();
}

public boolean isRecord(String text) {
	try{
        final boolean b = getRecord().contains(text);
        return b;
    }
    catch(final Exception e){
        return false;
    }
	}

public void clickclose() {
	close.click();
}
public void clickHelp() {
	GRHelp.click();
}
public void clickGRDownload() {
	GRDownload.click();
}
public void clickMSSignin() {
	MSSignin.click();
}

public void clickMSP() {
	MSPassword.click();
}
public void strMSPassword(String strMSPassword) {
	MSPassword.sendKeys(strMSPassword);
}
public void clickAC() {
	AzureConnect.click();


}
public void strMDMSearch(String strMDMSearch) {
	MDMSearch.sendKeys(strMDMSearch);
}
public void clickMDMAllTags() {
	MDMAllTags.click();
}
public void clickMDMColoumn() {
	MDMColumn.click();
}
public void clickMDMRefresh() {
	MDMRefresh.click();
}
public void clickMDMClose() {
	MDMClose.click();
}
public void clicKMDMExport() {
	MDMEport.click();

}
public void clickGoldenRecordsContact() {
	GoldenRecordsContacts.click();
}
public void clickMDataManagement() {
	MasterDataManagement.click();
}
public void clickNA() {
	NewAudience.click();
}
public String getABV() {
	return ABV.getText();
}

public boolean isPresent(String text) {
	try{
        final boolean b = getABV().contains(text);
        return b;
    }
    catch(final Exception e){
        return false;
    }
	}
public void clickABAcc() {
	ABAcc.click();
}

public void strABQS(String strABQS) {
	ABQuickSearch.sendKeys(strABQS);
}

public void clickABR() {
	RefreshGridAB.click();
}
public void clickNewAudience() {
	NewAudienceBuilder.click();
}
public void clickAudienceBuilder() {
	AudienceBuilder.click();
}
public void clickSelectAttribute() {
	SelectAttribute.click();
}

public void clickMR1() {
	MatchingRules1.click();
}
public String getTUM() {
	return TagUpdatedMessage.getText();
}

public void clickANTB() {
	AddNewTagBar.click();
}
public void clicKNTB() {
	NewTagBar.click();
}


public String getProcessed() {
	return this.Processed.getText();
}

public String getStatic() {
	return this.Static.getText();
}

public String getDisplayname() {
	return this.DisplayNameErrorMessage.getText();
}

public void clickOK() {
	Ok.click();
}
public void strName(String strName) {
	Name.sendKeys(strName);
}
public void clickSaveAll() {
	SaveAll.click();
	
}
public void clickAddRule() {
	AddRule.click();
}

public void clickDataManagement() {
	DataManagement.click();
}
public void clickSP() {
	SendPush.click();
}
public void clickSelectTag() {
	selecttag.click();
}

public void clickstar() {
	star.click();
}
public void clickOktaSigin() {
	OKtaSignin.click();
	}

public void strOktaPassword(String strOktaPassword) {
	OktaPassword.sendKeys(strOktaPassword);
}
public void strOktaEmail(String strOktaEmail) {
	OktaEmail.sendKeys(strOktaEmail);
}
public String getTagAlreadyExist() {
	return this.TagAlreadyExist.getText();
}

public void clickMSyes() {
	MSYes.click();
}
public void clickMSNext() {
	MSNext.click();
}
public void strMSEmail(String strMSEmail) {
	MSEmail.sendKeys(strMSEmail);
}

public void clickAttributeEdit() {
	AttributeEdit.click();
}

public WebElement setSchedule() {
	return Schedule;
}

public WebElement setDataType() {
	return DataType;
}
public WebElement setAggregate() {
	return Aggregate;
}
public void clickNewAttribute() {
	NewAttribute.click();
}
public void clickAttributeTab() {
	AttributeTab.click();
}
public void clickATB() {
	AddNewTieBreaker.click();         
}
public void clickMDM() {
	MasterDataManagement.click();
}
public void clickZip() {
	Zip.click();
}
public void clickCountry() {
	Country.click();
}
public void clickState() {
	State.click();
}
public void clickCity() {
	City.click();
}
public void clickAdd2() {
	Address2.click();
}
public void clickAdd1() {
	Address1.click();
}

public void clickCP() {
	CellPhone.click();
}

public void clickHP() {
	HomePhone.click();
}

public void clickWP() {
	WorkPhone.click();
}

public void clickCN() {
	CompanyName.click();
}
public void clickGRE() {
	GREmail.click();
}
public void clickLN() {
	LastName.click();
}
public void clickFN() {
	FirstName.click();
}
public WebElement setAttribute() {
	return Attribute;
}
public WebElement setOrder() {
	return Order;
}
public void clickGRR() {
	GoldRecordRules.click();
	
}
public void strSQL(String strSQL) {
	SQL.sendKeys(strSQL);
}

public WebElement setSource() {
	return Source;
}
public void clickEC(){
	EditCat.click();
}
public void strColour(String strColour) {
	Colour.clear();
	Colour.sendKeys(strColour);
}
public void strAPIName(String strAPIName) {
	APIName.clear();
	APIName.sendKeys(strAPIName);
	
}
public void clickAPIName() {
	APIName.clear();
}
public void clickNC() {
	NewCategory.click();
}
public void clickCAT() {
	Categories.click();
}
public void clickDB() {
	DeleteButton.click();
}
public void clickSB() {
	sideBar.click();
}

public void clickDel() {
	Delete.click();
}



public void clickEdit() {
	Edit.click();
}
public void strSF(String strSF) {
	SearchFilter.clear();
	SearchFilter.sendKeys(strSF);
	
}
public void clickEF() {
	EmailField.click();
}
public void clickSaveTag(){
    this.SaveTag.click();
}
public  WebElement setTagType(){
    return this.TagType;
}
public WebElement setCategory(){
    return this.Category;
    }


public void strDescription( String strDescription){
    Description.sendKeys(strDescription);

}
public void strDisplayName(String strDisplayName){
    displayName.sendKeys(strDisplayName);
}
public void clickNewTag(){
  newTag.click();
}
    public void clickTag(){
        tag.click();
    }

    public void clickOrganization(){
        ChooseOrganization.click();}
    public void strEmail(String strEmail) {
       EmailField.sendKeys(strEmail);
    }
    public void clickNext() {
      NextButton.click();
    }
    public void strUserName(String strUserName) {
    UserNameField.sendKeys(strUserName);
    }
    public void strPassword(String strPassword) {
     PasswordField.sendKeys(strPassword);
    }
    public void clickSubmit() {
      Submit.click();
    }

}

package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	  WebDriver driver;
	  
	 public Dropdown(WebDriver driver) {
	        this.driver = driver;
	    }
	 
    public void selectDropdownText(WebElement locator, String txtvalue) {
        Select select = new Select(locator);
        select.selectByVisibleText(txtvalue);
    }

    public void selectDropdownByIndex(WebElement locator, int index) {
        Select select = new Select(locator);
        select.selectByIndex(index);
    }
    
    public void selectDropdownByValue(WebElement locator, String value) {
        Select select = new Select(locator);
        select.selectByValue(value);
    }
}

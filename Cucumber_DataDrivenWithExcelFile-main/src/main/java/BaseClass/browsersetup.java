package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browsersetup {
	
	 protected static WebDriver driver;
	
	public static WebDriver setup(String browsername , String Url) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
	//	ChromeOptions options = new ChromeOptions();
		 //  options.addArguments("--headless");
			driver= new ChromeDriver();
			
		}else
			if(browsername.equalsIgnoreCase("IE")) {
				WebDriverManager.iedriver().setup();
				driver= new InternetExplorerDriver();	
			}else
				if(browsername.equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver= new FirefoxDriver();
		
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(Url);
		return driver;
}
	
	
	
}

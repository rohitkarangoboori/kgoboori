package utility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class utility {

    WebDriver driver;


    public utility(WebDriver driver) {
        this.driver = driver;
    }
    
    public void pause(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

package TestyBdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver driver;

    public static void startDriver(){
        System.setProperty("web driver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    public static void stopDriver(){
        driver.quit();
    }
}

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
//
//    WebDriver driver;
//
//    @BeforeEach
//    public void driverSetup() {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//
//        //czekanie imlicite
//
//        driver = new ChromeDriver();
//    }
//
//    @AfterEach
//    public void driverClose() {
//        driver.quit();
//    }
//
//    @Test
//    public void firstTest() {
//        driver.get("https://discogs.com/");
//        System.out.println("tytuł strony to: " + driver.getTitle());
//        System.out.println("url to: " + driver.getCurrentUrl());
//    }
//@Test
//    public void thirdTest(){
//        driver.get("https://skleptest.pl/");
//        WebElement searchButton = driver.findElement(By.id("search-top-bar-submit"));
//        WebElement searchInput = driver.findElement(By.className("search-field-top-bar"));
//        WebElement newsletterNameInput = driver.findElement(By.name("es_txt_name"));
//        WebElement blogButton = driver.findElement(By.linkText("BLOG"));
//        WebElement aboutUsButton = driver.findElement(By.partialLinkText("US"));
//
//    }
//    public void advSelector(){
//        driver.get("https://skleptest.pl/");
//        WebElement searchButton = driver.findElement(By.xpath(".//button[@id='search-top-bar-submit']"));
//        WebElement searchButtonCSS = driver.findElement(By.cssSelector("button[id='search-top-bar-submit']"));
//        WebElement searchButtonCSS2 = driver.findElement(By.cssSelector("#search-top-bar-submit"));
//    }
//
//    @Test
//    public void firstTask(){
//        driver.get("https://skleptest.pl/");
//        WebElement searchInput = driver.findElement(By.cssSelector(".search-field-top-bar"));
//        searchInput.clear();
//        searchInput.sendKeys("Dress");
//        WebElement searchButton = driver.findElement(By.className("search-top-bar-submit"));
//        searchButton.click();
//    }
//
//    @Test
//    public void subscribeNewsletterTest(){
//        driver.get("https://skleptest.pl/");
//        WebElement searchInput1 = driver.findElement(By.id("es_txt_name"));
//        searchInput1.clear();
//        searchInput1.sendKeys("test");
//        WebElement searchInput2 = driver.findElement(By.id("es_txt_email"));
//        searchInput2.clear();
//        searchInput2.sendKeys("test@test.com");
//        WebElement emailButton = driver.findElement(By.id("es_txt_button"));
//        emailButton.click();
//
//    }
//
//    @Test
//    public void firstAssertion(){
//        driver.get("https://skleptest.pl/");
//        WebElement accountButton = driver.findElement(By.xpath(".//li[@class='top-account']"));
//        accountButton.click();
//
//        WebElement usernameInput = driver.findElement(By.cssSelector("#username"));
//        usernameInput.clear();
//        usernameInput.sendKeys("Login");
//        WebElement loginButton = driver.findElement(By.name("login"));
//
//        Assertions.assertTrue(loginButton.isDisplayed());
//        Assertions.assertTrue(loginButton.isEnabled());
//        loginButton.click();
//
//        WebElement errorInfo = driver.findElement(By.cssSelector(".woocommerce-error"));
//        String info = errorInfo.getText();
//        Assertions.assertEquals("Error: The password field is empty.",info,"Zły komentarz");
//    }
//
//    public void addProductToCart () {
//        driver.get("https://skleptest.pl/");
//        WebElement accountButton = driver.findElement(By.xpath(".//li[@class='top-account']"));
//        accountButton.click();
//    }


}

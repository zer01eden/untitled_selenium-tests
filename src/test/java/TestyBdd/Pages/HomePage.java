package TestyBdd.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    private static String HOMEPAGE_URL = "https://skleptest.pl";

    @FindBy(how = How.CSS, using = ".site-title-description > .site-title")
    WebElement homePageName;

    @FindBy(how = How.ID, using = "es_txt_name")
    WebElement newsletterNameInput;

    @FindBy(how = How.ID, using = "es_txt_email")
    WebElement newsletterEmailInput;

    @FindBy(how = How.ID, using = "es_txt_button")
    WebElement subscribeButton;

    @FindBy(how = How.CSS, using = ".top-account")
    WebElement accountButton;

    public void openHomePage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(homePageName));
    }
    public String getHomepageName() {
        return homePageName.getText();
    }

    public void fillNewsletterNameInput(String name){
        newsletterNameInput.clear();
        newsletterNameInput.sendKeys(name);
    }

    public void fillNewsletterEmailInput(String email){
        newsletterNameInput.clear();
        newsletterNameInput.sendKeys(email);
    }

    public void clickSubscribeButton(){
        subscribeButton.click();
    }

    public void clickAccountButton(){
        accountButton.click();

    }
}

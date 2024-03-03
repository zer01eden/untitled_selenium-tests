package TestyBdd.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage extends BasePage{

    @FindBy(how = How.CSS, using = "#username")
    WebElement loginInput;
    @FindBy(how = How.NAME, using = "login")
    WebElement loginButton;
    @FindBy(how = How.CSS, using = ".woocommerce-error")
    WebElement message;

    public void fillLoginInput(String login) {
        loginInput.clear();
        loginInput.sendKeys(login);
    }
    public String getMessageInfo() {
        return message.getText();
    }

    public void clickLoginButtonOnMyAccount() {
        loginButton.click();
    }

}


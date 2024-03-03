package TestyBdd.StepDefinitions;

import TestyBdd.Pages.MyAccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MyAccountPageSteps {

    MyAccountPage myAccountPage = new MyAccountPage();

    @When("Fill login with {string}")
    public void fillLoginWith(String login) {
        myAccountPage.fillLoginInput(login);
    }

    @When("Click Login button")
    public void clickLoginButton() {
        myAccountPage.clickLoginButtonOnMyAccount();
    }

    @Then("Check if information {string} is displayed")
    public void checkIfInformationIsDisplayed(String info) {
        String information = myAccountPage.getMessageInfo();
        Assertions.assertEquals(info,information);
    }
}
package TestyBdd.StepDefinitions;

import TestyBdd.Pages.HomePage;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("Browser is open")
    public void browser_is_open() {
        homePage.openHomePage();
    }

    @Then("I am on the main site")
    public void i_am_on_the_main_site() {
        String nazwa = homePage.getHomepageName();
        Assertions.assertEquals("Generic Shop", nazwa);
    }

    @When("Fill newsletter name with {string}")
    public void fillNewsletterNameWith(String name) {
        homePage.fillNewsletterNameInput(name);
    }

    @When("Fill newsletter email with {string}")
    public void fillNewsletterEmailWith(String email) {
        homePage.fillNewsletterEmailInput(email);
    }

    @When("Click Subscribe button")
    public void clickSubscribeButton() {
        homePage.clickSubscribeButton();
    }

    @When("Click account button")
    public void clickAccountButton() {
        homePage.clickAccountButton();
    }
}

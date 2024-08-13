package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.DriverFactory;

public class LoginPageStepdefs {
    LoginPage lp = new LoginPage(DriverFactory.getDriver());

    @Given("user is on Login Page")
    public void userIsOnLoginPage() {
        lp.checkLoginButton();
    }

    @When("click Login Button on Login Page")
    public void clickLoginButtonOnLoginPage() {
        lp.clickLoginButton();
    }

    @Then("should see image on Login Page")
    public void shouldSeeImageOnLoginPage() {
        lp.checkImage();
    }

    @When("sendkeys username to usernamebox on Login Page")
    public void sendkeysUsernameToUsernameboxOnLoginPage() {
        lp.sendKeysUsername();
    }
}

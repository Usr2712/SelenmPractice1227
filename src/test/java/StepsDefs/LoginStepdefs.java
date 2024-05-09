package StepsDefs;

import Codefiles.LoginWithUserNamePassword;
import Codefiles.Logincode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



import java.io.IOException;

import static Codefiles.Logincode.driver;


public class LoginStepdefs {

    Logincode logincode = new Logincode();
    LoginWithUserNamePassword loginWithUserNamePassword = new LoginWithUserNamePassword(driver);


    @Given("User opens the website")
    public void user_opens_the_website() throws IOException {

        logincode.OpenBrowser();

    }

    @When("user enter username and password")
    public void userEnterUsernameAndPassword() {

        loginWithUserNamePassword.Enter_Username_Password_and_login();

    }

    @Then("Home page opened")
    public void homePageOpened() {
    }
}

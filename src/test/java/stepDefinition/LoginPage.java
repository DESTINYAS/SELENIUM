package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.HomePage.click_signIn_Link;
import static pages.HomePage.clik_hambuger_menu;
import static pages.LoginPage.*;

public class LoginPage {

    @When("user successfully enters login details")
    public void user_successfully_enters_login_details() throws InterruptedException {
        sendKeys_username();
        sendKeys_password();
        click_login_btn();

    }

    @Then("User clicks on new registration button")
    public void User_clicks_on_new_registration_button() throws InterruptedException {
        click_newuser_register();

    }
}
package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoginPage.*;
import static pages.RegistrationPage.visibility_welcometext_registration;

public class RegistrationPage {

    @Then("User should be able to view the registration page")
    public void User_should_be_able_to_view_the_registration_page() throws InterruptedException {
        visibility_welcometext_registration();

    }
}
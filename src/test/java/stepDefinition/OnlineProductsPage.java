package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static pages.OnlineProductsPage.clicks_formalshoes_drop_down;
import static pages.OnlineProductsPage.getext_shoes_first_value;
import static pages.RegistrationPage.visibility_welcometext_registration;
import static utility.BrowserDriver.driver;

public class OnlineProductsPage {

    @When("User clicks on  formal shoes drop down")
    public void User_clicks_on_formal_shoes_drop_down() throws InterruptedException{
        clicks_formalshoes_drop_down();
    }

    @Then("User should be able to view the products")
    public void User_should_be_able_to_view_the_products() throws InterruptedException{
        getext_shoes_first_value();
    }
}
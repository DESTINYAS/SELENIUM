package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static pages.HomePage.*;

public class HomePage {

    @Given("user navigates to login page")
    public void user_navigates_to_login_page() throws InterruptedException {
        clik_hambuger_menu();
        click_signIn_Link();

    }
    @Then("user navigates to online products page")
    public void user_navigates_to_online_products_page() throws InterruptedException {
        clik_hambuger_menu();
        click_onlineproducts_Link();
    }
}

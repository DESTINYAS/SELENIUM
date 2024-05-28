package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.common.returnsreceiver.qual.This;

import static pages.LoggedInPage.*;

public class LoggedInPage {
   @Then("user should be able to view the products page")
    public void user_should_be_able_to_view_the_products_page() throws InterruptedException {
       visibility_productcategory_formalshoes();
       visibility_productcategory_sneakershoes();
       visibility_productcategory_sportshoes();
   }
}
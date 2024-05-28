package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {
    public static String username_registration_xpath = "/html/body/center/h1";

    public static void visibility_welcometext_registration() throws InterruptedException{
        String welcome_text = driver.findElement(By.xpath(username_registration_xpath)).getText();
        assertEquals("User Registration Page",welcome_text);
    }

}

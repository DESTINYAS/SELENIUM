package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class OnlineProductsPage extends BrowserDriver {

    public static String formal_show_dropdown_class = "formalshoedropdown";

    public static String formal_shoes_webtable_xpath = "/html/body/div[2]/table";

    public static String formal_shoes_webtable_tr = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void clicks_formalshoes_drop_down() throws InterruptedException {

        driver.findElement(By.className(formal_show_dropdown_class)).click();
    }
public static void getext_shoes_first_value(){
    String text =driver.findElement(By.xpath(formal_shoes_webtable_tr)).getText();
    assertEquals("   Classic Cheltenham", text);
}
}
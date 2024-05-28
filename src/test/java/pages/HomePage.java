package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

public static String hambuger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
public static String sigIn_Link_linkText="Sign In Portal";

    public static String onlineproducts_linkText="Online Products";

public static void clik_hambuger_menu() throws InterruptedException{
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    Thread.sleep(2000);
    driver.findElement(By.xpath(hambuger_menu_xpath)).click();
}
public static void click_signIn_Link() throws InterruptedException{
    Thread.sleep(2000);
    driver.findElement(By.linkText(sigIn_Link_linkText)).click();
}

    public static void click_onlineproducts_Link() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.linkText(onlineproducts_linkText)).click();
    }
}

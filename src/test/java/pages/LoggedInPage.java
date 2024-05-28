package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver{

    public static String product_category_formalshoes = "//*[text()='Formal Shoes']";

    public static String product_category_sportshoes = "//*[text()='Sports']";

    public static String product_category_sneakershoes = "//*[text()='Sneakers']";

        public static void visibility_productcategory_formalshoes() throws InterruptedException{
            String actualProductCategory_fs = driver.findElement(By.xpath(product_category_formalshoes)).getText();
            assertEquals("Formal Shoes",actualProductCategory_fs);
        }
        public static void visibility_productcategory_sportshoes() throws InterruptedException{
            String actualProductCategory_ss = driver.findElement(By.xpath(product_category_sportshoes)).getText();
            assertEquals("Sports",actualProductCategory_ss);
        }
        public static void visibility_productcategory_sneakershoes(){
            String actualProductCategory_s = driver.findElement(By.xpath(product_category_sneakershoes)).getText();
            assertEquals("Sneakers",actualProductCategory_s);
        }
    }

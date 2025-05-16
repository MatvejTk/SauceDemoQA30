package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest extends BaseTest {

    @Test
    public void checkCart() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProduct("Sauce Labs Backpack");
        productsPage.addProduct("Sauce Labs Bike Light");
        productsPage.openCart();
    }
    @Test
    public void checkPurchaseOrder(){
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("[type=text]")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[id=login-button]")).click();
        String productPageTitle = driver.findElement(By.cssSelector(".title")).getText();
    }
}
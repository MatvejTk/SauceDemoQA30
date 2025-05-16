package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class LocatorTest extends BaseTest {

    @Test
    public void checkLocator() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name"));
        driver.findElement(By.name("user-name"));
        driver.findElement(By.className("error-message-container"));
        driver.findElement(By.tagName("div"));
        driver.findElement(By.id("password"));
        driver.findElement(By.name("password"));
        driver.findElement(By.className("form_group"));
        login();
        driver.findElement(By.linkText("Sauce Labs Backpack"));
        driver.findElement(By.partialLinkText("Sauce Labs"));
        driver.findElement(By.cssSelector(".inventory_item_label"));
        driver.findElement(By.cssSelector(".inventory_item_label.inventory_item_name"));
        driver.findElement(By.cssSelector(".pricebar.inventory_item_price"));
        driver.findElement(By.cssSelector("#inventory_container"));
        driver.findElement(By.cssSelector("pricebar"));
        driver.findElement(By.cssSelector("div.pricebar"));
        driver.findElement(By.cssSelector("[data-test=inventory-item]"));
        driver.findElement(By.cssSelector("[data-test~=inventory-item]"));
        driver.findElement(By.cssSelector("[data-test|=inventory-item]"));
        driver.findElement(By.cssSelector("[data-test^=inventory-item]"));
        driver.findElement(By.cssSelector("[data-test$=inventory-item]"));
        driver.findElement(By.cssSelector("[data-test*=inventory-item]"));
        driver.findElement(By.xpath("//inventory_item_desc[@data-test='inventory-item-desc']"));
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        driver.findElement(By.xpath("//inventory_item_desc[contains(@data-test='inventory')]"));
        driver.findElement(By.xpath("//div[contains(text()='Sauce Labs Backpack')]"));
        driver.findElement(By.xpath("//*[@id='inventory_item_name']//ancestor::a"));
        driver.findElement(By.xpath("//*[@id='inventory_item_name']//descendant::div"));

    }
}
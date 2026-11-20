
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCartTest {

    public static void main(String[] args) throws InterruptedException {

        // STEP 1: Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // STEP 2: Maximise browser window
        driver.manage().window().maximize();

        // STEP 3: Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // STEP 4: Enter username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        // STEP 5: Enter password
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        // STEP 6: Click Login
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

        // STEP 7: Locate Add to Cart button
        WebElement addToCart = driver.findElement(
                By.id("add-to-cart-sauce-labs-backpack"));

        // STEP 8: Click Add to Cart
        addToCart.click();

        Thread.sleep(2000);

        // STEP 9: Locate shopping cart
        WebElement cart = driver.findElement(
                By.className("shopping_cart_link"));

        // STEP 10: Click shopping cart
        cart.click();

        Thread.sleep(3000);

        // STEP 11: Verify product in shopping cart
        boolean productFound = driver.getPageSource()
                .contains("Sauce Labs Backpack");

        if (productFound) {
            System.out.println("TEST PASSED: Product added to cart!");
        } else {
            System.out.println("TEST FAILED: Product not found!");
        }

        // STEP 12: Close browser
        driver.quit();
    }
}

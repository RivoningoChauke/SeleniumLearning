
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitTest {

    public static void main(String[] args) {

        // STEP 1: Launch Chrome
        WebDriver driver = new ChromeDriver();

        // STEP 2: Maximise browser
        driver.manage().window().maximize();

        // STEP 3: Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // STEP 4: Create Explicit Wait
        WebDriverWait wait = new WebDriverWait(
                driver, Duration.ofSeconds(10));

        // STEP 5: Wait for username field to be visible
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("user-name")));

        username.sendKeys("standard_user");

        // STEP 6: Wait for password field
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("password")));

        password.sendKeys("secret_sauce");

        // STEP 7: Wait until login button is clickable
        WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("login-button")));

        loginButton.click();

        // STEP 8: Wait for inventory page to appear
        WebElement inventory = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("inventory_list")));

        // STEP 9: Verify successful login
        if (inventory.isDisplayed()) {

            System.out.println("TEST PASSED: Login successful!");
            System.out.println("Explicit Wait worked!");

        } else {

            System.out.println("TEST FAILED!");
        }

        // STEP 10: Close browser
        driver.quit();
    }
}

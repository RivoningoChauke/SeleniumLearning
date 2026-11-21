
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;

public class FluentWaitTest {

    public static void main(String[] args) {

        // STEP 1: Launch Chrome
        WebDriver driver = new ChromeDriver();

        // STEP 2: Maximise browser
        driver.manage().window().maximize();

        // STEP 3: Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // STEP 4: Create Fluent Wait
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        // STEP 5: Find username field
        WebElement username = driver.findElement(
                By.id("user-name"));

        username.sendKeys("standard_user");

        // STEP 6: Find password field
        WebElement password = driver.findElement(
                By.id("password"));

        password.sendKeys("secret_sauce");

        // STEP 7: Click login button
        driver.findElement(By.id("login-button")).click();

        // STEP 8: Wait for inventory page
        WebElement inventory = wait.until(
                d -> d.findElement(By.className("inventory_list"))
        );

        // STEP 9: Verify successful login
        if (inventory.isDisplayed()) {

            System.out.println("TEST PASSED: Login successful!");
            System.out.println("Fluent Wait worked!");

        } else {

            System.out.println("TEST FAILED!");
        }

        // STEP 10: Close browser
        driver.quit();
    }
}

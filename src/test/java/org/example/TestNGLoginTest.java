
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGLoginTest {

    @Test
    public void verifySuccessfulLogin() {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        try {

            // Maximise browser window
            driver.manage().window().maximize();

            // Open SauceDemo
            driver.get("https://www.saucedemo.com/");

            // Enter username
            driver.findElement(By.id("user-name"))
                    .sendKeys("standard_user");

            // Enter password
            driver.findElement(By.id("password"))
                    .sendKeys("secret_sauce");

            // Click login
            driver.findElement(By.id("login-button"))
                    .click();

            // Verify successful login
            Assert.assertTrue(
                    driver.getCurrentUrl().contains("inventory.html"),
                    "Login was unsuccessful!"
            );

            System.out.println("TEST PASSED: Login successful!");

        } finally {

            // Close browser
            driver.quit();
        }
    }
}

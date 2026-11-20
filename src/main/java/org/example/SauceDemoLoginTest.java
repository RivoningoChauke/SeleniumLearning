
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLoginTest {

    public static void main(String[] args) throws InterruptedException {

        // STEP 1: Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // STEP 2: Maximise the browser window
        driver.manage().window().maximize();

        // STEP 3: Navigate to the SauceDemo login page
        driver.get("https://www.saucedemo.com/");

        // STEP 4: Locate the username field using its ID
        WebElement username = driver.findElement(By.id("user-name"));

        // Enter the valid username
        username.sendKeys("standard_user");

        Thread.sleep(2000);

        // STEP 5: Locate the password field using its ID
        WebElement password = driver.findElement(By.id("password"));

        // Enter the valid password
        password.sendKeys("secret_sauce");

        Thread.sleep(2000);

        // STEP 6: Locate the Login button using its ID
        WebElement loginButton =
                driver.findElement(By.id("login-button"));

        Thread.sleep(2000);

        // STEP 7: Click Login to submit the credentials
        loginButton.click();

        // Wait to observe the login result
        Thread.sleep(5000);

        // STEP 8: Retrieve and display the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Retrieve and display the page title
        System.out.println("Page Title: " + driver.getTitle());

        // STEP 9: Verify whether the login was successful
        if (driver.getCurrentUrl().contains("inventory.html")) {

            System.out.println("TEST PASSED: Login successful!");

        } else {

            System.out.println("TEST FAILED: Login unsuccessful!");

        }

        // STEP 10: Close the browser session
        driver.quit();
    }
}

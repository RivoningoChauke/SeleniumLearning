
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitTest {

    public static void main(String[] args) {

        // STEP 1: Launch Chrome
        WebDriver driver = new ChromeDriver();

        // STEP 2: Maximise browser
        driver.manage().window().maximize();

        // STEP 3: Set implicit wait
        driver.manage().timeouts().implicitlyWait(
                Duration.ofSeconds(10));

        // STEP 4: Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // STEP 5: Find username field
        WebElement username = driver.findElement(
                By.id("user-name"));

        username.sendKeys("standard_user");

        // STEP 6: Find password field
        WebElement password = driver.findElement(
                By.id("password"));

        password.sendKeys("secret_sauce");

        // STEP 7: Find login button
        WebElement loginButton = driver.findElement(
                By.id("login-button"));

        loginButton.click();

        // STEP 8: Find inventory page element
        WebElement inventory = driver.findElement(
                By.className("inventory_list"));

        // STEP 9: Verify successful login
        if (inventory.isDisplayed()) {

            System.out.println("TEST PASSED: Login successful!");
            System.out.println("Implicit Wait worked!");

        } else {

            System.out.println("TEST FAILED!");
        }

        // STEP 10: Close browser
        driver.quit();
    }
}

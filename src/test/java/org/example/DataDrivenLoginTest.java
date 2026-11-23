
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenLoginTest {

    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {

        return new Object[][] {
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"}
        };
    }

    @Test(dataProvider = "loginData")
    public void verifyLogin(String username, String password) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            driver.get("https://www.saucedemo.com/");

            driver.findElement(By.id("user-name"))
                    .sendKeys(username);

            driver.findElement(By.id("password"))
                    .sendKeys(password);

            driver.findElement(By.id("login-button"))
                    .click();

            Assert.assertTrue(
                    driver.getCurrentUrl().contains("inventory.html"),
                    "Login failed for username: " + username
            );

            System.out.println("PASS: Login successful for " + username);

        } finally {
            driver.quit();
        }
    }
}
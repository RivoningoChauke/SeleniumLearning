
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginScenarioTest {

    @DataProvider(name = "loginScenarios")
    public Object[][] provideLoginScenarios() {

        return new Object[][] {
                {"standard_user", "secret_sauce", true},
                {"standard_user", "wrong_password", false},
                {"", "secret_sauce", false}
        };
    }

    @Test(dataProvider = "loginScenarios")
    public void verifyLoginScenarios(
            String username,
            String password,
            boolean expectedSuccess) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            driver.findElement(By.id("user-name")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("login-button")).click();

            boolean actualSuccess =
                    driver.getCurrentUrl().contains("inventory.html");

            Assert.assertEquals(
                    actualSuccess,
                    expectedSuccess,
                    "Unexpected login result for username: " + username
            );

            System.out.println(
                    "PASS: Login scenario behaved as expected for: " + username
            );

        } finally {
            driver.quit();
        }
    }
}

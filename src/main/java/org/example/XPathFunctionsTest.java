
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathFunctionsTest {

    public static void main(String[] args) throws InterruptedException {

        // STEP 1: Launch Chrome
        WebDriver driver = new ChromeDriver();

        // STEP 2: Maximise browser
        driver.manage().window().maximize();

        // STEP 3: Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);

        // STEP 4: Locate username using contains()
        WebElement containsLocator = driver.findElement(
                By.xpath("//input[contains(@id,'user')]")
        );

        System.out.println(
                "Contains XPath: " + containsLocator.isDisplayed()
        );

        // STEP 5: Locate username using starts-with()
        WebElement startsWithLocator = driver.findElement(
                By.xpath("//input[starts-with(@id,'user')]")
        );

        System.out.println(
                "Starts-with XPath: " + startsWithLocator.isDisplayed()
        );

        Thread.sleep(3000);

        // STEP 6: Close browser
        driver.quit();
    }
}

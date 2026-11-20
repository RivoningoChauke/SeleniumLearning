
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathComparisonTest {

    public static void main(String[] args) throws InterruptedException {

        // STEP 1: Launch Chrome
        WebDriver driver = new ChromeDriver();

        // STEP 2: Maximise browser
        driver.manage().window().maximize();

        // STEP 3: Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);

        // STEP 4: Locate username using Absolute XPath
        WebElement absolute = driver.findElement(
                By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")
        );

        // STEP 5: Locate username using Relative XPath
        WebElement relative = driver.findElement(
                By.xpath("//*[@id='user-name']")
        );

        // STEP 6: Print results
        System.out.println("Absolute XPath: " + absolute.isDisplayed());
        System.out.println("Relative XPath: " + relative.isDisplayed());

        Thread.sleep(3000);

        // STEP 7: Close browser
        driver.quit();
    }
}

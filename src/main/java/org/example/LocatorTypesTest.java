
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTypesTest {

    public static void main(String[] args) throws InterruptedException {

        // STEP 1: Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // STEP 2: Maximise browser window
        driver.manage().window().maximize();

        // STEP 3: Open SauceDemo website
        driver.get("https://www.saucedemo.com/");

        // STEP 4: Locate username using NAME
        WebElement usernameByName =
                driver.findElement(By.name("user-name"));

        System.out.println("Name locator: " +
                usernameByName.isDisplayed());

        // STEP 5: Locate username using CLASS NAME
        WebElement usernameByClass =
                driver.findElement(By.className("form_input"));

        System.out.println("Class Name locator: " +
                usernameByClass.isDisplayed());

        // STEP 6: Locate all input elements using TAG NAME
        int inputCount =
                driver.findElements(By.tagName("input")).size();

        System.out.println("Number of input elements: " + inputCount);

        // STEP 7: Locate username using CSS SELECTOR
        WebElement usernameByCSS =
                driver.findElement(By.cssSelector("#user-name"));

        System.out.println("CSS Selector: " +
                usernameByCSS.isDisplayed());

        // STEP 8: Locate username using XPATH
        WebElement usernameByXPath =
                driver.findElement(By.xpath("//*[@id='user-name']"));

        System.out.println("XPath locator: " +
                usernameByXPath.isDisplayed());

        // STEP 9: Wait to observe the browser
        Thread.sleep(5000);

        // STEP 10: Close browser
        driver.quit();
    }
}

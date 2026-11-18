
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationTest {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximise browser window
        driver.manage().window().maximize();

        // Open Google homepage
        driver.get("https://www.google.com");
        System.out.println("First website: " + driver.getTitle());

        Thread.sleep(2000);

        // Navigate to Selenium official website
        driver.navigate().to("https://www.selenium.dev");
        System.out.println("Second website: " + driver.getTitle());

        Thread.sleep(2000);

        // Navigate back to Google
        driver.navigate().back();
        System.out.println("After going back: " + driver.getTitle());

        Thread.sleep(2000);

        // Navigate forward to Selenium website
        driver.navigate().forward();
        System.out.println("After going forward: " + driver.getTitle());

        Thread.sleep(2000);

        // Refresh the current webpage
        driver.navigate().refresh();

        // Close browser
        driver.quit();
    }
}
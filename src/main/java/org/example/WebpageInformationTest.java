
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageInformationTest {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximise browser window
        driver.manage().window().maximize();

        // Open Selenium website
        driver.get("https://www.selenium.dev");

        // Retrieve and display page title
        System.out.println("Page Title: " + driver.getTitle());

        // Retrieve and display current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Retrieve webpage HTML source
        String pageSource = driver.getPageSource();

        // Display page source information
        System.out.println("Page source retrieved successfully!");

        // Check whether HTML source is available
        System.out.println("Contains HTML tag: " + pageSource.contains("<html"));

        // Display page source length
        System.out.println("Page source length: " + pageSource.length());

        // Keep browser open for 5 seconds
        Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}

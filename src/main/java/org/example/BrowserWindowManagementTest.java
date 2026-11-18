
package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowManagementTest {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Maximise browser window
        driver.manage().window().maximize();
        System.out.println("Browser maximised");

        Thread.sleep(2000);

        // Retrieve browser window dimensions
        Dimension size = driver.manage().window().getSize();

        System.out.println("Browser width: " + size.getWidth());
        System.out.println("Browser height: " + size.getHeight());

        Thread.sleep(2000);

        // Minimise browser window
        driver.manage().window().minimize();
        System.out.println("Browser minimised");

        Thread.sleep(2000);

        // Restore browser window
        driver.manage().window().maximize();
        System.out.println("Browser restored");

        Thread.sleep(2000);

        // Switch browser to full-screen mode
        driver.manage().window().fullscreen();
        System.out.println("Browser in full-screen mode");

        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}

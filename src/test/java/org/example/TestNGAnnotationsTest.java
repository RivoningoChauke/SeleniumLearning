
package org.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsTest {

    @BeforeClass
    public void setUpClass() {
        System.out.println("BeforeClass: Runs once before all test methods.");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("BeforeMethod: Runs before each test method.");
    }

    @Test
    public void firstTest() {
        System.out.println("Test 1: Verify successful login.");
    }

    @Test
    public void secondTest() {
        System.out.println("Test 2: Verify shopping cart.");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("AfterMethod: Runs after each test method.");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("AfterClass: Runs once after all test methods.");
    }
}

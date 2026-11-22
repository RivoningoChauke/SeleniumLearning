
package org.example;

import org.testng.annotations.Test;

public class TestNGPriorityTest {

    @Test(priority = 3)
    public void verifyShoppingCart() {
        System.out.println("Step 3: Verify shopping cart.");
    }

    @Test(priority = 1)
    public void verifyLogin() {
        System.out.println("Step 1: Verify login.");
    }

    @Test(priority = 2)
    public void verifyProductPage() {
        System.out.println("Step 2: Verify product page.");
    }
}

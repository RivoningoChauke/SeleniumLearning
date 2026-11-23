
package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMultipleParametersTest {

    @DataProvider(name = "productData")
    public Object[][] provideProductData() {

        return new Object[][] {
                {"Sauce Labs Backpack", 29.99},
                {"Sauce Labs Bike Light", 9.99},
                {"Sauce Labs Bolt T-Shirt", 15.99},
                {"Sauce Labs Fleece Jacket", 49.99}
        };
    }

    @Test(dataProvider = "productData")
    public void verifyProductDetails(String productName, double price) {

        Assert.assertNotNull(productName);
        Assert.assertTrue(price > 0);

        System.out.println("Product: " + productName);
        System.out.println("Price: R" + price);
        System.out.println("----------------------");
    }
}

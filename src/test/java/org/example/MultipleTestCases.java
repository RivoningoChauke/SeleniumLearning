
package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleTestCases {

    @Test
    public void verifyApplicationName() {

        String applicationName = "SauceDemo";

        Assert.assertEquals(applicationName, "SauceDemo");

        System.out.println("PASS: Application name is correct.");
    }

    @Test
    public void verifyUsername() {

        String username = "standard_user";

        Assert.assertEquals(username, "standard_user");

        System.out.println("PASS: Username is correct.");
    }

    @Test
    public void verifyPassword() {

        String password = "secret_sauce";

        Assert.assertEquals(password, "secret_sauce");

        System.out.println("PASS: Password is correct.");
    }
}

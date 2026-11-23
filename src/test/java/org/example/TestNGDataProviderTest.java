
package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderTest {

    @DataProvider(name = "usernameData")
    public Object[][] provideUsernames() {

        return new Object[][] {
                {"standard_user"},
                {"problem_user"},
                {"performance_glitch_user"}
        };
    }

    @Test(dataProvider = "usernameData")
    public void verifyUsernameData(String username) {

        Assert.assertNotNull(username);

        System.out.println("Testing username: " + username);
    }
}

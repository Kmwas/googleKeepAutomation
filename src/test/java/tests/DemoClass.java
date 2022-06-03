package tests;

import org.testng.annotations.Test;

import static utils.DriverFactory.getDriver;

public class DemoClass extends TestManager {

    @Test
    public void foo() {
        getDriver();
    }
}

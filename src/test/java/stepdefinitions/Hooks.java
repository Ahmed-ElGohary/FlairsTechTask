package stepdefinitions;

import io.cucumber.java.Before;
import base.BaseTest;

public class Hooks extends BaseTest {

    @Before
    public void setup() {
        initializeDriver();  // WebDriver setup
    }

//    @After
//    public void tearDown() {
//        driver.quit();  // Close browser after scenario
//    }
}

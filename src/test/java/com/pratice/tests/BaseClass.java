package com.pratice.tests;

import com.practice.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.sql.DriverManager;

class BaseClass {
    static WebDriver driver;

    @BeforeMethod
    private void setUp() {
        driver = Driver.initDriver();
    }

    @AfterMethod
    private void tearDown() {
        Driver.closeDriver();
    }

}

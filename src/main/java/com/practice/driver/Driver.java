package com.practice.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Objects;

public final class Driver {

    private Driver() {
    }

    private static WebDriver driver;

    public static WebDriver initDriver() {
        if (Objects.isNull(driver)) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setHeadless(true);
            driver = new ChromeDriver(chromeOptions);
            DriverManager.setDriverThreadLocal(driver);
            DriverManager.getDriverThreadLocal().get("https://www.google.co.in/");
            DriverManager.getDriverThreadLocal().manage().window().maximize();
        }
        return DriverManager.getDriverThreadLocal();
    }

    public static void closeDriver() {
        if (Objects.nonNull(DriverManager.getDriverThreadLocal())) {
            DriverManager.getDriverThreadLocal().quit();
            DriverManager.unloadDriver();
        }
    }
}

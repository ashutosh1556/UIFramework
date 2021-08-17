package com.practice.driver;

import org.openqa.selenium.WebDriver;

final class DriverManager {
    private DriverManager() {
    }

    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    static WebDriver getDriverThreadLocal() {
        return driverThreadLocal.get();
    }

    static void setDriverThreadLocal(WebDriver driver) {
        driverThreadLocal.set(driver);
    }

    static void unloadDriver() {
        driverThreadLocal.remove();
    }

}

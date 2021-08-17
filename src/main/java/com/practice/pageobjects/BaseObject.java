package com.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

class BaseObject {

    private BaseObject() {
    }

    static WebDriver driver;

    protected BaseObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

package com.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class GoogleHomePage extends BaseObject {

    @FindBy(name = "q")
    private WebElement textBox;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public GoogleHomePage enterDataInTextBox(String str) {
        textBox.sendKeys(str);
        return new GoogleHomePage(driver);
    }

    @FindBy(xpath = "//div[@jsmodel='vWNDde']/div/div/center/input[1]")
    private WebElement submitBtn;

    public GoogleSearchPage clickSubmit() {
        submitBtn.click();
        return new GoogleSearchPage(driver);
    }

    public static String getTitle() {
        return driver.getTitle();
    }
}

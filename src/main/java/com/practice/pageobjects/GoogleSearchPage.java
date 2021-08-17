package com.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public final class GoogleSearchPage extends BaseObject {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[@class='LC20lb DKV0Md']")
    private List<WebElement> list;

    public GoogleSearchPage getResultList() {
        int counter = 1;
        for (WebElement w : list) {
            System.out.println(counter + ": " + w.getAttribute("innerHTML"));
            counter++;
        }
        return new GoogleSearchPage(driver);
    }
}

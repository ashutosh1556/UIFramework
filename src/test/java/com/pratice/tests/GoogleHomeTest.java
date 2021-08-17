package com.pratice.tests;

import com.practice.pageobjects.GoogleHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.practice.pageobjects.GoogleHomePage.getTitle;

final class GoogleHomeTest extends BaseClass {

    private GoogleHomeTest() {
    }

    GoogleHomePage googleHomePage;

    @Test
    private void searchText() {
        googleHomePage = new GoogleHomePage(driver);
        googleHomePage.enterDataInTextBox("Algorithms").clickSubmit();
        Assert.assertEquals("Algorithms - Google Search", getTitle());
        System.out.println("Test executed successfully");
    }
}

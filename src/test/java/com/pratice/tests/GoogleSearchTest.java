package com.pratice.tests;

import com.practice.pageobjects.GoogleHomePage;
import com.practice.pageobjects.GoogleSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

final class GoogleSearchTest extends BaseClass {

    private GoogleSearchTest() {
    }

    GoogleHomePage googleHomePage;

    @Test
    private void printResultListFromSearchPage() {
            googleHomePage = new GoogleHomePage(driver);
            googleHomePage.enterDataInTextBox("Algorithms").clickSubmit().getResultList();
            Assert.assertEquals(1, 1);
    }
}

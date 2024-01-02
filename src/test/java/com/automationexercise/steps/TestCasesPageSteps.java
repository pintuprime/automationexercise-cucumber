package com.automationexercise.steps;

import com.automationexercise.pages.TestCasePage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TestCasesPageSteps {
    @Then("verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        String expectedPageTitle = "Automation Practice Website for UI Testing - Test Cases";
        Assert.assertEquals(new TestCasePage().getTitle(),expectedPageTitle, "Title not matching");
    }
}

package test;

import baseClasses.BaseUITest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IFramePage;
import pages.WelcomePage;
import utilities.Constans;


public class PracticeAutomationTest extends BaseUITest {


    @Test(description = "Practice automation test")
    public void practiceAutomationTest() {
        //welcome Page
        WelcomePage welcomePage = new WelcomePage(driver);
        //Scroll the window to iframe element
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", welcomePage.iFrameElement);
        //Wait the btn be clickable
        waitWebAction.waitForElementToBeEnable(welcomePage.iFrameElement);
        //Click on btn by webAction
        webAction.clickOnBtn(welcomePage.iFrameElement);


        //iframe Page
        //On IFramePage class defined iframe element
        IFramePage iFramePage = new IFramePage(driver);

        String expectedIFrameUrl = Constans.IFRAME_URL;
        try {
            Assert.assertEquals(expectedIFrameUrl, driver.getCurrentUrl());
            System.out.println("[Pass:] The iframe url is correct");

            //Switch the driver to first iframe
            webAction.switchToElemnt(iFramePage.iframe1);
            //Scroll the iframe to bottom
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", iFramePage.gitHubLink);
            //wait the btn be clickable
            waitWebAction.waitForElementToBeEnable(iFramePage.gitHubLink);
            //Click on the link
            webAction.clickOnBtn(iFramePage.gitHubLink);


            //github Page
            String expectedUrl = Constans.GITHUB_URL;
            //Switch the driver to new  git tab
            helperFunctions.switchToNextTab();
            try {
                Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
                System.out.println("[Pass:] The Github url is correct");
            } catch (Exception e) {
                System.out.println("[Fail:] The github link is incorrect");
            }

        } catch (Exception e) {
            System.out.println("[Fail:] The iframe link is incorrect");
        }

    }

}

package com.demoqa.pages.alertsFrameWindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver) {
        super(driver);
    }
@FindBy(tagName="iFrame")
List<WebElement> iframe;
    public FramePage returnListOfFrames() {
        //by finding all elements using method size()
        System.out.println("The total number if frames are " +iframe.size());
        //by executor js JavaScriptExecutor
        //Integer numberOfFrames = Integer.parseInt(js.executorScript("return window.length").toString());
        //System.out.println("The total number if frames are " +iframe.size());
        return this;
    }

    public FramePage switchToiFrameByIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }
@FindBy(id ="sampleHeading")
WebElement sampleHeading;
    public FramePage verifyiFrameByText(String text) {
        Assert.assertTrue(shouldHaveText(sampleHeading,text, 1));
        return this;
    }
@FindBy(id = "frame1")
WebElement frame1;
    public FramePage switchToiFrameByID() {
        driver.switchTo().frame(frame1);
        return this;
    }

    public FramePage switchToMainPage() {
        //to main page for all of the objects
     driver.switchTo().defaultContent();
        return this;
    }
@FindBy(tagName = "h1")
WebElement title;
    public FramePage verifyMainPageByTitle(String text) {
        Assert.assertTrue(title.getText().contains(text));
        return this;
    }
@FindBy(tagName="body")
WebElement body;
    public FramePage handleNestledFrames() {
        //switch to parent frame
        driver.switchTo().frame(frame1);
        //get text from parent frame
        System.out.println("iframe is "+body.getText());
        //number of iframes in parent frames
        System.out.println("Number of iframes are " +iframe.size());
        //switch to child frame
        driver.switchTo().frame(0);
        System.out.println("iframe is "+body.getText());
        return this;
    }
}

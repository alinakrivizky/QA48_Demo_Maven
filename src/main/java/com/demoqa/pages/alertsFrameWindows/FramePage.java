package com.demoqa.pages.alertsFrameWindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}

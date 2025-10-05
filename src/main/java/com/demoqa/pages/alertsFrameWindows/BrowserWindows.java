package com.demoqa.pages.alertsFrameWindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWindows extends BasePage {
    public BrowserWindows(WebDriver driver) {
        super(driver);
    }
@FindBy(id ="tabButton")
WebElement tabButton;
    public BrowserWindows switchToNewTab(int index) {
click(tabButton);
        return this;
    }
}

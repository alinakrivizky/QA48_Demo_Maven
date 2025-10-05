package com.demoqa.pages;

import com.demoqa.pages.alertsFrameWindows.AlertsPage;
import com.demoqa.pages.alertsFrameWindows.BrowserWindows;
import com.demoqa.pages.alertsFrameWindows.FramePage;
import com.demoqa.pages.bookStore.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {
    public SidePanel(WebDriver driver) {
        super(driver);
    }
   @FindBy(xpath="//span[.=\"Login\"]")
   WebElement login;
    public LoginPage selectLogin() {
        click(login);
        return  new LoginPage(driver);
    }
    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;
    public AlertsPage selectAlerts() {
        click(alerts);
        return new AlertsPage(driver);
    }
@FindBy(xpath ="//span[.='Frames']")
WebElement frames;
    public FramePage selectFrame() {
        click(frames);
        return new FramePage(driver);
    }
@FindBy(xpath ="//span[.='Nested Frames']")
WebElement nestedFrames;
    public FramePage selectNestedFrames() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nestedFrames);
        return new FramePage(driver);
    }
    @FindBy(xpath ="//span[.='Browser Windows']")
    WebElement browserWindows;
    public BrowserWindows selectBrowserWindows() {
        click(browserWindows);
        return new BrowserWindows(driver);
    }
}

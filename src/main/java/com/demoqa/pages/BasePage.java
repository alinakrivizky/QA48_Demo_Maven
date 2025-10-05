package com.demoqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
   public WebDriver driver;
   public static JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void click(WebElement element) {
        element.click();
    }
    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public boolean shouldHaveText(WebElement element, String text, int time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }
    //extra method to avoid problems
        //public void clickWithJS (WebElement element, int x,int y){
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("window.scrllBy("+x+","+y+")");
            //click(element);
        //}
    public void hideAd(){
        js.executeScript("document.getElementById('adplus-anchor').style.display='none';");
    }
    public void hideFooter(){
        js.executeScript("document.querySelector('footer').style.display='none';");
    }
    public void hideiFrames(){
        hideAd();
        hideFooter();
    }
    }



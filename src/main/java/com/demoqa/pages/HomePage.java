package com.demoqa.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SidePanel getBookStore() {
        return new SidePanel(driver);
    }
}

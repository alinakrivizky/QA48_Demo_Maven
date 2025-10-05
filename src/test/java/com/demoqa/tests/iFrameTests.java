package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsFrameWindows.FramePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iFrameTests extends TestBase{
    @BeforeMethod
    public void preCondition(){
        new HomePage(driver).getAlertsFrameWindows();
    }
    @Test
    public void iFrameTest(){
        new SidePanel(driver).selectFrame();
        new FramePage(driver).returnListOfFrames();
    }
}

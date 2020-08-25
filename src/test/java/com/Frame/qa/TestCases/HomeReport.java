package com.Frame.qa.TestCases;

import com.Frame.qa.DriverManager.DriverManager;
import com.Frame.qa.config.Config;
import com.Frame.qa.Listeners.ScreenshotListener;
import com.Frame.qa.Util.CaptureType;
import com.Frame.qa.Util.FrameWorkUtls;
import com.Frame.qa.reports.HtmlReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners({ScreenshotListener.class})

public class HomeReport {
    ExtentTest test = HtmlReports.getReport().createTest("HomeReport");


    @Test()
    public void testBrowser() throws InterruptedException, IOException {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Config.getProperty("url"));

        test.log(Status.PASS, "APP URL OPENED SUCCESSFULLY");
        test.addScreenCaptureFromPath(FrameWorkUtls.captureScreen("testBrowser", CaptureType.PASS));
        Thread.sleep(5000);
        driver.quit();
        HtmlReports.getReport().flush();
    }


}

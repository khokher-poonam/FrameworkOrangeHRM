package com.Frame.qa.TestCases;

import com.Frame.qa.DriverManager.DriverManager;
import com.Frame.qa.Listeners.ScreenshotListener;
import com.Frame.qa.data.ExcelData;
import com.Frame.qa.pages.AdminPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ScreenshotListener.class})

public class AdminPageTest  {
    WebDriver driver = DriverManager.getDriver();

    @Test(enabled = true,dataProviderClass = ExcelData.class,dataProvider = "adminPageProvider")
    public void formTest(String[]data) throws InterruptedException {

        AdminPage adminPage=new AdminPage(driver);
      adminPage.clickadminUsername((String)data[0]);
      adminPage.clickadminEmployeeRole((String)data[1]);
      adminPage.clickadminformemployeename((String)data[2]);
      adminPage.clickadminformstatus((String)data[3]);
      adminPage.clickadminformsearchbtnn();
      driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        adminPage.assignLeave();

    }


}

package com.Frame.qa.TestCases;

import com.Frame.qa.DriverManager.DriverManager;
import com.Frame.qa.config.Config;
import com.Frame.qa.data.ExcelData;
import com.Frame.qa.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//
//@Listeners({ScreenshotListener.class})

public class LoginPageTest  {
    WebDriver driver = DriverManager.getDriver();
    @BeforeSuite(enabled = true)

    public void setUp () {
        driver = DriverManager.getDriver();
        driver.get(Config.getProperty("url"));
    }
    @Test(enabled = true,dataProviderClass = ExcelData.class,dataProvider = "loginPageProvider")
    public void LoginOrange(String[]data) throws InterruptedException
    {
        LoginPage page= new LoginPage(driver);
        page.loginUsername((String)data[0]);
        page.loginPassword((String)data[1]);
        page.loginbtnn();
        Thread.sleep(3000);
    }


}

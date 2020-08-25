package com.Frame.qa.TestCases;

import com.Frame.qa.DriverManager.DriverManager;
import com.Frame.qa.config.Config;
import com.Frame.qa.pages.OrangeHRMDashboardPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OrangeHRMDashboardTest {
    WebDriver driver = DriverManager.getDriver();
    OrangeHRMDashboardPage loginpp=new OrangeHRMDashboardPage(driver);



        @BeforeSuite(enabled = true)

        public void setUp () {
            driver = DriverManager.getDriver();
            driver.get(Config.getProperty("url"));
        }
        @Test(priority = 1)
        public void loginPageTitle ()
        {
            String title = loginpp.validateLoginPageTitle();
            Assert.assertEquals(title, "OrangeHRM");
        }
        @Test()
        public void signIn ()
        {
            driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

            loginpp.adminClick();
        }

}

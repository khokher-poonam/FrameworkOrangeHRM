package com.Frame.qa.TestCases;

import com.Frame.qa.DriverManager.DriverManager;
import com.Frame.qa.config.Config;
import com.Frame.qa.Listeners.ScreenshotListener;
import com.Frame.qa.pages.DirectoryPage;
import com.Frame.qa.pages.OrangeHRMDashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ScreenshotListener.class})
public class DirectoryPageTest  {
    WebDriver driver = DriverManager.getDriver();
    OrangeHRMDashboardPage loginPage;

    public Object DirectoryPage;

//    @BeforeSuite
//    public void setUp(){
//        loginPage = new LoginPage(driver);
//        homePage= loginPage.login(Config.getProperty("username"),Config.getProperty("password"));
//        DirectoryPage=homePage.clickdirectoryPage();
//    }
//    @Test(priority = 1)
//    public void loginpageTitle()
//    {
//        String title =loginPage.validateLoginPageTitle();
//        Assert.assertEquals(title,"OrangeHRM");
//    }
    @Test(priority = 2)
    public void clickdirectoryformTest() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/directory/viewDirectory/");
        DirectoryPage directoryPage=new DirectoryPage(driver);
    directoryPage.clickondirectoryform(Config.getProperty("username2"));
        Thread.sleep(2000);

        Select select=new Select(driver.findElement(By.id("searchDirectory_job_title")));
        select.selectByVisibleText("CEO");
        Thread.sleep(3000);

        Select select2=new Select(driver.findElement(By.id("searchDirectory_location")));
        select2.selectByVisibleText("  United States");
    Thread.sleep(3000);
    }

    @AfterSuite
    public  void tearDown()
    {
        driver.quit();
    }
}

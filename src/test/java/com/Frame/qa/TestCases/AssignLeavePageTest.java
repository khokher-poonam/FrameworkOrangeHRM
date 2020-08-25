package com.Frame.qa.TestCases;

import com.Frame.qa.DriverManager.DriverManager;
import com.Frame.qa.config.Config;
import com.Frame.qa.data.ExcelData;
import com.Frame.qa.pages.AssignLeavePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AssignLeavePageTest {
    WebDriver driver = DriverManager.getDriver();
  @Test(enabled = true,dataProviderClass = ExcelData.class,dataProvider = "assignPageData")
    public void assignTest(String[]data) throws InterruptedException {
      AssignLeavePage Assign=new AssignLeavePage(driver);
      Thread.sleep(1000);
Assign.assignPage();
      Assign.empName((String)data[0]);
      Assign.leaveTypeSelect();
      Assign.fromDate((String)data[1]);
      Assign.toDate((String)data[2]);
      Assign.comment((String)data[3]);
      Assign.assignBtn();
  }

}



package com.Frame.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    WebDriver driver;

    @FindBy(name="searchSystemUser[userName]")
    WebElement username;
@FindBy(xpath = "//select[@id='searchSystemUser_userType']")
WebElement employeeRole;
    @FindBy(id="searchSystemUser_employeeName_empName")
    WebElement employeename;
    @FindBy(id="searchSystemUser_status")
    WebElement status;
    @FindBy(id="searchBtn")
    WebElement searchbtnn;
    @FindBy(id="resetBtn")
    WebElement resetbtnn;
    @FindBy(xpath="//div[@class='quickLaunge']//span[text()='Assign Leave']")
    WebElement assignLeave;

    public AdminPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickadminUsername(String un1) {
        username.sendKeys(un1);
    }

    public void clickadminEmployeeRole(String empr) {
        employeeRole.sendKeys(empr);
    }
    public void clickadminformemployeename(String empn) {
        employeename.sendKeys(empn);
    }
    public void clickadminformstatus(String stas) {
        status.sendKeys(stas);
    }
    public void clickadminformsearchbtnn() {
        searchbtnn.click();
    }
    public void clickadminformresetbtnn() {
        resetbtnn.click();
    }
    public void assignLeave()
    {
        this.assignLeave.click();
    }


}

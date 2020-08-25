package com.Frame.qa.pages;

import com.Frame.qa.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AssignLeavePage
{
    WebDriver driver;

@FindBy(xpath = "//a[@id='menu_leave_assignLeave']")
WebElement assignLeavePg;
    @FindBy(xpath = "//input[@id='assignleave_txtEmployee_empName']")
    WebElement empName;
    @FindBy(xpath = "//select[@id='assignleave_txtLeaveType']")
    WebElement leaveTypeSelect;
    @FindBy(xpath = "//input[@id='assignleave_txtFromDate']")
    WebElement fromDate;
    @FindBy(xpath = "assignleave_txtToDate")
    WebElement toDate;
    @FindBy(xpath = "//textarea[@id='assignleave_txtComment']")
    WebElement comment;
    @FindBy(xpath = "//input[@id='assignBtn']")
    WebElement assignBtn;

    public AssignLeavePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
public  AssignLeavePage assignPage()
{
    this.assignLeavePg.click();
    return this;
}
    public AssignLeavePage empName(String empn)
    {
        this.empName.sendKeys(empn);
        return this;
    }
    public AssignLeavePage leaveTypeSelect()
    {
        Select select=new Select(leaveTypeSelect);
        select.selectByVisibleText("Vacation US");
        return this;
    }
    public AssignLeavePage fromDate(String frDate)
    {
        this.fromDate.sendKeys(frDate);
        return this;
    }
    public AssignLeavePage toDate(String toDate)
    {
        this.toDate.sendKeys(toDate);
        return this;
    }
    public AssignLeavePage comment(String comment)
    {
        this.comment.sendKeys(comment);
        return this;
    }
    public AssignLeavePage assignBtn()
    {
        this.assignBtn.click();
        return this;
    }
}

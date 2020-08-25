package com.Frame.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMDashboardPage {
    WebDriver driver;
    @FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
    WebElement admin;


    public OrangeHRMDashboardPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
public String validateLoginPageTitle()
{
    return driver.getTitle();
}
  public OrangeHRMDashboardPage adminClick()
    {
        this.admin.click();
        return this;
    }
}

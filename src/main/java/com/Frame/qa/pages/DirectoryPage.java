package com.Frame.qa.pages;

import com.Frame.qa.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectoryPage  {
    public WebDriver driver;

    @FindBy(xpath="//input[@id='searchDirectory_emp_name_empName']")
    WebElement name;
    @FindBy(id="searchBtn")
    WebElement searchbtnn;
    @FindBy(id="resetBtn")
    WebElement resetbtnn;

    public DirectoryPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickondirectoryform(String un2)
    {
        name.sendKeys(un2);
        searchbtnn.click();
        resetbtnn.click();
    }
}

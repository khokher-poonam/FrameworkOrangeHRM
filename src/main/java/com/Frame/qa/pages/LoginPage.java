package com.Frame.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id ="txtUsername")
    public WebElement email;

    @FindBy(id="txtPassword")
    public WebElement password;

    @FindBy(id="btnLogin")
   public WebElement loginbtn;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public LoginPage loginUsername(String email)
    {
        this.email.sendKeys(email.trim());
        return this;
    }
    public LoginPage loginPassword(String pwd)
    {

        this.password.sendKeys(pwd.trim());
        return this;
    }
    public LoginPage loginbtnn()
    {
        this.loginbtn.click();
        return this;
    }

}

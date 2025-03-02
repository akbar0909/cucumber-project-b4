package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {

    public SmartBearLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="ctl00$MainContent$username")
    public WebElement usernameBox;

    @FindBy (name = "ctl00$MainContent$password")
    public WebElement passwordBox;

    @FindBy (name = "ctl00$MainContent$login_button")
    public WebElement loginButton;
}

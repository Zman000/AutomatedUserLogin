package com.userlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {
    private static WebDriver driver;
    protected void setDriver()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }
}

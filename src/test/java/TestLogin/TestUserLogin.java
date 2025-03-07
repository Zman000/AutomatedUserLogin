package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

public class TestUserLogin {
    private WebDriver driver;

    @BeforeClass
    public void setDriver()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://192.168.2.190/userlogin/index.html");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void testLoginIntoNetwork() throws InterruptedException {
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("//form//input[@type='text']"));
        WebElement password = driver.findElement(By.xpath("//form//input[@type='password']"));
        username.sendKeys("23cs01008");
        password.sendKeys("iitbbs#2182");

        WebElement loginButton = driver.findElement(By.xpath("//form//input[@type='submit']"));
        loginButton.click();
        Thread.sleep(5000);

        WebElement checkLogin = driver.findElement(By.xpath("//table//p[@class='para1']"));
        String check = "You have been successfully log in to IIT Bhubaneswar Network";
        Assert.assertEquals(checkLogin.getText(),check,"Login Failed!");

    }
}

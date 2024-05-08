package Codefiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginWithUserNamePassword extends Logincode {



    @FindBy(xpath = "//input[@id='txt-username']")
    static WebElement UserName;

    @FindBy(xpath = "//input[@id='txt-password']")
    static WebElement Password;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    static WebElement Login;

    public LoginWithUserNamePassword(WebDriver driver) throws IOException {
        super(driver);
    }


        @Test
    public void Enter_Username_Password_and_login(){

        UserName.sendKeys("John Doe");
        Password.sendKeys("ThisIsNotAPassword");
        Login.click();
    }
}

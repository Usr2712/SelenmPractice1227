package Codefiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.desktop.SystemEventListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Logincode {

    public static WebDriver driver;
    static Properties prop = new Properties();
    static FileInputStream File;

    static {
        try {
            File = new FileInputStream("C:\\Users\\DELL\\Sai\\SeleniumAutomation\\src\\test\\resources\\Utilities\\Config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public Logincode() throws IOException {
    }
    public void  SetDriver() throws IOException {
        prop.load(File);

        if (prop.getProperty("Browser").equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Intel\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
    }
    }

    @Test
    public void OpenBrowser() throws IOException {

          driver.get(prop.getProperty("Url"));
          driver.manage().window().maximize();

        }
    }







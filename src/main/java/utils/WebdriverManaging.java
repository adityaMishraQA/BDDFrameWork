package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.util.Properties;

public class WebdriverManaging {
    public WebDriver driver;



    public WebDriver driverSetup() throws IOException {
        Properties properties=new Properties();
        InputStream inputStream=new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ConfigFiles\\global.properties"));
        properties.load(inputStream);
        if (driver==null)
        {
            if (properties.getProperty("browser").equalsIgnoreCase("Chrome"))
            {
                WebDriverManager.chromiumdriver().setup();
                driver=new ChromeDriver();

            } else {
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                
            }
            driver.manage().window().maximize();
        }
        return driver;
    }
}

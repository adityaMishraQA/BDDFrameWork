package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverManaging {
    public WebDriver driver;

    public WebDriver driverSetup()
    {
        if (driver==null)
        {
            System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver-win64\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        }
        return driver;
    }
}

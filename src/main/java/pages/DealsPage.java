package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealsPage extends BasePage{

    private final By searchFieldDealsPage=By.id("search-field");
    private final By getSearchItemText=By.xpath("//td[text()='Tomato']");

    public DealsPage(WebDriver driver)
    {
        super(driver);
    }

    public void searchingInDealsPage(String search)
    {
        findField(searchFieldDealsPage).sendKeys(search);
    }

    public void switchToChildTab()
    {
        switchToTab();
    }

    public String searchItemTextDealsPage()
    {
        return getTextbyXpath(getSearchItemText);
    }





}

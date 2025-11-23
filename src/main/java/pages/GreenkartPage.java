package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GreenkartPage extends BasePage {

    private final By searchFiled = By.xpath("//input[@type='search']");
    private final By greenkartPageSearchedresult = By.xpath("//h4[@class='product-name']");
    private final By topDealsLink = By.linkText("Top Deals");

    public GreenkartPage(WebDriver driver) {
        super(driver);
    }

    public void sendingTextonSearchField(String search) {
        findField(searchFiled).sendKeys(search);
    }

    public String getTextofSearchedItem() {
        return getTextbyXpath(greenkartPageSearchedresult);
    }

    public void clickOnTopDeals() {
        cliclOnElement(topDealsLink);
    }


}

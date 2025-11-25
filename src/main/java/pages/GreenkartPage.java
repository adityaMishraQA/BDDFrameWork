package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GreenkartPage extends BasePage {

    private final By searchFiled = By.xpath("//input[@type='search']");
    private final By greenkartPageSearchedresult = By.xpath("//h4[@class='product-name']");
    private final By topDealsLink = By.linkText("Top Deals");
    private final By INCREMENT_BUTTON=By.linkText("+");
    private final By ADD_TO_CART_BUTTON=By.xpath("//button[text()='ADD TO CART']");
    private final By CHECKOUT_ICON=By.xpath("//img[@alt='Cart']");

    public GreenkartPage(WebDriver driver) {
        super(driver);
    }

    public String newXpath()
    {
        String newPath=String.format("//div[@class='cart-preview active']/div/div/ul/li/div/p[text()='%s']",getTextofSearchedItem());
        return getTextbyXpath(By.xpath(newPath));
    }

    public void openingURL(String url)
    {
        goToURL(url);
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

    public void clickingonIncrementButton()
    {
        cliclOnElement(INCREMENT_BUTTON);
        cliclOnElement(INCREMENT_BUTTON);
        cliclOnElement(INCREMENT_BUTTON);
    }

    public void clickOnAddtoCart()
    {
        cliclOnElement(ADD_TO_CART_BUTTON);
    }

    public void clickOnCheckoutImage()
    {
        cliclOnElement(CHECKOUT_ICON);
    }




}

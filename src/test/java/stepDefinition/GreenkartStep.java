package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.GreenkartPage;
import utils.InjectionSetup;

import java.io.IOException;

public class GreenkartStep {


    InjectionSetup injectionSetup;

    public GreenkartStep(InjectionSetup injectionSetup)
    {
        this.injectionSetup=injectionSetup;
        System.out.println("GreenkartStep constructor invocation");
    }

    @Given("user is on Greencart page")
    public void user_is_on_greencart_page() throws IOException {
        injectionSetup.pageObjectsManager.getObjectOfGreenKartPage().openingURL(injectionSetup.propertyFiles.propertyName("url"));
    }


    @When("user search with short name {string} in home page")
    public void user_search_with_short_name_in_home_page(String string) throws InterruptedException {
        GreenkartPage greenkartPage=injectionSetup.pageObjectsManager.getObjectOfGreenKartPage();
        greenkartPage.sendingTextonSearchField(string);
        Thread.sleep(2000);
        injectionSetup.greenCartSearchItem=greenkartPage.getTextofSearchedItem();
        greenkartPage.clickOnTopDeals();

    }

    @Given("user is on GreenKart website")
    public void user_is_on_green_kart_website() throws IOException {
        injectionSetup.pageObjectsManager.getObjectOfGreenKartPage().openingURL(injectionSetup.propertyFiles.propertyName("url"));
    }
    @When("user searches for {string} in search field")
    public void user_searches_for_in_search_field(String search) throws InterruptedException {
        injectionSetup.pageObjectsManager.getObjectOfGreenKartPage().sendingTextonSearchField(search);
        Thread.sleep(3000);

    }
    @When("user adds three item of searched item")
    public void user_adds_three_item_of_searched_item() {
        injectionSetup.pageObjectsManager.getObjectOfGreenKartPage().clickingonIncrementButton();
    }
    @When("user clicks on add to cart")
    public void user_clicks_on_add_to_cart() {
        injectionSetup.pageObjectsManager.getObjectOfGreenKartPage().clickOnAddtoCart();
        injectionSetup.greencartSearchedItem=injectionSetup.pageObjectsManager.getObjectOfGreenKartPage().getTextofSearchedItem();
        injectionSetup.pageObjectsManager.getObjectOfGreenKartPage().clickOnCheckoutImage();

    }
    @Then("user should see searched in checkout feature")
    public void user_should_see_searched_in_checkout_feature() {
        Assert.assertEquals(injectionSetup.pageObjectsManager.getObjectOfGreenKartPage().newXpath(),injectionSetup.greencartSearchedItem);
        System.out.println(injectionSetup.pageObjectsManager.getObjectOfGreenKartPage().newXpath());


    }
}

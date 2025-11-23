package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
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
}

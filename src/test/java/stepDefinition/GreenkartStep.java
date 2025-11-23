package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.GreenkartPage;
import utils.InjectionSetup;

import java.util.Iterator;
import java.util.Set;

public class GreenkartStep {


    InjectionSetup injectionSetup;

    public GreenkartStep(InjectionSetup injectionSetup)
    {
        this.injectionSetup=injectionSetup;
        System.out.println("GreenkartStep constructor invocation");
    }

    @Given("user is on Greencart page")
    public void user_is_on_greencart_page() {



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

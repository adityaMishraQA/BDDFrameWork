package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.DealsPage;
import utils.InjectionSetup;

import java.util.Iterator;
import java.util.Set;

public class DealsStep {

    InjectionSetup injectionSetup;
    public DealsStep(InjectionSetup injectionSetup)
    {
        this.injectionSetup=injectionSetup;
        System.out.println("DealsStep constructor invocation");

    }

    @Then("user should search same {string} in deals page")
    public void user_should_get_same_result_with_same_short_name_in_deals_page(String search) {
        DealsPage dealsPage=injectionSetup.pageObjectsManager.getDealsPageObject();
        dealsPage.switchToChildTab();
        dealsPage.searchingInDealsPage(search);
        String dealsPageSearch=dealsPage.searchItemTextDealsPage();
        Assert.assertEquals(injectionSetup.greenCartSearchItem,dealsPageSearch);
        injectionSetup.driver.close();

    }
}

package stepDefinition;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DealsPage;
import utils.InjectionSetup;

public class DealsStep {

    InjectionSetup injectionSetup;
    public DealsStep(InjectionSetup injectionSetup)
    {
        this.injectionSetup=injectionSetup;
        System.out.println("DealsStep constructor invocation");

    }

    @Then("user should search same {string} in deals page")
    public void user_should_get_same_result_with_same_short_name_in_deals_page(String search) throws InterruptedException {
        DealsPage dealsPage=injectionSetup.pageObjectsManager.getDealsPageObject();
        dealsPage.switchToChildTab();
        Thread.sleep(2000);
        dealsPage.searchingInDealsPage(search);
        String dealsPageSearch=dealsPage.searchItemTextDealsPage();
        Assert.assertEquals(injectionSetup.greenCartSearchItem,dealsPageSearch);

    }
}

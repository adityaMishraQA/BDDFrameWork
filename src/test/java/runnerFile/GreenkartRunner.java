package runnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/FeatureFiles", glue = "stepDefinition",monochrome = true)
public class GreenkartRunner extends AbstractTestNGCucumberTests {
}

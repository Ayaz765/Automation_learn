package FeaturesFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="FeaturesFile",glue="Steps", monochrome=true, plugin="html:target/cucumber.html")

public class Testrunner extends AbstractTestNGCucumberTests {

}

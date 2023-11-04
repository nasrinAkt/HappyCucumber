package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/happyFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition")//tags={""})


public class runner extends  AbstractTestNGCucumberTests{

}

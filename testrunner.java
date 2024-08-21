//Name: Juhi Chaudhary
//Date: 12/08/2024

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="features",glue= {"stepdefinition"}, 
plugin= {"pretty","html:target/cucumber-reports/report.html"},
monochrome=true)
public class testrunner extends AbstractTestNGCucumberTests {

}

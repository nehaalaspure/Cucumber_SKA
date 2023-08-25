package CucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


  //   1.To verify that www.sharekhan.com is launched in browser as below


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/",
                 glue="StepDefinitions",
                 plugin={"pretty",
 						"html:target/cucumber","json:target/cucumber.json",
 						"junit:target/cukes.xml"},
 				dryRun=false,
 				monochrome=true,
 				strict=true
		        )
public class TestRunner extends AbstractTestNGCucumberTests{

}

	
	
	
	
	
	

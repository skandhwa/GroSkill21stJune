package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/java/resources/LoginScenario.feature",
		
		glue= {"StepDefinition"},
		dryRun=false,
		monochrome=false,
		
		plugin= {"pretty","html:target/HtmlReport/index.html",
				"json:target/Cucumberreports/cucumber.json",
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		
		
		
		)



public class TestRunner {
	
	
	

}

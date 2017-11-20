package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/cucumber-html-report",
		                   "json:target/cucmber.json",
		                   "pretty:target/cucumber-pretty.txt",
		                   "junit:target/cucumber-results.xml"
},
						features = "src/test/java/features",glue = "stepdef",
						monochrome=true,dryRun = false,tags = {"@cb"}
			
		)
public class Runner {

}

package XrayCucumber.runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

/*
 * features = links with the location of the feature file to run
 * glue = Links to the Java "step" files which do the work
 * monochrome = true makes the output in console more readable
 * plugin = "pretty" is a format, the type of reports to be generated : specified folder
 */

@CucumberOptions(
		features = {"src/test/java/XrayCucumber/featureFiles/"},
		glue = {"XrayCucumber.stepsFile"},
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber", 
				"json:target/cucumber.json", 
				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
)


public class Runner {

}

package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/feature",
		glue ={"stepdefinations","hooks", "Base"},
		plugin= {"pretty","html:target/cucumbereport.html","json:target/cucumbereport.json","junit:target/cucumbereport.xml"}
		
		)


public class Test_Runner {

}

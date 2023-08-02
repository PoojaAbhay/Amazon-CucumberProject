package hooks;

import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Base {
	WebDriver driver;
	@Before
	public void setup(Scenario Scenario) {
		 driver =initializeBrowserAndOpenApplicationURL("Chrome");
		System.out.println(Scenario.getName());
		
	}
	
	@After
	public void tearDown(Scenario Scenario) {
		driver.quit();
		System.out.println(Scenario.getName());
		
	}
}

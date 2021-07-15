package zoho.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features="src/test/resources/zoho",
		//	features="rerun:rerun/failed_scenarios.txt",
		    glue = {"zoho.teststeps"},
		    plugin= {"html:target/cucumber-reports.html","rerun:rerun/failed_scenarios.txt"},
			tags= "@CreateLead",
			monochrome=false,
			dryRun=false
		  
)

	
	public class MyRunner extends AbstractTestNGCucumberTests{
		
	
	
	
}

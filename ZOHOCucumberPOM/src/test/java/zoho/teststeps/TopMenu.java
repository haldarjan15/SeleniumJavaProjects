package zoho.teststeps;

import io.cucumber.java.en.When;

public class TopMenu {

	 @When("I click on {string} on top menu")
	 public void loadPage(String menuOption) {
		 System.out.println("I click on" +menuOption+ "on top menu");
	 }
	
}

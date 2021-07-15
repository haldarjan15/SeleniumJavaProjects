package zoho.teststeps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Leads {

	
	
	@When ("I go to {string} page")
	public void verifyLeadPage(String pageName) {
		System.out.println("I go to"+ pageName + " Page");
	}
	
	@And("enter and submit lead details")
	public void submitDetails() {
		System.out.println("enter and submit lead details");
	}
	
	
	@And ("I verfiy the lead details")
	public void verfyLeadDetails() {
		
		System.out.println("I verfiy the lead details");
		
	}
	
	
	 @Then("lead should be present inside the grid")
	 public void verifyLeadCreation() {
		 System.out.println("lead should be present inside the grid");
	 }
}

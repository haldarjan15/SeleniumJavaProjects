package zoho.teststeps;

import io.cucumber.java.en.Given;

public class Session {

	
	
	@Given ("I am logged in zoho.com")
	public void zohoLogin() {
		System.out.println("I am logged in zoho.com");
	}
	
	
}

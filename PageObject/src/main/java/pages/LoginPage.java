package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//login_id
	//nextbtn
	
	WebDriver driver;
	
	/*
	 * @FindBy(id = "login_id") WebElement userName;
	 * 
	 * @FindBy(id="nextbtn") WebElement NextBtn;
	 */
	
	public LoginPage(WebDriver driver) {
		System.out.println("Login Page Constructor ");
		this.driver=driver;
	}
	
	public LandingPage doLogin(String username,String password) {
		driver.findElement(By.id("login_id")).sendKeys(username);
		driver.findElement(By.id("nextbtn")).click();
		return new LandingPage();
		
		
		
		
	}

}

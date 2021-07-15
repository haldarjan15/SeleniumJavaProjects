package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	//@FindBy(linkText="Sign in")
	//WebElement signInLink;
	
	public HomePage(WebDriver driver) {
		System.out.println("Home Page Constructor ");
		this.driver=driver;
	}
	
	
	
	public LoginPage goToLoginPage() throws InterruptedException {
		driver.get("http://Zoho.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in")).click();
		
		//LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		
		return new LoginPage(driver);
		
	}

}

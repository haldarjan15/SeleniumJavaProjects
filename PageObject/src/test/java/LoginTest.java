import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

public class LoginTest {

	
	
	
	
	
	  @Test public void dologin() throws InterruptedException 
	  { 
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriver driver = new  ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	  HomePage homePage= new HomePage(driver); 
	  LoginPage loginPage=homePage.goToLoginPage();
	  
	  LandingPage landingpage=
	  loginPage.doLogin("haldarjan15@gmail.com", "Neeloy@1234");
	  
	  }
	 

	
	/*
	 * @Test public void dologinPF() throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver",
	 * "D:\\Drivers\\chromedriver_win32\\chromedriver.exe"); WebDriver driver = new
	 * ChromeDriver();
	 * 
	 * 
	 * HomePage homePage= PageFactory.initElements(driver, HomePage.class);
	 * LoginPage loginPage=homePage.goToLoginPage(); LandingPage landingpage=
	 * loginPage.doLogin("haldarjan15@gmail.com", "Neeloy@1234");
	 * 
	 * }
	 */
}

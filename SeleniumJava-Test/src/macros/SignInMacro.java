package macros;

import org.openqa.selenium.WebDriver;

import objectrepository.HomePage;

public class SignInMacro {
	
	WebDriver driver;
	
	public SignInMacro(WebDriver driver) {
		this.driver= driver;
	}
	
	HomePage homepage = new HomePage(driver);
	
	public void signInTestTest()
	{
		homepage.SignInAvatar().click();
		homepage.EmailID().sendKeys("test");
		homepage.Password().sendKeys("test");
		
	}
}

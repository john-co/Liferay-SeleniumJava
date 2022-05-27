package Testcases;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectrepository.HomePage;

public class SignInTest2 {

	@Test
	public void SignIn() {
		//Invoking Browser
		
		// chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "/home/john-co/Liferay-archive/Selenium/Drivers/chromedriver");
		
		
		//Chrome - ChromeDriver -> Methods
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost:8080");
		
		
		HomePage homepage = new HomePage(driver);
		homepage.SignInAvatar().click();
		homepage.EmailID().clear();
		homepage.EmailID().sendKeys("test@liferay.com");
		homepage.Password().sendKeys("test");
		homepage.SignInSubmitButton().click();
		homepage.EditPageIcon().click();
		homepage.SideBarFragmentsAndWdigets().isDisplayed();

		driver.quit();
		
		
		
		
		
		
		
	}

}

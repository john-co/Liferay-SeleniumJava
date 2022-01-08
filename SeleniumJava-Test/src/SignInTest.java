import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInTest {

	public static void main(String[] args) {
		
		//Invoking Browser
		
		// chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "/home/john-co/Liferay-archive/Selenium/Drivers/chromedriver");
		
		//Chrome - ChromeDriver -> Methods
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost:8080");
		driver.findElement(By.xpath("//a[contains(@class,'sign-in')]")).click();
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_login")).sendKeys("test");
		driver.findElement(By.id("_com_liferay_login_web_portlet_LoginPortlet_password")).sendKeys("test");
		driver.findElement(By.xpath("//button/span[text()='Sign In']")).click();
		driver.findElement(By.xpath("//*[@data-qa-id='controlMenu']//span[@title='Edit']")).click();
		driver.findElement(By.xpath("//*[@class='page-editor__sidebar__content page-editor__sidebar__content--open']//h1[text()='Fragments and Widgets']")).isDisplayed();

		driver.quit();
	}

}

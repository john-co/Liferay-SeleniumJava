import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.internal.util.Assert;

public class LiferayFormTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking Browser
		
		// chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "/home/john-co/Liferay-archive/Selenium/Drivers/chromedriver");
		
		//Chrome - ChromeDriver -> Methods
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://forms.liferay.com/web/forms/shared/-/form/122548");
		

		driver.findElement(By.xpath("//*[text()=\"Let's party rock.\"]")).isDisplayed();

		driver.findElement(By.xpath("//button[text()='Submit']")).isDisplayed();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.xpath("//*[@class='form-feedback-item' and text()='This field is required.']")).isDisplayed();
		driver.findElement(By.xpath("//div[@data-field-name='WhatIsYourName']//input[contains(@class,'form-control')]")).sendKeys("Test Test");
		driver.findElement(By.xpath("//div[@data-field-name='WhyDidYouJoinTheTestingArea']//textarea")).sendKeys("To Test stuff.");
		driver.findElement(By.xpath("//div[@data-field-name='WhatIsTheDateOfYourBirth']//input[contains(@class,'form-control')]")).click();
		driver.findElement(By.xpath("//div[@data-field-name='WhatIsTheDateOfYourBirth']//input[contains(@class,'form-control')]")).sendKeys("0303112021");

		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'alert-success')][contains(@class,'alert-dismissible')]")).isDisplayed();

		driver.quit();
	}

}

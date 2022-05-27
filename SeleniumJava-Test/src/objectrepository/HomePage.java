package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	

	By signInAvatar=By.xpath("//a[contains(@class,'sign-in')]");
	By loginField=By.id("_com_liferay_login_web_portlet_LoginPortlet_login");
	By passwordField=By.id("_com_liferay_login_web_portlet_LoginPortlet_password");
	By signInSubmit=By.xpath("//button/span[text()='Sign In']");

	By editPageIcon=By.xpath("//*[@data-qa-id='controlMenu']//span[@title='Edit']");
	By sideBarFragmentsAndWidgets=By.xpath("//*[@class='page-editor__sidebar__content page-editor__sidebar__content--open']//h1[text()='Fragments and Widgets']");
	
	
	public WebElement SignInAvatar()
	{
		return driver.findElement(signInAvatar);
		
	}	

	public WebElement EmailID()
	{
		return driver.findElement(loginField);
		
	}
	
	public WebElement Password()
	{
		return driver.findElement(passwordField);
		
	}

	public WebElement SignInSubmitButton()
	{
		return driver.findElement(signInSubmit);
		
	}

	public WebElement EditPageIcon()
	{
		return driver.findElement(editPageIcon);
		
	}

	public WebElement SideBarFragmentsAndWdigets()
	{
		return driver.findElement(sideBarFragmentsAndWidgets);
		
	}


}

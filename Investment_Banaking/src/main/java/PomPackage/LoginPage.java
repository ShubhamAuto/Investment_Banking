package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy (xpath = "//input[@placeholder='User ID (eg: AB0001)']")
	private WebElement userid;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement userpassword;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement login;
	
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserid()
	{
		userid.sendKeys("YMD450");
	}
	
	public void enterPassword()
	{
		userpassword.sendKeys("Zxc@9876");
	}
	
	public void clickOnLogin()
	{
		login.click();
	}

	

	
}

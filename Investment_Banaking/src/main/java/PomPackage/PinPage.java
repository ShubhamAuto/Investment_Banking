package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	
	WebDriver driver;
	
	@FindBy (xpath ="//input[@placeholder=\"PIN\"]")
	private WebElement pin;
	
	@FindBy (xpath ="//button[@type='submit']")
	private WebElement continuelogin;
	
	
	public PinPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin()
	{
		pin.sendKeys("325476");
	}
	
	public void clickOnContineu()
	{
		continuelogin.click();
	}

}

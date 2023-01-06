package ai.DS.apps.Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.DS.apps.Testbase.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//object repository--- declaration and initialization
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;
	
	
	// Action method--- usage
	public void EnterEmailId( String EmailID) {
		email_txtbox.sendKeys(EmailID);
	}
	public void EnterPassword(String Password) {
		 password_txtbox.sendKeys(Password);
	}
	public void ClickOnLogin_btn() {
		login_btn.click();
	}
	
	public String getCUrl() {
        String url = driver.getCurrentUrl();               //Enter Password
	      return url;
	}
	}

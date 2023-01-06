package ai.DS.apps.Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.DS.apps.Testbase.TestBase;

public class DashboardPage extends TestBase {
	
	public DashboardPage () {
		
		PageFactory.initElements(driver, this);
	}
	// object repository
	@FindBy(xpath="//input[@class='form-control'][1]")
	private WebElement search_box;
	
	@FindBy(xpath="(//div[@class='m-4 card'])[2]")
	private WebElement option;
	
	// usage / actions
	public void enterCompanyname(String Company_name) {
		
		search_box.sendKeys(Company_name);
	}
	public void clickOnOption() {
		
		option.click();
	}
}

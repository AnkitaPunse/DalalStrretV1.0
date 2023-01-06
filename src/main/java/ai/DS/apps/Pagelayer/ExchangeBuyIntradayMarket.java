package ai.DS.apps.Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.DS.apps.Testbase.TestBase;

public class ExchangeBuyIntradayMarket extends TestBase{
	
	public ExchangeBuyIntradayMarket() {
		
       PageFactory.initElements(driver, this);
	}
	//    object repository
	@FindBy(xpath="//a[@class='active nav-link']")
	private WebElement buy_btn1;
	
	@FindBy(xpath="(//label[@class='btn btn-outline-secondary'])[2]")
	private WebElement intraday;
	
	@FindBy(xpath="(//label[@class='btn btn-outline-secondary'])[3]")
	private WebElement market;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement Qty;
	
	@FindBy(xpath="//button[contains(text(), 'Buy')]")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//button[contains(text(), 'Buy')]")
	private WebElement Status;
	
	
	//actions 
	public void clickOnbuy_btn1() {
		buy_btn1.click();
	}
	public void clickOnintraday() {
		intraday.click();
	}
	public void clickOnmarket() {
		market.click();
	}
	public void enterQty() {
		Qty.click();
		Qty.sendKeys("2");
	}
	public void clickOnbuy_btn2() {
		buy_btn2.click();
	}

}

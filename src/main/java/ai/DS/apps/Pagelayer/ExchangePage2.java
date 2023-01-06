package ai.DS.apps.Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.DS.apps.Testbase.TestBase;

public class ExchangePage2 extends TestBase{
	//sell intraday market
	public  ExchangePage2() {
		
		PageFactory.initElements(driver, this);
	}
	// object repository
	@FindBy(xpath="//a[@class='nav-link']")
	private WebElement Sell_btn1;
	@FindBy(xpath="//label[@for='btnradio6']")
	private WebElement Intraday;
	@FindBy(xpath="//label[@for='btnradio7']")
	private WebElement Market;
	@FindBy(xpath="//input[@id='quantity']")
	private WebElement Qty;
/*	@FindBy(xpath="//input[@class='form-control form-control']")
	private WebElement Sell_price;*/
	@FindBy(xpath="//button[@class='w-md btn btn-danger']")
	private WebElement Sell_btn2;
	@FindBy(xpath="")
	private WebElement Success_msg;
	
   // actions performed
	public void clickOnSell_btn1() {
		 Sell_btn1.click();
	}
	public void clickOnIntraday() {
		Intraday.click();
	}
	public void clickOnMarket() {
		Market.click();
	}
	public void enterQty() {
		Qty.click();
		Qty.sendKeys("3");
    }
/*	public void enterSell_price() {
		Sell_price.click();
		Sell_price.sendKeys("500");
	}*/
	public void clickOnSell_btn2() {
		 Sell_btn2.click();
	}
	
	
	
	
	
	
	
	
	
}

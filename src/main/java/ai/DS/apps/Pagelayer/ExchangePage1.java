package ai.DS.apps.Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.DS.apps.Testbase.TestBase;

public class ExchangePage1 extends TestBase{
	//Longterm and custom limit
	public ExchangePage1() {
		
		PageFactory.initElements(driver, this);
	}
	// object repository
	@FindBy(xpath="//a[@class='active nav-link']")
	private WebElement Buy_btn1;
	
	@FindBy(xpath="//label[@class='btn btn-outline-secondary']")
	private WebElement Longterm;
	
	@FindBy(xpath="//label[@for='btnradio4']")
	private WebElement Custom_limit;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement Qty;
	
	@FindBy(xpath="//body/div[@id='root']/div[@id='layout-wrapper']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/input[1]\r\n")
	private WebElement price;
	
	@FindBy(xpath="//button[@class='w-md btn btn-success']")
	private WebElement Buy_btn2;
	
	// action or click
	public void clickOnBuy_btn1() {
		 Buy_btn1.click();
	}
	public void clickOnLongterm() {
		Longterm.click();
	}
	public void clickOnCustom_limit() {
		Custom_limit.click();
	}
	public void enterQty() {
		Qty.click();
		Qty.sendKeys("3");
	}
	public void enterprice() {
		price.click();
		price.sendKeys("80");
	}
	public void clickOnBuy_btn2() {
		 Buy_btn2.click();
	}
	
	
	

}

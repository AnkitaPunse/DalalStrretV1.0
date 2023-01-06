package ai.DS.apps.Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.DS.apps.Testbase.TestBase;

public class ExchangePage extends TestBase{
	// Long-term and market value
	
    public ExchangePage() {
    	
    PageFactory.initElements(driver, this);	
    }
    //   object repository
    @FindBy(xpath="//a[contains(text(),'Buy')]")
    private WebElement Buy_btn1;
   
    @FindBy(xpath="//label[@for='btnradio1']")
    private WebElement Longterm;
    
    @FindBy(xpath="//label[@for='btnradio3']")
    private WebElement Market;
    
    @FindBy(xpath="//input[@name='input-Qunatity']")
    private WebElement Qty;
    
    @FindBy(xpath="//button[@class='w-md btn btn-success']")
    private WebElement Buy_btn2;
    
   //usage/ action performed
    public void clickOnBuy_btn1() {
    	Buy_btn1.click();
    }
    public void clickOnLongterm() {
    	Longterm.click();
    }
    public void clickOnMarket() {
    	Market.click();
    }
    public void enterQty() {
        Qty.sendKeys("2");
    	
    }
    public void clickOnBuy_btn2() {
    	Buy_btn2.click();
    }
    
       
}

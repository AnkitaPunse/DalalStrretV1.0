package ai.DS.apps.Testlayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ai.DS.apps.Pagelayer.DashboardPage;
import ai.DS.apps.Pagelayer.ExchangeBuyIntradayMarket;
import ai.DS.apps.Testbase.TestBase;

public class BuyatIntradayMarket extends TestBase {
	 
	@Test
	public void VerifyBuyatIntradayMarket() throws InterruptedException {
		
		Thread.sleep(4000);
		DashboardPage dash = new  DashboardPage();
		dash.enterCompanyname("Reliance"); 
		dash.clickOnOption();
		
		logger.info("Searched and select trade");
		
		Thread.sleep(5000);
		ExchangeBuyIntradayMarket buy1=new ExchangeBuyIntradayMarket();
		 buy1.clickOnbuy_btn1();
		 buy1.clickOnintraday();
		 buy1.clickOnmarket();
		 buy1.enterQty();
		 
	//	 JavascriptExecutor js= ( JavascriptExecutor)driver;
	//	 js.executeScript("scrollBy(0,150)");
		 buy1.clickOnbuy_btn2();
		
		logger.info("Buy share at Intraday market");
//		String expected_result="";
		
		
		
		
	}

}

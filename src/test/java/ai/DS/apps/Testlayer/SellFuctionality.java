package ai.DS.apps.Testlayer;

import org.testng.annotations.Test;

import ai.DS.apps.Pagelayer.DashboardPage;
import ai.DS.apps.Pagelayer.ExchangePage2;
import ai.DS.apps.Pagelayer.LoginPage;
import ai.DS.apps.Testbase.TestBase;

public class SellFuctionality extends TestBase{
    @Test
	public void verifySellatIntraday() throws InterruptedException {
	/*	LoginPage l = new LoginPage();
		l.EnterEmailId("ankitapunse96@gmail.com");
		l.EnterPassword("Ankita@1996");
		l.ClickOnLogin_btn();   */
	
		Thread.sleep(5000);
		DashboardPage dash = new  DashboardPage();	
		dash.enterCompanyname("Reliance"); 
		dash.clickOnOption();
		
		logger.info("Searched and select trade");
		
		Thread.sleep(5000);
		ExchangePage2 sell=new ExchangePage2();
		sell.clickOnSell_btn1();
		sell.clickOnIntraday();
		sell.clickOnMarket();
		sell.enterQty();
	//	sell.enterSell_price();
		sell.clickOnSell_btn2();

		logger.info("Sell share at Intraday market");
		
	}
}

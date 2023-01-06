package ai.DS.apps.Testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.DS.apps.Pagelayer.ExchangePage;
import ai.DS.apps.Pagelayer.DashboardPage;
import ai.DS.apps.Testbase.TestBase;

public class BuyFuctionalityScenario extends TestBase{
	@Test
	
	public void verifyBuyFuctionality() throws InterruptedException {
	
	/*	l = new LoginPage();
		l.EnterEmailId("ankitapunse96@gmail.com");
		l.EnterPassword("Ankita@1996");
		l.ClickOnLogin_btn();  */
		
		Thread.sleep(5000);
		DashboardPage dash = new  DashboardPage();
		dash.enterCompanyname("Reliance"); 
		dash.clickOnOption();
		
		logger.info("Searched and select trade");
		
		Thread.sleep(5000);
		ExchangePage buy= new ExchangePage();
		buy.clickOnBuy_btn1();
		buy.clickOnLongterm();
		buy.clickOnMarket();
		buy.enterQty();
		buy.clickOnBuy_btn2();
	
		logger.info("Buy share at Longterm market");
		
		System.out.println(driver.getTitle());
		String expected_result="Exchange | Papertrader by Dalalstreet.ai";
		String actual_result=driver.getTitle();
		
		Assert.assertEquals( actual_result,expected_result);
	}

}

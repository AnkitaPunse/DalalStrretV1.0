package ai.DS.apps.Testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.DS.apps.Pagelayer.DashboardPage;
import ai.DS.apps.Pagelayer.ExchangePage1;
import ai.DS.apps.Pagelayer.LoginPage;
import ai.DS.apps.Testbase.TestBase;

public class BuyatLongtermCustom extends TestBase {
	@Test
	public void verifyBuy2() throws InterruptedException {
		
	/*	LoginPage l = new LoginPage();
		l.EnterEmailId("ankitapunse96@gmail.com");
		l.EnterPassword("Ankita@1996");
		l.ClickOnLogin_btn(); */
	
		Thread.sleep(5000);
		DashboardPage dash = new  DashboardPage();	
		dash.enterCompanyname("Reliance"); 
		dash.clickOnOption();
		
		logger.info("Searched and select trade");
		
		Thread.sleep(5000);
		ExchangePage1 buy= new ExchangePage1();
		buy.clickOnBuy_btn1();
		buy.clickOnLongterm();
		buy.clickOnCustom_limit();
		buy.enterQty();
		buy.enterprice();
		buy.clickOnBuy_btn2();
		
		logger.info("Buy share Longterm custom limit");
		
		System.out.println(driver.getCurrentUrl());
		String Expected_result="https://apps.dalalstreet.ai/exchange/nse/RELIANCE.NS";
		String Actual_result=driver.getCurrentUrl();
		
		Assert.assertEquals(Actual_result, Expected_result);
	}

}

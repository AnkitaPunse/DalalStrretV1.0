package ai.DS.apps.Testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.DS.apps.Pagelayer.LoginPage;
import ai.DS.apps.Testbase.TestBase;

public class LoginpageTest extends TestBase{
	@Test
	public void VerifyLogin() throws InterruptedException {
		
		String expected_result="https://apps.dalalstreet.ai/dashboard";
	/*	LoginPage l = new LoginPage();
		l.EnterEmailId("ankitapunse96@gmail.com");
		l.EnterPassword("Ankita@1996");
		l.ClickOnLogin_btn();  */
		
		Thread.sleep(5000);
	
		Assert.assertEquals(l.getCUrl(), expected_result);
		
	}
	
	

}

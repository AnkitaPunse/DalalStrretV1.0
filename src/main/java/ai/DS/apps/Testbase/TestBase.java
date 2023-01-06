package ai.DS.apps.Testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import ai.DS.apps.Pagelayer.DashboardPage;
import ai.DS.apps.Pagelayer.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public LoginPage l;
	public DashboardPage dash;
	public static Logger logger;
	
	@BeforeClass
	public void Start() {
	    logger= Logger.getLogger("Dalal Street Automation freamework");
		PropertyConfigurator.configure("Log4jcode.properties");
		
		logger.info("Framework execution started");
	}
	
	@AfterClass
	public void End() {
		logger.info("Framework execution stopped");
	}
	
	@Parameters("browser")
	@BeforeMethod
	public void SetUpBrowser(String brw) throws InterruptedException {
   //String brw= "chrome";  //  here brw= browser
		
		if(brw.equalsIgnoreCase("chrome")){
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(brw.equalsIgnoreCase("edge")) {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		else if (brw.equalsIgnoreCase("firefox")){
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else {
			System.out.println(" Please provide correct browser name ");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://apps.dalalstreet.ai/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		logger.info("browser launch, url hit, window maximize");
		
		// object creation for our repeated code
		l = new LoginPage();
		
		logger.info(" login object creation");
		
		l.EnterEmailId("ankitapunse96@gmail.com");
		l.EnterPassword("Ankita@1996");
		l.ClickOnLogin_btn();  
		
		logger.info(" logged In");	
	}
	
   @AfterMethod
   public void CloseBrowser() {
	// driver.quit();  
	   logger.info("browser closed");
   }
}

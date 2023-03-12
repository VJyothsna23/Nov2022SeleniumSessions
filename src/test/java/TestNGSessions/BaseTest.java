package TestNGSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class BaseTest { 
	
    WebDriver driver;
	
    @Parameters({"url", "browser"}) // Here we write the name of the parameter we are passing from testng.xml file. 
	@BeforeTest 
	public void setUp(String url, String browser) { //The same parameter(url) value from testng.xml file will be given to this setUp method.
		
    	System.out.println("Runnint test on :" +browser);
    	
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please enter a valid browser");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterTest 
	public void tearDown() {	
		driver.quit();
	}


}

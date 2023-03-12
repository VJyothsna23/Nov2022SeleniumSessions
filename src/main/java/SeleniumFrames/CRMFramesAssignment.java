package SeleniumFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMFramesAssignment {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		clickMenuFrameElement("DEALS");
		Thread.sleep(2000);
		
		clickMenuFrameElement("TASKS");
		Thread.sleep(2000);
		
		clickMenuFrameElement("CASES");
		Thread.sleep(2000);
		
		clickMenuFrameElement("CALL");
		Thread.sleep(2000);
	}
	
	public static void clickMenuFrameElement(String tabName) {
					
		driver.findElement(By.linkText(tabName.toUpperCase())).click();
	}

}

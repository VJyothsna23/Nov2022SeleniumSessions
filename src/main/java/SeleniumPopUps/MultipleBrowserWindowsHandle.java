package SeleniumPopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserWindowsHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement linkedinEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement facebookEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twitterEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement youtubeEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		linkedinEle.click();
		facebookEle.click();
		twitterEle.click();
		youtubeEle.click();		
		
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentWindowId = it.next();
		System.out.println("Parent window url is: "+ driver.getCurrentUrl());
		
		while(it.hasNext()) {// .hasNext() method returns a boolean. This is to check if there is another child window available or not.
			
			String WindowId = it.next();						
			driver.switchTo().window(WindowId);
			System.out.println("The window url is: "+ driver.getCurrentUrl());
			Thread.sleep(3000);			
			driver.close();	
		}
		
		driver.switchTo().window(parentWindowId);
		
// This is the same exact way we handle advertisement popUps too. They are link browser window popUps.	
	}

}

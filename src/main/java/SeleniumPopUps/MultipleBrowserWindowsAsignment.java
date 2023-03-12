package SeleniumPopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserWindowsAsignment {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement linkedinEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement facebookEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twitterEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement youtubeEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		multiBrowserHandle(linkedinEle);
		multiBrowserHandle(facebookEle);
		multiBrowserHandle(twitterEle);
		multiBrowserHandle(youtubeEle);
		
		System.out.println("The parent window url is: "+ driver.getCurrentUrl());
		driver.close();
	}
	
	public static void multiBrowserHandle(WebElement ele) throws InterruptedException {
		ele.click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		System.out.println("The child window url is: "+ driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindowId);
	}	

}

package SeleniumActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultilevelMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement shopParentEle= driver.findElement(By.cssSelector("a.meganav-shop"));		
		
		Actions act = new Actions(driver);
		act.moveToElement(shopParentEle).build().perform();
		Thread.sleep(2000);
			
		WebElement shopL2Ele = driver.findElement(By.linkText("Beverages"));
		act.moveToElement(shopL2Ele).build().perform();
		Thread.sleep(2000);
		
		WebElement shopL3Ele = driver.findElement(By.linkText("Tea"));
		act.moveToElement(shopL3Ele).build().perform();
		Thread.sleep(2000);
		
	    WebElement shopL4Ele = driver.findElement(By.linkText("Tea Bags"));
//		act.moveToElement(shopL4Ele).click().build().perform(); -We can click on this element either directly or by using actions class.
		shopL4Ele.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt = 'Taj Mahal Tea 1 Kg']")).click();
		
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//td[@data-qa='productPrice']")).getText();
		System.out.println(" The product price is: " + text);
	}

}

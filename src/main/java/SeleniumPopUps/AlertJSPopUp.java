package SeleniumPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//JS Alert pop-up:
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		// No Alert Present Exception: no such alert- will be thrown in case of no alert.
//		
//		String text = alert.getText();
//		System.out.println("Alert text says: "+ text);		
//  	alert.accept(); // Accept the alert means to click ok.
//		alert.dismiss(); // Dismiss the alert means to cancel it.( To do this manually, we press escape key).
		
		//JS confirmation pop-up:
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println("Alert text says: "+ text); 
//		alert.accept();// clicks on ok button
//		alert.dismiss();// clicks on cancel button
		
		//JS Prompt pop-up:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert text says: "+ text); 
		
		alert.sendKeys("123456");
		alert.accept();// clicks on ok button
//		alert.dismiss();// clicks on cancel button
		
	}

}

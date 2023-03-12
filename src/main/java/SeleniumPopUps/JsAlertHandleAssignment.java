package SeleniumPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlertHandleAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		
		System.out.println("Alert text says: "+ text);
		if(text.contains("Please enter a valid user name")) System.out.println("Test1 PASS");
		else System.out.println("Test1 Fail");
		
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("login1")).sendKeys("Jyothsna");
		driver.findElement(By.name("proceed")).click();
		
		alert = driver.switchTo().alert();
		text = alert.getText();
		
		System.out.println("Alert text says: "+ text);
		if(text.contains("Please enter your password")) System.out.println("Test2 PASS");
		else System.out.println("Test2 Fail");

	}

}

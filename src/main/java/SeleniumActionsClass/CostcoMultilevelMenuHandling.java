package SeleniumActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CostcoMultilevelMenuHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.costco.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@style='display: none; visibility: hidden;'])[1]")));
		By shop = By.id("navigation-dropdown");
		WebElement shopEleL1 = driver.findElement(shop);
				
		Actions act = new Actions(driver);
		act.moveToElement(shopEleL1).build().perform();
				
		WebElement babyEleL2 = driver.findElement(By.xpath("//a[text()='Baby']/parent::li"));
		act.moveToElement(babyEleL2).build().perform();
		
		WebElement babyCareEleL3 = driver.findElement(By.xpath("//a[text()='Baby Care & Safety']/parent::li"));
		act.moveToElement(babyCareEleL3).build().perform();		
		
		WebElement babyMonitorsEleL4 = driver.findElement(By.xpath("//a[text()='Baby Monitors']/parent::li"));
		act.moveToElement(babyMonitorsEleL4).click().build().perform();
	}

}

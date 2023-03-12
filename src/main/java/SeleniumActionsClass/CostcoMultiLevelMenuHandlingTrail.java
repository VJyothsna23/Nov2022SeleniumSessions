package SeleniumActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CostcoMultiLevelMenuHandlingTrail {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.costco.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Actions actions = new Actions(driver);

		WebElement menu1=driver.findElement(By.cssSelector(".menu #navigation-dropdown"));

		actions.moveToElement(menu1).build().perform();

		WebElement menu2=driver.findElement(By.xpath("//div[@id='level1']//a[text()='Baby']/parent::li"));

		actions.moveToElement(menu2).build().perform();

		WebElement menu3=driver.findElement(By.xpath("//div[@id='level2']//a[text()='Baby Care & Safety']/parent::li"));

		actions.moveToElement(menu3).build().perform();

		WebElement menu4=driver.findElement(By.xpath("//div[@id='level3']//a[text()='Baby Monitors']/parent::li"));

		actions.click(menu4).build().perform();

	}

}

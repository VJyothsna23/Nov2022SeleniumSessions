package SeleniumWebTableHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {// This is an example of Dynamic Table
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-women-s-under-19-t20-world-cup-2022-23-1336137/india-women-under-19s-vs-england-women-under-19s-final-1336195/full-scorecard");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		String wicketTakerName = getWicketTakerName("Liberty Heap");
		System.out.println("Wicket taker name is: "+ wicketTakerName);
		
		getScoreCardList("Liberty Heap");
		List<String> HollandScoreList = getScoreCardList("Niamh Holland");
		System.out.println(HollandScoreList);

		
	}
	
	public static String getWicketTakerName(String batsmanName) {
		//return driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td/span/span")).getText();
		return driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td")).getText();
	}
	
	public static List<String> getScoreCardList(String batsmanName) {		
		 List<WebElement> scoreCardEleList = driver.findElements(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td"));
		 List<String> PlayerScoreList = new ArrayList<String>();
		 for(WebElement e: scoreCardEleList) {
			String text = e.getText();
			if (text.length() > 0) {
				PlayerScoreList.add(text);
				System.out.println(text);
			}
		 }
		 return PlayerScoreList;
	}
}
 
package SeleniumWebTableHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		System.out.println(getTableHeaders());
		int rowCount = getTableRowscount();
		System.out.println(("Total number of rows in the table are: "+ rowCount));
		
		List<String> rowvaluesList = getTableColumnValues(3);
		System.out.println(rowvaluesList);

	}
	
	public static List<String> getTableHeaders() {
		List<WebElement> headerEleList = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Table headers count/ Total number of columns are : "+headerEleList.size());
		List<String> headerTextList = new ArrayList<String>(); 
		for(WebElement e: headerEleList) {
			String text = e.getText();
			headerTextList.add(text);
		}
		return headerTextList;
	}
	
	public static int getTableRowscount() {
		return driver.findElements(By.xpath("//table[@id = 'customers']//tr")).size()-1;
	}
	
	// relative xpath:   //table[@id="customers"]/tbody/tr[2]/td[1] - Here we observe the pattern for each element in the column
	                     //table[@id="customers"]/tbody/tr[3]/td[1] - we see that just the row number changes.
	// Here using custom xpath may not work because we are collecting data from different row elements which have no connection in html dom.
	public static List<String> getTableColumnValues(int columnNumber) {
		List<String> rowValuesList = new ArrayList<String>();
		for(int row=2; row<=7; row++) {				
			String value = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+row+"]/td["+columnNumber+"]")).getText();
			rowValuesList.add(value);
			System.out.println(value);
		}
		return rowValuesList;
		
				
	}
	

}

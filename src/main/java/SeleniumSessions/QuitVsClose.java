package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		//SID: Session ID
		
		WebDriver driver = new ChromeDriver();//Session ID: ex: 123
		driver.get("https://www.google.com");//SID: 123
		
		String title = driver.getTitle();//SID: 123
		System.out.println(title);//SID: 123
		
		System.out.println(driver.getCurrentUrl());//SID: 123
		
	//	driver.quit();//SID: 123
		//- SID will be null
		
//		driver.getTitle(); - SID: null
		//"No such session" exception will be thrown. Session ID is "null" now because we are using webDriver after calling quit.
		
		driver.close();// SID: 123
		//SID : 123( will be the same even AFTER closing the browser but it will be - INVALID)
		
	//	driver.getTitle(); - SID: null
	//"No such session" exception will be thrown. Session ID is "INVALID" now because we are using webDriver after calling Close.
		
		
		// In both close and quit cases, we need to re-initialize the driver in order to use the WebDriver again.
		driver = new ChromeDriver(); // SID: new session ID : ex:456
		driver.get("https://www.google.com"); // SID:456
		driver.getTitle(); // SID:456

	}

}

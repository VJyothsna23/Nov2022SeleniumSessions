package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		//HeadLess Browser: That means running browser in the headless mode. 
		//Which means the browser will still be launched but it won't be visible.
		//Here testing happens behind the scene and is faster than the normal mode.
		//But, for the complex html dom, it may not work. That's why we don't use it in real time.
		
		
		ChromeOptions co = new ChromeOptions();// ChromeOptions class is responsible for running the browser in headless mode.
		co.setHeadless(true);// to run in headless mode
		//co.addArguments("--headless"); // to run in headless mode
		//co.addArguments("--incognito");// to run in Incognito mode.
		
		WebDriver driver = new ChromeDriver(co); 
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();


	}

}

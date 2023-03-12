package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		String browser = "firefox";
		
		BrowserUtility brUtil = new BrowserUtility();
				
		brUtil.initDriver(browser);
				
		brUtil.launchUrl("https://amazon.com");
		
		String title = brUtil.getPageTitle();
		if (title.contains("Amazon")) {
			System.out.println("Title test is PASS");
		}
		else {
			System.out.println("Title test is FAIL");
		}
		
		String url = brUtil.getPageUrl();
		if (url.contains("amazon")) {
			System.out.println("Url test is PASS");
		}
		else {
			System.out.println("Url test is FAIL");
		}
		
		brUtil.quitBrowser();

	}

}

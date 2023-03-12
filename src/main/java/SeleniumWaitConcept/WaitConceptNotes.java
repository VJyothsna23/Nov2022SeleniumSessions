package SeleniumWaitConcept;

import com.beust.ah.A;

public class WaitConceptNotes {

	public static void main(String[] args) {
		
//Types of wait: 
//	1.Static wait(Java Wait): Thread.sleep(5000) --> Pause for 5 secs. The static wait is not provided by Selenium. 
//  2.Dynamic wait: There are 2 types of Dynamic wait.
//	  2A. Implicitly wait(Acts like auto wait feature): Global wait on all the elements of the page. This wait doesn't work for 'driver.findElements'
//		      Ex: if we applied 10 secs wait, If element is found within 2 secs, then the remaining 8 secs will be ignored.
//	  2B. Explicitly wait: Applied on a specific element. There are 2 types of Explicit wait.
//			i)  WebDriverWait
//          ii) FluentWait 
		
// Wait Hierarchy in Selenium :  Wait(I): until()--> FluentWait(c)--->WebDriverWait(c)
		
//												
		
		

	}

}

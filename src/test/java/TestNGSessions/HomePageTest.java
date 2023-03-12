package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	//Here we are trying to automate the Home page. That means we are going to design some test cases for Home Page.
	// The naming convention is important for understanding and readability purposes. Always end your test classes and test method names with 'Test'. 
	// In TestNG we do not need main method to run the code( That's why we installed the plug-in so we can run the script).
	//  So no need to select main method while creating a new test class. 
	
	// To design Test cases:
	//	 We need to write some Global Pre-conditions, exact pre conditions of that particular test.
	//	 Start writing the Test cases where in:
	// 	  we write test steps along with the actual vs expected results( which are nothing but Assertions/Validation logic).
	//   We also write Post steps and post global steps if any.
	
	// So here is the summary of list of things that we want to include while designing test cases:
	// Global pre-conditions, pre-conditions, test cases (with test steps, assertions), post steps, Global post steps.
	// It is not mandatory to include all the pre-conditions and post steps. It is up to us on how we design the Test cases.
	
	// AAA rule while designing test cases: Arrange( the tests in order), Act( write test steps), Assert( validate the test with only one assertion per test case)
	
	
	// For writing anything in the above list, they have given some annotations to follow in TestNG.
	// Annotations is a special key word that start with '@'. These annotations should always be associated with methods.
	// Ex: In the below example of TestNG class, we have written total 3 test cases and for every test case, 
	//     we have to write '@Test' annotation and Test at the end of each method name.
	// When we write all these methods in TestNG class, it doesn't matter in which order we write them.
	// The sequence in which they get executed depends totally on the annotation we give to the method(See comments for the order of preference for each annotation). 
	//
	
	
// Pre-conditions(Steps)   ======================================================		
	
	@BeforeSuite // preference - 1.  Before Suite will be executed only once.
	public void startDBConnection() {
		System.out.println("BS - start DB Connection");
	}
	
	@BeforeTest // preference - 2.  Before Test will be executed only once.
	public void createUser() {
		System.out.println("BT - Create User");
	}
	
	@BeforeClass // preference - 3.  Before Class will be executed only once.
	public void launchBrowser() {
		System.out.println("BC - launch Browser");
	}
	
	@BeforeMethod // preference - 4, 7, 10. Before Method will be executed before each and every Test Method.
	public void loginToApp() {
		System.out.println("BM - login to App");
	}
	
// Test cases	====================================================
// Test cases will be executed on the basis of alphabetical order, Or you can decide the order by writing the 'priority' after @Test annotation.
//  Ex: @Test(Priority = 1), the value of the priority can be any integer including -ve numbers.
	
	@Test // preference 8 - Test cases will be executed on the basis of alphabetical order.
	public void homePageTitleTest() {
		System.out.println("home Page Title Test");
	}
	
	@Test // preference 11 - Test cases will be executed on the basis of alphabetical order.
	public void homePageUrlTest() {
		System.out.println("home Page url Test");
	}
	
	@Test // preference 5 - Test cases will be executed on the basis of alphabetical order.
	public void homePageSearchTest() {
		System.out.println("home Page search Test");
	}	
	
// post Steps   ======================================================	
	
	@AfterMethod  // preference - 6, 9, 12 . After Method will be executed after each and every Test Method.
	public void logout() {
		System.out.println("AM - logout");
	}
	
	@AfterClass // preference - 13.  After Class will be executed only once.
	public void closeBrowser() {
		System.out.println("AC - close Browser");
	}
	
	@AfterTest // preference - 14.  After Test will be executed only once.
	public void deleteUser() {
		System.out.println("AT - delete User");
	}
	
	@AfterSuite // preference - 15.  After Suite will be executed only once.
	public void diconnectWithDB() {
		System.out.println("AS - diconnect With DB");
	}
	
// Output when we run the above code to see the sequence of method execution:
//	BS - start DB Connection
//	BT - Create User
//	BC - launch Browser
	
//	BM - login to App
//	home Page search Test
//	AM - logout
	
//	BM - login to App
//	home Page Title Test
//	AM - logout
	
//	BM - login to App
//	home Page url Test
//	AM - logout
	
//	AC - close Browser
//	AT - delete User
//	AS - disconnect With DB
	

}

package TestNGSessions;

public class TestNGNotes {
	
//--------- TesNg    ---------------
// TesNg is a Unit Testing Framework for Java(only). It is not only for automation engineers, but also for the Devs.
// Developers can use TestBG for writing Unit Test cases(UTs)
	
//---------- Using test NG ------------
//	We can write and prioritize the Test cases for both positive and negative test cases.
//	We can create a dependency of the test cases
//	We can generate the html reports
//	We can generate listeners
//	We can achieve parallel test case execution
//	We can write validation logic using assertions 
//	We can implement Re-try logic
//	Using annotations featute of testNG, We can define pre conditions and post conditions 
//	We can achieve data driven testing with the help of data providers
	
// --------- How to Set-up and Install TestNG  -----------	
// Test NG is a 3rd party library. It doesn't come along with Selenium or Java.
// It is available in the form of .jar file.
// In order to use TestNG, we need to do 2 things. 
//    	1. Add a dependency in the pom.xml file - To use the methods, classes, annotations and other features of TestNG.
//	    2. We have to install a testNG plug-in on eclipse - so we can run the test with TestNG

// ------------ Where to write TestNG code ---------------	
// Once TestNG plug-in is installed, in order to write the test cases, we write them under src/test/Java.
// So far we wrote the selenium code under src/main/java.
// This is the maven structure we need to follow.
// We write TestNG code only under src/test/Java. So we will create a package(TestNGSessions) and start writing our code.
	
// ------------- How to write Test cases ----------------	
// It is always important to segregate the test cases with multiple @test annotations so that they are independent and every test case gets equal opportunity to get executed.
	// We write separate test cases for different functionalities. 
	
	// You should never club all of them into one test method because we will not be able to verify the reports clearly.
	//     We can't validate which exact functionality has issues and why a test is failing. 
	//     If a specific assertion fails, or an exception is thrown, it will terminate the entire test.
	// It's always best practice and important to write one assertion per test case.	
	
// ------------ Runner file in TestNG --------------------
		 
//	Runner File in TestNG: To run the test classes together in parallel as a bundle package, we need to create a runner. 
//  TestNG provides one runner called 'testng.xml' file. It's a configuration file. 
//     It's the main heart of TestNG because it controls everything from the testng.xml file, which is also helpful in the framework.
// We can create any number of these runner files( .xml files).
	
// ------------ How and where to create Runner file ----------
// In order to create a runner file, we need to create a 'folder'(Not a package, because we are trying to create a .xml file)under src/test/resources.
// Whenever we have to create a	non-java files, we need to create them under folder(not package). For java files, we have to create a package.
	
// I created a folder named 'testrunners' under src/test/resources. Then created a file named 'testng.xml' under this folder. 
	//This file name can be anything but with '.xml' as extension.
// 	In the .xml file, we include all the test classes, we want to bundle up and run together in a certain format(copied from standard xml file format).
// When we run this testng.xml file by right click--> Run as --> TestNG Suite, it will execute all the test classes included in the file in the same order as we written.
// In the .xml file, 'verbose' value can be any number from 1-10. This value represents the details generated in the logs in the report(TestNG logs).
// Usually we use either verbose = 3, 4 or 5, to include required information, 
	//so that we don't get too much info and at the same time not enough info in the TestNG logs(reports). 	

// -------------- TestNG parameterization -----------
// We can pass some parameters from the testng.xml (runner file) for the respective test case.
// These are called 'environment variables or environment parameters', which will help us run our test cases.
// But, once we define the testng.xml file and set up the parameters, we will not be able to run the individual classes.
//   That is because, the parameters are only defined in the .xml file, not in the 'BaseTest' class.
	
// ----------- Difference b/w @Dataprovider and parameters in .xml file -----------------------

// Data providers are used for test specific data and are maintained inside the individual classes for the specific test cases. Ex: different fields info like for registration, etc.
// Environment variables are used for environment specific data and are maintained in the .xml file. Ex: url, database details, browser info etc.

// ------------- parallel execution/ TestNG threads -----------------------
// To perform parallel execution, we need to add two configurations in .xml file. 1. 'thread-count="3" ' and 2. 'parallel = "tests" '.
// Both these configurations have to be given to achieve parallel execution. If any one of these misses, parallel execution can't happen.
	
// A Thread is a Java Instance of the memory(JVM memory). 
//	A TestNG JVM instance will be created inside the memory when we add 'thread-count="1"' in our testng.xml file.
// It is always a good practice to keep the thread count to either less than or equal the number of test blocks in testng.xml file.
// If we have too many test blocks for ex: 50, then we don't want to create 50 threads.
//	We can create 5 threads so that these 5 threads will take turns and run all the 50 test blocks. Here, at a time 5 threads will be participating.
//   This is to minimize the unnecessary usage of memory and to maintain the performance. Too many threads may even crash the system.

// Whenever we are doing parallel execution, do NOT create dependency between test classes. 
//	Because, threads will randomly picK test class blocks and the order can't be maintained here. So, if there's is any dependency b/w test classes, there are high chances that the test classes may fail.

//---------------- TestNG report(testng.html file) -----------
//When we run the .xml file, Other than the console log we get ,TestNG also provides a default report which is called as testng.html file.
// We can see this .html file by right clicking on the project( Nov2022SeleniumSessions) and click refresh.
// After refreshing, a folder named 'test-output' will be automatically created. In which, we can see index.html file.
// We can also open this file in our browser. 
//	right click on 'test-output' folder--> click on properties--> copy the location path. Now paste this location path in the browser to access the report.
// This report file contains all the details about the execution and results.
// Along with index.html file, there will be another .html file named 'emailable-report.html', This also has the same report in a different format with all the details.
// In the same folder test-output, there will be another file named 'testing-failed.xml' which will have all the failed test cases. We can re-run these failed test cases separately to verify by running this file.


}

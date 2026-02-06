package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@Test
	public void sampleTestCase()
	{
		System.out.println("This is a sample Test");
		
	}
	
	@BeforeMethod
	public void sampleBeforeMethod()
	{
		System.out.println("This is a Sample Before Method");
		
	}
	
	@AfterMethod
	public void sampleAfterMethod()
	{
		System.out.println("This is a Sample After Method");
		
	}	
	
	@BeforeClass
	public void beforeClassmethod()
	{
		System.out.println("This is a  Before Class Method");
	}
	
	@AfterClass
	public void afterClassmethod()
	{
		System.out.println("This is a  After Class Method");
	}
	
	@BeforeTest
	public void beforeTestmethod()
	{
		System.out.println("This is a  Before Test Method");
	}
	
	@AfterTest
	public void afterTestethod()
	{
		System.out.println("This is a  After Test Method");
	}
	
	@BeforeSuite
	public void beforeSuitemethod()
	{
		System.out.println("This is a  Before Suite Method");
	}
	
	@AfterSuite
	public void afterSuitethod()
	{
		System.out.println("This is a  After Suite Method");
	}

}

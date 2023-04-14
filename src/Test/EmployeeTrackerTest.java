package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.LoginPage;

public class EmployeeTrackerTest {


LoginPage LGpage;
	
	@BeforeMethod
	public void browserConfigure()
	{
		LGpage=new LoginPage();
		LGpage.initialization();
				
	}
	
	@Test
	public void clickEmployeeTracker() 
	{
		LGpage.login();
		EmployeeTrackerTest eptt=new EmployeeTrackerTest();
		eptt.clickEmployeeTracker();	
	}
	
	
	@Test
	public void validateEmployeeName() 
	{
		LGpage.login();
		EmployeeTrackerTest eptt=new EmployeeTrackerTest();
		eptt.validateEmployeeName();	
	}
	
	@Test
	public void validateSelectInclude() 
	{
		LGpage.login();
		EmployeeTrackerTest eptt=new EmployeeTrackerTest();
		eptt.validateSelectInclude();	
	}
	
	
	
	@Test
	public void validateSearchbtn() 
	{
		LGpage.login();
		EmployeeTrackerTest eptt=new EmployeeTrackerTest();
		eptt.validateSearchbtn();	
	}
	
	
	
}

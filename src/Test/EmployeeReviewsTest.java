package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.LoginPage;

public class EmployeeReviewsTest {

LoginPage LGpage;
	
	@BeforeMethod
	public void browserConfigure()
	{
		LGpage=new LoginPage();
		LGpage.initialization();
				
	}
	
	@Test
	public void validateEmployeereviews() 
	{
		LGpage.login();
		EmployeeReviewsTest eprt=new EmployeeReviewsTest();
		eprt.validateEmployeereviews();	
	}
	
	
	@Test
	public void EmployeeName() 
	{
		LGpage.login();
		EmployeeReviewsTest eprt=new EmployeeReviewsTest();
		eprt.EmployeeName();	
	}
	
	@Test
	public void validateJobTitle() 
	{
		LGpage.login();
		EmployeeReviewsTest eprt=new EmployeeReviewsTest();
		eprt.validateJobTitle();	
	}
	
	public void validateInclude()
	{
		LGpage.login();
		EmployeeReviewsTest eprt=new EmployeeReviewsTest();
		eprt.validateInclude();
	}
	
	@Test
	public void validateSearchbtn() 
	{
		LGpage.login();
		EmployeeReviewsTest eprt=new EmployeeReviewsTest();
		eprt.validateSearchbtn();	
	}
	
	
	

}

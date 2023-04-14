package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.LoginPage;

public class ManageReviewTest {


LoginPage LGpage;
	
	@BeforeMethod
	public void browserConfigure()
	{
		LGpage=new LoginPage();
		LGpage.initialization();
		LGpage.login();
	}

	
	@Test
	public void validateManageReview() 
	{
		LGpage.login();
		ManageReviewTest mrt=new ManageReviewTest();
		mrt.validateManageReview();	
	}
	
	
	@Test
	public void EmployeeName() 
	{
		LGpage.login();
		ManageReviewTest mrt=new ManageReviewTest();
		mrt.EmployeeName();	
	}
	
	@Test
	public void validateJobTitle() 
	{
		LGpage.login();
		ManageReviewTest mrt=new ManageReviewTest();
		mrt.validateJobTitle();	
	}
	@Test
	public void validateReviewStatus() 
	{
		LGpage.login();
		ManageReviewTest mrt=new ManageReviewTest();
		mrt.validateReviewStatus();	
	}
	
	@Test
	public void validateSearchbtn() 
	{
		LGpage.login();
		ManageReviewTest mrt=new ManageReviewTest();
		mrt.validateSearchbtn();	
	}
	
}	
	
	

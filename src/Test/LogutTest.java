package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.LoginPage;

public class LogutTest {


	LoginPage LGPage;
	
	@BeforeMethod
	public void browserConfig()
	{
		LGPage=new LoginPage();
		LGPage.initialization();
			
	}
	
	@Test
	public void validateLogoutTest()
	{
		LGPage.Logout();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		LGPage.tearDown();
	}
}

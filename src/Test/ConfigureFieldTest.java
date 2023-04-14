package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.ConfigureField;
import Page.LoginPage;

public class ConfigureFieldTest {
ConfigureField cf;
	LoginPage LGpage;
	
	@BeforeMethod
	public void browserConfigure()
	{
		LGpage=new LoginPage();
		LGpage.initialization();
		LGpage.login();
	}
	
	@Test
	public void validatePerformanceFeature() 
	{
		LGpage.login();
		ConfigureFieldTest cft=new ConfigureFieldTest();
		cft.validatePerformanceFeature();	
	}
	
	
	@Test
	public void EmployeeName() 
	{
		LGpage.login();
		ConfigureFieldTest cft=new ConfigureFieldTest();
		cft.EmployeeName();	
	}
	
	@Test
	public void validateJobTitle() 
	{
		LGpage.login();
		ConfigureFieldTest cft=new ConfigureFieldTest();
		cft.validateJobTitle();	
	}
	
	@Test
	public void validateSearchbtn() 
	{
		LGpage.login();
		ConfigureFieldTest cft=new ConfigureFieldTest();
		cft.validateSearchbtn();	
	}
	
	@Test
	public void validateSubcompKPIs()
	{
		LGpage.login();
		ConfigureFieldTest cft=new ConfigureFieldTest();
		cft.validateSubcompKPIs();
	}
	

	@Test
	public void validateSubcompTrackers()
	{
		LGpage.login();
		ConfigureFieldTest cft=new ConfigureFieldTest();
		cft.validateSubcompTrackers();
	}
	
	
	@Test
	public void validateJobTitle1()
	{
		LGpage.login();
		ConfigureFieldTest cft=new ConfigureFieldTest();
		cft.validateJobTitle1();
	}
	
	@Test
	public void validateSearchbtn1()
	{
		LGpage.login();
		ConfigureFieldTest cft=new ConfigureFieldTest();
		cft.validateSearchbtn1();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		LGpage.tearDown();
	}
}





	


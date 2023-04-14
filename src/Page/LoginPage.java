package Page;


import org.openqa.selenium.By;

import main.OrngHRMBase;


public class LoginPage extends OrngHRMBase {
	
	public void login()
	
{ 
	driver.findElement(By.name("//input[@placeholder='Username']")).sendKeys(prop.getProperty("Username"));
	driver.findElement(By.name("//input[@placeholder='Password']")).sendKeys(prop.getProperty("Password"));
	driver.findElement(By.xpath("//*button[@type='submit']")).click();
	
}

	public void Logout() {
		
	}
}
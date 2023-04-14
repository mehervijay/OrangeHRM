package Page;

import org.openqa.selenium.By;

import main.OrngHRMBase;

public class Logout extends OrngHRMBase {
	
	public void clcikLogout() 
	{
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']=Logoutbtn")).click();
	}

}
//
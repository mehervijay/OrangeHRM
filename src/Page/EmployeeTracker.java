package Page;

import java.time.Duration;

import org.openqa.selenium.By;

import main.OrngHRMBase;

public class EmployeeTracker extends OrngHRMBase{
	
	public void clickEmployeeTracker()
	{
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']=Performance")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --visited']=EmployeeTracker")).click();
		
	}
	
	public void EnterEmployeeName()
	{
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']=Performance")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --visited']=EmployeeTracker")).click();
		driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']=EmployeeName")).sendKeys("Charlie Carter");
	}
	
	public void SelectInclude()
	{
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']=Performance")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --visited']=EmployeeTracker")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']=Include")).isSelected();
				
	}
	
	public void clickSearchbtn()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	}

}

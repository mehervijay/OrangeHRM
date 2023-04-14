package Page;

import java.time.Duration;

import org.openqa.selenium.By;

import main.OrngHRMBase;

public class ManageReviewField extends OrngHRMBase{
	
	public void  ManageReview()
	{
		driver.findElement(By.xpath("//span[normalize-space()='Manage Reviews']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
	public void EnterEmployName()
	{
		driver.findElement(By.xpath("//span[normalize-space()='Manage Reviews']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@fdprocessedid='ibqjup']=EmployeeName")).isDisplayed();
	}
	
	public void EnterJobTitle()
	{
		driver.findElement(By.xpath("//span[normalize-space()='Manage Reviews']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@class='oxd-select-text oxd-select-text--active']=JobTitle")).isDisplayed();
	}
	
	public void ReviewStatus()
	{
		driver.findElement(By.xpath("//span[normalize-space()='Manage Reviews']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@class='oxd-select-text--after']=ReviewStatus")).isDisplayed();
	}
	
	public void clickSearchbtn()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	}
	

	
	
}

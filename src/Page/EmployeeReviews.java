package Page;

import java.time.Duration;

import org.openqa.selenium.By;

import main.OrngHRMBase;

public class EmployeeReviews extends OrngHRMBase{
	
	public EmployeeReviews() {
		
		driver.findElement(By.xpath("//*span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void EnterJobTitle()
	{
		driver.findElement(By.xpath("//*[@class='oxd-select-text oxd-select-text--active']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*button[@type='submit']")).click();
	}
	
	public void SelectSubunit()
	{
		driver.findElement(By.xpath("//*[@class='oxd-select-text oxd-select-text--active']=Subunit")).isSelected();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*button[@type='submit']")).click();
	}
	
	public void Include()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")).isSelected();
		driver.findElement(By.xpath("//*button[@type='submit']")).click();
	}

}

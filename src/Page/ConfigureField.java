package Page;

import java.time.Duration;

import org.openqa.selenium.By;

import main.OrngHRMBase;

public class ConfigureField extends OrngHRMBase{
	ConfigureField cf;
	public void Configure()
	{
		driver.findElement(By.xpath("//*span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent']")).isDisplayed();
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent']")).click();
		
	}

	public void SubcompField()
	    // KPIs field
	{
		driver.findElement(By.xpath("//*span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent']")).isDisplayed();
		driver.findElement(By.xpath("//*[@role='menuitem']")).isDisplayed();
		driver.findElement(By.xpath("//*[@role='menuitem']")).click();
	}
	
	public void SubcompField1()
		// Trackers field
	{
		driver.findElement(By.xpath("//*span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent']")).isDisplayed();
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab-link']")).isDisplayed();
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab-link']")).click();
	}
	
	public void SelectJobtitle()
	{
		driver.findElement(By.xpath("//*span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent']")).isDisplayed();
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab-link']")).isDisplayed();
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab-link']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).isDisplayed();
	}
	
	public void clickSearchbtn()
	{
		driver.findElement(By.xpath("//*button[@type='submit']")).click();
	}
	
}

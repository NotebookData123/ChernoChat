package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.loginpage;
import PageObjects.mainadminpage;
import screenshots.screenshot;

public class addcompany {
	public WebDriver driver;
	
	public addcompany(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}


	public void producingerror() throws InterruptedException{
		
		loginpage lp=new loginpage(driver);
		screenshot sc=new screenshot();
		mainadminpage  map=new mainadminpage(driver);
		sc.takeScreenShotMethod("CompanyDetailsForm");
		map.companyname().sendKeys(Keys.TAB);
		Thread.sleep(1000);
		sc.takeScreenShotMethod("SkippedName");
		map.companyemail().sendKeys(Keys.TAB);
		sc.takeScreenShotMethod("SkippedEmail");
		map.location().sendKeys(Keys.TAB);
		Thread.sleep(1000);
		map.companyname().sendKeys("newkhech");
		Thread.sleep(1000);
		map.companyemail().sendKeys("newtgfgech@newtech.com");
		Thread.sleep(1000);
		map.location().sendKeys("nowhere");
		Thread.sleep(1000);
		map.smstogglses().click();
		Thread.sleep(4000);
		map.ndatoggles().click();
		Thread.sleep(4000);
		map.schedulemeet().click();
		Thread.sleep(4000);
		map.addcompanybutton().click();
		sc.takeScreenShotMethod("ErrorDisplayed");
		
	}
	
	
	public void validaddition() throws InterruptedException{
		
		loginpage lp=new loginpage(driver);
		screenshot sc=new screenshot();
		mainadminpage  map=new mainadminpage(driver);
		
		map.companyname().clear();
		map.companyname().sendKeys("tempge");
		Thread.sleep(1000);
		map.companyemail().clear();
		Thread.sleep(1000);
		map.companyemail().sendKeys("temegp@shtc.com");
		map.location().clear();
		Thread.sleep(1000);
		map.location().sendKeys("nowhere");
		Thread.sleep(1000);
		map.smstogglses().click();
		Thread.sleep(1000);
		sc.takeScreenShotMethod("SMSDeSelected");
		Thread.sleep(1000);
		map.addcompanybutton().click();
		Thread.sleep(4000);
		sc.takeScreenShotMethod("DetailsAdded");
	}
	
	
	public void editlink() throws InterruptedException{
	
		screenshot sc=new screenshot();
		mainadminpage  map=new mainadminpage(driver);
		map.clickedit().click();
		Thread.sleep(2000);
		sc.takeScreenShotMethod("EditClicked");
		map.companyname().clear();
		Thread.sleep(1000);
		map.companyname().sendKeys("Zenssdddesk");
		map.companyemail().clear();
		Thread.sleep(1000);
		map.companyemail().sendKeys("zenssdesk@zho.com");
		Thread.sleep(1000);
		map.location().clear();
		Thread.sleep(1000);
		map.location().sendKeys("Chennai");
		Thread.sleep(1000);
		map.smstogglses().click();
		Thread.sleep(1000);
		sc.takeScreenShotMethod("SMSSelectedinEdit");
		map.schedulemeet().click();
		Thread.sleep(1000);
		sc.takeScreenShotMethod("ScheduleMeetingselected");
		map.updatecompany().click();
		Thread.sleep(2000);
		map.userimage().click();
		Thread.sleep(3000);
		map.logout().click();
//		map.addlocation().click();
//		map.location().sendKeys("THenkasi");
		
//		map.deletelocation().click();
//		Thread.sleep(3000);
//		sc.takeScreenShotMethod("ErrorMessageDisplayed");
//		String error=map.errormess().getText();
//		System.out.println(error);
//		map.clickno();
//		Thread.sleep(2000);
//		map.addlocation().click();
//		WebDriverWait wait=new WebDriverWait(driver,20);
		
//		map.deletelocation().click();
//		if(map.deletelocation().isEnabled()){
//			
//			map.deletelocation().click();
//		}
//		
//		wait.until(ExpectedConditions.elementToBeClickable(map.clickyes()));
//		map.clickyes();
//			
	}
}

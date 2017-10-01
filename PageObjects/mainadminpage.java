package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainadminpage {

	public WebDriver driver;
	By addcompany=By.xpath("//*[@class='addcompany']");
	By compname=By.xpath("//*[@name='companyName']");
	By compemail=By.xpath("//*[@name='companyEmail']");
	By location=By.xpath("//*[@placeholder='Location']");
	By togglses=By.xpath("//*[@id='yesno']/div/label/span[1]");
	By addcompbtn=By.xpath("//*[@class='signup_btn']");
	By editlink=By.xpath("//*[@id='table_col']/table/tbody/tr[1]/td[5]/span");
	By smstoggle=By.xpath("//*[@id='custForm']/div[3]/div[2]/label");
	By ndatoggle=By.xpath("//*[@id='custForm']/div[3]/div[3]/label");
	By schedulemeeting=By.xpath("//*[@id='custForm']/div[3]/div[4]/label");
	By updatecompany=By.xpath("//*[@class='signup_btn']");
	By addlocation=By.xpath("//*[@class='alocation']");
	By delete_icon=By.xpath(".//*[@id='custForm']/div[3]/div[2]/span[2]/span");
	By error_msg=By.xpath("//*[@class='err_msg']");
	By yes=By.xpath("//*[@name='yesCompany']");
	By No=By.xpath("//*[text()='No']");
	By updatecompbutton=By.xpath("//*[@class='signup_btn']");
	
	By authentication=By.xpath("//*[@class='modal-content w_700']");
	
	By userimage=By.xpath("//*[@class='btn-group']");
	By logout=By.xpath("//*[@class='dropdown-menu']/li");
	
	
	
	public WebElement userimage(){
		return driver.findElement(userimage);
	}
	
	public WebElement logout(){
		return driver.findElement(logout);
	}
	public WebElement updatecompany(){
		return driver.findElement(updatecompbutton);
	}
	
	public WebElement authenticate(){
		return driver.findElement(authentication);
	}
	
	public WebElement clickyes(){
		return driver.findElement(yes);
	}
	
	public WebElement clickno(){
		 return driver.findElement(No);
	 
	}
	public WebElement errormess(){
		return driver.findElement(error_msg);
	}
	
	
	public WebElement deletelocation(){
		return driver.findElement(delete_icon);
	}
	
	public WebElement addlocation(){
		return driver.findElement(addlocation);
	}
	public WebElement updatedetails(){
	  return driver.findElement(updatecompany);
	}
	public WebElement clickedit(){
		return driver.findElement(editlink);
	}
	
	public WebElement schedulemeet(){
		return driver.findElement(schedulemeeting);
	}
	
	public WebElement smstogglses(){
		return driver.findElement(smstoggle);
	}
	
	public WebElement ndatoggles(){
		return driver.findElement(ndatoggle);
	}
	
	
	
	public mainadminpage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement addCompany(){
		return driver.findElement(addcompany);
	}
	
	public WebElement companyname(){
			return driver.findElement(compname);
	}
	
	public WebElement companyemail(){
		return driver.findElement(compemail);
		
	}
	
	public WebElement location(){
		return driver.findElement(location);
	}
	
	
	public WebElement addcompanybutton(){
		
		
		return driver.findElement(addcompbtn);
	}
	
	
}

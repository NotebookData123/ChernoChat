package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

	public WebDriver driver;
 By username=By.xpath("//*[@name='email']");
 
 By password=By.xpath("//*[@name='password']");
 
 By login=By.xpath("//*[@class='signup_btn']");
 
 





public loginpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement username(){
	 
	 return driver.findElement(username);
 }
 
 
 public WebElement password(){
	 
	 return driver.findElement(password);
 }
 
 public WebElement login(){
	 
	 
	 return driver.findElement(login);
 }
}

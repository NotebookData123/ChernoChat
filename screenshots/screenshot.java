package screenshots;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
 
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
 
import org.openqa.selenium.OutputType;
 
import org.openqa.selenium.TakesScreenshot;
 
import org.openqa.selenium.WebDriver;
 

 
import org.testng.annotations.Test;
 
public class screenshot {
	  WebDriver driver;
 
	 public static void takeScreenShotMethod(String name){
		    try{
		        Thread.sleep(1000);
		        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		        ImageIO.write(image, "png", new File("./Ara/"+name+".png"));
		    }
		    catch(Exception e){
		        e.printStackTrace();
		    }
		}}
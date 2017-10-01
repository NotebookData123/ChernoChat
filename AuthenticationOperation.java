package packagesfromnisha;

//Functions of Authentication Operation prepared by NISHA


import java.io.IOException;

public class AuthenticationOperation extends DriverOperation {
    
    //Function to open URL and sign in without username and password
    public void invalidLogin1() throws IOException, InterruptedException{
        loadObjectFile();
        open("http://mis.heptagon.tech/stage/mis-wpos-backend/login.php");
        //login_page.open();
        maximizeWindow();
        click("SignIn");
        wait(2000);
        checkVisibility("Invalidusername","Invalid Username");
        checkVisibility("Invalidpassword","Invalid Password");
    }
    
    //Function to sign in without password
    public void invalidLogin2() throws InterruptedException{
        enterText("username","admin123");
        wait(2000);
        click("SignIn");
        wait(5000);
        checkVisibility("Invalidpassword","Invalid Password");
    }
    
    //Function to sign in without username
    public void invalidLogin3() throws InterruptedException{
        enterText("password","Admin@123");
        wait(2000);
        click("SignIn");
        wait(5000);
        checkVisibility("Invalidusername","Invalid Username");
    }
    
    //Function to sign in with invalid username and password
    public void invalidLogin4() throws InterruptedException{
        enterText("username","ahfhfhfh");
        enterText("password","Adfgfdhfdh");
        wait(2000);
        click("SignIn");
        checkVisibility("Invalidusername","Invalid Username");
        checkVisibility("Invalidpassword","Invalid Password");
    }
    
    //Function to login with valid credentials
    //Input1:Username-admin123
    //Input2:Password-Admin@123
    public void validLogin() throws InterruptedException{
        enterText("username","admin123");
        enterText("password","Admin@123");
        wait(2000);
        click("SignIn");
        wait(2000);
    }
    
    //Function to verify Remember me
    public void verifyRememberMe() throws InterruptedException{
    	click("userprofile");
    	wait(2000);
    	click("Logout");
    	wait(5000);
        enterText("username","admin123");
        enterText("password","Admin@123");
        wait(2000);
        click("Rememberme");
        click("SignIn");
        wait(2000);
    }
    
    //Function to check the Remember me 
    public void checkRememberMe() throws InterruptedException{
    	click("userprofile");
    	click("Logout");
    	wait(2000);
    	checkVisibility("username","admin123");
    	checkVisibility("password","Admin@123");
    	click("SignIn");
    	wait(2000);
    	/*click("userprofile");
    	click("Logout");*/
    }
    
    //Function to click Forgot Password
    public void forgotPassword() throws InterruptedException{
    	click("ForgotPassword");
    	wait(2000);
    	enterText("Email","nisha@heptagon.in");
    	wait(2000);
    	click("verifyEmail");
    	checkContent("Verification Link has been sent to your registered email.");
    	wait(2000);
    	checkContent("The Link Expires in 30 mins.");  
    	wait(3000);
    	open("http://mis.heptagon.tech/stage/mis-wpos-backend/login.php");
    	wait(2000);
    	click("SignIn");
    }
    

}
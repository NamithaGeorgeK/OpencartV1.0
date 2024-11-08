package testBase;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import pageObjects.AccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginBase extends BaseClass {
	
	@BeforeClass
	public void toLogin() throws InterruptedException {
		
		logger.info("** Login to Web Application **");
		try {
		
		HomePage hp=new HomePage(driver);
		hp.click_myAccount();
		//logger.info("** Navigating to Login Page **");
		hp.click_login();	
		
		LoginPage lp= new LoginPage(driver);
		logger.info("** Provide Login Details **");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.click_Login();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		AccountPage myacc= new AccountPage(driver);
		
		logger.info("** Verifying Login Success **");
		String txtPresent=myacc.checktxt_MyAccPresent();
		
		if(txtPresent.equals("My Account"))
		{
			Assert.assertTrue(true);
		}
		else {
			logger.error("Login Failed!");	
			Assert.assertTrue(false);
			}
		
		}
		catch(Exception e)
		{
			Assert.fail("Login Fail!");
			//Assert.fail();
		}
		
		logger.info("** Login successful **");
	}

}

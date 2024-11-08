package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.AccountPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass {
	
	@Test
	public void verify_LoginTest() {
		
		logger.info("** Starting Execution of Login Test **");
		try {
		HomePage hp=new HomePage(driver);
		hp.click_myAccount();
		logger.info("** Navigating to Login Page **");
		hp.click_login();	
		
		LoginPage lp= new LoginPage(driver);
		logger.info("** Provide Login Details **");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.click_Login();
		
		AccountPage myacc= new AccountPage(driver);
		logger.info("** Verifying Login Success **");
		String txtPresent=myacc.checktxt_MyAccPresent();
		if(txtPresent.equals("My Account"))
		{
			Assert.assertTrue(true);
		}
		else {
			logger.error("Test Failed!");	
			Assert.assertTrue(false);
			}
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
		logger.info("** Completed Execution of Login Test **");
	}
	
}

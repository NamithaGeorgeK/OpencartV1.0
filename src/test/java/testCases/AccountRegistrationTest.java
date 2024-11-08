package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterAccountPage;
import testBase.BaseClass;

public class AccountRegistrationTest extends BaseClass {
	
		
	@Test
	public void verify_AccountRegistration() {
		logger.info("** Starting Exection of AccountRegistration Test **");		
		
		try {
		HomePage hp= new HomePage(driver);
		hp.click_myAccount();
		logger.info("** Navigating to Account Registration Page **");
		hp.click_register();
		
		RegisterAccountPage regpage = new RegisterAccountPage(driver);
		logger.info("** Providing Customer Details **");
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@yzmail.com");
		regpage.setTelephone(randomNumber());
		logger.info("** Password Setup **");
		String password=randomAlphanumeric();
		regpage.setPassword(password);
		regpage.setConfPassword(password);
		regpage.set_NewsSubscription();
		regpage.set_PrivacyPolicy();
		regpage.click_Continue_AccountRegisterPage();
		logger.info("** Account Registration Complete **");
		logger.info("** Registration Confirmation Message Check **");
		String confMsg= regpage.getRegistrationSuccessMsg();
		regpage.click_Continue_RegisterSuccessPage();
		logger.info("** After Registration continue to Login Page **");
		
		if(confMsg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
		}
		else {
			logger.error("Test Failed!");
			logger.debug("Debug Logs");
			Assert.assertTrue(false);
			
		}
	}catch(Exception e) {
		
		Assert.fail();
	}
		
		logger.info("** Completed Execution of AccountRegistration Test **");			
	}
	
	
}

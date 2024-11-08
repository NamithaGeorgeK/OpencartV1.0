package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.AccountPage;
//import pageObjects.HomePage;
//import pageObjects.LoginPage;

import testBase.LoginBase;


public class AccountPg_HeaderAndLink_TxtTest extends LoginBase {
  
	@Test
  public void verify_LinkTxtElements_AccountPage() {
	  
		
		logger.info("** Starting Execution of Account Page Header & Link_Text Elements Test **");
	  	sfAssert =new SoftAssert();
		/*HomePage hp=new HomePage(driver);
		hp.click_myAccount();
		logger.info("** Navigating to Login Page **");
		hp.click_login();
		
		LoginPage lp= new LoginPage(driver);
		logger.info("** Provide Login Details **");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.click_Login();*/
	  	
	  	  	
		AccountPage myacc= new AccountPage(driver);
		
		logger.info("** Verify Text-My Account Is Present **");
		sfAssert.assertEquals(myacc.checktxt_MyAccPresent(), "My Account");
		logger.info("** Verify Text-My Orders Is Present **");
		sfAssert.assertEquals(myacc.checktxt_MyOrdersPresent(),"My Orders");
		logger.info("** Verify Text-My Affiliate Account Is Present **");
		sfAssert.assertEquals(myacc.checktxt_MyAffiliateAccountPresent(),"My Affiliate Account");
		logger.info("** Verify Text-Newsletter Is Present **");
		sfAssert.assertEquals(myacc.checktxt_NewsletterPresent(),"Newsletter");		
		
		logger.info("***** Verifying Link Texts Under Header-My Account ****");
		logger.info("** Verify Text-Edit your account information Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_EditAccntInfo(),"Edit your account information");
		logger.info("** Verify Text-Change your password Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_ChangePassword(),"Change your password");
		logger.info("** Verify Text-Modify your address book entries Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_ModifyAddressBook(),"Modify your address book entries");
		logger.info("** Verify Text-Modify your wish list Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_ModifyWishList(),"Modify your wish list");
		
		logger.info("***** Verifying Link Texts Under Header-My Orders *****");
		logger.info("** Verify Text-View your order history Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_ViewOrderHistory(),"View your order history");
		logger.info("** Verify Text-Downloads Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_ViewDowloads(),"Downloads");
		logger.info("** Verify Text-Your Reward Points Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_ViewRewardPoints(),"Your Reward Points");
		logger.info("** Verify Text-View your return requests Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_ViewReturnRequests(),"View your return requests");
		logger.info("** Verify Text-Your Transactions Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_ViewTransactions(),"Your Transactions");
		logger.info("** Verify Text-Recurring payments Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_RecurringPayments(),"Recurring payments");
		
		logger.info("***** Verifying Link Texts Under Header-My Affiliate Account *****");
		logger.info("** Verify Text-Register for an affiliate account Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_RegisterAffliateAccount(),"Register for an affiliate account");
		
		logger.info("****** Verifying Link Texts Under Header-Newsletter ******");
		logger.info("** Verify Text-Subscribe/Unsubscribe to newsletter Is Present **");
		sfAssert.assertEquals(myacc.checktxt_link_ViewNewsletterSubscription(),"Subscribe / unsubscribe to newsletter");
		
		sfAssert.assertAll();
		logger.info("** Completed Execution of Account Page Header & Link_Text Elements Test **");
		
		
  	}
}

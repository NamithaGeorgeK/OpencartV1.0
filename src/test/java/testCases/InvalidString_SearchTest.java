package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.NoProductMatchPage;
import testBase.BaseClass;

public class InvalidString_SearchTest extends BaseClass {

	@Test
	public void verify_Search_InvalidString() {
		
		logger.info("** Starting Execution of Search with Invalid String Test **");
		sfAssert =new SoftAssert();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		logger.info("** From The Home Page **");
		HomePage hp = new HomePage(driver);
		logger.info("** Enter Search text **");
		hp.enter_SearchText(p.getProperty("invalidString"));
		logger.info("** Click on Search icon **");
		hp.click_SearchIconBtn();
		
		logger.info("** Navigating to Search Page **");
		NoProductMatchPage np= new NoProductMatchPage(driver);
		
		logger.info("** Verify Search value displayed **");
		
		sfAssert.assertEquals(np.checktxtdisplayed_SearchHeaderText(),"Search - "+p.getProperty("invalidString") );
			
		logger.info("** Verify Search value results  with Invalid Search String **");
		sfAssert.assertEquals(np.checktxtdisplayed_ProductMatchSuccess(),"Products meeting the search criteria");
		
		logger.info("** Verify Text - No Product Match is displayed **");
		Assert.assertEquals(np.checktxtdisplayed_ProductMatchFail(),"There is no product that matches the search criteria.");
		sfAssert.assertAll();
		logger.info("** Completed Execution of Search with Invalid String Test**");
		
	}
	@Test
	public void verify_Search_EmptyString() {
		
		logger.info("** Starting Execution of Search with Empty String Test **");
		sfAssert =new SoftAssert();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		logger.info("** From The Home Page **");
		HomePage hp = new HomePage(driver);
		logger.info("** Enter Search text **");
		hp.enter_SearchText(p.getProperty("emptyString"));
		logger.info("** Click on Search icon **");
		hp.click_SearchIconBtn();
		
		logger.info("** Navigating to Search Page **");
		NoProductMatchPage np= new NoProductMatchPage(driver);
		
		logger.info("** Verify Search value displayed **");
		
		sfAssert.assertEquals(np.checktxtdisplayed_SearchHeaderText(),"Search"+p.getProperty("emptyString") );
		
			
		logger.info("** Verify Search value results  with Empty Search String **");
		sfAssert.assertEquals(np.checktxtdisplayed_ProductMatchSuccess(),"Products meeting the search criteria");
		
		logger.info("** Verify Text - No Product Match is displayed **");
		Assert.assertEquals(np.checktxtdisplayed_ProductMatchFail(),"There is no product that matches the search criteria.");
		sfAssert.assertAll();
		logger.info("** Completed Execution of Search with Empty String Test**");
		
	}
}

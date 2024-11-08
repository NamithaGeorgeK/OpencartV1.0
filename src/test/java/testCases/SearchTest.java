package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class SearchTest extends BaseClass{
	
	
	@Test(priority=1)
	public void verify_Search() {
		
		logger.info("** Starting Execution Of Search Test **");
		sfAssert =new SoftAssert();
		
		
		
		logger.info("** From The Home Page **");
		HomePage hp = new HomePage(driver);
		logger.info("** Enter Search Text **");
		hp.enter_SearchText(p.getProperty("searchTxt"));
		logger.info("** Click On Search Icon **");
		hp.click_SearchIconBtn();
		
		logger.info("** Navigating To Search Page **");
		SearchPage sp= new SearchPage(driver);
		
		logger.info("** Verify Search Value Displayed **");
		sfAssert.assertEquals(sp.checktxtdisplayed_SearchHeaderText(),"Search - "+p.getProperty("searchTxt") );
		logger.info("** Verify Search Value Results **");
		sfAssert.assertTrue(sp.checktxtdisplayed_ProductMatchSuccess(),"Products Meeting The Search Criteria");
		logger.info("** Verify Products meeting the search criteria are displayed **");
		Assert.assertTrue(sp.isSuccess_Search_Productdisplayed());
		logger.info("** Verify Navigation to Product Page **");
		sp.click_Productdisplayed(p.getProperty("productIndex"));
		sfAssert.assertAll();
		logger.info("** Completed Execution of Search Test**");
		
	}  
	@Test(priority=2)
	public void verify_Search_changeCategory() {
		
		logger.info("** Starting Execution Of Search_ChangeCategory Test **");
		sfAssert =new SoftAssert();
		
		
		HomePage hp = new HomePage(driver);
		logger.info("** Enter Search Text **");
		hp.enter_SearchText(p.getProperty("searchTxt"));
		logger.info("** Click On Search Icon **");
		hp.click_SearchIconBtn();
	
		logger.info("** Navigating To Search Page **");
		SearchPage sp= new SearchPage(driver);
		
	
		
		logger.info("** Select Category **");
		sp.select_SearchCategory(p.getProperty("category"));
		sfAssert.assertEquals(sp.checktxtdisplayed_SearchinSubcatgories(),"Search in subcategories");
		sp.selectCheckbox_ProductDescription();
		sfAssert.assertEquals(sp.checktxtdisplayed_SearchinProductDescription(),"Search in product descriptions");
		sp.click_SearchBtn();
		
		logger.info("** Verify Products meeting the search criteria are displayed **");
		sfAssert.assertTrue(sp.isSuccess_Search_Productdisplayed());

		
		sfAssert.assertAll();
		logger.info("** Completed Execution Of Search_ChangeCategory Test **");
		
		
	}
	@Test(priority=3)
	public void verify_Searchfilter_SortBy_Show() {
		
		logger.info("** Starting Execution Of Search With Filter Test **");

		logger.info("** Navigating To Search Page **");
		SearchPage sp= new SearchPage(driver);
		logger.info("** Select Sortby Value **");
		sp.select_Sortvalue(p.getProperty("sort"));
		logger.info("** Verify Sortby Value Selected **");
		sfAssert.assertEquals(sp.check_valuedisplayed_SortBy(),p.getProperty("sort"));
		
		logger.info("** Select Show Dropdown Value **");
		
		
		sp.select_Numberof_ProductsDisplayed(p.getProperty("numberofproducts"));
		logger.info("** Verify Show Dropdown Value **");
		sfAssert.assertEquals(sp.check_valuedisplayed_ShowDropdownBox(),p.getProperty("numberofproducts"));
		
		logger.info("** Completed Execution Of Search With Filter Test **");
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

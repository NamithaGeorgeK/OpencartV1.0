package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {
	
	public SearchPage(WebDriver driver) {
		
		super(driver);
	}

	WebElement txtbox_search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	WebElement btn_searchicon=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
	
	WebElement txtheader_searchpage=driver.findElement(By.cssSelector("div[id='content'] h1"));
	WebElement txtlabel_searchcriteria=driver.findElement(By.xpath("//label[normalize-space()='Search Criteria']"));
	WebElement txtinputbx_searchkeywrd=driver.findElement(By.xpath("//input[@id='input-search']"));
	
	
	WebElement checkbx_subcategories=driver.findElement(By.xpath("//input[@name='sub_category']"));
	WebElement txtlabel_searchsubcategories=driver.findElement(By.xpath("//body/div[@id='product-search']/div[@class='row']/div[@id='content']/div[1]/div[3]"));
			//driver.findElement(By.xpath("//label[normalize-space()='Search in subcategories']"));
	
	WebElement checkbx_productdescription=driver.findElement(By.xpath("//input[@id='description']"));
	
	WebElement txtlabel_productdescription=driver.findElement(By.xpath("//body/div[@id='product-search']/div[@class='row']/div[@id='content']/p[1]"));
			//driver.findElement(By.xpath("//label[normalize-space()='Search in product descriptions']"));
	
	WebElement btn_txtsearch=driver.findElement(By.xpath("//input[@id='button-search']"));
	
	WebElement txtheader_searchproductmatch=driver.findElement(By.xpath("//h2[normalize-space()='Products meeting the search criteria']"));
	
	
	WebElement elementtxt_sortby=driver.findElement(By.xpath("//label[normalize-space()='Sort By:']"));
	WebElement elementtxt_show=driver.findElement(By.xpath("//label[normalize-space()='Show:']"));
	
	WebElement viewbar=driver.findElement(By.xpath("//body/div[@id='product-search']/div/div[@id='content']/div/div[2]/div[1]"));
	WebElement btn_listview=driver.findElement(By.xpath("//button[@id='list-view']"));
	WebElement btn_gridview=driver.findElement(By.xpath("//button[@id='grid-view']"));	
	
	WebElement link_productcompare=driver.findElement(By.xpath("//a[@id='compare-total']"));	
	
	WebElement row_productdisplay=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]"));
	List<WebElement> searchOutput=row_productdisplay.findElements(By.tagName("img"));
	WebElement first_productdisplayed=driver.findElement(By.xpath("//body/div[@id='product-search']/div/div[@id='content']/div[3]/div[1]"));
	
	WebElement txtdisplayed_numberofpages=driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(9) > div:nth-child(2)"));
	
	Select dropdownbx_categories=new Select(driver.findElement(By.xpath("//select[@name='category_id']")));
	Select dropdownbx_sortby=new Select(driver.findElement(By.xpath("//select[@id='input-sort']")));
	
	Select dropdownbx_productdisplay_perpage=new Select(driver.findElement(By.xpath("//select[@id='input-limit']")));
	
	//Buttons of 1st product result
	WebElement btn_addtocart=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]"));
	WebElement btn_addtowishlist=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[2]"));	
	WebElement btn_addproducttocompare=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[3]"));
		
	
	
	public void enter_SearchText(String searchtxt) {
		txtbox_search.clear();
		txtbox_search.sendKeys(searchtxt);
	}
	public void click_SearchIconBtn() {
		btn_searchicon.click();
	}
	public void click_SearchBtn() {
		btn_txtsearch.click();
	}
	
	public void select_SearchCategory(String category ) {
		dropdownbx_categories.selectByVisibleText(category);
		
	}
	public String checktxtdisplayed_SearchHeaderText() {
		if(txtheader_searchpage.isDisplayed())
		{
			String searchtxt_Displayed=txtheader_searchpage.getText();
			return searchtxt_Displayed;
		}
		else 
		{
			return "No text displayed";
		}
	}
	public boolean checktxtdisplayed_SearchCriteriaText() {
		try {
			return txtlabel_searchcriteria.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	public boolean checktxtdisplayed_ShowNumofPages() {
		try {
			return txtdisplayed_numberofpages.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public void selectCheckbox_Subcategories() {
		try{
			if(checkbx_subcategories.isEnabled() && checkbx_subcategories.isSelected()) {
		
			checkbx_subcategories.click();
			}
		
		else {
			
			checkbx_subcategories.click();
			}
		}
		catch(Exception e) {
			
			e.getMessage();
			e.printStackTrace();
			
		}
	}		
	
	public void selectCheckbox_ProductDescription() {
		try{
			if(checkbx_productdescription.isEnabled() && !checkbx_productdescription.isSelected()) {
			
			checkbx_productdescription.click();		
		}
		else {
			checkbx_productdescription.click();	
			 }
		}
		catch(Exception e) {
			
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	public String checktxtdisplayed_SearchinSubcatgories() {
		try {
			
			return txtlabel_searchsubcategories.getText();
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
	public String checktxtdisplayed_SearchinProductDescription() {
		try {
			return txtlabel_productdescription.getText();
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
	public boolean checktxtdisplayed_ProductMatchSuccess() {
		try {
			return txtheader_searchproductmatch.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public void select_View_Grid() {
	try {
		if(viewbar.isEnabled() && btn_gridview.isDisplayed() ) {
			btn_gridview.click();			
		}
	}
		catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}		
	}
	public void select_View_List() {
		try {
			if(viewbar.isEnabled() && btn_listview.isDisplayed() ) {
				btn_listview.click();			
			}
		}
			catch(Exception e) {
				e.getMessage();
				e.printStackTrace();
			}		
		}
	
	
	public boolean checktxt_SortByPresent() {
		try {
			return elementtxt_sortby.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}		
	}
	
	public void select_Sortvalue(String sortvalue) {
	
		dropdownbx_sortby.selectByVisibleText(sortvalue);
				
	}
	
	public String check_valuedisplayed_SortBy() {
		try {
		return dropdownbx_sortby.getFirstSelectedOption().getText();
		}
		catch(Exception e) {
			return "No text";
		} 
	}
	
	public boolean check_Show_isPresent() {
		try {
			return elementtxt_show.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
		
	}
	public void select_Numberof_ProductsDisplayed(String numbertodisplay) {
		try {
			
		dropdownbx_productdisplay_perpage.selectByVisibleText(numbertodisplay);
	}
		catch(Exception e) {
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.ignoring(StaleElementReferenceException.class)
			.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='input-limit']"))));
			
			dropdownbx_productdisplay_perpage=new Select(driver.findElement(By.xpath("//select[@id='input-limit']")));
			dropdownbx_productdisplay_perpage.selectByVisibleText(numbertodisplay);
		}
	}
	
	public String check_valuedisplayed_ShowDropdownBox() {
		try {
			
		return dropdownbx_productdisplay_perpage.getFirstSelectedOption().getText();
		}
		catch(Exception e) {
			return "No text";
		} 
	}
	
	public void advancedSearch(String searchtxt,String category) {
		enter_SearchText(searchtxt);
		select_SearchCategory(category );
		selectCheckbox_Subcategories();
		selectCheckbox_ProductDescription();
		click_SearchBtn();
		}
	
	public boolean isSuccess_Search_Productdisplayed() {
		try {
			
			return  row_productdisplay.isDisplayed();
			
			}
		catch(Exception e) {
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.ignoring(StaleElementReferenceException.class)
			.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]")));
			
			return driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]")).isDisplayed() ;
		}
	}
	public String click_Productdisplayed(String index) {
		
		int i = Integer.parseInt(index);
		if(row_productdisplay.isDisplayed()) {
			
			searchOutput.get(i).click();
			return "Navigate to Product Page";	
			
			}
		else {
			return "No Text displayed";
		}
	}
	
	 public void click_AddtoCart() {
		
				btn_addtocart.click();
		}
	public void click_AddtoWishlist() {
		
			btn_addtowishlist.click();		
	}
	public void click_CompareProduct() {
		
		btn_addproducttocompare.click();
			
	}
	public void clickLink_ProductCompare() {
		
		link_productcompare.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}




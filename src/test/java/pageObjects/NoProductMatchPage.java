package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NoProductMatchPage extends BasePage {
	
	public NoProductMatchPage(WebDriver driver) {
		
		super(driver);
	}
	
	WebElement txtbox_search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	WebElement btn_searchicon=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
	
	WebElement txtheader_searchpage=driver.findElement(By.cssSelector("div[id='content'] h1"));
	WebElement txtlabel_searchcriteria=driver.findElement(By.xpath("//label[normalize-space()='Search Criteria']"));
	WebElement txtinputbx_searchkeywrd=driver.findElement(By.xpath("//input[@id='input-search']"));
	
	
	WebElement checkbx_subcategories=driver.findElement(By.xpath("//input[@name='sub_category']"));
	WebElement txtlabel_searchsubcategories=driver.findElement(By.xpath("//label[normalize-space()='Search in subcategories']"));
	
	WebElement checkbx_productdescription=driver.findElement(By.xpath("//input[@id='description']"));
	WebElement txtlabel_productdescription=driver.findElement(By.xpath("//label[normalize-space()='Search in product descriptions']"));
	
	WebElement btn_txtsearch=driver.findElement(By.xpath("//input[@id='button-search']"));
	
	WebElement txtheader_searchproductmatch=driver.findElement(By.xpath("//h2[normalize-space()='Products meeting the search criteria']"));
	WebElement txtheader_noproductmatch=driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criter')]"));
	
	Select dropdownbx_categories=new Select(driver.findElement(By.xpath("//select[@name='category_id']")));
	
	
	
	
	public void enter_SearchText(String searchtxt) {
		txtbox_search.sendKeys(searchtxt);
	}
	
	public void click_SearchIconBtn() {
		btn_searchicon.click();
	}
	
	public void enterText_SearchKeywordsbox(String searchtxt) {
		txtinputbx_searchkeywrd.sendKeys(searchtxt);
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
		
		public boolean checktxtdisplayed_SearchinSubcatgories() {
			try {
				return txtlabel_searchsubcategories.isDisplayed();
			}
			catch(Exception e) {
				return false;
			}
		}
		public boolean checktxtdisplayed_SearchinProductDescription() {
			try {
				return txtlabel_productdescription.isDisplayed();
			}
			catch(Exception e) {
				return false;
			}
		}
		public String checktxtdisplayed_ProductMatchSuccess() {
			if ( txtheader_searchproductmatch.isDisplayed())
			{
				return txtheader_searchproductmatch.getText();
			}
			else {
				return "No Text Displayed";
			}
		}
		public String checktxtdisplayed_ProductMatchFail() {
			if ( txtheader_noproductmatch.isDisplayed())
			{
				return txtheader_noproductmatch.getText();
			}
			else {
				return "No Text Displayed";
			}
		}
		
	
	

}

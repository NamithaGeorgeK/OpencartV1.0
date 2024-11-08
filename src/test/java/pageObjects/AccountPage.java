package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage{

	public AccountPage(WebDriver driver) {
		
		super(driver);
	}
	
//Weblements under title='My Account' 

	WebElement txtheader_myaccnt= driver.findElement(By.xpath("//h2[normalize-space()='My Account']"));
	WebElement link_edit_accntinfo= driver.findElement(By.xpath("//a[normalize-space()='Edit your account information']"));
	WebElement link_chnge_password= driver.findElement(By.xpath("//a[normalize-space()='Change your password']"));
	WebElement link_edit_addrbk= driver.findElement(By.xpath("//a[normalize-space()='Modify your address book entries']"));
	WebElement link_edit_wishlist= driver.findElement(By.xpath("//a[normalize-space()='Modify your wish list']"));
		
//Weblements under title='My Orders' 

	WebElement txtheader_myorders= driver.findElement(By.xpath("//h2[normalize-space()='My Orders']"));
	WebElement link_view_orderhistory= driver.findElement(By.xpath("//a[normalize-space()='View your order history']"));
	WebElement link_downloads= driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[normalize-space()='Downloads']"));
	WebElement link_rewardpoints= driver.findElement(By.xpath("//a[normalize-space()='Your Reward Points']"));
	WebElement link_view_returnreqs= driver.findElement(By.xpath("//a[normalize-space()='View your return requests']"));
	WebElement link_transactions= driver.findElement(By.xpath("//a[normalize-space()='Your Transactions']"));
	WebElement link_recurringpayments= driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[normalize-space()='Recurring payments']"));

//Weblements under title='My Affiliate Account' 

	WebElement txtheader_myaffliateaccnt=driver.findElement(By.xpath("//h2[normalize-space()='My Affiliate Account']"));
	WebElement link_register_affliateaccnt= driver.findElement(By.xpath("//a[normalize-space()='Register for an affiliate account']"));

//Weblements under title='Newsletter' 

	WebElement txtheader_newsletter=driver.findElement(By.xpath("//h2[normalize-space()='Newsletter']"));
	WebElement link_newsletter_subscription= driver.findElement(By.xpath("//a[normalize-space()='Subscribe / unsubscribe to newsletter']"));
	
	public String checktxt_MyAccPresent() {
		
		if(txtheader_myaccnt.isDisplayed()) 
		{
			String txtDisplayed_Myaccnt=txtheader_myaccnt.getText();
			return txtDisplayed_Myaccnt;
		}
		else
		{
			return "No Text Displayed"; 
		}		
	}	
	public String checktxt_MyOrdersPresent() {
		
		if(txtheader_myorders.isDisplayed()) 
		{
			String txtDisplayed_Myorders=txtheader_myorders.getText();
			return txtDisplayed_Myorders;
		}
		else
		{
			return "No Text Displayed"; 
		}				
	}		
	public String checktxt_MyAffiliateAccountPresent() {
		
		if(txtheader_myaffliateaccnt.isDisplayed()) 
		{
			String txtDisplayed_Affaccnt=txtheader_myaffliateaccnt.getText();
			return txtDisplayed_Affaccnt;
		}
		else
		{
			return "No Text Displayed"; 
		}			
	}	
	public String checktxt_NewsletterPresent() {
		
		if(txtheader_newsletter.isDisplayed()) 
		{
			String txtDisplayed_Newsletter=txtheader_newsletter.getText();
			return txtDisplayed_Newsletter;
		}
		else
		{
			return "No Text Displayed"; 
		}			
	}
	public String checktxt_link_EditAccntInfo() {
			
		if(link_edit_accntinfo.isDisplayed() && link_edit_accntinfo.isEnabled()) 
		{
			String linktxt_Displayed_Accntinfo=link_edit_accntinfo.getText();
			return linktxt_Displayed_Accntinfo;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}				
	}
	public String checktxt_link_ChangePassword() {
		
		if(link_chnge_password.isDisplayed() && link_chnge_password.isEnabled()) 
		{
			String linktxt_Displayed_Chnge_Password=link_chnge_password.getText();
			return linktxt_Displayed_Chnge_Password;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}			
	}
	public String checktxt_link_ModifyAddressBook() {
		
		if(link_edit_addrbk.isDisplayed() && link_edit_addrbk.isEnabled()) 
		{
			String linktxt_Displayed_Addrbk=link_edit_addrbk.getText();
			return linktxt_Displayed_Addrbk;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}		
	}
	public String checktxt_link_ModifyWishList() {
			
		if(link_edit_wishlist.isDisplayed() && link_edit_wishlist.isEnabled()) 
		{
			String linktxt_Displayed_Wishlist=link_edit_wishlist.getText();
			return linktxt_Displayed_Wishlist;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}			
	}	
	public String checktxt_link_ViewOrderHistory() {
		
		if(link_view_orderhistory.isDisplayed() && link_view_orderhistory.isEnabled()) 
		{
			String linktxt_Displayed_Orderhistory=link_view_orderhistory.getText();
			return linktxt_Displayed_Orderhistory;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}		
	}
	public String checktxt_link_ViewDowloads() {
		
		if( link_downloads.isDisplayed() &&  link_downloads.isEnabled()) 
		{
			String linktxt_Displayed_Downloads= link_downloads.getText();
			return linktxt_Displayed_Downloads;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}
	}
	public String checktxt_link_ViewRewardPoints() {
		
		if(link_rewardpoints.isDisplayed() && link_rewardpoints.isEnabled()) 
		{
			String linktxt_Displayed_Rewardpoints=link_rewardpoints.getText();
			return linktxt_Displayed_Rewardpoints;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}			
	}
	public String checktxt_link_ViewReturnRequests() {
		
		if(link_view_returnreqs.isDisplayed() && link_view_returnreqs.isEnabled()) 
		{
			String linktxt_Displayed_Returnreqs=link_view_returnreqs.getText();
			return linktxt_Displayed_Returnreqs;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}	
	}
	public String checktxt_link_ViewTransactions() {
		
		if(link_transactions.isDisplayed() && link_transactions.isEnabled()) 
		{
			String linktxt_Displayed_Transactions=link_transactions.getText();
			return linktxt_Displayed_Transactions;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}			
	}
	public String checktxt_link_RecurringPayments() {
		
		if(link_recurringpayments.isDisplayed() && link_recurringpayments.isEnabled()) 
		{
			String linktxt_Displayed_Recurringpayments=link_recurringpayments.getText();
			return linktxt_Displayed_Recurringpayments;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}		
	}
	public String checktxt_link_RegisterAffliateAccount() {
		
		if(link_register_affliateaccnt.isDisplayed() && link_register_affliateaccnt.isEnabled()) 
		{
			String linktxt_Displayed_Register_Affaccnt=link_register_affliateaccnt.getText();
			return linktxt_Displayed_Register_Affaccnt;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}			
	}
	public String checktxt_link_ViewNewsletterSubscription() {
		
		if(link_newsletter_subscription.isDisplayed() && link_newsletter_subscription.isEnabled()) 
		{
			String linktxt_Displayed_Newslettersub=link_newsletter_subscription.getText();
			return linktxt_Displayed_Newslettersub;
		}
		else
		{
			return "No Link_Text Displayed or Enabled"; 
		}			
	}
	public void clicklink_Edit_AccountInfo() {
		
		link_edit_accntinfo.click();
	}
	public void clicklink_Change_Password() {
		
		link_chnge_password.click();
	}
	public void clicklink_Modify_AddressBookEntry() {
		
		link_edit_addrbk.click();
	}
	public void clicklink_Modify_WishList() {
		
		link_edit_wishlist.click();
	}
	public void clicklink_View_OderHistory() {
		
		link_view_orderhistory.click();
	}
	public void clicklink_View_OrderDownloads() {
		
		link_downloads.click();
	}
	public void clicklink_View_RewardPoints() {
		
		link_rewardpoints.click();
	}
	public void clicklink_View_ReturnRequests() {
		
		link_view_returnreqs.click();
	}
	public void clicklink_View_Transactions() {
		
		link_transactions.click();
	}
	public void clicklink_View_RecurringPayments() {
		
		link_recurringpayments.click();
	}
	public void clicklink_Register_AffliateAccount() {
		
		link_register_affliateaccnt.click();
	}
	public void clicklink_NewsletterSubscription() {
		
		link_newsletter_subscription.click();
	}
		
}

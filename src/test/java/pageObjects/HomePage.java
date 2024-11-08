package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	
	//Page Object Classes have a constructor,locators and actions
	
	//Constructor
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	//WebElement Locators
	
	WebElement link_myAcc= driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
	WebElement link_register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	WebElement link_login=driver.findElement(By.xpath("//a[normalize-space()='Login']"));
	WebElement txtbox_search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	WebElement btn_searchicon=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
	
	//WebElement Actions
	
	public void click_myAccount() {
		link_myAcc.click();
	}
	public void click_register() {
		link_register.click();
	}
	public void click_login() {
		link_login.click();
	}
	public void enter_SearchText(String searchtxt) {
		txtbox_search.clear();
		txtbox_search.sendKeys(searchtxt);
	}
	public void click_SearchIconBtn() {
		btn_searchicon.click();}
	
	
	
	
	
	
	
	
}

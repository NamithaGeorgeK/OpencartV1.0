package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountPage extends BasePage  {
	
	
	public RegisterAccountPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	WebElement txtbx_firstName= driver.findElement(By.xpath("//input[@id='input-firstname']"));
	WebElement txtbx_lastName= driver.findElement(By.xpath("//input[@id='input-lastname']"));
	WebElement txtbx_email= driver.findElement(By.xpath("//input[@id='input-email']"));
	WebElement txtbx_telephone= driver.findElement(By.xpath("//input[@id='input-telephone']"));
	WebElement txtbx_password= driver.findElement(By.xpath("//input[@id='input-password']"));
	WebElement txtbx_confpassword= driver.findElement(By.xpath("//input[@id='input-confirm']"));
	WebElement radiobtn_Newsltr_subscribe_no= driver.findElement(By.xpath("//label[normalize-space()='No']"));
	WebElement radiobtn_Newsltr_subscribe_yes=driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
	WebElement chkbx_privacypolicy= driver.findElement(By.xpath("//input[@name='agree']"));
	WebElement btn_continue_AccRegPage= driver.findElement(By.xpath("//input[@value='Continue']"));
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	@FindBy(xpath = "//a[normalize-space()='Continue']")
	WebElement btn_continue_registersuccess;
	//WebElement btn_continue_registersuccess= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div"));
	public void setFirstName(String fname) {
		txtbx_firstName.sendKeys(fname);
	}
	public void setLastName(String lname) {
		txtbx_lastName.sendKeys(lname);
	}
	public void setEmail(String email) {
		txtbx_email.sendKeys(email);
	}
	public void setTelephone(String phone) {
		txtbx_telephone.sendKeys(phone);
	}
	public void setPassword(String pwd) {
		txtbx_password.sendKeys(pwd);
	}
	public void setConfPassword(String pwd) {
		txtbx_confpassword.sendKeys(pwd);
	}
	public void set_NewsSubscription() {
		if(!radiobtn_Newsltr_subscribe_no.isSelected()) 
		{
			radiobtn_Newsltr_subscribe_yes.click();
		}
		else
		{
			radiobtn_Newsltr_subscribe_no.click();
		}
	}
	public void set_PrivacyPolicy() {
		chkbx_privacypolicy.click();
	}
	public void click_Continue_AccountRegisterPage() {
		btn_continue_AccRegPage.click();
	}
	
	
	public String getRegistrationSuccessMsg() {
		
		try {
		
			return(msgConfirmation.getText());
		}
		catch(Exception e) {
			
			return (e.getMessage());
		}
	}
	
	public void click_Continue_RegisterSuccessPage() {
		btn_continue_registersuccess.click();
	}








	
	
	
	
	
	

}

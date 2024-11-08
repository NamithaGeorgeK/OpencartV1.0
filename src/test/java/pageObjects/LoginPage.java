package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	  		
		public LoginPage(WebDriver driver) {
			
			super(driver);
		}
		
		WebElement txtbx_login_email= driver.findElement(By.xpath("//input[@id='input-email']")) ;
		WebElement txtbx_login_pwd= driver.findElement(By.xpath("//input[@id='input-password']")) ;
		WebElement link_forgottenPwd= driver.findElement(By.xpath("//div[@class='form-group']//a[normalize-space()='Forgotten Password']"));
		WebElement btn_login= driver.findElement(By.xpath("//input[@value='Login']"));
		WebElement btn_continue_registrationpg= driver.findElement(By.xpath("//a[normalize-space()='Continue']"));
		
		public void setEmail(String email) {
			txtbx_login_email.sendKeys(email);
		}
		
		public void setPassword(String pwd) {
			txtbx_login_pwd.sendKeys(pwd);
		}
		
		public void click_Login() {
			btn_login.click();
		}
		
		public void clicklink_ForgottenPassword() {
			link_forgottenPwd.click();
		}

		
		public void moveto_RegistrationPage() {
			btn_continue_registrationpg.click();
		}




		
		





















}

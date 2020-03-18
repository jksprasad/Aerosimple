package com.aerosimple.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aerosimple.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="loginPassword")
	WebElement password;
	
	@FindBy(xpath="//*[@class='login_button__mWumr']")
	WebElement loginbtn;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String usr, String pwd) {
		
		email.sendKeys(usr);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
		
	}
	
	
	

}

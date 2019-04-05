package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {

	
	@FindBy(name="username") WebElement username;
	
	@FindBy(name="password") WebElement password;
	
	@FindBy(xpath="//input[@type='submit']") WebElement loginbtn;
	
	
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		
		return driver.getTitle();
		
	}
	
	
	public Homepage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new Homepage();
		
	}
}

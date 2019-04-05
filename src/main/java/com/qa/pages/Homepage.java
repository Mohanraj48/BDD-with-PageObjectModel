package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class Homepage extends TestBase{
	
	
	@FindBy(xpath="//td[contains(text(),'User: Mukesh Otwani')]") WebElement UserNameLable;
	
	public Homepage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyUserName(){

		return UserNameLable.isDisplayed();
	}

}

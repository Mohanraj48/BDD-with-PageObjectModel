package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.Homepage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageSteps extends TestBase {
	LoginPage loginpage;
	Homepage homepage;
	
	@Given("^user open the browser$")
	public void user_open_the_browser() throws Throwable {
	 TestBase.initialization();   
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginpage=new LoginPage();
		String title=loginpage.validateLoginPageTitle();
		
	}

	@Then("^user log into app$")
	public void user_log_into_app() throws Throwable {
	    
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	
	

}

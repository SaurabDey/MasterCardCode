package com.org.MasterCardCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinationMasterCard {

	
	WebDriver driver;
	@Given("^I have opened the mastercard developer site$")
	public void i_have_opened_the_site() throws Throwable {
		System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://developer.mastercard.com/account/log-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@When("I click on the link and check it should get loaded")
	public void tryingMethod(DataTable data) throws Throwable {
		 List<List<String>> values=data.raw();
		 
		 System.out.println(values.size());
		 PageLoadClass pageLoadClass=new PageLoadClass(driver);
		for (int i = 0; i < values.size(); i++) {
			pageLoadClass.clickOnLink(values.get(i).get(0));
			pageLoadClass.checkIfPageIsLoaded(values.get(i).get(0));
		}
		
	}
	
	@Then("^close the browser$")
	public void i_should_get_logged_in() throws Throwable {

		driver.quit();
	}
}

package com.org.MasterCardCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLoadClass {
	WebDriver driver;
	
	
	public PageLoadClass(WebDriver driver)
	{
		this.driver= driver;
	}

	public void clickOnLink(String link)
	{
	
			WebElement linkToClick=driver.findElement(By.xpath("//a[text()='"+link+"']"));
			linkToClick.click();
	}
	public void checkIfPageIsLoaded(String link)
	{
		try {
			String  pageLoadStatus;
			do {

				JavascriptExecutor js = (JavascriptExecutor) driver;

				pageLoadStatus = (String)js.executeScript("return document.readyState");

				} while ( !pageLoadStatus.equals("complete") );
			
			System.out.println(link+ " Page is loaded.");
			
		} catch (Exception e) {
			System.out.println(link+ " Page is not loaded "+ e);
		}
		
	}
}

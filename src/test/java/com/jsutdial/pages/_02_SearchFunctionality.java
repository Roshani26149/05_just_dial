package com.jsutdial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.justdial.core.WebDriverFactory;

public class _02_SearchFunctionality {
	
	private WebDriver driver;
	 
	//Parameterized constructor
	public _02_SearchFunctionality(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators
	private By Search_text =By.id("srchbx");
	private By Search_btn =By.id("srIconwpr");
	
	//Actions
	public void search_text(String searchname) throws Exception {
		driver.findElement(Search_text).sendKeys(searchname);
		Thread.sleep(5000);
	
	}
	
	public void Click_search() throws Exception {
		driver.findElement(Search_btn).click();
		 WebDriverFactory.switchBrowserToTab();
		 Thread.sleep(3000);
	}
	
	public void Partial_search(String resta) {
		driver.findElement(Search_text).sendKeys(resta);
	}
	public void Select_All_link() {
		Select select =new Select(driver.findElement(Search_text));
		
	}
	
	
	
	

}

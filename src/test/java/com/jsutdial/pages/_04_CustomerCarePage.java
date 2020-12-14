package com.jsutdial.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_CustomerCarePage {
	private WebDriver driver;

	public _04_CustomerCarePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	//Locators
	private By customer_care =By.xpath("//a[@class='cscare ']");
	private By input_field =By.id("what");
	
	//Actions
	
	public void click_on_customer_link() throws Exception {
		driver.findElement(customer_care).click();
		Thread.sleep(4000);
	}
	public void input_field(String test) {
		driver.findElement(input_field).sendKeys(test);
	}

	public void Select_All_link() {
		Select sel =new Select(driver.findElement(input_field));
		List<WebElement> dropList =sel.getOptions();
		
		for(WebElement a :dropList) {
			System.out.println(a);
		}
		
	}
	
}

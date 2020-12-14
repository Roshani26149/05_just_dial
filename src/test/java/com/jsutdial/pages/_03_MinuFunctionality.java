package com.jsutdial.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _03_MinuFunctionality {
	private WebDriver driver;
	
	//Parameterized constructor
	public _03_MinuFunctionality(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators
	//private By baby_care =By.xpath("//span[@class='hotkeys_sprite hotkeys-icon babyc-icon']");
	private By minu_list =By.xpath("//a[contains(@id,'ContextualHotkey')]");
	
	//Actions
	public void Select_minu_List(String product) {
		
		 List<WebElement> list=driver.findElements(minu_list);
       //  System.out.println(list.size());
		 WebDriverWait wait=new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.elementToBeClickable(minu_list));
          
         for(int i=0;i<list.size();i++) {
       	 // System.out.println(list.get(i).getText());
       	  if(list.get(i).getText().contains(product))
       	  {
       		   list.get(i).click();
       	  }
         }
		
	}
	

}

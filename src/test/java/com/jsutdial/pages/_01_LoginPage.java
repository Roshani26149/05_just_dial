package com.jsutdial.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class _01_LoginPage {

	private WebDriver driver;
	private static final Logger logger = LogManager.getLogger(_01_LoginPage.class);

	//Parameterized constructor
	public _01_LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	//Locators
	private By sign_up =By.id("h_sin_up");
	private By login_name=By.id("lgn_name");
	private By login_mob =By.id("lgn_mob");
	private By login_submit =By.id("lgn_smtn");
	private By OTP_is_sent_on_number=By.xpath("//div[@class='otp-text wrapper pb-10']");
	private By h_login_tab =By.id("h_login");
	private By Error_msg =By.xpath("//div[@class='error dn wrapper']");


	//Actions 
	public void Click_On_Sign_in() throws Exception {
		driver.findElement(sign_up).click();
		Thread.sleep(4000);
		logger.info("Login button clicked");
	}

	public void login_pop_up(String namefield,String mobfield) throws Exception {
		driver.findElement(login_name).sendKeys(namefield);
		Thread.sleep(2000);
		driver.findElement(login_mob).sendKeys(mobfield);
		Thread.sleep(2000);
		driver.findElement(login_submit).click();
		Thread.sleep(2000);

		logger.info("OTP is sent on number is displayed");
	}
	public void msg_display(String msg) {
		String text =driver.findElement(OTP_is_sent_on_number).getText();
		System.out.println("The Messgae dispayed is " +text);
	}

	public void Click_On_Login() throws Exception {
		driver.findElement(h_login_tab).click();
		Thread.sleep(2000);
	}
	public void Enter_name(String name1,String mob1) throws Exception {

		driver.findElement(login_name).sendKeys(name1);
		Thread.sleep(2000);
		driver.findElement(login_mob).sendKeys(mob1);
		Thread.sleep(2000);
		driver.findElement(login_submit).click();
		Thread.sleep(2000);
	}
	public void Error_msg() {
		String error_msg=driver.findElement(Error_msg).getText();
		System.out.println("The message is displayed i.e. - "+error_msg);
	}
	

	public void cheke_mob_field(String num) {
		String attribute =driver.findElement(login_mob).getAttribute("9511824982");
		System.out.println("the value of mob field is "+attribute);
		
		
	}

	
}

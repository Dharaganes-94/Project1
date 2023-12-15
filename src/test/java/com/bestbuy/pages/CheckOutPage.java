package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers;

public class CheckOutPage extends Sewrappers{
	
	@FindBy(xpath="//button[text()='Checkout']")
	public WebElement checkbutton;
	
	@FindBy(xpath="//button[text()='Continue as Guest']")
	public WebElement continuebutton;
	
	@FindBy(xpath="//input[@id='user.emailAddress']")
	public WebElement useremail;
	
	@FindBy(xpath="//input[@id='user.phone']")
	public WebElement userNo; 
	
	@FindBy(xpath="//input[@id='text-updates']")
	public WebElement textButton;
	
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	public WebElement paymentinfo;
	
	public void clickCheckoutButton()
	{
		waitForElement(checkbutton,20);
		clickElement(checkbutton);
	}
	
	public void clickContinueGuestButton()
	{
		waitForElement(continuebutton,20);
		clickElement(continuebutton);
	}
	
	public void setUserEmail(String email)
	{
		waitForElement(useremail,20);
		typeText(useremail,email);
	}
	
	public void setUserPhone(String phone)
	{
		waitForElement(userNo,20);
		typeText(userNo,phone);
	}
	
	public void clickTextUpdateButton()
	{
		waitForElement(textButton,20);
		clickElement(textButton);
	}
	
	public void clickPaymentButton()
	{
		waitForElement(paymentinfo,20);
		clickElement(paymentinfo);
	}
	
	

}

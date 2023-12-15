package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers;

public class WebPage extends Sewrappers {
	
	@FindBy(xpath="//h4[text()='United States']")
	public WebElement unitedstates;
	
	
	public void clickButton ()
	{
		waitForElement(unitedstates,20);
		clickElement(unitedstates);
	}

}

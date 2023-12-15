package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers;

public class NavigationMenuPage extends Sewrappers {
	
	@FindBy(xpath="//button[text()='Menu']")
	public WebElement menuButton;
	
	public void clickMenuButton()
	{
		waitForElement(menuButton,20);
		clickElement(menuButton);
	}

}

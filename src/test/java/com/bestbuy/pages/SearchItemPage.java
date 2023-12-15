package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers;

public class SearchItemPage extends Sewrappers{
	
	@FindBy(xpath="//input[@id='gh-search-input']")
	public WebElement searchBox;
	
	@FindBy(xpath="//button[@title='submit search']")
	public WebElement submitSearch;
	
	@FindBy(xpath="//span[text()='Amazfit - Bip 3 Pro Smartwatch 42.9mm Polycarbonate Plastic - Black']")
	public WebElement searchedItem;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	public WebElement cartButton;
	
	@FindBy(xpath="//span[text()='Cart']")
	public WebElement addCart;
	
	
	public void setSearchText(String text)
	{
		waitForElement(searchBox,20);
		typeText(searchBox,text);
	}
	
	public void clickSubmitButton()
	{
		waitForElement(submitSearch,20);
		clickElement(submitSearch);
	}
	
	public void clickSearchItem()
	{
		waitForElement(searchedItem,20);
		clickElement(searchedItem);
	}
	
	public void clickCartItem()
	{
		waitForElement(cartButton,20);
		clickElement(cartButton);
	}
	
	public void clickAddedCartItem()
	{
		waitForElement(addCart,20);
		clickElement(addCart);
	}
	

	
	
	
	
	
	
	
	
	
	//https://shorturl.at/cquMW

}

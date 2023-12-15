package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers;

public class AddCartPage extends Sewrappers{
	
	@FindBy(xpath="//button[text()='Menu']")
	public WebElement menuSearch;
		
	@FindBy(xpath="//button[text()='Appliances']")
	public WebElement appliancess;
	
	@FindBy(xpath="//button[text()='Major Kitchen Appliances']")
	public WebElement kitchenItems;
	
	@FindBy(xpath="//a[text()='Refrigerators']")
	public WebElement fridge;
	
	@FindBy(xpath="//a[text()='Side-by-side refrigerators']")
    public WebElement sideFridge;	
	
	@FindBy(xpath="//span[text()='LG - 27 Cu. Ft. Side-by-Side Smart Refrigerator with Craft Ice - Stainless Steel']")
	public WebElement smartFridge;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	public WebElement addFridge;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	public WebElement cart;
	
	@FindBy(xpath="//button[@class='c-close-icon c-modal-close-icon']")
	public WebElement cIcon;
	
	
	public void clickMenuLink()
	{
		waitForElement(menuSearch,20);
		clickElement(menuSearch);
	}
	
	public void clickApplianceButton() 
	{
		waitForElement(appliancess,20);
		clickElement(appliancess);
	}
	
	public void clickKitchenAppliances() 
	{
		waitForElement(kitchenItems,20);
		clickElement(kitchenItems);
	}
	
	public void clickRefrigerators()
	{
	
		waitForElement(fridge,20);
		clickElement(fridge);
		
	}
	
	public void clickSideByRefrigerators()
	{
		waitForElement(sideFridge,20);
		clickElement(sideFridge);
		
	}
	
	public void clickSmartRefrigerators()
	{
		waitForElement(smartFridge,20);
		clickElement(smartFridge);
	}
	
	public void clickAddCart()
	{
		waitForElement(addFridge,20);
		clickElement(addFridge);
	}
	
	public void clickGoToCart()
	{
		waitForElement(cart,20);
		clickElement(cart);
	}
	
	public void clickCloseIcon()
	{
		waitForElement(cIcon,20);
		clickElement(cIcon);
	}

}

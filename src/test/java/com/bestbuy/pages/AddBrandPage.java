package com.bestbuy.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers;

public class AddBrandPage extends Sewrappers{
	
	@FindBy(xpath="//button[text()='Menu']")
	public WebElement menubutton;
	
    @FindBy(xpath="//button[text()='Brands']")
    public WebElement brandbutton;
    
    @FindBy(xpath="//a[text()='Samsung']")
    public WebElement samsungbrand;
    
    @FindBy(xpath="//a[text()='Smartphones']")
    public WebElement smartphone;
    
    @FindBy(xpath="//a[text()='Unlocked Samsung phones']")
    public WebElement unlockphones;
    
    @FindBy(xpath="//a[text()='Samsung - Pre-Owned Galaxy A21 32GB (Unlocked) - Black']")
    public WebElement samasungGalaxy;
    
    @FindBy(xpath="//button[text()='Add to Cart']")
    public  WebElement addcart;
    
    @FindBy(xpath="//a[text()='Go to Cart']")
    public WebElement gotocart;
    
    
	
	
	public void clickMenuButton() 
	{
		waitForElement(menubutton,20);
		clickElement(menubutton);
	}
	
	public void clickBrandButton()
	{
		waitForElement(brandbutton,20);
		clickElement(brandbutton);
	}
	
	public void clickBrandSamsungButton()
	{
		waitForElement(samsungbrand,20);
		clickElement(samsungbrand);
	}
	
	public void clickSmartPhoneButton()
	{
		waitForElement(smartphone,20);
		clickElement(smartphone);
	}
	
	public void clickUnlockedSamsungPhone()
	{
		waitForElement(unlockphones,20);
		clickElement(unlockphones);
	}
	
	public void clickSamsungGalaxy()
	{
		waitForElement(samasungGalaxy,20);
		clickElement(samasungGalaxy);
	}
	
	public void clickAddCart()
	{
		
		waitForElement(addcart,30);
		clickElement(addcart);
	}
	
	public void clickGoToCart()
	{
		waitForElement(gotocart,20);
		clickElement(gotocart);
	}
	


}

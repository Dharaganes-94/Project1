package com.bestbuy.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.pages.SearchItemPage;
import com.bestbuy.pages.AddBrandPage;
import com.bestbuy.pages.AddCartPage;
import com.bestbuy.pages.CheckOutPage;
import com.bestbuy.pages.NavigationMenuPage;
import com.bestbuy.pages.WebPage;

public class Bestbuywrappers extends Sewrappers{
	
	public void WebPageNavigation()
	{
		WebPage webpage = PageFactory.initElements(driver, WebPage.class);
		NavigationMenuPage menuPage = PageFactory.initElements(driver, NavigationMenuPage.class);
		webpage.clickButton();
		menuPage.clickMenuButton();
	}
		
	public void SearchItem(String text) 
	
	{
		SearchItemPage cartPage = PageFactory.initElements(driver, SearchItemPage.class);
		
		cartPage.setSearchText(text);
		cartPage.clickSubmitButton();
		
		
	}
	
	public void  AddToCart()
	{
		SearchItemPage cartItem = PageFactory.initElements(driver, SearchItemPage.class);
		cartItem.clickSearchItem();
		cartItem.clickCartItem();
		cartItem.clickAddedCartItem();
		
	}
		
	public void AddToCartFromMenu()
	{
			
		
	
		AddCartPage addCartPage =PageFactory.initElements(driver, AddCartPage.class);
			
		
		addCartPage.clickMenuLink();
		addCartPage.clickApplianceButton();
		addCartPage.clickKitchenAppliances();
		addCartPage.clickRefrigerators();
		addCartPage.clickSideByRefrigerators();
		addCartPage.clickSmartRefrigerators();
		addCartPage.clickAddCart();
		addCartPage.clickGoToCart();
		addCartPage.clickCloseIcon();
	}
	
	public void AddBrandItems()
	{
		AddBrandPage brandPage =PageFactory.initElements(driver, AddBrandPage.class);
		
		brandPage.clickMenuButton();
		brandPage.clickBrandButton();
		brandPage.clickBrandSamsungButton();
		brandPage.clickSmartPhoneButton();
		brandPage.clickUnlockedSamsungPhone();
		brandPage.clickSamsungGalaxy();
		brandPage.clickAddCart();
		brandPage.clickGoToCart();
	}
	
	public void CheckOutProcess(String email, String phone)
	{
		CheckOutPage checkoutPage = PageFactory.initElements(driver, CheckOutPage.class);
		
		checkoutPage.clickCheckoutButton();
		checkoutPage.clickContinueGuestButton();
		checkoutPage.setUserEmail(email);
		checkoutPage.setUserPhone(phone);
		checkoutPage.clickTextUpdateButton();
		checkoutPage.clickPaymentButton();
	}
	
	}
	
	



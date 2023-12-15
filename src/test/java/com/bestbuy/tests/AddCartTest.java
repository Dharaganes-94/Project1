package com.bestbuy.tests;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.bestbuy.utils.Bestbuywrappers;
import com.bestbuy.utils.Sewrappers;
import com.bestbuy.utils.Reports;

public class AddCartTest extends Sewrappers{
	
	Bestbuywrappers bestbuy = new Bestbuywrappers();
	Reports report = new Reports();

	@Test
	public void searchedItem()
	{
		try
		{
			report.setTCDesc("Adding the items to the cart");
			launchBrowser("https://www.bestbuy.com/?intl=nosplash");
			bestbuy.SearchItem("Watch");
			bestbuy.AddToCart();
			
	String cartItem = driver.findElement(By.xpath("//a[text()='Amazfit - Bip 3 Pro Smartwatch 42.9mm Polycarbonate Plastic - Black']")).getText();
    System.out.println("The added item name is --->"+cartItem);

	   if(cartItem.contains(cartItem))
	   {
		   
		   System.out.println("The item was sucessfully added to the cart");
		   Reports.reportStep("INFO", "Successfully added the items to the cart");
	   }
	   
	   else 
	   {
		   System.out.println("The item not added to the cart");
	   }	   
	   
			
		}
		catch(Exception ex)
		{
			System.out.println("Problem in adding items to cart");
			ex.printStackTrace();
		}
		
	
	

}
}

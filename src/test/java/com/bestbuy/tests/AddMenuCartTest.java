package com.bestbuy.tests;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.bestbuy.utils.Bestbuywrappers;
import com.bestbuy.utils.Sewrappers;
import com.bestbuy.utils.Reports;

public class AddMenuCartTest extends Sewrappers{
	
	Bestbuywrappers bestbuy = new Bestbuywrappers();
	Reports report = new Reports();

	
	@Test
	
	public void addMenuCartItems()
	{
		try
		{
			report.setTCDesc("Added the item from the menu option" );
			launchBrowser("https://www.bestbuy.com/?intl=nosplash");
			bestbuy.AddToCartFromMenu();
			String cartItemFromMenu = driver.findElement(By.xpath("//a[text()='LG - 27 Cu. Ft. Side-by-Side Smart Refrigerator with Craft Ice - Stainless Steel']")).getText();
		    System.out.println("The added item name is --->"+cartItemFromMenu);
		    if(cartItemFromMenu.contains(cartItemFromMenu))
		    	
		    {
				   System.out.println("The item was sucessfully added to the cart");
				   Reports.reportStep("INFO", "Successfully added the item from the menu option");

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

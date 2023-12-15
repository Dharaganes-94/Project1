package com.bestbuy.tests;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bestbuy.utils.Bestbuywrappers;
import com.bestbuy.utils.Sewrappers;
import com.bestbuy.utils.Reports;

public class AddBrandCartTest extends Sewrappers{
	
	Bestbuywrappers bestbuy = new Bestbuywrappers();
	Reports report = new Reports();

	
	@Test
	
	public void addBrandItemsToCart()
	{
		try
		{
			report.setTCDesc("Added the Branded items to the cart");
			launchBrowser("https://www.bestbuy.com/?intl=nosplash");
			bestbuy.AddBrandItems();
			
			String cartItem = driver.findElement(By.xpath("//a[text()='Samsung - Pre-Owned Galaxy A21 32GB (Unlocked) - Black']")).getText();
			System.out.println("The added  cart item name----->"+cartItem);
			if(cartItem.contains(cartItem))
			{
				   System.out.println("The item was sucessfully added to the cart");
				   Reports.reportStep("INFO", "Successfully added the Brand items to the cart");

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



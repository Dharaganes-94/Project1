package com.bestbuy.tests;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bestbuy.utils.Bestbuywrappers;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.Sewrappers;


public class WebPageTest extends Sewrappers{
	
	Bestbuywrappers bestbuy = new Bestbuywrappers();
	Reports report = new Reports();
	
	@Test
	public void navigateToWebpage()
	{
		try
		{
			report.setTCDesc("Validating the given URL and Title in the Menu Page ");
			launchBrowser("https://www.bestbuy.com/");
			bestbuy.WebPageNavigation();
			
			//Validating the given URL link is broken
			
			Assert.assertTrue(driver.getTitle().equals("Best Buy | Official Online Store | Shop Now & Save"));
			System.out.println("Assertion Passed");
			System.out.println("The given link is broken");
			
			//Validation of title in menu page
			List<WebElement> titlePage= driver.findElements(By.xpath("//ul[@class='hamburger-menu-flyout-list']"));
			for(WebElement eachTitle:titlePage)
			{
				String menuPage =eachTitle.getText();
				System.out.println(menuPage);
			}
			
			Reports.reportStep("INFO", "Assertion passed by title");
			

		}
		catch(Exception ex)
		{
			System.out.println("The given url link  is not broken");
			ex.printStackTrace();
		}
	}

}



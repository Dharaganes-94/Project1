package com.bestbuy.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.bestbuy.utils.Bestbuywrappers;
import com.bestbuy.utils.Sewrappers;
import com.bestbuy.utils.Reports;

public class CheckOutTest extends Sewrappers{
	
	Bestbuywrappers bestbuy = new Bestbuywrappers();
	Reports report = new Reports();

	@Test
	public void navigateToCheckOut() throws IOException
	{
		try 
		{
		 
		 report.setTCDesc("Navigating to the checkout page and done with payement process");	
		 launchBrowser("https://www.bestbuy.com/?intl=nosplash");
		 bestbuy.AddBrandItems();
		 bestbuy.CheckOutProcess("Guviassessment94@gmail.com", "9876543210");
		 
		 Reports.reportStep("INFO", "Successfully naviagated to the payment process");
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest= new File(System.getProperty("user.dir")+"/screenshots/bug2.png");
		 FileUtils.copyFile(src, dest);
		
		}
		catch(Exception ex)
		{
			System.out.println("Problem in checking out");
			ex.printStackTrace();
		}

		
	}


		
	}
		



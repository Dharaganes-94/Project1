package com.bestbuy.tests;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bestbuy.utils.Sewrappers;
import com.bestbuy.utils.Reports;

public class BottomLinkTest extends Sewrappers{
	Reports report = new Reports();
	
	
	@Test
	public void bottomLinks()
	{
		try 
		{
			report.setTCDesc("Validating the Bottom Links");
			launchBrowser("https://www.bestbuy.com/?intl=nosplash");
			
			//Validating the bottom links
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    
		    List<WebElement> links = driver.findElements(By.xpath("//div[@class='flex justify-content-between ']"));
		    for(WebElement eachLink:links)
		    {
		      String bottomLinks =eachLink.getText();
		      System.out.println("The bottom Links in the website--->"+bottomLinks);
		      Reports.reportStep("INFO", "Sucessfully validated the bottom Links");
		    }
		}
		catch(Exception ex)
		{
			System.out.println("Problem in validating the bottom Links");
			ex.printStackTrace();
		}
	}

}

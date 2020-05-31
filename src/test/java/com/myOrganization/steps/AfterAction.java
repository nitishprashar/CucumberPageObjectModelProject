package com.myOrganization.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.myOrganization.utils.SeleniumDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterAction {
	
	@After
	public static void tearDown(Scenario scenario) {
		
    	WebDriver driver=SeleniumDriver.getDriver();
    	System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/png");
          
         }
		
		SeleniumDriver.tearDown();
	}

}

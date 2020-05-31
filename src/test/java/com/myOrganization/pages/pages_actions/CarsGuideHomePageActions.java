package com.myOrganization.pages.pages_actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.myOrganization.pages.pages_locators.CarsGuideHomePageLocators;
import com.myOrganization.utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators= null;
	
	public CarsGuideHomePageActions() {
		
		this.carsGuideHomePageLocators= new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
		
	}
	
	public void moveToBuySellCarsMenu() {
		
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buy_sellCarsLink).perform();
		
	}
	
	public void clickOnCarSearchLink() {
		
		carsGuideHomePageLocators.searchCarsLink.click();
		
	}

	public void clickOnUsedCarslink() {
		
		carsGuideHomePageLocators.usedCarsLink.click();
	}
	
	public void moveToReviewsMenu() {
		
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.reviewsLink).perform();
		
	}
	
	public void moveToNewsMenu() {
		
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.newsLink).perform();
	}
	
	
}

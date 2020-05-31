package com.myOrganization.pages.pages_actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.myOrganization.pages.pages_locators.CarSeachPageLocators;
import com.myOrganization.utils.SeleniumDriver;

public class CarsSeachPageActions {
	
	CarSeachPageLocators carSeachPageLocators= null;
	
	public CarsSeachPageActions() {
		
		this.carSeachPageLocators = new CarSeachPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSeachPageLocators);
		
	}
	
	public void selectCarMake(String carBrand) {
		
		Select select= new Select(carSeachPageLocators.carMakeDropdown);
		select.selectByVisibleText(carBrand);
				
	}
	
	public void selectCarModel(String carModel) {
		
		Select select= new Select(carSeachPageLocators.carModelDropdown);
		select.selectByVisibleText(carModel);
				
	}

	
	public void selectLocation(String location) {
		
		Select select= new Select(carSeachPageLocators.locationsDropdown);
		select.selectByVisibleText(location);
				
	}

	
	public void selectcarPrice(String carPrice) {
		
		Select select= new Select(carSeachPageLocators.carPriceDropdown);
		select.selectByVisibleText(carPrice);
				
	}

	public void clickOnFindMyNextCarButton() {
		
		carSeachPageLocators.findCarButton.click();
	}

}

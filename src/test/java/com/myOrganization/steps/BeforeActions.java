package com.myOrganization.steps;

import com.myOrganization.utils.SeleniumDriver;

import cucumber.api.java.Before;

public class BeforeActions {
	
	@Before
	public static void setUp() {
		
		SeleniumDriver.setUpDriver();
	}

}

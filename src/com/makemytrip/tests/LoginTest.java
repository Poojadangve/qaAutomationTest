package com.makemytrip.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.makemytrip.generic.MasterPage;
import com.makemytrip.pages.LoginPage;

public class LoginTest {

	@Test
	public void doPage() throws Exception {
		LoginPage lp = new LoginPage();
		lp.clickOnLoginAndCreate();
		Thread.sleep(3000);
		lp.clickOnCityFrom();
		Thread.sleep(3000);
		lp.SelectFromCity();
		Thread.sleep(3000);
		lp.selectToCity();
		//lp.moveToCityTo();
		//lp.clickOnToCity();
		//Thread.sleep(3000);
		//lp.SelectToCity();
//		lp.clickDeparture();
//		Thread.sleep(2000);
//		lp.selectDate();
//		Thread.sleep(2000);
//		lp.clickOnReturn();
//		Thread.sleep(3000);
//		lp.selectReturnDate();
//		Thread.sleep(3000);
//		lp.ClickOnTravellersAndClass();
//		lp.selectAdultCount();
//		lp.selectChildrenCount();
//		Thread.sleep(1000);
//		lp.selectInfantsCount();
//		Thread.sleep(1000);
//		lp.clickOnApply();
//		lp.clickOnSearch();
//		Thread.sleep(3000);
//		lp.clickOnTripType();
//		lp.selectTripType();
//		Thread.sleep(3000);
		
	}

//	@AfterClass
//	public void colsePage()
//	{
//		MasterPage.driver.close();
//	}

}

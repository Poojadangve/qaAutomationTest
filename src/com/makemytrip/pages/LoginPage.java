package com.makemytrip.pages;

import com.makemytrip.generic.MasterPage;

public class LoginPage extends MasterPage {

	public LoginPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void clickOnLoginAndCreate() {
		click("LoginOrCreateAcc");
	}

	public void clickOnCityFrom() {
		click("ClickOnfromCity");
	}
	
	public void SelectFromCity()
	{
		selectListFromDropDown("SelectFromCity","ExpectedCityFrom");
	}
	
//	public void moveToCityTo()
//	{
//		moveToElement("clickOnCity");
//	}
//	public void clickOnToCity()
//	{
//		click("clickOnCity");
//	}
//	public void SelectToCity()
//	{
//		selectListFromDropDown("SelectToCity","ExpectedToCity");
//	}
	
	public void selectToCity() throws Exception
	{
		autosuggest("clickOnCity","SendsKey","SelectToCity","ExpectedToCity");
	}
	public void clickDeparture() {
		click("ClickOnDeparture");
	}

	public void selectDate() throws Exception {
		captureDateCalender("Header", "ExpectedMonth", "MonthAndYear", "SelectDate", "ExpectedDate");
	}

	public void clickOnReturn() {
		click("ClickOnReturen");
	}
	
	public void selectReturnDate() throws Exception {
		Thread.sleep(3000);
		captureDateCalender("HeaderReturn", "ExpectedReturnMonth", "MonthAndYearReturn", "SelectDateReturn", "ExpectedReturnDate");
	}

	public void ClickOnTravellersAndClass() {
		click("ClickOnTravellersAndClass");
	}

	public void selectAdultCount() {
		selectListFromDropDown("SelectAdultCount", "ExpectedAdults");
	}

	public void selectChildrenCount() {
		selectListFromDropDown("SelectChildrenCount", "ExpectedChildren");
	}

	public void selectInfantsCount() {
		selectListFromDropDown("SelectInfantscount", "ExpectedInfants");
	}

	public void clickOnApply() {
		click("ClickOnApply");
	}

	public void clickOnSearch() {
		click("Search");
	}

	public void clickOnTripType() {
		click("ClickOnTripType");
	}

	public void selectTripType() {
		selectListFromDropDown("SelectTripType", "ExpectedTrip");
	}

	
}

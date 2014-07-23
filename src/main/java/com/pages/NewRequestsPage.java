package com.pages;

import java.text.ParseException;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class NewRequestsPage extends PageObject {

	@FindBy(css = "input[name='startDate']")
	private WebElementFacade start;

	@FindBy(css = "input[name='endDate']")
	private WebElementFacade end;

	@FindBy(css = "input[value='CO']")
	private WebElementFacade checkHoliday;

	@FindBy(css = "input[value='CF']")
	private WebElementFacade checkPayment;

	@FindBy(css = "input[value='Save']")
	private WebElementFacade save;
	
	@FindBy(css = "input[value='VACATION_WITHOUT_PAYMENT'][type='checkbox']")
	private WebElementFacade checkboxWithoutPayment;
	
	@FindBy(css = "input[value='PENDING'][type='checkbox']")
	private WebElementFacade checkboxPending;
	
	
	
	public CalendarPage calendar;
	
	public VacationMenuPage myRequests;

	public void checkHoliday() {
		element(checkHoliday).waitUntilVisible();
		checkHoliday.click();
	}

	public void checkVacationWithoutPayment() {
		element(checkPayment).waitUntilVisible();
		checkPayment.click();
	}

	public void clikStartDate() {
		element(start).waitUntilVisible();
		start.click();
		
		
	}

	public void clikEndDate() {
		element(end).waitUntilVisible();
		end.click();
		
	}

	public void clikSave() {
		element(save).waitUntilVisible();
		save.click();
	}
	
	public void selectStartDate(int month, int day, int year) throws ParseException{
		calendar.setDate(month, day, year);
	}
	
	public void selectEndDate(int month, int day, int year) throws ParseException{
		element(end).waitUntilVisible();
		calendar.setDate(month, day, year);
		
	}
	
	public void clickRequestsPage(){
		myRequests.click_myRequests();
	}
	
	public void checkWithoutPaymentFilter(){
		element(checkboxWithoutPayment).waitUntilVisible();
		checkboxWithoutPayment.click();
	}
	
	public void checkPendingFilter(){
		element(checkboxPending).waitUntilVisible();
		checkboxPending.click();
	}
	
	public void checkDate(){
		
		 getDriver().findElement(By.linkText("28/07/2014"));
	}
	
	

}
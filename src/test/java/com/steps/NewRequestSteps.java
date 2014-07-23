package com.steps;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.CalendarPage;
import com.pages.NewRequestsPage;

@SuppressWarnings("serial")
public class NewRequestSteps extends ScenarioSteps {

	NewRequestsPage request;
	CalendarPage calendar;
	WebElementFacade display;

	@Step
	public void select_start_date() {
		request.clikStartDate();

	}

	@Step
	public void select_end_date() {
		request.clikEndDate();
	}

	@Step
	public void vacationWithoutPayment() {
		request.checkVacationWithoutPayment();
	}

	@Step
	public void holiday() {
		request.checkHoliday();
	}

	@Step
	public void save() {
		request.clikSave();
	}
	@Step
	public void startDateCalendar(int month, int day, int year) throws ParseException{
		request.selectStartDate(month, day, year);
	}
	@Step
	public void endDateCalendar(int month, int day, int year) throws ParseException{
		
		request.selectEndDate(month, day, year);
	}
	
	@Step
	public void myRequests(){
		request.clickRequestsPage();
	}
	
	@Step
	public void withoutPaymentFilter(){
		request.checkWithoutPaymentFilter();
	}
	
	@Step
	public void pendingFilter(){
		request.checkPendingFilter();
	}
	
	@Step
	public void displayDate(){
		display.containsText("28/07/2014");
		
	}
	
	@Step
	public void checkValidityOfSelectedDate() {
		
	}
	

}

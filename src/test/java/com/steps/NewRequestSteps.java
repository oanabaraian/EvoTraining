package com.steps;

import java.text.ParseException;
import java.util.List;

import org.junit.Assert;

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
	public void startDateCalendar(int month, int day, int year)
			throws ParseException {
		request.selectStartDate(month, day, year);
	}

	@Step
	public void endDateCalendar(int month, int day, int year)
			throws ParseException {

		request.selectEndDate(month, day, year);
	}

	@Step
	public void myRequests() {
		request.clickRequestsPage();
	}

	@Step
	public void withoutPaymentFilter() {
		request.checkWithoutPaymentFilter();
	}

	@Step
	public void pendingFilter() {
		request.checkPendingFilter();
	}

	@Step
	public void checkIfDateIsDisplayed(String myDate) {
		request.checkDateOnPage(myDate);

	}

	@Step
	public void verifyMessage(String message) {
		request.verifyMessage(message);
	}
	
	@Step
	public void withdrawButton(){
		request.withdrawButton();
	}

}

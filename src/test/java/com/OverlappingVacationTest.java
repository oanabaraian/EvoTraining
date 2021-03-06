package com;

import java.text.ParseException;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.CalendarPage;
import com.requirements.Application;
import com.steps.LoginSteps;
import com.steps.MyRequestsSteps;
import com.steps.NewRequestSteps;
import com.steps.VacationMenuSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class OverlappingVacationTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://192.168.1.68:9090/login")
	public Pages pages;

	@Steps
	public LoginSteps loginSteps;
	
	@Steps
	CalendarPage calendar;
	
	@Steps
	MyRequestsSteps myRequestsSteps;

	@Steps
	public NewRequestSteps requestVacation;

	@Steps
	public VacationMenuSteps vacationMenuSteps;

	@Test
	public void createSimpleVacation() throws ParseException {
		loginSteps.login("ciprian.mocian", "test");
		vacationMenuSteps.select_newVacation();
		requestVacation.select_start_date();
		requestVacation.startDateCalendar(7, 23, 2014);
		requestVacation.select_end_date();
		requestVacation.endDateCalendar(7, 25, 2014);
		requestVacation.holiday();
		requestVacation.save();
		requestVacation.verifyMessage("Your request failed to complete.");
	}
	
	/*@Test
	public void calendarRangeValidity(){
		vacationMenuSteps.select_newVacation();
		requestVacation.select_start_date();
		requestVacation.startDateCalendar(7, 25, 2014);
		requestVacation.select_end_date();
		requestVacation.endDateCalendar(7, 24, 2014);
		requestVacation.checkValidityOfSelectedDate();
	}*/
}

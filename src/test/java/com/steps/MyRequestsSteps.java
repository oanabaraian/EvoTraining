package com.steps;

import java.text.ParseException;
import java.util.List;
import java.util.Date;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;

import net.thucydides.core.steps.ScenarioSteps;

import com.pages.MyRequestsPage;

@SuppressWarnings("serial")
public class MyRequestsSteps extends ScenarioSteps {

	MyRequestsPage myRequestsPage;

	@Step
	public void check_futureVacation() {
		myRequestsPage.check_futureVacation();
	}

	@Step
	public void check_oneToFiveDays() {
		myRequestsPage.check_oneToFiveDays();
	}

	@Step
	public void check_fiftyOnePlusDays() {
		myRequestsPage.check_fiftyOnePlusDays();
	}

	@Step
	public void check_allDays() {
		myRequestsPage.check_allDays();
	}

	@Step
	public void apply() {
		myRequestsPage.apply();
	}

	@Step
	public void select_items_per_page(String value) {
		myRequestsPage.select_items_per_page(value);
	}

	@Step
	public void check_holiday_Vacation_Type() {
		myRequestsPage.check_holiday_Vacation_Type();
	}

	@Step
	public void chech_days_number_in_range(int lowValue, int highValue) {
		List<String> daysList = myRequestsPage.get_days_number_list();

		for (String val : daysList) {
			Assert.assertTrue("Days Number not in selected range!!!", lowValue <= Integer.parseInt(val)
							&& highValue >= Integer.parseInt(val));
		}

	}

	@Step
	public void check_future_start_date(Date current_date) throws ParseException {
		List<Date> startDateList = myRequestsPage.get_start_date_list();

		for (Date startDate : startDateList) { 
			Assert.assertTrue("Selected dates are not future dates", current_date.before(startDate));
		}

	}

	@Step
	public void check_vacation_type(String myVacation) {
		List<String> typeVacation = myRequestsPage.check_vacation_type_list();

		for (String val : typeVacation) {
			Assert.assertTrue("Vacation Type resulted after filter apply is not the same with"
							+ " vacation type selected", myVacation.equals(val));
		}
	}

}

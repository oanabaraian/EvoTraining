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
	public void chech_days_number_in_range(int lowValue, int highValue) {
		List<String> daysList = myRequestsPage.get_days_number_list();

		for (String val : daysList) {
			Assert.assertTrue("Days Number not in selected range!!!",
					lowValue <= Integer.parseInt(val)&& highValue >= Integer.parseInt(val));
		}

	}

	@Step
	public void check_future_start_date(Date current_date)
			throws ParseException {
		List<Date> startDateList = myRequestsPage.get_start_date_list();

		for (Date startDate : startDateList) {
			Assert.assertTrue("Selected dates are not future dates",
					current_date.before(startDate));
		}

	}

}

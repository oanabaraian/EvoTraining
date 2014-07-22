package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.VacationMenuPage;

@SuppressWarnings("serial")
public class VacationMenuSteps extends ScenarioSteps {

	VacationMenuPage vacationMenuPage;

	@Step
	public void select_newVacation() {
		vacationMenuPage.click_newVacation();
	}

	@Step
	public void select_myRequest() {
		vacationMenuPage.click_myRequests();
	}

	@Step
	public void select_myFreeDays() {
		vacationMenuPage.click_myFreeDays();
	}

	@Step
	public void select_freeDaysHistory() {
		vacationMenuPage.click_freeDaysHistory();
	}
}

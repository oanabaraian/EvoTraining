package com.steps;

import com.pages.LoginPage;
import com.pages.VacationMenuPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class VacationMenuSteps extends ScenarioSteps {

	LoginPage loginPage;
	VacationMenuPage vacationMenuPage;

    @Step
    public void open() {
    	loginPage.open();
    }
    
    @Step
    public void enter_username(String keyword) {
    	loginPage.enter_username(keyword);
    }
    
    @Step
    public void enter_password(String keyword) {
    	loginPage.enter_password(keyword);
    }
    
    @Step
    public void submit() {
    	loginPage.click_submit();
    }
    
    @Step
    public void select_vacation_tab() {
    	loginPage.click_vacation();
    }
    @Step
    public void select_newVacation()
    {
    	vacationMenuPage.click_newVacation();
    }
    @Step
    public void select_myRequest()
    {
    	vacationMenuPage.click_myRequests();
    }
    @Step
    public void select_myFreeDays()
    {
    	vacationMenuPage.click_myFreeDays();
    }
    @Step
    public void select_freeDaysHistory()
    {
    	vacationMenuPage.click_freeDaysHistory();
    }
    
    
    
    @StepGroup
    public void login(String username, String password) {
    	open();
    	enter_username(username);
    	enter_password(password);
    	submit();
    	select_vacation_tab();
    	
    }
}

package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LoginPage;

@SuppressWarnings("serial")
public class LoginSteps extends ScenarioSteps {

	LoginPage loginPage;

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
    
    @StepGroup
    public void login(String username, String password) {
    	open();
    	enter_username(username);
    	enter_password(password);
    	submit();
    	select_vacation_tab();
    }
}
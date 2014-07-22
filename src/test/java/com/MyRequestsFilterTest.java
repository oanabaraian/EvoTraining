package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.requirements.Application;
import com.steps.LoginSteps;
import com.steps.MyRequestsSteps;
import com.steps.VacationMenuSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class MyRequestsFilterTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://192.168.1.68:9090/login")
    public Pages pages;

    @Steps
    public LoginSteps loginSteps;
    
    @Steps
    public VacationMenuSteps vacationMenuSteps;
    
    @Steps
    MyRequestsSteps myRequestsSteps;


    @Test
    public void createSimpleVacation() {
    	loginSteps.login("ciprian.mocian", "test");
    	vacationMenuSteps.select_myRequest();
    	myRequestsSteps.check_oneToFiveDays();
    	myRequestsSteps.apply();
    	myRequestsSteps.select_items_per_page("75");
    	myRequestsSteps.chech_days_number_in_range(1,5);
    	
    }
} 

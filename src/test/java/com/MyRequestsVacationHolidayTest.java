package com;

import java.text.ParseException;
import java.util.Date;

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
public class MyRequestsVacationHolidayTest {

    @Managed(uniqueSession=true)
    public WebDriver webdriver;
    
    @ManagedPages(defaultUrl="http://192.168.1.68:9090/login")
    public Pages pages;
    
    @Steps
    public LoginSteps loginSteps;
    
    @Steps
    MyRequestsSteps myRequestsSteps;
    
    @Steps
    public VacationMenuSteps vacationMenuSteps;
    
    

    @Test
    public void checkResultsVacationFilter() throws ParseException {
    	loginSteps.login("oana.baraian", "1Nteresant!");
    	vacationMenuSteps.select_myRequest();
    	myRequestsSteps.check_holiday_Vacation_Type();
    	myRequestsSteps.apply();
    	myRequestsSteps.select_items_per_page("75");
    	myRequestsSteps.check_vacation_type("Holiday");
    	
    	
    }


	
} 

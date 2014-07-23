package com.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class MyRequestsPage extends PageObject {

	@FindBy(css = "input.aui-button-input")
	private WebElementFacade applyButton;

	@FindBy(css = "input[value='true']")
	private WebElementFacade futureVacation;
	
	@FindBy(css = "input[value='FIFTH'][type='checkbox']")
	private WebElementFacade oneToFiveDays;
	
	@FindBy(css = "input[value='REST']")
	private WebElementFacade fiftyOnePlusDays;
	
	@FindBy(css = "input[value='all']")
	private WebElementFacade allDays;
	
	@FindBy(css = "select[name*='itemsPerPage']")
	private WebElementFacade selectItemsPerPage;
	
	@FindBy(css="input[value='HOLIDAY'][type='checkbox']") 
			private WebElementFacade holidayCheckBox;

	public void check_futureVacation() {
		element(futureVacation).waitUntilVisible();
		futureVacation.click();
	}

	public void check_oneToFiveDays() {
		element(oneToFiveDays).waitUntilVisible();
		oneToFiveDays.click();
	}

	public void check_fiftyOnePlusDays() {
		element(fiftyOnePlusDays).waitUntilVisible();
		fiftyOnePlusDays.click();
	}

	public void check_allDays() {
		element(allDays).waitUntilVisible();
		allDays.click();
	}
	public void check_holiday_Vacation_Type() {
		element(holidayCheckBox).waitUntilVisible();
		holidayCheckBox.click();
	}

	public void apply() {
		element(applyButton).waitUntilVisible();
		applyButton.click();
	}
	
	public void select_items_per_page(String value) { // ca sa selectez sa se afiseze din start o anumita val(respectiv nr rezultate pe o pagina)
		selectItemsPerPage.selectByValue(value);
	}
	
	public List<String> get_days_number_list(){
		List<WebElement> daysList = getDriver().findElements(By.cssSelector("td[class*='day.number']"));
		
		List<String> stringList = new ArrayList<String>();
		
		for (WebElement dayElem : daysList){
			stringList.add(dayElem.getText());
		}
		
		return stringList;
	}
	
	public List<Date> get_start_date_list() throws ParseException{
		List<WebElement> startDateList=getDriver().findElements(By.cssSelector("td[class*='start.date']"));
	
		List<Date> dateList=new ArrayList<Date>();
		
		for(WebElement dateElem:startDateList){
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		    Date theDate = dateFormat.parse(dateElem.getText());
		    
			dateList.add(theDate);
		}
		
		return dateList;
	}

	// public List<String> getResults() {
	// WebElementFacade DaysList = find(By.tagName("tr"));
	// List<WebElement> results = DaysList.findElements(By.tagName("td(3)"));
	// //return convert(results);
	// return;
	// }

}
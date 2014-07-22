package com.pages;

import java.util.ArrayList;
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

	public void apply() {
		applyButton.click();
	}
	
	public void select_items_per_page(String value) {
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

	// public List<String> getResults() {
	// WebElementFacade DaysList = find(By.tagName("tr"));
	// List<WebElement> results = DaysList.findElements(By.tagName("td(3)"));
	// //return convert(results);
	// return;
	// }

}
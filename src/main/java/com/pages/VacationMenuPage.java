
package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class VacationMenuPage extends PageObject {

    @FindBy(css="ul.nav-list li:nth-child(2) a")
    private WebElementFacade newVacationLink;
    
    @FindBy(css="ul.nav-list li:nth-child(3) a")
    private WebElementFacade myRequestsLink;

    @FindBy(css="ul.nav-list li:nth-child(4) a")
    private WebElementFacade myFreeDaysLink;
    
    @FindBy(css="ul.nav-list li:nth-child(5) a")
    private WebElementFacade freeDaysHistoryLink;

  
    
    public void click_newVacation() {
    	element(newVacationLink).waitUntilVisible();
    	newVacationLink.click();
    }
    
    public void click_myRequests() {
    	element(myRequestsLink).waitUntilVisible();
    	myRequestsLink.click();
    }
    public void click_myFreeDays() {
    	element(myFreeDaysLink).waitUntilVisible();
    	myFreeDaysLink.click();
    }
    public void click_freeDaysHistory() {
    	element(freeDaysHistoryLink).waitUntilVisible();
    	freeDaysHistoryLink.click();
    }
}
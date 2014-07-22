
package com.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class MyRequestsPage extends PageObject {

    
	 @FindBy(css="input.aui-button-input")
	    private WebElementFacade applyButton;
    
    
   

   
  
    
    
  
}
package org.stepdefinition;

import java.util.Arrays;
import java.util.List;

import org.baseutils.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pagerepo.SearchFlightsPageRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFlightsSteps {

	SearchFlightsPageRepo sf=new SearchFlightsPageRepo();
	
	@Given("Launch the application")
	public void lauch_the_application() {
	   BaseClass.driver.get(BaseClass.url);
	}

	@When("Select source and destination")
	public void select_source_and_destination() {
		BaseClass.impWait();
	    sf.getFrom().clear();
	    WebElement from = sf.getFrom();
	   from.sendKeys("chennai"+Keys.ARROW_DOWN);
	   from.click();
	    WebElement dest = sf.getTo();
	    dest.sendKeys("delhi");
	  sf.getSuggestions().get(1).click();
		
	  
	}

	@When("Select departs and return dates")
	public void select_dates_departs_and_return() {
			sf.getDeparts().get(25).click();
			sf.getReturns().get(30).click();
		
	}

	@When("Click and Add traveler details")
	public void add_traveler() {
	    sf.getTraveller().click();
	    BaseClass.impWait();
	    
	    for(int i=1;i<5;i++)
	    {
	    sf.getAdult().click();
	    }
	    for(int i=1;i<3;i++)
	    {
	    	sf.getSeniors().click();
	    }
	    sf.getChildren().click();
	    sf.getInfants().click();
	}

	@When("select classes")
	public void select_classes() {
	   
	   BaseClass.dropDown(sf.getClasses(), "value", "Y");
	   
	}

	@When("click search flights")
	public void click_search_flights() {
	    sf.getSearchflights().click();
	}

	@When("see the Flight Results")
	public void see_the_Flight_Results() throws InterruptedException {
		BaseClass.getWindowHandles(1);
		BaseClass.impWait();
		sf.getAlertclose().click();
		}
	@When("check price and select lower price")
	public void check_price_and_select_lower_price() {
	   String priceLis;
		int priceDetails=0;
	
		List<WebElement> price=sf.getPriceList();
		int[] pl=new int[price.size()];
		for(int i=0;i<price.size();i++)
	    {
	    	 priceLis = price.get(i).getText();
	    	 String pp = priceLis.replaceAll("[^0-9]","");
	    	  priceDetails = Integer.parseInt(pp);
	    	  pl[i]=priceDetails;
	    }
		Arrays.sort(pl);
		for(int i=0;i<price.size();i++)
		{
	    price.get(0).click();
		}
		
	}

	@Then("click continue and move to next page")
	public void click_continue_and_move_to_next_page() {
	   
		sf.getClickContinue().click();
	}




}

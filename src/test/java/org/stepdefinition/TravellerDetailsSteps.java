package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.baseutils.BaseClass;
import org.pagerepo.TravellerDetailsPageRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class TravellerDetailsSteps {
	
	TravellerDetailsPageRepo td=new TravellerDetailsPageRepo();
	
	
	@Given("Land into Purchase page")
	public void land_into_Purchase_page() {
	    System.out.println("Landed into purchase page");
	}

	@When("Enter traveller details")
	public void enter_traveller_details(DataTable table) {
	  
	   	   	
	   List<Map<String,String>> mps = table.asMaps();
	   td.getFname1().sendKeys(mps.get(0).get("firstname"));
	   td.getLname1().sendKeys(mps.get(0).get("lastname"));
	   BaseClass.dropDown(td.getSuffix1(), "index", "0");
	   BaseClass.dropDown(td.getGender1(), "index", "1");
	   BaseClass.dropDown(td.getDobmonth1(), "value", "08");
	   td.getDobday1().sendKeys(mps.get(0).get("day"));
	   td.getDobyear1().sendKeys(mps.get(0).get("year"));
	   
	   td.getFname2().sendKeys(mps.get(1).get("firstname"));
	   td.getLname2().sendKeys(mps.get(1).get("lastname"));
	   BaseClass.dropDown(td.getSuffix2(), "index", "0");
	   BaseClass.dropDown(td.getGender2(), "index", "1");
	   BaseClass.dropDown(td.getDobmonth2(), "value", "12");
	   td.getDobday2().sendKeys(mps.get(1).get("day"));
	   td.getDobyear2().sendKeys(mps.get(1).get("year"));
	   
	   td.getFname3().sendKeys(mps.get(2).get("firstname"));
	   td.getLname3().sendKeys(mps.get(2).get("lastname"));
	   BaseClass.dropDown(td.getSuffix3(), "index", "0");
	   BaseClass.dropDown(td.getGender3(), "index", "2");
	   BaseClass.dropDown(td.getDobmonth3(), "value", "09");
	   td.getDobday3().sendKeys(mps.get(2).get("day"));
	   td.getDobyear3().sendKeys(mps.get(2).get("year"));
	   
	   td.getFname4().sendKeys(mps.get(3).get("firstname"));
	   td.getLname4().sendKeys(mps.get(3).get("lastname"));
	   BaseClass.dropDown(td.getSuffix4(), "index", "0");
	   BaseClass.dropDown(td.getGender4(), "index", "2");
	   BaseClass.dropDown(td.getDobmonth4(), "value", "10");
	   td.getDobday4().sendKeys(mps.get(3).get("day"));
	   td.getDobyear4().sendKeys(mps.get(3).get("year"));
	   
	   td.getFname5().sendKeys(mps.get(4).get("firstname"));
	   td.getLname5().sendKeys(mps.get(4).get("lastname"));
	   BaseClass.dropDown(td.getSuffix5(), "index", "0");
	   BaseClass.dropDown(td.getGender5(), "index", "2");
	   BaseClass.dropDown(td.getDobmonth5(), "value", "08");
	   td.getDobday5().sendKeys(mps.get(4).get("day"));
	   td.getDobyear5().sendKeys(mps.get(4).get("year"));
	
	   td.getFname6().sendKeys(mps.get(5).get("firstname"));
	   td.getLname6().sendKeys(mps.get(5).get("lastname"));
	   BaseClass.dropDown(td.getSuffix6(), "index", "0");
	   BaseClass.dropDown(td.getGender6(), "index", "1");
	   BaseClass.dropDown(td.getDobmonth6(), "value", "12");
	   td.getDobday6().sendKeys(mps.get(5).get("day"));
	   td.getDobyear6().sendKeys(mps.get(5).get("year"));
	   
	   td.getFname7().sendKeys(mps.get(6).get("firstname"));
	   td.getLname7().sendKeys(mps.get(6).get("lastname"));
	   BaseClass.dropDown(td.getSuffix7(), "index", "0");
	   BaseClass.dropDown(td.getGender7(), "index", "2");
	   BaseClass.dropDown(td.getDobmonth7(), "value", "08");
	   td.getDobday7().sendKeys(mps.get(6).get("day"));
	   td.getDobyear7().sendKeys(mps.get(6).get("year"));
	   
	   td.getFname8().sendKeys(mps.get(7).get("firstname"));
	   td.getLname8().sendKeys(mps.get(7).get("lastname"));
	   BaseClass.dropDown(td.getSuffix8(), "index", "0");
	   BaseClass.dropDown(td.getGender8(), "index", "1");
	   BaseClass.dropDown(td.getDobmonth8(), "value", "06");
	   td.getDobday8().sendKeys(mps.get(7).get("day"));
	   td.getDobyear8().sendKeys(mps.get(7).get("year"));
	   
	   td.getFname9().sendKeys(mps.get(8).get("firstname"));
	   td.getLname9().sendKeys(mps.get(8).get("lastname"));
	   BaseClass.dropDown(td.getSuffix9(), "index", "0");
	   BaseClass.dropDown(td.getGender9(), "index", "1");
	   BaseClass.dropDown(td.getDobmonth9(), "value", "02");
	   td.getDobday9().sendKeys(mps.get(8).get("day"));
	   td.getDobyear9().sendKeys(mps.get(8).get("year"));
	}

	@When("Select payment and provide respective details")
	public void select_payment_and_provide_respective_details(DataTable table) {
		List<Map<String,String>> maps = table.asMaps();
		td.getCnum().sendKeys(maps.get(0).get("Cardnumber"));
		BaseClass.dropDown(td.getExpmon(), "value", "09");
	    BaseClass.dropDown(td.getExpyear(), "value", "2025");
	    td.getCvvnum().sendKeys(maps.get(0).get("ccv"));
	    td.getCardholder().sendKeys(maps.get(0).get("cardholder"));
	    BaseClass.dropDown(td.getCountry(), "value", "IN");
	    td.getBilladdress1().sendKeys(maps.get(0).get("address1"));
	    td.getBilladdress2().sendKeys(maps.get(0).get("address2"));
	    td.getCity().sendKeys(maps.get(0).get("city"));
	    td.getContact().sendKeys(maps.get(0).get("contactnumber"));
	    td.getEmail().sendKeys(maps.get(0).get("email"));
	    
	}

	@Then("validate purchace")
	public void validate_purchace() {
	    String actual = td.getPurchase().getText();
	    Assert.assertEquals("Purchase", actual);
	    
	}




}

package org.pagerepo;

import java.util.List;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightsPageRepo {
	
	public SearchFlightsPageRepo()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	@FindBy(id="from1")
	private WebElement From;
	@FindBy(id="to1")
	private WebElement To;
	
	@FindBy(xpath="//*[@id='ui-id-3']//child::li//span")
	private List<WebElement> suggestions;
	
	
	@FindBy(xpath="//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody//tr//td")
	private List<WebElement> departs;
	
	
	@FindBy(xpath="//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody//tr//td")
	private List<WebElement> returns;
	
	@FindBy(id="options")
	private WebElement traveller;
	
	@FindBy(xpath="(//button[@data-trav-type='adults'])[2]")
	private WebElement adult;
	
	@FindBy(xpath="(//button[@data-trav-type='seniors'])[2]")
	private WebElement seniors;
	@FindBy(xpath="(//button[@data-trav-type='children'])[2]")
	private WebElement children;
	@FindBy(xpath="(//button[@data-trav-type='infants'])[2]")
	private WebElement infants;
	
	@FindBy(id="cabin")
	private WebElement classes;
	@FindBy(xpath="//button[contains(text(),'Search Flights')]")
	private WebElement searchflights;
	
	@FindBy(xpath="//div[@class='sc-gikAfH exQzre']//div//div[@class='sc-fnGiBr kCVmbb']")
	private WebElement alertclose;
	
	@FindBy(xpath="//span[@class='sc-fztKhi lfzpWR']//span")
	private List<WebElement> priceList;
	
	@FindBy(xpath="//div[text()='Continue']")
	private WebElement clickContinue;
	
	public WebElement getClickContinue() {
		return clickContinue;
	}
	public List<WebElement> getPriceList() {
		return priceList;
	}
	public WebElement getAlertclose() {
		return alertclose;
	}
	public WebElement getSearchflights() {
		return searchflights;
	}
	public WebElement getClasses() {
		return classes;
	}
	public WebElement getFrom() {
		return From;
	}
	public WebElement getTo() {
		return To;
	}
	
	public List<WebElement> getSuggestions() {
		return suggestions;
	}
	public List<WebElement> getDeparts() {
		return departs;
	}
	public List<WebElement> getReturns() {
		return returns;
	}
	public WebElement getTraveller() {
		return traveller;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getSeniors() {
		return seniors;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getInfants() {
		return infants;
	}
	

}

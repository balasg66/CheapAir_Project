package org.pagerepo;

import java.util.List;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravellerDetailsPageRepo {
	public TravellerDetailsPageRepo()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(xpath="//div[@class='trav']")
	private List<WebElement> travdetails;
	
	public List<WebElement> getTravdetails() {
		return travdetails;
	}
	
	
	@FindBy(id="firstName1")
	private WebElement fname1;
	@FindBy(id="lastName1")
	private WebElement lname1;
	@FindBy(id="suffix1")
	private WebElement suffix1;
	@FindBy(id="gender1")
	private WebElement gender1;
	@FindBy(id="dobMonth1")
	private WebElement dobmonth1;
	@FindBy(id="dobDay1")
	private WebElement dobday1;
	@FindBy(id="dobYear1")
	private WebElement dobyear1;
	
	
	public WebElement getFname1() {
		return fname1;
	}
	public WebElement getLname1() {
		return lname1;
	}
	public WebElement getSuffix1() {
		return suffix1;
	}
	public WebElement getGender1() {
		return gender1;
	}
	public WebElement getDobmonth1() {
		return dobmonth1;
	}
	public WebElement getDobday1() {
		return dobday1;
	}
	public WebElement getDobyear1() {
		return dobyear1;
	}
	@FindBy(id="firstName2")
	private WebElement fname2;
	@FindBy(id="lastName2")
	private WebElement lname2;
	@FindBy(id="suffix2")
	private WebElement suffix2;
	@FindBy(id="gender2")
	private WebElement gender2;
	@FindBy(id="dobMonth2")
	private WebElement dobmonth2;
	@FindBy(id="dobDay2")
	private WebElement dobday2;
	@FindBy(id="dobYear2")
	private WebElement dobyear2;
	
	@FindBy(id="firstName3")
	private WebElement fname3;
	@FindBy(id="lastName3")
	private WebElement lname3;
	@FindBy(id="suffix3")
	private WebElement suffix3;
	@FindBy(id="gender3")
	private WebElement gender3;
	@FindBy(id="dobMonth3")
	private WebElement dobmonth3;
	@FindBy(id="dobDay3")
	private WebElement dobday3;
	@FindBy(id="dobYear3")
	private WebElement dobyear3;
	
	@FindBy(id="firstName4")
	private WebElement fname4;
	@FindBy(id="lastName4")
	private WebElement lname4;
	@FindBy(id="suffix4")
	private WebElement suffix4;
	@FindBy(id="gender4")
	private WebElement gender4;
	@FindBy(id="dobMonth4")
	private WebElement dobmonth4;
	@FindBy(id="dobDay4")
	private WebElement dobday4;
	@FindBy(id="dobYear4")
	private WebElement dobyear4;
	
	@FindBy(id="firstName5")
	private WebElement fname5;
	@FindBy(id="lastName5")
	private WebElement lname5;
	@FindBy(id="suffix5")
	private WebElement suffix5;
	@FindBy(id="gender5")
	private WebElement gender5;
	@FindBy(id="dobMonth5")
	private WebElement dobmonth5;
	@FindBy(id="dobDay5")
	private WebElement dobday5;
	@FindBy(id="dobYear5")
	private WebElement dobyear5;
	
	@FindBy(id="firstName6")
	private WebElement fname6;
	@FindBy(id="lastName6")
	private WebElement lname6;
	@FindBy(id="suffix6")
	private WebElement suffix6;
	@FindBy(id="gender6")
	private WebElement gender6;
	@FindBy(id="dobMonth6")
	private WebElement dobmonth6;
	@FindBy(id="dobDay6")
	private WebElement dobday6;
	@FindBy(id="dobYear6")
	private WebElement dobyear6;
	
	@FindBy(id="firstName7")
	private WebElement fname7;
	@FindBy(id="lastName7")
	private WebElement lname7;
	@FindBy(id="suffix7")
	private WebElement suffix7;
	@FindBy(id="gender7")
	private WebElement gender7;
	@FindBy(id="dobMonth7")
	private WebElement dobmonth7;
	@FindBy(id="dobDay7")
	private WebElement dobday7;
	@FindBy(id="dobYear7")
	private WebElement dobyear7;
	
	@FindBy(id="firstName8")
	private WebElement fname8;
	@FindBy(id="lastName8")
	private WebElement lname8;
	@FindBy(id="suffix8")
	private WebElement suffix8;
	@FindBy(id="gender8")
	private WebElement gender8;
	@FindBy(id="dobMonth8")
	private WebElement dobmonth8;
	@FindBy(id="dobDay8")
	private WebElement dobday8;
	@FindBy(id="dobYear8")
	private WebElement dobyear8;
	
	@FindBy(id="firstName9")
	private WebElement fname9;
	@FindBy(id="lastName9")
	private WebElement lname9;
	@FindBy(id="suffix9")
	private WebElement suffix9;
	@FindBy(id="gender9")
	private WebElement gender9;
	@FindBy(id="dobMonth9")
	private WebElement dobmonth9;
	@FindBy(id="dobDay9")
	private WebElement dobday9;
	@FindBy(id="dobYear9")
	private WebElement dobyear9;

	public WebElement getFname2() {
		return fname2;
	}
	public WebElement getLname2() {
		return lname2;
	}
	public WebElement getSuffix2() {
		return suffix2;
	}
	public WebElement getGender2() {
		return gender2;
	}
	public WebElement getDobmonth2() {
		return dobmonth2;
	}
	public WebElement getDobday2() {
		return dobday2;
	}
	public WebElement getDobyear2() {
		return dobyear2;
	}
	public WebElement getFname3() {
		return fname3;
	}
	public WebElement getLname3() {
		return lname3;
	}
	public WebElement getSuffix3() {
		return suffix3;
	}
	public WebElement getGender3() {
		return gender3;
	}
	public WebElement getDobmonth3() {
		return dobmonth3;
	}
	public WebElement getDobday3() {
		return dobday3;
	}
	public WebElement getDobyear3() {
		return dobyear3;
	}
	public WebElement getFname4() {
		return fname4;
	}
	public WebElement getLname4() {
		return lname4;
	}
	public WebElement getSuffix4() {
		return suffix4;
	}
	public WebElement getGender4() {
		return gender4;
	}
	public WebElement getDobmonth4() {
		return dobmonth4;
	}
	public WebElement getDobday4() {
		return dobday4;
	}
	public WebElement getDobyear4() {
		return dobyear4;
	}
	public WebElement getFname5() {
		return fname5;
	}
	public WebElement getLname5() {
		return lname5;
	}
	public WebElement getSuffix5() {
		return suffix5;
	}
	public WebElement getGender5() {
		return gender5;
	}
	public WebElement getDobmonth5() {
		return dobmonth5;
	}
	public WebElement getDobday5() {
		return dobday5;
	}
	public WebElement getDobyear5() {
		return dobyear5;
	}
	public WebElement getFname6() {
		return fname6;
	}
	public WebElement getLname6() {
		return lname6;
	}
	public WebElement getSuffix6() {
		return suffix6;
	}
	public WebElement getGender6() {
		return gender6;
	}
	public WebElement getDobmonth6() {
		return dobmonth6;
	}
	public WebElement getDobday6() {
		return dobday6;
	}
	public WebElement getDobyear6() {
		return dobyear6;
	}
	public WebElement getFname7() {
		return fname7;
	}
	public WebElement getLname7() {
		return lname7;
	}
	public WebElement getSuffix7() {
		return suffix7;
	}
	public WebElement getGender7() {
		return gender7;
	}
	public WebElement getDobmonth7() {
		return dobmonth7;
	}
	public WebElement getDobday7() {
		return dobday7;
	}
	public WebElement getDobyear7() {
		return dobyear7;
	}
	public WebElement getFname8() {
		return fname8;
	}
	public WebElement getLname8() {
		return lname8;
	}
	public WebElement getSuffix8() {
		return suffix8;
	}
	public WebElement getGender8() {
		return gender8;
	}
	public WebElement getDobmonth8() {
		return dobmonth8;
	}
	public WebElement getDobday8() {
		return dobday8;
	}
	public WebElement getDobyear8() {
		return dobyear8;
	}
	public WebElement getFname9() {
		return fname9;
	}
	public WebElement getLname9() {
		return lname9;
	}
	public WebElement getSuffix9() {
		return suffix9;
	}
	public WebElement getGender9() {
		return gender9;
	}
	public WebElement getDobmonth9() {
		return dobmonth9;
	}
	public WebElement getDobday9() {
		return dobday9;
	}
	public WebElement getDobyear9() {
		return dobyear9;
	}
	
	
	@FindBy(id="ccNum1")
	private WebElement cnum;
	@FindBy(id="expMonth1")
	private WebElement expmon;
	@FindBy(id="expYear1")
	private WebElement expyear;
	@FindBy(id="cvv1")
	private WebElement cvvnum;
	@FindBy(id="paymentName1")
	private WebElement cardholder;
	@FindBy(id="paymentCountry1")
	private WebElement country;
	@FindBy(id="paymentAddress1")
	private WebElement billaddress1;
	@FindBy(id="paymentAddress21")
	private WebElement billaddress2;
	@FindBy(id="paymanetCity1")
	private WebElement city;
	@FindBy(id="paymentState1")
	private WebElement state;
	@FindBy(id="paymentZip1")
	private WebElement zipcode;
	@FindBy(id="paymentPhone1")
	private WebElement contact;
	@FindBy(xpath="//div[@class='flag-dropdown']//ul//li[@class='country']//child::span[@class='country-name']")
	private WebElement countrycode;
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="purchaseBtn")
	private WebElement purchase;

	public WebElement getCnum() {
		return cnum;
	}

	public void setCnum(WebElement cnum) {
		this.cnum = cnum;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public void setExpmon(WebElement expmon) {
		this.expmon = expmon;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public void setExpyear(WebElement expyear) {
		this.expyear = expyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public void setCvvnum(WebElement cvvnum) {
		this.cvvnum = cvvnum;
	}

	public WebElement getCardholder() {
		return cardholder;
	}

	public void setCardholder(WebElement cardholder) {
		this.cardholder = cardholder;
	}

	public WebElement getCountry() {
		return country;
	}

	public void setCountry(WebElement country) {
		this.country = country;
	}

	public WebElement getBilladdress1() {
		return billaddress1;
	}

	public void setBilladdress1(WebElement billaddress1) {
		this.billaddress1 = billaddress1;
	}

	public WebElement getBilladdress2() {
		return billaddress2;
	}

	public void setBilladdress2(WebElement billaddress2) {
		this.billaddress2 = billaddress2;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getState() {
		return state;
	}

	public void setState(WebElement state) {
		this.state = state;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public void setZipcode(WebElement zipcode) {
		this.zipcode = zipcode;
	}

	public WebElement getContact() {
		return contact;
	}

	public void setContact(WebElement contact) {
		this.contact = contact;
	}

	public WebElement getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(WebElement countrycode) {
		this.countrycode = countrycode;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPurchase() {
		return purchase;
	}

	public void setPurchase(WebElement purchase) {
		this.purchase = purchase;
	}
	
	
}

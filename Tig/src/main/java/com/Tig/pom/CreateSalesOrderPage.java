package com.Tig.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSalesOrderPage {
@FindBy(xpath="//input[@name='subject']")
private WebElement Subjecttb;

@FindBy(xpath="//input[@id='customerno']")
private WebElement Customernotb;

@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[2]")
private WebElement QuoteNamebn;

@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[3]")
private WebElement ContactNamebn;

@FindBy(xpath="//a[@href='javascript:window.close();']")
private WebElement QuotesSubjectname;

@FindBy(xpath="//a[@href='javascript:window.close();']")
private WebElement Contactname;

@FindBy(xpath="//a[@href='javascript:window.close();']")
private WebElement Opportunityname;

@FindBy(xpath="//a[@href='javascript:window.close();']")
private WebElement Organizationname;

@FindBy(xpath="//select[@name='carrier']")
private WebElement Carrierdropdn;

@FindBy(xpath="//select[@name='sostatus']")
private WebElement Statusdropdn;

@FindBy(xpath="//input[@id='exciseduty']")
private WebElement Excisedutytb;

@FindBy(xpath="//input[@value='U']")
private WebElement Userradiobn;

@FindBy(xpath="//input[@value='T']")
private WebElement Groupradiobn;

@FindBy(xpath="//select[@name='assigned_user_id']")
private WebElement Assignedtodropdn;

@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[1]")
private WebElement OpportunityNamebn;

@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[4]")
private WebElement OrganizationNamebn;

@FindBy(xpath="//input[@id='vtiger_purchaseorder']")
private WebElement PurchaseOrdertb;

@FindBy(xpath="//input[@name='duedate']")
private WebElement duedatetb;

@FindBy(xpath="//input[@id='pending']")
private WebElement Pendingtb;

@FindBy(xpath="//input[@name='enable_recurring']")
private WebElement Enablereccuringcheckbox;

@FindBy(xpath="//input[@name='start_period']")
private WebElement Startperiodtb;

@FindBy(xpath="//input[@name='end_period']")
private WebElement Endperiodtb;

@FindBy(xpath="//select[@name='payment_duration']")
private WebElement Payementdurationdropdn;

@FindBy(xpath="//select[@name='recurring_frequency']")
private WebElement Frequencydropdn;

@FindBy(xpath="//select[@name='invoicestatus']")
private WebElement InvoiceStatusDropdn;

@FindBy(xpath="(//input[@name='cpy'])[1]")
private WebElement Copyshippingaddressradiobn;

@FindBy(xpath="(//input[@name='cpy'])[2]")
private WebElement CopyBillingaddressradiobn;

@FindBy(xpath="//input[@id='bill_city']")
private WebElement BillingCitytb;

@FindBy(xpath="//textarea[@name='ship_street']")
private WebElement Shippingaddressta;

@FindBy(xpath="//textarea[@name='bill_street']")
private WebElement Billingaddressta;

@FindBy(xpath="//input[@id='bill_pobox']")
private WebElement Billpoboxtb;

@FindBy(xpath="//input[@id='bill_state']")
private WebElement Billstatetb;

@FindBy(xpath="//input[@id='bill_code']")
private WebElement Billcodetb;

@FindBy(xpath="//input[@id='bill_country']")
private WebElement Billcountrytb;

@FindBy(xpath="//input[@id='ship_pobox']")
private WebElement Shippoboxtb;

@FindBy(xpath="//input[@id='ship_city']")
private WebElement Shippingcitytb;

@FindBy(xpath="//input[@id='ship_state']")
private WebElement Shippingstatetb;

@FindBy(xpath="//input[@id='ship_code']")
private WebElement Shippingpostalcodetb;

@FindBy(xpath="//input[@id='ship_country']")
private WebElement Shippingcountrytb;

@FindBy(xpath="//textarea[@name='terms_conditions']")
private WebElement termsandconditionta;

@FindBy(xpath="//textarea[@name='description']")
private WebElement descriptionta;

@FindBy(xpath="//img[@id='searchIcon1']")
private WebElement Productsbn;

@FindBy(xpath="//a[@href='javascript:window.close();']")
private WebElement Productname;

@FindBy(xpath="//input[@id='qty1']")
private WebElement Qtytb;

@FindBy(xpath="//input[@id='listPrice1']")
private WebElement listpricetb;

@FindBy(xpath="//input[@value='Add Product']")
private WebElement AddProductbn;

@FindBy(xpath="//input[@value='Add Service']")
private WebElement AddServicebn;

@FindBy(xpath="//input[@value='  Save  ']")
private WebElement Savebn;

@FindBy(xpath="//input[@value='  Cancel  ']")
private WebElement Cancelbn;

@FindBy(xpath="//img[@id='searchIcon2']")
private WebElement Servicesbn;

@FindBy(xpath="//a[@href='javascript:window.close();']")
private WebElement ServiceName;

@FindBy(xpath="//input[@class='crmbutton small edit']")
private WebElement Editbn;

@FindBy(xpath="//input[@class='crmbutton small create']")
private WebElement Duplicatebn;

@FindBy(xpath="//input[@class='crmbutton small delete']")
private WebElement Deletebn;

@FindBy(xpath="//td[@id='tab1']")
private WebElement Addressinfo;


public CreateSalesOrderPage(WebDriver d)
{
	PageFactory.initElements(d, this);
}

public WebElement getSubjecttb() {
	return Subjecttb;
}

public WebElement getCustomernotb() {
	return Customernotb;
}

public WebElement getQuoteNamebn() {
	return QuoteNamebn;
}

public WebElement getContactNamebn() {
	return ContactNamebn;
}

public WebElement getQuotesSubjectname() {
	return QuotesSubjectname;
}

public WebElement getContactname() {
	return Contactname;
}

public WebElement getOpportunityname() {
	return Opportunityname;
}

public WebElement getOrganizationname() {
	return Organizationname;
}

public WebElement getCarrierdropdn() {
	return Carrierdropdn;
}

public WebElement getStatusdropdn() {
	return Statusdropdn;
}

public WebElement getExcisedutytb() {
	return Excisedutytb;
}

public WebElement getUserradiobn() {
	return Userradiobn;
}

public WebElement getGroupradiobn() {
	return Groupradiobn;
}

public WebElement getAssignedtodropdn() {
	return Assignedtodropdn;
}

public WebElement getOpportunityNamebn() {
	return OpportunityNamebn;
}

public WebElement getOrganizationNamebn() {
	return OrganizationNamebn;
}

public WebElement getPurchaseOrdertb() {
	return PurchaseOrdertb;
}

public WebElement getDuedatetb() {
	return duedatetb;
}

public WebElement getPendingtb() {
	return Pendingtb;
}

public WebElement getEnablereccuringcheckbox() {
	return Enablereccuringcheckbox;
}

public WebElement getStartperiodtb() {
	return Startperiodtb;
}

public WebElement getEndperiodtb() {
	return Endperiodtb;
}

public WebElement getPayementdurationdropdn() {
	return Payementdurationdropdn;
}

public WebElement getFrequencydropdn() {
	return Frequencydropdn;
}

public WebElement getInvoiceStatusDropdn() {
	return InvoiceStatusDropdn;
}

public WebElement getCopyshippingaddressradiobn() {
	return Copyshippingaddressradiobn;
}

public WebElement getCopyBillingaddressradiobn() {
	return CopyBillingaddressradiobn;
}

public WebElement getBillingCitytb() {
	return BillingCitytb;
}

public WebElement getShippingaddressta() {
	return Shippingaddressta;
}

public WebElement getBillingaddressta() {
	return Billingaddressta;
}

public WebElement getBillpoboxtb() {
	return Billpoboxtb;
}

public WebElement getBillstatetb() {
	return Billstatetb;
}

public WebElement getBillcodetb() {
	return Billcodetb;
}

public WebElement getBillcountrytb() {
	return Billcountrytb;
}

public WebElement getShippoboxtb() {
	return Shippoboxtb;
}

public WebElement getShippingcitytb() {
	return Shippingcitytb;
}

public WebElement getShippingstatetb() {
	return Shippingstatetb;
}

public WebElement getShippingpostalcodetb() {
	return Shippingpostalcodetb;
}

public WebElement getShippingcountrytb() {
	return Shippingcountrytb;
}

public WebElement getTermsandconditionta() {
	return termsandconditionta;
}

public WebElement getDescriptionta() {
	return descriptionta;
}

public WebElement getProductsbn() {
	return Productsbn;
}

public WebElement getProductname() {
	return Productname;
}

public WebElement getQtytb() {
	return Qtytb;
}

public WebElement getListpricetb() {
	return listpricetb;
}

public WebElement getAddProductbn() {
	return AddProductbn;
}

public WebElement getAddServicebn() {
	return AddServicebn;
}

public WebElement getSavebn() {
	return Savebn;
}

public WebElement getCancelbn() {
	return Cancelbn;
}

public WebElement getServicesbn() {
	return Servicesbn;
}

public WebElement getServiceName() {
	return ServiceName;
}

public WebElement getEditbn() {
	return Editbn;
}

public WebElement getDuplicatebn() {
	return Duplicatebn;
}

public WebElement getDeletebn() {
	return Deletebn;
}

public WebElement getAddressinfo() {
	return Addressinfo;
}



}

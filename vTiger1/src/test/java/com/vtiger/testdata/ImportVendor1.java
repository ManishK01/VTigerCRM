package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.ImportVendorsPage;
import com.vtiger.pom.VendorsPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class ImportVendor1 extends BaseClass{
	@Test
	public void testImportVendor1() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on vendors link",true);
		h.getVendorsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on import vendor",true);
		VendorsPage vp=new VendorsPage(driver);
		vp.getImportVendors().click();
		Thread.sleep(3000);
		Reporter.log("choose a file",true);
		ImportVendorsPage ip=new ImportVendorsPage(driver);
		ip.getChooseFile().sendKeys("C:\\Users\\HP\\git\\repository\\Vtiger\\vTiger1\\src\\test\\resources\\data\\abc.CSV");
		Thread.sleep(3000);
		Reporter.log("click on next button",true);
		ip.getNextBtn().click();
		Thread.sleep(3000);
		Reporter.log("click on import button",true);
		ip.getImportBtn().click();
		Thread.sleep(3000);
		Reporter.log("handle alert popup",true);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);

	}

}

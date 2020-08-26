package com.vtiger.testdata;

import org.openqa.selenium.Alert;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.RecycleBinPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class Restore extends BaseClass {
	@Test
	public void testRestore() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on recycle bin link
		h.getRecycleBin().click();
		Thread.sleep(3000);
		//select a particular module from list box
		RecycleBinPage r=new RecycleBinPage(driver);
		Select s=new Select(r.getSelectModuleListBox());
		s.selectByVisibleText("Vendors");
		Thread.sleep(3000);
		//select one of the entity
		r.getCheckbox().get(1).click();
		Thread.sleep(3000);
		//click on restore button
		r.getRestoreBtn().click();
		Thread.sleep(3000);
		//handle the confirmation pop up
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
	}

}

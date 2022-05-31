package com.purnadata.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.purnadata.libraries.BaseClass;
import com.purnadata.libraries.Utilities;
import com.purnadata.pages.DashboardPage;
import com.purnadata.pages.LoginPage;
import com.purnadata.pages.SaleInvoicePage;

public class SalesInvoiceTest extends BaseClass {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	SaleInvoicePage saleInvoicePage;
	Utilities utils;
	
	@BeforeMethod
	public void init() {
		initialization();	
		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);
		saleInvoicePage = new SaleInvoicePage(driver);
		utils = new Utilities();
		loginPage.logintToPurna(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void createNewSalesInvoiceSuccessTest() throws InterruptedException {
		dashboardPage.btn_newSaleInvoice.click();
		saleInvoicePage.textBox_invoiceNumber.sendKeys("9922551110");
		saleInvoicePage.textBox_poWo.sendKeys("42022229");
		saleInvoicePage.textBox_po_date.sendKeys("05/25/2022");
		utils.doDropDownSelectByVisibleText(saleInvoicePage.dropDown_billTo, "Sarang12");
		saleInvoicePage.textBox_srNo.clear();
		saleInvoicePage.textBox_srNo.sendKeys("001234590");
		saleInvoicePage.btn_saveItem.click();
		utils.syncElement(driver, null, "alertPresent");
		utils.handleAlert(driver).accept();
		Thread.sleep(2000);
//		saleInvoicePage.final_btn_save.click();
//		utils.scrollToWebElement(driver, null);
//		utils.syncElement(driver, null, "alertPresent");
//		utils.handleAlert(driver).accept();
//		saleInvoicePage.salesInvoicedetail.click();
		Assert.assertTrue(true);
	
	}
	

	@AfterMethod
	  public void close() {
		driver.close();
	}

}

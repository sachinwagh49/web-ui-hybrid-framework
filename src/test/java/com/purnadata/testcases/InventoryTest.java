package com.purnadata.testcases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.purnadata.libraries.BaseClass;
import com.purnadata.libraries.ExcelUtils;
import com.purnadata.libraries.Utilities;
import com.purnadata.pages.DashboardPage;
import com.purnadata.pages.LoginPage;
import com.purnadata.pages.PurchaseItemDashboardPage;
import com.purnadata.pages.PurchaseItemPage;

public class InventoryTest extends BaseClass{

	LoginPage loginPage;
	DashboardPage dashboardPage;
	PurchaseItemDashboardPage purchaseItemDashPage;
	PurchaseItemPage purchaseItemPage;
	Utilities utils;

	@BeforeMethod
	public void inti() {
		initialization();
		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);
		purchaseItemDashPage = new PurchaseItemDashboardPage(driver);
		purchaseItemPage = new PurchaseItemPage(driver);
		utils = new Utilities();
		loginPage.logintToPurna(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getInventoryData() {
		return ExcelUtils.getTestData("Inventory");
	}

	@Test(dataProvider="getInventoryData")
	public void addInventorySuccessTest(String srNo, String itemCode, String itemName, String rate, String quantity, String amount, String units) {
		dashboardPage.link_mainMenu.click();
		dashboardPage.link_inventory.click();	
		purchaseItemDashPage.btn_addNewItem.click();
		
		purchaseItemPage.txtBox_srNo.clear();
		purchaseItemPage.txtBox_srNo.sendKeys(srNo);
		purchaseItemPage.txtBox_itemcode.sendKeys(itemCode);
		purchaseItemPage.txtBox_itemname.sendKeys(itemName);
			
		utils.doDropDownSelectByVisibleText(purchaseItemPage.dropdown_units, units);
		
		purchaseItemPage.txtBox_rate.sendKeys(rate);
		purchaseItemPage.txtBox_quantity.sendKeys(quantity);
		purchaseItemPage.txtBox_amount.sendKeys(amount);
		purchaseItemPage.btn_addItem.click();
		purchaseItemPage.btn_itemDetails.click();
		Assert.assertTrue(true);
			
	}

	@AfterMethod
	public void browserclose() {
		
		driver.close();
	}

}

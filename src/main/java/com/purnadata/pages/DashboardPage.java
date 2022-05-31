package com.purnadata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='menu-icon fa fa-desktop']")
	public WebElement link_mainMenu;
	
	@FindBy(xpath="//a[@href='purchase_item_dashboard.php']")
	public WebElement link_inventory;
	
	@FindBy(xpath="//h4[text()='Sale Invoice Details']")
	public WebElement text_salesInvoiceDetails;
	
	@FindBy(name="btn_new_party")
	public WebElement btn_newSaleInvoice;
	
}

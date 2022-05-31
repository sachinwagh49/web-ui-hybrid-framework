package com.purnadata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseItemDashboardPage {
	
	public PurchaseItemDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="btn_new_party")
	public
	WebElement btn_addNewItem;

}

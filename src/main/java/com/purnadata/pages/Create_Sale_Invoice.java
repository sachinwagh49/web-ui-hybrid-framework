package com.purnadata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Sale_Invoice {
	
	WebDriver driver;
	public void CreateSaleInvoice (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//button[text()='New Sale Invoice']")
		WebElement NewSaleInvoice;
		@FindBy(name="invoice_date")
		WebElement invoice_date;
		@FindBy(id="powo")
		WebElement powo;
		@FindBy(id="powo_date")
		WebElement powo_date;
		@FindBy(id="bill_to")
		WebElement bill_to;
		
//		Party.click();
//		Select select=new Select(Party);
//		select.selectByIndex(10);
		
		@FindBy(id="terms_cond")
		WebElement terms_cond;
		@FindBy(id="item_no")
		WebElement item_no;
		@FindBy(id="description")
		WebElement description;
		@FindBy(id="hsn_code")
		WebElement hsn_code;
		@FindBy(id="unit")
		WebElement unit;
		@FindBy(id="qty")
		WebElement qty;
		@FindBy(id="rate")
		WebElement rate;
		@FindBy(id="amount")
		WebElement amount;
		@FindBy(id="btn_save_item")
		WebElement btn_save_item;
		@FindBy(xpath ="//button[contains(@onclick, 'Are you sure you want to Save Sales Invoice')]")
		WebElement btn_save;
	}


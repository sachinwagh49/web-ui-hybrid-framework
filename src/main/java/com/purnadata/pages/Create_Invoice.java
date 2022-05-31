package com.purnadata.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Invoice {
	WebDriver driver;

	public void CreateInvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="(//a[@href='#'])[5]")
		WebElement link_mainMenu;
		@FindBy(xpath="//button[text()=' New Sale Invoice']")
		WebElement NewSaleInvoice;
		@FindBy(name="invoice_date")
		WebElement invoice_date;
		@FindBy(id="powo")
		WebElement powo;
		@FindBy(id="powo_date")
		WebElement powo_date;
		@FindBy(id="bill_to_Party")
		WebElement bill_to_Party;
		@FindBy(id="terms_cond")
		WebElement terms_cond;
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
	}


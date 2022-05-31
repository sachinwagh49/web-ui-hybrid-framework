package com.purnadata.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//*Edit Customer Detail*
public class Edit_CustomerDetail {
	
	WebDriver driver;

	public void EditCustomerDetailTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="(//a[@href='#'and@class='dropdown-toggle'])[3]")
		WebElement mainmenu;
		@FindBy(xpath="//a[@href='customer_dashboard.php']")
		WebElement customer_dashboard;
		@FindBy(xpath="//a[@href='edit_customer.php?sr_no=129']")
		WebElement edit_customer;
		@FindBy(id="customer_name")
		WebElement customer_name;
		@FindBy(id="contact_no")
		WebElement contact_no;
		@FindBy(id="billing_address")
		WebElement billing_address;
		@FindBy(id="shipping_address")
		WebElement shipping_address;
		@FindBy(xpath="//button[text()='UPDATE']")
		WebElement UPDATE;
		//driver.switchTo().alert().accept();
	}
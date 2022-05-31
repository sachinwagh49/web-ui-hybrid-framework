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

//*Create Supplier*
public class Create_Supplier {
	
	WebDriver driver;

	public void SupplierTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="(//a[@href='#'and@class='dropdown-toggle'])[3]")
		WebElement dropdown;
		@FindBy(xpath="//a[@href='supplier_dashboard.php']")
		WebElement supplier_dashboard;
		@FindBy(xpath="//button[@type='submit']")
		WebElement button_submit;
		@FindBy(id="supplier_name")
		WebElement supplier_name;
		@FindBy(id="contact_no")
		WebElement contact_no;
		@FindBy(id="address")
		WebElement address;
		@FindBy(id="email_id")
		WebElement email_id;
		@FindBy(id="contact_person")
		WebElement contact_person;
		@FindBy(id="gst_no")
		WebElement gst_no;
		@FindBy(id="pan_no")
		WebElement pan_no;
		@FindBy(id="bank_name")
		WebElement bank_name;
		@FindBy(id="bank_addr")
		WebElement bank_addr;
		@FindBy(id="account_no")
		WebElement account_no;
		@FindBy(id="ifsc_code")
		WebElement ifsc_code;
		@FindBy(id="btn")
		WebElement btn;
//		driver.switchTo().alert().accept();
}
		
	


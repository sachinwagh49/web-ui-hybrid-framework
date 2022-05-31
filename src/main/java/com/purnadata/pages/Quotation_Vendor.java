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
//*Quotation_Vendor*
public class Quotation_Vendor {
	
	WebDriver driver;

	public void QuotationVendorTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath="(//a[@href='#'])[7]")
		WebElement link_mainMenu;
		@FindBy(xpath="(//a[@href='quotation_dashboard.php'])")
		WebElement quotation_dashboard;
		@FindBy(name="btn_new_party")
		WebElement btn_new_party;
		@FindBy(id="to")
		WebElement BillToParty;
//		Select BilltoParty=new Select(Bill_to_Party);
//		BilltoParty.selectByVisibleText("SNJ PVT LTD");
		@FindBy(id="drg_no")
		WebElement drg_no;
		@FindBy(id="delivery_period")
		WebElement delivery_period;
		@FindBy(id="payment_terms")
		WebElement payment_terms;
		@FindBy(id="btn_save_item")
		WebElement btn_save_item;
//		driver.switchTo().alert().accept();
		@FindBy(id="btn")
		WebElement btn;
}
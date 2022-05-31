package com.purnadata.pages;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Customer_Page {
	
	public Create_Customer_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy (xpath="(//a[@href='#'])[4]")
		WebElement link_mainMenu;
		@FindBy(xpath="//a[@href='customer_dashboard.php']")
		WebElement customer_dashboard;
		@FindBy(name="btn_new_party")
		WebElement btn_new_party;
		@FindBy(id="customer_name")
		WebElement customer_name;
		@FindBy(id="contact_no")
		WebElement contact_no;
		@FindBy(id="billing_address")
		WebElement billing_address;
		@FindBy(id="shipping_address")
		WebElement shipping_address;
		@FindBy(id="email")
		WebElement email;
		@FindBy(id="contact_person")
		WebElement contact_person;
		@FindBy(id="person_no")
		WebElement person_no;
		@FindBy(id="gst_no")
		WebElement gst_no;
		@FindBy(id="pan_no")
		WebElement pan_no;
		@FindBy(id="vendor_code_no")
		WebElement vendor_code_no;
		@FindBy(name="submit")
		WebElement Save;
		
		
//		public void CreateCustomerPage() {
//			link_mainMenu.click();
//			customer_dashboard.click();
//			btn_new_party.click();
//			customer_name.sendKeys("ShivShakti Enterprises");
//			contact_no.sendKeys("9099988877");
//			billing_address.sendKeys("At Post Walunj MIDC, Aurangabad, Maharatra");
//			shipping_address.sendKeys("Plat no 234, chakan MIDC, Pune");
//			email.sendKeys("Rajesh@gmail.com");
//			contact_person.sendKeys("Pratyunsha");
//			person_no.sendKeys("9900887767");
//			gst_no.sendKeys("M1Z1GSt5566778MT");
//			pan_no.sendKeys("898990099");
//			vendor_code_no.sendKeys("SHIV01234");
//			Save_btn.click();
//			alerthandle();
//			
//		
//		}
}

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
//*Create Employee*
public class Create_Employee {
	
	WebDriver driver;

	public void Create_Employee() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//a[@hrefname='employee_dashboard.php']")
		WebElement employee_dashboard;
		@FindBy(name="btn_new_party")
		WebElement btn_new_party;
		@FindBy(name="name")
		WebElement name;
		@FindBy(name="date_of_joining")
		WebElement date_of_joining;
		@FindBy(name="department")
		WebElement department;
		@FindBy(name="designation")
		WebElement designation;
		@FindBy(name="mobile")
		WebElement mobile;
		@FindBy(name="altr_cont")
		WebElement altr_cont;
		@FindBy(name="pan_no")
		WebElement pan_no;
		@FindBy(name="email")
		WebElement email;
		@FindBy(name="area")
		WebElement area;
		@FindBy(name="region")
		WebElement region;
		@FindBy(name="birthdate")
		WebElement birthdate;
		@FindBy(name="bloodgroup")
		WebElement bloodgroup;
		@FindBy(name="address")
		WebElement address;
		@FindBy(name="passport")
		WebElement passport;
		@FindBy(name="emp_id")
		WebElement emp_id;
		@FindBy(name="bank_name")
		WebElement bank_name;
		@FindBy(name="bank_addr")
		WebElement bank_addr;
		@FindBy(name="acc_no")
		WebElement acc_no;
		@FindBy(name="ifsc_code")
		WebElement ifsc_code;
		@FindBy(name="salary")
		WebElement salary;
		@FindBy(name="no_of_days")
		WebElement no_of_days;
		@FindBy(name="total")
		WebElement total;
		@FindBy(name="net_amount")
		WebElement net_amount;
		@FindBy(name="submit")
		WebElement submit;
		
	}

package com.purnadata.pages;
import java.util.*;
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
//*Create Inventory*
public class Create_Inventory {
	
	WebDriver driver;

	public void CreateInventoryPage(WebDriver driver) {
		
			PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="(//a[@href='#'and@class='dropdown-toggle'])[3]")
		WebElement link_mainMenu;
		@FindBy(xpath="//a[@href='purchase_item_dashboard.php']")
		WebElement purchase_item_dashboard;
		@FindBy(xpath="//button[@type='submit']")
		WebElement submit;
		@FindBy(xpath="//input[@type='text'and@name='itemcode']")
		WebElement item;
		@FindBy(name="itemcode")
		WebElement itemcode;
		@FindBy(id="itemname")
		WebElement itemname;
		@FindBy(name="units")
		WebElement units;
		@FindBy(id="supp_product_code")
		WebElement supp_product_code;
		@FindBy(id="drawing_no")
		WebElement drawing_no;
		@FindBy(id="spec_no")
		WebElement spec_no;
		@FindBy(id="weight")
		WebElement weight;
		@FindBy(id="packing")
		WebElement packing;
		@FindBy(id="txt_rate")
		WebElement txt_rate;
		@FindBy(id="txt_discount")
		WebElement txt_discount;
		@FindBy(id="txt_qty")
		WebElement txt_qty;
		@FindBy(id="txt_amount")
		WebElement txt_amount;
	}
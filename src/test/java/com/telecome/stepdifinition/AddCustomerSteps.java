package com.telecome.stepdifinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class AddCustomerSteps {
	
	static WebDriver driver;
	
	@Given("user launchs demo telecome application")
	public void user_launchs_demo_telecome_application() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("http://www.demo.guru99.com/telecom/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Given("click on add customer option")
	public void click_on_add_customer_option() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("user enter all the requirements")
	public void user_enter_all_the_requirements() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys("arun");
	    driver.findElement(By.id("lname")).sendKeys("kumar");
	    driver.findElement(By.id("email")).sendKeys("arunsrkumar1997@gmail.com");
	    driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("hi tester");
	    driver.findElement(By.id("telephoneno")).sendKeys("123456789");
	    
	}

	@When("click submit button")
	public void click_submit_button() {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    
	}
  
	@Then("verify the customer ID generated")
	public void verify_the_customer_ID_generated() {
		 WebElement text = driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']"));
		 String text2 = text.getText();
		 Assert.assertEquals("Please Note Down Your CustomerID", text2);
		
	
	    
	}


}

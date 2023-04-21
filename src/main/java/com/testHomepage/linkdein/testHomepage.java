package com.testHomepage.linkdein;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.homepage.linkdein.homepage;

public class testHomepage {

	
	WebDriver driver;
	
	homepage page;
	
	
	@BeforeClass
	public void setup() {
		
		
		driver=new ChromeDriver();
		
		driver.get("https://in.linkedin.com/");
		
		driver.manage().window().maximize();
		
		page=new homepage(driver);
		
		
		
		
	}
	@Ignore
	@Test
	public void testhomepageLogo() {
		
		page.logo();
	}
	@Ignore
	@Test
	public void testHomepageLogin() {
		
		page.homepagelogin("shubhamsingh89604@gmail.com", "indianrailway","6307623408");
		
		
	}
	@Ignore
	@Test
	public void signwithgoogle() {
		
		page.signWithGoogle("shubhamsingh89604@gmail.com");
	}
	@Ignore
	@Test
	public void testforgettenpassword() {
		
		page.forogettenPassword("shubhamsingh89604@gmail.com", "610989");
	}
	
	@Test
	public void testjoinNow() {
		
		page.joinNow("shubhamsingh89604@gmail.com", "Indian12@", "shubham", "singh","6307623408");
	}
}


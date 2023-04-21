package com.homepage.linkdein;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locator.Object.Repository.LocatorObjectRepository;

public class homepage implements LocatorObjectRepository{

	
	WebDriver driver;
	
	WebDriverWait wait;
	
	public homepage(WebDriver driver){
		
		this.driver=driver;
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		

	}
	
	
	
	public void logo() {
		
		driver.findElement(By.xpath(homepage_logo)).click();
	}
	
	public void homepagelogin(String email,String password,String phoneno) {
		
		driver.findElement(By.xpath(homepage_email)).sendKeys(email);
		
		driver.findElement(By.xpath(homepage_password)).sendKeys(password);
		
		driver.findElement(By.xpath(homepage_show)).click();
		
		driver.findElement(By.xpath(homepage_signinButton)).click();
		
		
		}
	
	public void signWithGoogle(String email) {
		
		
		String parent=driver.getWindowHandle();
		
		System.out.println(parent);
		
		
		driver.findElement(By.xpath(signWithGoogle)).click();
		
	
		Set<String> mul=driver.getWindowHandles();
		
		
		System.out.println(mul);
		
		
		mul.remove(parent);
		
		
		String tab1=(String) mul.toArray()[0];
		
		
		driver.switchTo().window(tab1);
		
		
		driver.findElement(By.xpath(signwithgoogleemail)).sendKeys(email);
		
		
	}
	
	public void forogettenPassword(String email,String otp) {
		
		driver.findElement(By.xpath(forogettenpassword)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(email)));
		
		
		driver.findElement(By.xpath(forogetenemail)).click();
		
		driver.findElement(By.xpath(forogetenemail)).sendKeys(email);
		
		driver.findElement(By.xpath(forogetten_reset)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(otp)));
		
		
		driver.findElement(By.xpath(forogettenOtp)).sendKeys(otp);
		
		
		driver.findElement(By.xpath(forogettensubmitbtn)).click();
		
		
	}
	
	public void joinNow(String joinemails,String joinpassword,String profile_first_name,String profile_last_name,String profile_phone_no) {
		
		driver.findElement(By.xpath(joinnowbtn)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(joinnow_email)));
		
		driver.findElement(By.xpath(joinnow_email)).sendKeys(joinemails);
		
		driver.findElement(By.xpath(joinnow_password)).sendKeys(joinpassword);
		
		driver.findElement(By.xpath(joinnowbtn_submit)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profilename)));
		
		driver.findElement(By.xpath(profilename)).sendKeys(profile_first_name);
		
		driver.findElement(By.xpath(profilelastname)).sendKeys(profile_last_name);
		
		driver.findElement(By.xpath(profilecontinuebtn)).click();
		
		WebElement frameid=driver.findElement(By.xpath(framelocation));
		
		driver.switchTo().frame(frameid);
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( profilephoneno)));
		
		
		driver.findElement(By.id(profilephoneno)).sendKeys(profile_phone_no);
		
		driver.findElement(By.xpath(profilesubmitbtn)).click();
		
		
		
	}
	
}

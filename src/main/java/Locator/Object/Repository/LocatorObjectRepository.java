package Locator.Object.Repository;

public interface LocatorObjectRepository {
	
	//Linkdein icon
	
	String homepage_logo="(//a)[2]";
	
	String homepage_email="//input[@id=\"session_key\"]";
	
	String homepage_password="//input[@id=\"session_password\"]";
	
	String homepage_show="//button[text()=\"Show\"]";
	
	String homepage_signinButton="(//button[contains(.,\"Sign in\")])[1]";
	
	String homepage_phone_verfication="//input[@id=\"phone-input\"]";
	
	String homepage_verification_sendcode="//button[text()=\"Send code\"]";
	
	String signWithGoogle="(//button)[3]";
	
	String signwithgoogleemail="//input[@id=\"identifierId\"]";
	
	String forogettenpassword="//a[text()=\"Forgot password?\"]";
	
	String forogetenemail="//input[@id='username']";
	
	String forogetten_reset="(//button)[2]";
	
	String forogettenOtp="//input[@name=\"pin\"]";
	
	String forogettensubmitbtn="//button[text()=\"Submit\"]";
	
	//Join Now Locators
	
	String joinnowbtn="(//a[contains(.,\"Join now\")])[1]";
	
	String joinnow_email="//input[@id=\"email-or-phone\"]";
	
	String joinnow_password="//input[@id=\"password\"]";
	
	String joinnowbtn_submit="//button[@id=\"join-form-submit\"]";
	
	String profilename="//input[@id=\"first-name\"]";
	
	String profilelastname="//input[@id=\"last-name\"]";
	
	String profilecontinuebtn="//button[@id=\"join-form-submit\"]";
	
	String framelocation="//iframe[@title=\"Security verification\"]";
	
	String profilephoneno="register-verification-phone-number";
	
	String profilesubmitbtn="//button[@id=\"register-phone-submit-button\"]";
	
	
	
	
	
	
	
	
	

}

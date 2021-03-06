package pageobjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTC extends Home{
	
	@Test
	public static void invalidUsernameTest() {
		
		driver.get("https://facebook.com");
		FacebookPage.login("baba@gmail.com", "mytest007");
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
	}
	
	@Test
	public static void invalidPasswordTest() {
		
		driver.get("https://facebook.com");
		FacebookPage.login("baba@gmail.com", "mytest007");
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
	}
	
	@Test
	public static void blankCredentialsTest() {

		driver.get("https://facebook.com");
		FacebookPage.login("", "");
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
	}

}

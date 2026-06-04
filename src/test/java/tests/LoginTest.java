package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void verifyLogin() {
		LoginPage loginPage = new LoginPage(page);
		HomePage homePage = new HomePage(page);
		loginPage.navigate();
		loginPage.login("Admin", "admin123");
		homePage.clickTimeLink();
	//	String heading = homePage.getHeadingText();
		//Assert.assertEquals(heading.trim(), "Login failed or wrong page loaded");
	}
}

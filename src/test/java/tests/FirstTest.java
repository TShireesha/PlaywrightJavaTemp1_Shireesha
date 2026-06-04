package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
//ctrl+shft+o - to manage imports
//ctrl_shift+f  - to correct formatting
//mvn clean test -DsuiteXmlFile=testng.xml  - to run in command line
//mvn exec:java -P run-cli -Dexec.args="codegen https://opensource-demo.orangehrmlive.com/"

public class FirstTest extends BaseTest {
	LoginPage loginPage;
	String username ="Admin";
	String password = "admin123";

	
	@Test
	public void verifyTitle() {
		loginPage.navigate();
		loginPage.login(username, password);
	}

}

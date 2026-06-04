package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	private Page page;
	
	private final String usernameInput = "input[name='username']";
	private final String passwordInput= "input[name='password']";
	private final String loginButton = "button[type='submit']";
	
	//constructor
	public LoginPage(Page page) {
		this.page= page;
	}
	
	//page actions
	public void navigate() {
		page.navigate("https://opensource-demo.orangehrmlive.com/");
	}
	
	public void login(String username,String password) {
		page.fill(usernameInput,username);
		page.fill(passwordInput, password);
		page.click(loginButton);
	}

}

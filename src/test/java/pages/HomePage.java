package pages;

import com.microsoft.playwright.Page;

public class HomePage {
	private final Page page;
	private final String timeLink = "span[class='oxd-text oxd-text--span oxd-main-menu-item--name']";
//	private final String heading = "getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName(\"Dashboard\"))";
	
	public HomePage(Page page) {
		this.page=page;
	}
	
	public void clickTimeLink() {
		page.click(timeLink);
	}
	
//	public String getHeadingText() {
//		page.getAttribute(timeLink, "value");
//	}

}

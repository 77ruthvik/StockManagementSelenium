package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class CreatePortfolioTest {
	
	@Test
	public void createPortfolioTest() throws IOException {
		//Login to website
		//Create the portfolio
		//Verify
		
		//Loading the Properties file
		ApplicationKeywords app = new ApplicationKeywords();
		
		app.openBrowser("Chrome");
		app.navigate("url");
		app.type("username_css", "");
		app.type("password_xpath", "");
		//app.validateElementPresent("loginsubmit");
		app.click("login_id");
		
		app.validateLogin();

		//app.selectDateFromCalendar();
	}
	
	@Test
	public void createReservation() {
		
	}
}

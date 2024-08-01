package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC006_ValidateHistoryWithoutBooking extends ProjectSpecification {
	
	@BeforeTest
	public void setup() {
		excelfile="TC006_ValidateHistoryWithoutBooking";
	}
	
	@Test(dataProvider = "getData", priority = 6)
	public void validateHistoryWithoutBooking(String username, String password, String scenario) throws IOException, InterruptedException {
		
			new HomePage(driver)
		         .clickOnMenu()
		         .clickOnLogin()
		         .enterUsername(username)
		         .enterPassword(password)
		         .clickOnLogin()
		         .validateLogin(scenario)
		         .clickOnMenu()
		         .clickOnHistory()
		         .verifyNoAppointmentmsg();
		
	}

}

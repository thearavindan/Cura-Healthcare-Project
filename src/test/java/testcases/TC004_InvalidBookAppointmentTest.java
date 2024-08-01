package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC004_InvalidBookAppointmentTest extends ProjectSpecification{
	
	@BeforeTest
	public void setup() {
		excelfile="TC004_InvalidBookAppointmentTest";
	}
	
	@Test(dataProvider = "getData", priority = 4)
	public void invalidBookAppointmentTest(String username, String password, String scenario) throws IOException, InterruptedException {

			new HomePage(driver)
		         .clickOnMenu()
		         .clickOnLogin()
		         .enterUsername(username)
		         .enterPassword(password)
		         .clickOnLogin()
		         .validateLogin(scenario)
		         .clickOnBookAppointment()
		         .verifyInvalidAppointment();
			
	}
}

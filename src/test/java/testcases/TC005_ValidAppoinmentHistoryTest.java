package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC005_ValidAppoinmentHistoryTest extends ProjectSpecification {
	
	@BeforeTest
	public void setup() {
		excelfile="TC005_ValidAppoinmentHistoryTest";
	}
	
	@Test(dataProvider = "getData", priority = 5)
	public void validAppoinmentHistoryTest(String Username, String Password, String scenario, String facility, 
			String healthcareprogram, String monthandYear,String Date, String comment, String verifyapp) throws IOException, InterruptedException {
		
			new HomePage(driver)
			    .clickOnMenu()
			    .clickOnLogin()
			    .enterUsername(Username)
			    .enterPassword(Password)
			    .clickOnLogin()
			    .validateLogin(scenario)
			    .selectFacility(facility)
			    .clickOnReAdmission()
			    .selectHealthcareProgram(healthcareprogram)
			    .selectVisitDate(monthandYear, Date)
			    .addcomments(comment)
			    .clickOnBookAppointment()
			    .clickOnGoToHomePage()
			    .clickOnMenu()
			    .clickOnHistory()
			    .verifyTheAppointment(verifyapp);
			
			
		}
		
	}



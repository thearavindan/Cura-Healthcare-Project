package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC003_ValidateBookAppointmentTest extends ProjectSpecification {
	
	@BeforeTest
	public void setup() {
		excelfile="TC003_ValidateBookAppointmentTest";
	}
	
	@Test(dataProvider = "getData", priority = 3)
	public void ValidateBookAppointmentTest(String Username, String Password, String scenario,String facility,  
			String healthcareprogram,String monthandYear,String Date, String comment) throws IOException, InterruptedException {
		
		//try {
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
			    .verifyAppointmentConformation();
//			
//		}catch(Exception e) {
//			String savedPath = getScreenShot("Screen_TC003_InvalidLoginTest");
//			System.out.println("TC003_InvalidLoginTest is failed :Screenshot is captured and saved in " + savedPath);
//			e.printStackTrace();
			
	//	}
		
	}
}



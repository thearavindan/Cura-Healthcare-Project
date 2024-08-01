package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC002_InvalidLoginTest extends ProjectSpecification {
	
	@BeforeTest
	public void setup() {
		excelfile="TC002_InvalidLoginTest";
	}
	
	@Test(dataProvider = "getData",priority = 2, enabled = true)
	public void invalidLoginTest(String username, String password, String scenario) throws IOException {
		try {
			new HomePage(driver)
			    .clickOnMenu()
			    .clickOnLogin()
			    .enterUsername(username)
			    .enterPassword(password)
			    .clickOnLogin()
			    .validateLogin(scenario);
			
		}catch(Exception e) {
			String savedPath = getScreenShot("Screen_TC002_InvalidLoginTest");
			System.out.println("TC002_InvalidLoginTest is failed :Screenshot is captured and saved in " + savedPath);
			e.printStackTrace();
			
		}
	}

}

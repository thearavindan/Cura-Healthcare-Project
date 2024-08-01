package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC007_LogoutTest extends ProjectSpecification {
	@BeforeTest
	public void setup() {
		excelfile="TC007_LogoutTest";
	}
	
	@Test(dataProvider = "getData", priority = 7)
	public void logoutTest(String username, String password, String scenario) throws IOException {
		
		try {
			new HomePage(driver)
		         .clickOnMenu()
		         .clickOnLogin()
		         .enterUsername(username)
		         .enterPassword(password)
		         .clickOnLogin()
		         .validateLogin(scenario)
		         .clickOnMenu()
		         .clickOnLogout()
		         .validateLogout();
			}catch(Exception e) {
				String savedPath = getScreenShot("Screen_TC001_ValidLoginTest");
				System.out.println("TC001_ValidLoginTest is failed :Screenshot is captured and saved in " + savedPath);
				e.printStackTrace();
			}
	}

}

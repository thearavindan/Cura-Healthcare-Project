package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class LoginPage extends ProjectSpecification{
	
	@FindBy(xpath="//input[@id='txt-username']")
	WebElement Usernamefield;
	
	@FindBy(xpath="//input[@id='txt-password']")
	WebElement Passwordfield;
	
	@FindBy(xpath="//button[@id='btn-login']")
	WebElement Loginbtn;
	
	@FindBy(xpath="//p[@class='lead text-danger']")
	WebElement Errormsg;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage enterUsername(String username) {
		Usernamefield.sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		Passwordfield.sendKeys(password);
		return this;
	}
	
	public LoginPage clickOnLogin() {
		clickOnElement(Loginbtn);
		return this;
	}
	
	public MakeAppointmentPage validateLogin(String scenario) throws InterruptedException {
		if(scenario.equals("positive")) {
			if(driver.getCurrentUrl().contains("appointment")) {
				System.out.println("Loggedin successfully");
			}
		}else if(scenario.equals("negative")) {
			checkErrorMessage(scenario, Errormsg, "Login failed");
		}
		return new MakeAppointmentPage(driver);
	}
	

}

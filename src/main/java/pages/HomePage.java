package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification {
	
	@FindBy(xpath="//a[@id='btn-make-appointment']")
	WebElement MakeAppointmentbtn;
	
	@FindBy(xpath="//a[@id='menu-toggle']")
	WebElement Menubtn;
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement Homebtn;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement loginbtn;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnMakeAppointment() {
		clickOnElement(MakeAppointmentbtn);
		return new LoginPage(driver);
	}
	
	public HomePage clickOnMenu() {
		clickOnElement(Menubtn);
		return this;
	}
	
	public LoginPage clickOnLogin() {
		clickOnElement(loginbtn);
		return new LoginPage(driver);
	}

}

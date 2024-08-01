package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HistoryPage extends ProjectSpecification {
	
	@FindBy(xpath="//div[@class='panel-heading']")
	WebElement AppointmentDate; //26/07/2024
	
	@FindBy(xpath="//p[@id='facility']")
	WebElement Facility;
	
	@FindBy(xpath="//i[@class='fa fa-bars']")
	WebElement Menubtn;
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement Home;
	
	@FindBy(xpath="//p[text()='No appointment.']")
	WebElement NoAppointment;
	
	public HistoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public HistoryPage verifyTheAppointment(String value) {
		assertTrue(AppointmentDate.isDisplayed());
		assertEquals(Facility.getText(), value);
		System.out.println("Appointment booked successfully");
		return this;
	}
	
	public MakeAppointmentPage clickOnHome() {
		Home.click();
		return new MakeAppointmentPage(driver);
	}
	
	public HistoryPage verifyNoAppointmentmsg() {
		assertTrue(NoAppointment.isDisplayed());
		System.out.println(NoAppointment.getText()+ "message displayed");
		return this;
	}

}

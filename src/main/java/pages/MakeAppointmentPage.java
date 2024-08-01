package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class MakeAppointmentPage extends ProjectSpecification {
	
	@FindBy(xpath ="//select[@id='combo_facility']")
	WebElement Facilityoption;
	
	@FindBy(xpath ="//input[@id='chk_hospotal_readmission']")
	WebElement ReadmissionCheckbox;
	
	@FindBy(xpath ="//label[@class='radio-inline']//input")
	List<WebElement> Radiobtn;
	
	@FindBy(xpath ="//span[@class='glyphicon glyphicon-calendar']")
	WebElement Calenderbtn;
	
	@FindBy(xpath="(//table[@class='table-condensed']//th[@class='datepicker-switch'])[1]")
	WebElement MonthAndYear;
	
	@FindBy(xpath="//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")
	WebElement MoveToNextMonth;
	
	@FindBy(xpath="//table[@class='table-condensed']//tbody//tr//td[@class='day']")
	List<WebElement> AllDays;
	
	@FindBy(xpath="//textarea[@id='txt_comment']")
	WebElement CommentBox;
	
	@FindBy(xpath="//button[@id='btn-book-appointment']")
	WebElement BookAppointmentbtn;
	
	@FindBy(xpath="//h2[text()='Appointment Confirmation']")
	WebElement AppointmentConfirmmsg;
	
	@FindBy(xpath="//a[@id='menu-toggle']")
	WebElement Menubtn;
	
	@FindBy(xpath="//a[normalize-space()='History']")
	WebElement History;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement Logout;
	
	@FindBy(xpath="(//table[@class='table-condensed'])[1]")
	WebElement CalanderTable;
	
	@FindBy(xpath="//a[normalize-space()='Go to Homepage']")
	WebElement GoToHomepagebtn;
	
	public MakeAppointmentPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public MakeAppointmentPage selectFacility(String VisiblText) {
		selectOptionFromDropdown(Facilityoption, VisiblText);
		return this;
	}
	
	public MakeAppointmentPage clickOnReAdmission() {
		ReadmissionCheckbox.click();
		return this;
	}
	
	public MakeAppointmentPage selectHealthcareProgram(String value) {
		clickOnRadioButton(Radiobtn, value);
		return this;
	}
	
	public MakeAppointmentPage selectVisitDate(String monthandYear,String Date) {
		Calenderbtn.click();
		datePicker(monthandYear, Date, MonthAndYear,MoveToNextMonth,AllDays);
		return this;
	}
	
	public MakeAppointmentPage addcomments(String text) {
		CommentBox.sendKeys(text);
		return this;
	}
    
	public MakeAppointmentPage clickOnBookAppointment() {
		BookAppointmentbtn.click();
		return this;
	}
	
	public MakeAppointmentPage verifyAppointmentConformation() {
		assertTrue(AppointmentConfirmmsg.isDisplayed());
		System.out.println("Appointment has been booked");
		return this;
	}
	
	public MakeAppointmentPage verifyInvalidAppointment() {
		assertTrue(CalanderTable.isDisplayed());
		System.out.println("Error message Displayed");
		return this;
	}
	
	public MakeAppointmentPage clickOnGoToHomePage() {
		GoToHomepagebtn.click();
		return this;
	}
	
	public MakeAppointmentPage clickOnMenu() {
		Menubtn.click();
		return this;
	}
	
	public HistoryPage clickOnHistory() {
		History.click();
		return new HistoryPage(driver);
	}
	
	public MakeAppointmentPage clickOnLogout() {
		Logout.click();
		return this;
	}
	
	public HomePage validateLogout() {
		assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
		System.out.println("LoggedOut Successfully : TestCase passed");
		return new HomePage(driver);
	}
}

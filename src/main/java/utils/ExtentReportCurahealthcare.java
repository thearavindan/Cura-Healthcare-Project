package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportCurahealthcare {
	
	public static ExtentReports getreport() {
		
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("./reports/Extentreport.html");
	    sparkreporter.config().setDocumentTitle("Cura Healthcare Project Test report");
		sparkreporter.config().setReportName("Functional Testing");
		sparkreporter.config().setTheme(Theme.STANDARD);
		
		ExtentReports extent = new ExtentReports();
		extent.setSystemInfo("Computer Name", "Local Host");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Aravindan.R");
		extent.setSystemInfo("Operating System", "Windows 11");
		extent.setSystemInfo("Browser Name", "Chrome");
        
		extent.attachReporter(sparkreporter);
		
	  return extent;
		
	}

}

# CURA-Healthcare-Project
![Screenshot 2024-07-24 232358](https://github.com/user-attachments/assets/4420a5ec-e253-4ee8-8924-969d04fe9cb1)
The Project is to build a system that can automatically test the major functionalities of the CURA Healthcare service. I have used Data-Driven testing for testing Login functionality with the Data provider and also it covers the main features of Medicare and Medicaid program as well.

## Coding Style:
* I have used Java Programming language with POM(Page Object Model) design pattern with Selenium framework in this project.

## IDE/Language:
* IDE: Eclipse
* Language: Java

 ## Technology/Frameworks used:
* TestNG framework - Used for various purposes like Data provider and the prioritization of tests and suites.
* Extent reports library - Used for the detailed reporting of the test cases status with various information like screenshots.
* Maven project - For the ease of handling the dependencies in one place.
* Selenium Java library - Selenium provides support for the automation of web browsers. It provides extensions to emulate user interaction with browsers, a distribution server for scaling browser allocation, and the infrastructure for implementations of the W3C WebDriver specification.
* Apache POI library- For the reading and writing the data in an Excel sheet.
* Maven Surefire plugin- For the building of a Maven build and for Jenkins CI/CD implementation for invoking the build by local host or remotely.
* Jenkins tool - For triggering the build eventually executing the tasks locally or remotely.
* WebDriverManager library - Automated driver management and other helper features for Selenium WebDriver in Java.

## Steps to create the project and adding dependencies:
* Step 1: Create a new project of type Maven in Eclipse IDE.
* Step 2: Then add a testNG library by navigating to the Java build path and adding the testNG library. Then Apply and close.
* Step 3: The next step is to add the important dependencies in the Pom.xml file(refer to the below dependencies).
* Step 4: Since we are following the POM design pattern we need to create four packages(refer to the below POM screenshot).
* Step 5: Finally, add the Maven sure surefire plugin in the Pom.xml file under tag (refer to the below dependencies).
* Step 6: Create a new testng.xml file adding the test java classes to be executed under suite.
* Step 7: Run the project a testNG suite.

## Dependencies used for this project 

``` xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>CuraHealthcareService</groupId>
  <artifactId>CuraHealthcareService</artifactId>
  <version>0.0.1-SNAPSHOT</version>
 
   <dependencies>

  <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.9.2</version>
</dependency>

	<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.23.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.3.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.3.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.23.1</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.10.2</version>
</dependency>

<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>5.1.2</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.34</version>
    <optional>true</optional>
</dependency>

  </dependencies>
  
  <build>
	<pluginManagement>
		<plugins>
			<plugin>
			<!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin -->
             <groupId>org.apache.maven.plugins</groupId>
             <artifactId>maven-surefire-plugin</artifactId>
             <version>3.3.1</version>
             <configuration>
				<suiteXmlFiles>
					<suiteXmlFile>testng.xml</suiteXmlFile>
				</suiteXmlFiles>
			 </configuration>
			</plugin>
		</plugins>
	</pluginManagement>
  </build>
</project>
```

## POM Structure screenshot:
![pom structure](https://github.com/user-attachments/assets/a8b8b405-76e0-4e8d-b6f2-0c4d38b6a38a)

## Test case Code Example:
* I have used constructor chaining here in order to access the methods of pages with single object creation.
* We are using try/catch to handle the exception that occurs in between the process of executing a test case.
* Finally, based on the validation if the test case is passed we report that test case as Pass/Fail in extent report.

## Test Scenarios covered:
* Test to verify the Login functionality
* Test to verify book an appointment by filling in the appropriate details and validate the appointment confirmation message.
* Test to Verify the scheduled appointment by looking through the "History".
* Test to verify the Logout funcionality

## Maven output Build success screenshot:
![Maven result screenshot](https://github.com/user-attachments/assets/0a19ac52-a098-4361-9383-78bed9ccb779)

## Jenkins output Build success screenshot:
![image](https://github.com/user-attachments/assets/21d1e3d8-1f11-406c-b0f3-b17ee531b9de)

## Extent report screenshots:
![image](https://github.com/user-attachments/assets/d1d00f8c-e29f-4957-b048-ddc4028a64ea)
![image](https://github.com/user-attachments/assets/35125323-b3cf-47a0-8630-826d6064d2a0)

## Testscript Execution video: 
https://github.com/user-attachments/assets/95e753ce-712d-42db-9fa0-f1874ee4d6eb

## People who worked on this project:
**R.Aravindan**









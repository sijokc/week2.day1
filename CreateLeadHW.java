package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadHW {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("Demosalesmanager");
		WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		elePassword.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Thread.sleep(1000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create Lead")).click();
		//driver.findElement(By.id("ext-gen872")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sijo");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KC");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sijo1");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("KC1");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("SIC COde");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Tick");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description Description Description");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Notes notes notes notes");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0484");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7777");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("555");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Sijo");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sijo@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.URL.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("TOName");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Att name");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("CIty");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("88888");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("44");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/10/21");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Alaska");	
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Cold Call");	
		
		driver.findElement(By.name("submitButton")).click();
		
		String fName=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		String tTitle=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println("First Name:"+fName+"     "+"Title:"+tTitle );
		
	}

}

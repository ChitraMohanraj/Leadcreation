package Gittest.Gittest;

/**
 * Hello world!
 *
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public static void createlogin() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		// driver.findElementByLinkText("//a[contains(@id,'ext-gen')][1]").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(
				"Leaf LNT");
		driver.findElementById("createLeadForm_firstName").sendKeys("Mithra");
		driver.findElementById("createLeadForm_lastName").sendKeys("Petr");
		Select dropdown = new Select(
				driver.findElementById("createLeadForm_dataSourceId"));
		dropdown.selectByValue("LEAD_COLDCALL");
		dropdown.selectByVisibleText("Cold Call");
		Select drop = new Select(
				driver.findElementById("createLeadForm_marketingCampaignId"));
		drop.selectByVisibleText("Automobile");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys(
				"Jackie");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("jok");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("MDT");
		driver.findElementById("createLeadForm_personalTitle")
				.sendKeys("Honey");
		driver.findElementById("createLeadForm_departmentName").sendKeys(
				"Krishna");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys(
				"4500000");
		Select drop0 = new Select(
				driver.findElementById("createLeadForm_currencyUomId"));
		drop0.selectByValue("INR");
		Select dropdn = new Select(
				driver.findElementById("createLeadForm_industryEnumId"));
		dropdn.selectByValue("IND_HARDWARE");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("45");
		Select drop2 = new Select(
				driver.findElementById("createLeadForm_ownershipEnumId"));
		drop2.selectByVisibleText("Partnership");
		driver.findElementById("createLeadForm_sicCode").sendKeys("02");
		driver.findElementByName("tickerSymbol").sendKeys("TNK");
		driver.findElementById("createLeadForm_description").sendKeys(
				"grociers MALL");
		driver.findElementById("createLeadForm_importantNote").sendKeys(
				"KEY POINT");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(
				"789456231");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys(
				"758");
		driver.findElementById("createLeadForm_primaryPhoneAskForName")
				.sendKeys("NULL");
		driver.findElementById("createLeadForm_primaryPhoneExtension")
				.sendKeys("21658");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(
				"birdkey@gmail.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys(
				"https://et.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Barb");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys(
				"SEDY");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys(
				"str 1 mandaveli");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys(
				"chn north");
		driver.findElementById("createLeadForm_generalCity")
				.sendKeys("Chennai");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys(
				"600 097");
		WebElement we = driver
				.findElementById("createLeadForm_generalCountryGeoId");
		Select drop4 = new Select(we);
		drop4.selectByVisibleText("India");
		Select drop3 = new Select(
				driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		drop3.selectByValue("IN-TN");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		driver.close();
	}
}



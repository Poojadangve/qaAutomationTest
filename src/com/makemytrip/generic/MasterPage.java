package com.makemytrip.generic;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MasterPage {

	public static WebDriver driver;
	public Properties prop;
	public Properties or;

	// constructor
	public MasterPage() throws Exception {
		// configure properies file
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\makemytrip\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);

		// configure locators file
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\makemytrip\\repository\\locators.properties");
		or = new Properties();
		or.load(fis);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\eclipse-workspace\\qaAutomationTest\\com.makemytrip.driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("Open IE Browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.makemytrip.com/flights/");
	}

	public void click(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}

	public void enterdata(String xpath, String testdata) {

		driver.findElement(By.xpath(xpath)).sendKeys(testdata);
	}

	public void captureDateCalender(String xpathKey, String data, String xpathKey1, String xpathKey2, String data1)
			throws Exception {
		// String month = "January 2023";

		Thread.sleep(3000);
		WebElement month_year = driver.findElement(By.xpath(or.getProperty(xpathKey)));
		// System.out.println(month_year.getText());

		while (true) {
			if (month_year.getText().equalsIgnoreCase(or.getProperty(data))) {
				break;
			} else {
				driver.findElement(By.xpath(or.getProperty(xpathKey1))).click();
			}
		}

		Thread.sleep(3000);
		List<WebElement> dates = driver.findElements(By.xpath(or.getProperty(xpathKey2)));

		Thread.sleep(3000);
		// System.out.println(dates.size());
		// String ExpectedResult = "6";
		for (WebElement ele : dates) {
			String date_text = ele.getText();
			String date[] = date_text.split("\n");
			if (date[0].equals(or.getProperty(data1))) {

				ele.click();
				break;
			}
		}

	}

	public void selectListFromDropDown(String XpathKey, String data) {
		List<WebElement> list = driver.findElements(By.xpath(or.getProperty(XpathKey)));

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equalsIgnoreCase(or.getProperty(data))) {
				list.get(i).click();
				// System.out.println(ExpectedResult+" Adults clicked");
				// break;
			}
		}
	}
	
	public void moveToElement(String xpathkey)
	{
		Actions action=new Actions(driver);
		WebElement element = driver.findElement(By.xpath(or.getProperty(xpathkey)));
		action.moveToElement(element).build().perform();
	}

	public void autosuggest(String xpathKey, String data, String xpathKey1, String data1) throws Exception {
		WebElement selectData = driver.findElement(By.xpath(or.getProperty(xpathKey)));
		selectData.sendKeys(or.getProperty(data));
		Thread.sleep(3000);
		List<WebElement> toCity = driver.findElements(By.xpath(or.getProperty(xpathKey1)));
		// String ExpectedResult4 = "Mumbai, India";
		for (int i = 0; i < toCity.size(); i++) {
			if (toCity.get(i).getText().equalsIgnoreCase(or.getProperty(data1))) {
				toCity.get(i).click();
				// System.out.println(ExpectedResult4 + " clicked");
				break;
			}
		}

	}
	
	

}

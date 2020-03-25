package com.cts.Base;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebDriver {

	private WebDriver driver;

	public LaunchWebDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		return driver;
	}

	public void tearDown() {
		Date date = new Date();
		String dateStr = date.toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("src/test/resources/ScreenShot/image" + dateStr + ".png"));
		driver.quit();
	}
}

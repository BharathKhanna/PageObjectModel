package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadData;

public class ProjectSpecificMethods {

	public static ChromeDriver driver;
	String excelFileName = "";

	@BeforeMethod
	public void init() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	//@DataProvider(name = "fetch", indices = {0})
	//public String[][] fetchData() throws IOException {
	//String[][] data = ReadData.readData(excelFileName);
	//return data;
}


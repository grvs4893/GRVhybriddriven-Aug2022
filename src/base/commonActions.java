package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonActions {
	
protected static WebDriver driver;
	
	public final static WebDriver start(String url) {
		System.out.println("Step-1 : Verify Chrome Browser Launched");
		System.setProperty("webdriver.chrome.driver",
				"E:\\AUG 2022 CLASS\\HybridDrivenFrameWork2022\\drivers\\chromedriver_106.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public final static void close() {
		driver.close();
	}
	
	static public void scrollTillElement(WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	{

		System.out.println("Garvis");

		System.out.println("Gaurav");
	}
	
	{
		System.out.println("Sahu");
	}
	
	{
		System.out.println("Line 47");

		System.out.println("Line no.48 ");

	}
	
	
	
	
	
	
	
	
}

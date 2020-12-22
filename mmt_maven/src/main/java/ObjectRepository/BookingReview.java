package ObjectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingReview {
	public static void main(String[] args) throws IOException, InterruptedException {	
		// Create WebDriver Instance		
		WebDriver driver;			
		System.setProperty("webdriver.chrome.driver","C:\\automation testing drivers\\chromedriver.exe");				
		driver = new ChromeDriver();	
		driver.get("https://www.makemytrip.com/flight/review/?itineraryId=654515549678db3e6ceb6499c530d90e8d77c119&rKey=RKEY:2abc0823-b694-4d20-896b-28148c904778:58_0&crId=1db360e9-3207-454f-984c-5ecb6dffc426&cur=INR&openFF=undefined&xflt=eyJjIjoiRSIsInAiOiJBLTFfQy0wX0ktMCIsInQiOiIiLCJzIjoiSVhSLUJMUi0yMDIwMTIyMiJ9&ccde=IN");
		driver.manage().window().maximize();
		Properties obj = new Properties();					
		FileInputStream objfile = new FileInputStream("C:\\Users\\rishit\\workspace\\mmt_maven\\Config\\bookingreview.properties");
		obj.load(objfile);
		Thread.sleep(3000);
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
		WebElement coupon = driver.findElement(By.xpath(obj.getProperty("coupons_xpath")));
		coupon.click();
		coupon.sendKeys("FLYMON");
		Thread.sleep(3000);*/
		driver.findElement(By.xpath(obj.getProperty("SecureTrip_no_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("SecureTrip1_no_xpath"))).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(obj.getProperty("coupons_xpath"))).click();
		//driver.findElement(By.xpath(obj.getProperty("coupons_xpath"))).sendKeys("FLYMON");
		driver.findElement(By.xpath(obj.getProperty("apply_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("continuebtn_xpath"))).click();

	}
}

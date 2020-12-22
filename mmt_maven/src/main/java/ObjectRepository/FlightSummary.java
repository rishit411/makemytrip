package ObjectRepository;
import java.io.FileInputStream;		
import java.io.FileNotFoundException;		
import java.io.IOException;		
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlightSummary {
	public static void main(String[] args) throws IOException, InterruptedException {	
		// Create WebDriver Instance		
		WebDriver driver;			
		System.setProperty("webdriver.chrome.driver","C:\\automation testing drivers\\chromedriver.exe");				
		driver = new ChromeDriver();	
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flight/traveller/?itineraryId=5d3913853bbbdcfd5842024eb3920415d9dd4240&crId=e6aafbab-bd38-4b77-90f3-ea0ce1423927&cur=INR");
		driver.manage().window().maximize();
		Properties obj = new Properties();					
		FileInputStream objfile = new FileInputStream("C:\\Users\\rishit\\workspace\\mmt_maven\\Config\\FlightSummary.properties");
		obj.load(objfile);
		driver.findElement(By.xpath(obj.getProperty("AddAdult_xpath"))).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(obj.getProperty("FirstName_xpath"))).click();
		driver.findElement(By.xpath(obj.getProperty("FirstName_xpath"))).sendKeys("Rishit");
		Thread.sleep(3000);
		//driver.findElement(By.xpath(obj.getProperty("LastNmae_xpath"))).click();
		driver.findElement(By.xpath(obj.getProperty("LastName_xpath"))).sendKeys("Bansal");
		Thread.sleep(5000);
		//driver.findElement(By.xpath(obj.getProperty("Gender_xpath"))).click();
		Actions actions = new Actions(driver); 
		actions.moveToElement(driver.findElement(By.xpath(obj.getProperty("Gender_xpath")))).click().build().perform(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("MobileNo_xpath"))).click();
		driver.findElement(By.xpath(obj.getProperty("MobileNo_xpath"))).sendKeys("9901951644");
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("Email_xpath"))).click();
		driver.findElement(By.xpath(obj.getProperty("Email_xpath"))).sendKeys("rishitb411@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("Continuebtn_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("Confrim_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("Continue_btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("skiptopayement_btn"))).click();
		driver.findElement(By.xpath(obj.getProperty("skiptopayement_btn"))).click();



	}
}

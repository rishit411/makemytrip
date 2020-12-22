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

public class FlightSelection {
	public static void main(String[] args) throws IOException, InterruptedException {	
		// Create WebDriver Instance		
	    WebDriver driver;			
	    System.setProperty("webdriver.chrome.driver","C:\\automation testing drivers\\chromedriver.exe");				
	    driver = new ChromeDriver();	
	   // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.makemytrip.com/flight/search?itinerary=IXR-BLR-30/12/2020&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");					
	    driver.manage().window().maximize();			
	// Load the properties File		
	    
	    Properties obj = new Properties();					
	    FileInputStream objfile = new FileInputStream("C:\\Users\\rishit\\workspace\\mmt_maven\\Config\\FlightSelection.properties");									
	    obj.load(objfile);

	   // JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(obj.getProperty("Stops_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("Airlines_xpath"))).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(obj.getProperty("booknowbtn_xpath"))).click();
		//Thread.sleep(3000);
		Actions actions = new Actions(driver); 
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[2]/div[3]/div/div/div[3]/div[1]/div[1]/div/div/div/div[4]/button"))).click().build().perform(); 
		Thread.sleep(5000);
}

}

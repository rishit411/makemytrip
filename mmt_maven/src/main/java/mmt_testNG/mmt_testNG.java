package mmt_testNG;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class mmt_testNG {
	WebDriver driver;
	Date startdate=new Date();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	ChromeOptions option;


	@BeforeTest
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\automation testing drivers\\chromedriver.exe");

		option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();


	}


	@Test //public static void main(String[] args) throws InterruptedException
	public void alogin() throws InterruptedException 
	{	
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[6]/div[3]/div/div[1]/div[2]")).click();
		
		
		
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[6]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(
				"//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/div[4]/div[2]")).click();
		Thread.sleep(3000);

		String winHandleBefore = driver.getWindowHandle(); for(String winHandle :
			driver.getWindowHandles()) { driver.switchTo().window(winHandle); }

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(
				"mmt.flights.1234@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"))
		.click(); Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))
		.sendKeys("123makemytrip");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
		Thread.sleep(5000);

		//Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore); Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/div[1]/div/span")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/section/div[1]/div/span")).click(); 
		Thread.sleep(3000);
		}
	



	@Test
	public void bsearch() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Ranchi, India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")).click();
		Thread.sleep(3000);

		//enter destination city
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("Bengaluru, India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")).click();
		Thread.sleep(3000);

		//select date
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[4]")).click();
		Thread.sleep(3000);

		//click search button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
		Thread.sleep(3000);
	}


	@Test
	public void cfilter() throws InterruptedException
	{
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);

		//select filter as air india
		driver.findElement(By.xpath("//*[@id=\"section--wrapper\"]/div[1]/div[4]/div/span[1]/label/span/span")).click();
		//Thread.sleep(8000);
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[2]/div[3]/div/div/div[3]/div[1]/div[1]/div/div/div/div[4]/button")).click();
		Actions actions = new Actions(driver); 
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[2]/div[3]/div/div/div[3]/div[1]/div[1]/div/div/div/div[4]/button"))).click().build().perform(); 
		Thread.sleep(4000);
	}

	@Test
	public void dinsure() throws InterruptedException
	{

		for(String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}
		
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
	//	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/label[1]/input")).click();
		Actions actions = new Actions(driver); 
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/label[1]/input"))).click().build().perform(); 
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,1000)");
		
		
		Thread.sleep(3000);
	//	Actions actions2 = new Actions(driver); 
	//	actions2.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[6]/button"))).click().build().perform();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[6]/button")).click();
		Thread.sleep(3000);
		//	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/label[1]/input")).click();
		//	Thread.sleep(3000);
		
	}

	@Test
	public void eaddadult() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"wrapper_ADULT\"]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/input")).sendKeys("Mrigyank");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/input")).sendKeys("Shekhar");

		Actions actions = new Actions(driver); 
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div/label[1]"))).click().build().perform(); 

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"Mobile No\"]/div/input")).sendKeys("8294637726");
		//	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[4]/div/div/div[3]/div/input")).sendKeys("mmt.flights.1234@gmail.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);

		Actions actions1 = new Actions(driver); 
		actions1.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[9]/div/div/button"))).click().build().perform(); 
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/p[2]/a[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[5]/div[2]/p[5]/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/span/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/span/a")).click();
		Thread.sleep(3000);
		
	}
	
	

}

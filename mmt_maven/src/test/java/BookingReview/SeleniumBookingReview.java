package BookingReview;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBookingReview {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\automation testing drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flight/review/?itineraryId=878b736d987eaa4dafb016b486a01e87cbdadcac&rKey=RKEY:48d8f5e2-0237-4311-8542-ee814a29d9e6:53_0&crId=9efd61b5-8cf2-4bbe-997e-4345aa882232&cur=INR&openFF=undefined&xflt=eyJjIjoiRSIsInAiOiJBLTFfQy0wX0ktMCIsInQiOiIiLCJzIjoiSVhSLUJMUi0yMDIwMTIyMiJ9&ccde=IN");

		// TODO Auto-generated method stub
		// For no radio button
		driver.findElement(By.xpath("//*[@id=insurance-section]/div/div[3]/label[2]/input")).click();

		//add adult
		driver.findElement(By.xpath("//*[@id=wrapper_ADULT]/a")).click();

		// For blank First Name
		String op=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/div/p")).getText();
		if(op.contentEquals("First & Middle Name is required."))
			System.out.println("******firstname blank*************");
		//callAlert();

		// For valid First Name 
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/input")).sendKeys("Rishit");

		// For valid last name
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/input")).sendKeys("Bansal");

		// for gender not selects
		String op1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div/div[3]/div/p")).getText();
		if(op1.contentEquals("Gender is required."))
			System.out.println("*******gender not selected.*********");

		//gender is selected
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div/label[1]")).click();

		//for blank phone number
		String op2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/form/div[4]/div/div/div[2]/div/p")).getText();
		if(op2.contentEquals("Mobile No is required."))
			System.out.println("*********mobile phone is not selected***********");

		//valid phone number
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/form/div[4]/div/div/div[2]/div/input")).sendKeys("9901951644");

	}
}

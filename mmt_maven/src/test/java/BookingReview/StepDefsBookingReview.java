package BookingReview;

import java.awt.Desktop.Action;
import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefsBookingReview {
	private WebDriver driver;

	@Given("user is on booking review page")
	public void user_is_on_booking_review_page() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\automation testing drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flight/review/?itineraryId=bd18018b5d73425abef0159c09b978cbcd34a812&rKey=RKEY:6e91e010-8d40-444f-9afe-c9704aa62041:19_0&crId=b6d5fd0c-9daf-47a3-b33e-763e367edc8a&cur=INR&openFF=undefined&xflt=eyJjIjoiRSIsInAiOiJBLTFfQy0wX0ktMCIsInQiOiIiLCJzIjoiSVhSLUJMUi0yMDIwMTIzMCJ9&ccde=IN");
		driver.manage().window().maximize();
		//throw new io.cucumber.java.PendingException();
	}

	@When("user select the no radio button for securing the trip")
	public void user_select_the_no_radio_button_for_securing_the_trip() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/label[2]/input")).click();
		Thread.sleep(10000);
		WebElement securetrip = driver.findElement(By.xpath("//*[@id='insurance-section']//input[@value='no']"));
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",securetrip);*/
		
		Actions actions = new Actions(driver); 
		actions.moveToElement(securetrip).click().build().perform();
		
		Thread.sleep(10000);
		//throw new io.cucumber.java.PendingException();
	}

	@Then("fare summary remains the same")
	public void fare_summary_remains_the_same() {
		// Write code here that turns the phrase above into concrete actions
		String cost = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[4]/p/span[2]/span/span")).getText();
		if(cost.contentEquals("₹ 6,830"))
			System.out.println("fare summary remains same");
		else
			System.out.println("fare summary changes");

		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[6]/button")).click();

		//throw new io.cucumber.java.PendingException();
	}





}

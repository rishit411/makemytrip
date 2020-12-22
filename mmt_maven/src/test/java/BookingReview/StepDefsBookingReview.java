package BookingReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		driver.get("https://www.makemytrip.com/flight/review/?itineraryId=f3d6ea133f750326261bdd6038249243a3f3e1e0&rKey=RKEY:5c9cb4e4-44dd-40dd-84b0-69a9e80f4836:19_0&crId=e048b230-5393-4118-b1cf-b286bcf81732&cur=INR&openFF=undefined&xflt=eyJjIjoiRSIsInAiOiJBLTFfQy0wX0ktMCIsInQiOiIiLCJzIjoiSVhSLUJMUi0yMDIwMTIzMCJ9&ccde=IN");
		driver.manage().window().maximize();
		//throw new io.cucumber.java.PendingException();
	}

	@When("user select the no radio button for securing the trip")
	public void user_select_the_no_radio_button_for_securing_the_trip() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/label[2]/input")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='insurance-section']//input[@value='yes']")).click();
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

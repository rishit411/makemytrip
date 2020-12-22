package BookingSummary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefsBookingSummary {
	private WebDriver driver;

	@Given("user is on booking review page")
	public void user_is_on_booking_review_page() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\automation testing drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flight/traveller/?itineraryId=f3d6ea133f750326261bdd6038249243a3f3e1e0&crId=e048b230-5393-4118-b1cf-b286bcf81732&cur=INR");
		driver.manage().window().maximize();
		//throw new io.cucumber.java.PendingException();
	}

	@When("clicks on add traveller")
	public void clicks_on_add_traveller() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/a")).click();
		//throw new io.cucumber.java.PendingException();
	}

	@When("user leaves firstname blank")
	public void user_leaves_firstname_blank() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/input")).sendKeys("");
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enters lastname")
	public void user_enters_lastname() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/input")).sendKeys("Bansal");
		//throw new io.cucumber.java.PendingException();
	}

	@When("user selects the gender")
	public void user_selects_the_gender() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div/label[1]")).click();
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enters a phone number")
	public void user_enters_a_phone_number() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/form/div[4]/div/div/div[2]/div/input")).sendKeys("9901951644");
		
		// throw new io.cucumber.java.PendingException();
	}

	@When("user enters an email-id")
	public void user_enters_an_email_id() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[4]/div/div/div[3]/div/input")).sendKeys("rishitb411@gmail.com");
		//throw new io.cucumber.java.PendingException();
	}
	@When("user clicks on continue")
	public void user_clicks_on_continue() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		Actions actions = new Actions(driver); 
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[9]/div/div/button"))).click().build().perform(); 
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[10]/div/div/button")).click();
		//throw new io.cucumber.java.PendingException();
	}
	@Then("alert message is displayed")
	public void alert_message_is_displayed() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		/*Thread.sleep(3000);
		String op=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/div/p")).getText();
		if(op.contentEquals("First & Middle Name is required."))*/
		System.out.println("First & Middle Name is required.");
		//driver.close();
		//throw new io.cucumber.java.PendingException();
	}
	
	@When("user enters firstname")
	public void user_enters_firstname() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/input")).sendKeys("Rishit");
	    //throw new io.cucumber.java.PendingException();
	}
	@When("user doesnot enter a phone number")
	public void user_doesnot_enter_a_phone_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/form/div[4]/div/div/div[2]/div/input")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/form/div[4]/div/div/div[2]/div/input")).sendKeys("");
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("user is redirected to make payment page")
	public void user_is_redirected_to_make_payment_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user naviagtes to payment page");
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/p[2]/a[2]")).click();
		Thread.sleep(3000);
        driver.get("https://www.makemytrip.com/flight/ancillary/?crId=b286423f-cdad-4e86-a605-a78d26ac1b63&itineraryId=e029e2f22d9282f5768c3fa2c61fafc32cef54ab");*/		
	 //   throw new io.cucumber.java.PendingException();
	}

	
}

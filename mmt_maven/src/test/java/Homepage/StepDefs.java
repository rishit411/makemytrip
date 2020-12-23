package Homepage;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebDriver;

public class StepDefs {
	static WebDriver driver; 
	String title;
	ChromeOptions option;

	@Given("user is on mmt homepage")
	public void user_is_on_mmt_homepage() {

		System.setProperty("webdriver.chrome.driver","C:\\automation testing drivers\\chromedriver.exe");
		//"C:\\Users\\mrshekha\\Downloads\\chromedriver_win32\\chromedriver.exe");

		option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[7]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/div[5]/div[2]")).click();
		Thread.sleep(3000);

		String winHandleBefore = driver.getWindowHandle(); for(String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }

		Thread.sleep(3000);
	}

	@When("user enters invalid username")
	public void user_enters_invalid_username() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("mmt.flights.i12b99@gmail.com");
		Thread.sleep(3000);
	}

	@When("user clicks on next button")
	public void user_clicks_on_next_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		Thread.sleep(3000);
	}

	@Then("Text appears invalid username")
	public void text_appears_invalid_username()throws InterruptedException {
		Thread.sleep(3000);
		String op=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[3]/div[2]")).getText();
		Thread.sleep(3000);
		if(op.contentEquals("Couldn't find your Google Account"))
			System.out.println("\n\n\t\t** invalid email **\n\n");




		//Thread.sleep(3000);
		driver.quit();
	}

	@When("user clicks on login button1")
	public void user_clicks_on_login_button1()throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[6]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/div[4]/div[2]")).click();
		Thread.sleep(3000);

		String winHandleBefore = driver.getWindowHandle(); for(String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }

		Thread.sleep(3000);
	}

	@When("user enters valid username")
	public void user_enters_valid_username() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("mmt.flights.1234@gmail.com");
		Thread.sleep(3000);

	}
	@When("clicks on next button1")
	public void clicks_on_next_button1()throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		Thread.sleep(3000);
	}
	@When("invalid password")
	public void invalid_password() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("123456mmt"); 
		//Thread.sleep(3000);
	}
	@When("user clicks on signin1")
	public void user_clicks_on_signin1()throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
		Thread.sleep(3000);
	}
	@Then("text appears invalid password")
	public void text_appears_invalid_password()throws InterruptedException {
		String op1=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]")).getText();
		System.out.println(op1);
		if(op1.contentEquals("Wrong password. Try again or click Forgot password to reset it."))
			System.out.println("\n\n\t\t** invalid password **\n\n");

		driver.quit();
	}

	@When("user clicks on login button2")
	public void user_clicks_on_login_button2() throws InterruptedException{
		user_clicks_on_login_button1();
	}
	@When("user enters valid username1")
	public void user_enters_valid_username1()throws InterruptedException {
		user_enters_valid_username();
	}
	@When("clicks on next button2")
	public void clicks_on_next_button2() throws InterruptedException {
		clicks_on_next_button1();
	}
	@When("valid password1")
	public void valid_password1()throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("123makemytrip");
	}
	@When("clicks on signin2")
	public void clicks_on_signin2()throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
		Thread.sleep(5000);
	}
	@Then("Successful login")
	public void successful_login()throws InterruptedException {
		for(String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}
		System.out.println("\n\n\t\t** Successful Login **\n\n");


		driver.close();
	}

	@When("user clicks on oneway")
	public void user_clicks_on_oneway() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/ul/li[1]")).click();
	}
	@When("user enters source city")
	public void user_enters_source_city()throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Ranchi, India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")).click();
		Thread.sleep(3000);
	}
	@When("user enters destination city")
	public void user_enters_destination_city() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("Bengaluru, India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")).click();
		Thread.sleep(3000);
	}
	@When("user enters departure date and clicks on search button")
	public void user_enters_departure_date_and_clicks_on_search_button()throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/p/a")).click();
	}
	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page()throws InterruptedException {
		//click search button
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
		System.out.println("\n\n\t\t** navigated to search results **\n\n");
		Thread.sleep(3000);
		driver.quit();
	}

	@When("user clicks on roundtrip")
	public void user_clicks_on_roundtrip() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/ul/li[2]")).click();
	}
	@When("user enters source city1")
	public void user_enters_source_city1() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Ranchi, India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")).click();
		Thread.sleep(3000);
	}
	@When("user enters destination city1")
	public void user_enters_destination_city1() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("Bengaluru, India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")).click();
		Thread.sleep(3000);
	}
	@When("user enters departure date")
	public void user_enters_departure_date() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@When("user enters arrival date and clicks on search button")
	public void user_enters_arrival_date_and_clicks_on_search_button()throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[5]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/p/a")).click();
	}
	@Then("user is navigated to search results page1")
	public void user_is_navigated_to_search_results_page1()throws InterruptedException {
		//click search button
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
		System.out.println("\n\n\t\t** navigated to search results **\n\n");

		driver.quit();
	}



}

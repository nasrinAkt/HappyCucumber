package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class step {
	WebDriver driver;
	@Given("^open demoblaze application$")
	public void open_demoblaze_application() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
		 ChromeOptions run = new ChromeOptions();
		 run.addArguments("--remote-allow-origins=*");
		 
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.demoblaze.com/index.html");
		 
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.manage().window().maximize();
		   
	}

	@Then("^click sign up$")
	public void click_sign_up() throws Throwable {
		WebElement m = driver.findElement(By.id("signin2"));
		m.click();
	   
	}

	@Then("^Enter username$")
	public void enter_username() throws Throwable {
		WebElement n = driver.findElement(By.id("sign-username"));
		n.sendKeys("hello");
	    
	}

	@Then("^Enter password$")
	public void enter_password() throws Throwable {
		WebElement h = driver.findElement(By.id("sign-password"));
		h.sendKeys("1234");
		
		Thread.sleep(5000);
		driver.close();
	   
	}
	
	
	
}

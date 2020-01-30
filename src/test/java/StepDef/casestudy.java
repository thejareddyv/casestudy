package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy {
	WebDriver driver;
	@When("user registered into testme app")
	public void user_registered_into_testme_app() {
		System.out.println("Launch chrome browser");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\selenium drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    System.out.println("Navigates to application");
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.name("userName")).sendKeys("thejareddyv");
		driver.findElement(By.name("password")).sendKeys("theju321");
		driver.findElement(By.name("Login")).click();

	}

	@When("user search a particular products like headphones")
	public void user_search_a_particular_products_like_headphones() {
		driver.findElement(By.name("products")).sendKeys("head");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	    
	}

	@When("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/i")).getText();
		String cart=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/i")).getText();

		Assert.assertFalse(cart, false);
	    
	}

	@Then("Test me app does not display the cart icon")
	public void test_me_app_does_not_display_the_cart_icon() {
		driver.close();
	   
	}
}

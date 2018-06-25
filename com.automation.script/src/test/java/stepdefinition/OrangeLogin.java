package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeLogin {
	FirefoxDriver driver;

	@Given("^The browser is launched and we navigate to url$")
	public void the_browser_is_launched_and_we_navigate_to_url() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver.exe");
		   driver=new FirefoxDriver();
		   driver.get("http://opensource.demo.orangehrmlive.com/index.php/admin/viewAdminModule");
		   
	}

	@When("^We enter username and password$")
	public void we_enter_username_and_password() throws Throwable {

	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	
	}

	@When("^Click an login Button$")
	public void click_an_login_Button() throws Throwable {
		 driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^It should display welcome Admin msg$")
	public void it_should_display_welcome_Admin_msg() throws Throwable {
		 String expmsg="Welcome Admin";
		    Thread.sleep(8000);
		    String actmsg=driver.findElement(By.id("welcome")).getText();
		    if(actmsg.contains(expmsg))
		    	System.out.println("passed");
	//Assert.assertEquals(actmsg, expmsg);
		    
	//driver.close();
	}


}

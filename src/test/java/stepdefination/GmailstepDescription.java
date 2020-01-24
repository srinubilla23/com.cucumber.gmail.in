package stepdefination;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.leeyazhou.cobertura.javancss.ccl.FileUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailstepDescription 
{
	WebDriver driver;
	
	@Given("^open chromebrowser$")
	public void open_chromebrowser() throws Throwable 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("start-maximized");
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(opt);
		opt.addArguments("--disable notification");
	}

	@Then("^Enter gmail URL$")
	public void enter_gmail_URL() throws Throwable 
	{
	    driver.get("http://www.gmail.com");
	    String web=driver.getTitle();
	    if(web.equalsIgnoreCase("Gmail"))
	    {
	    	System.out.println("Test Pass");
	    }
	    else
	    {
	    	System.out.println("Test Fail");
	    	File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	File scr1=new File("image.PNG");
	    	FileUtils.copyFile(f1, scr1);
	    }
	}

	@When("^Enterr \"([^\"]*)\"$")
	public void enterr(String mailid) throws Throwable 
	{
	    driver.findElement(By.name("identifier")).sendKeys(mailid);
	}

	@When("^click Nextt Button$")
	public void click_Nextt_Button() throws Throwable 
	{
	    driver.findElement(By.xpath("(//*[contains (text(), 'Next')])[2]")).click();
	}

	@Then("^Enter \"([^\"]*)\"$")
	public void enter(String password) throws Throwable 
	{
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^click Next Button$")
	public void click_Next_Button() throws Throwable 
	{
		driver.findElement(By.xpath("(//*[contains (text(), 'Next')])[2]")).click();
	}

	@When("^mailid and password correct expected to display gmail home page$")
	public void mailid_and_password_correct_expected_to_display_gmail_home_page() throws Throwable 
	{
	    String hp=driver.getTitle();
	    if(hp.contains("indox"))
	    	{
	    		System.out.println("Gmail Successfull Login");
	    	}
	    else
	    {
	    	System.out.println("Gmail Not Successfull Login");
	    	File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	File scr2=new File("image2.PNG");
	    	FileUtils.copyFile(f2, scr2);
	    }
	}

	@Then("^close site$")
	public void close_site() throws Throwable 
	{
	    driver.close();
	}
}

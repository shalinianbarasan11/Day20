
  package Cucumber.steps;
  
  import org.openqa.selenium.By; 
  import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import
  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And; 
  import io.cucumber.java.en.Given; import
  io.cucumber.java.en.Then; 
  import io.cucumber.java.en.When;
  
  public class RegistrationSteps {
  
  WebDriver driver;
  
  @Given("user open demoqa practice form") 
  public void user_open_demoqa_practice_form() { 
	  
	  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://demoqa.com/automation-practice-form"); 
  }
  
  @When("the user enters {string} and {string}")
  public void the_user_enters_and(String string, String string2) {
  driver.findElement(By.id("firstName")).sendKeys("Shalini");
  driver.findElement(By.id("lastName")).sendKeys("Anbu");
  
  }
  
  @And("the user enters email {string}")
  public void the_user_enters(String string) {
  driver.findElement(By.id("userEmail")).sendKeys("shalini11@gmail.com");
  }
  
  @And("the user select gender") 
  public void the_user_select_gender() {
  driver.findElement(By.id("gender-radio-2")).click();
  }
  @And("the user enters mobileNO {string}")
  public void the_user_enters_mobile_no(String string) {
     driver.findElement(By.id("userNumber")).sendKeys("9837366471");
  }
  
  @And("the user select hobbies")
  public void the_user_select_hobbies() throws InterruptedException {
	  
  WebElement src =driver.findElement(By.xpath("//label[text()='Music']")); 
  Thread.sleep(2000);
  Actions mouseActions = new Actions(driver);
  mouseActions.scrollByAmount(0, 600).perform();
	mouseActions.moveToElement(src).perform();
	src.click();
  }
  

  @And("the user enters address {string}")
public void the_user_enters_address(String string) {
    driver.findElement(By.id("currentAddress")).sendKeys("1/13 seoul st");
}

  
  @And("the user submit the form") 
  public void the_user_submit_the_form() {
  driver.findElement(By.id("submit")).click();
  }
  
  @Then("form submitted successfully")
  public void form_submitted_successfully() throws InterruptedException {
	  
	  System.out.println("Form submitted successfully");
	  
	  Thread.sleep(2000);
	  driver.quit();
  }


  
  }
 
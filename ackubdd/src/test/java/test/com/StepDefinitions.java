/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Uma
 */
public class StepDefinitions {
    
    private static WebDriver driver;
    private String baseUrl; 
    
    @Given("^user is already on Bulletin Home Page$")
public void user_is_already_on_Bulletin_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    driver = new ChromeDriver(options);
    baseUrl = "https://bamboo-gardens.com/";
    driver.manage().window().maximize();
    driver.get(baseUrl);
    driver.findElement(By.cssSelector("[title=\"IBG Bulletin\"]")).click();
    Thread.sleep(2000);
}

@Then("^user enters data name emaile$")
public void user_enters_data_name_emaile() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("Name")).click();
    driver.findElement(By.id("Name")).clear();
    driver.findElement(By.id("Name")).sendKeys("Arti Verma");
    Thread.sleep(2000);
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).clear();
    driver.findElement(By.id("Email")).sendKeys("ackuselenium@gmail.com");
    Thread.sleep(2000);
}

@Then("^user clicks on Schaumburg on Select Location Page$")
public void user_clicks_on_Schaumburg_on_Select_Location_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    new Select(driver.findElement(By.xpath("(//select[@id='Location'])[2]"))).selectByVisibleText("Chicago, IL - Schaumburg");
    driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    driver.findElement(By.xpath("//div[@id='contact_form_fields']/div[4]")).click();
}

@Then("^user enters captcha code on Bulletin Page$")
public void user_enters_captcha_code_on_Bulletin_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("Captcha")).click();
    driver.findElement(By.name("Captcha")).click();
    driver.findElement(By.name("Captcha")).clear();
    driver.findElement(By.name("Captcha")).sendKeys("5738");
}

@Then("^user clicks on Submit Form on Bulletin Page$")
public void user_clicks_on_Submit_Form_on_Bulletin_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//input[@value='Send']")).click(); 
}

@Then("^user closes the browser for bulletin$")
public void user_closes_the_browser_for_bulletin() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.close();
}

@Given("^user is already on Bamboo Home Page$")
public void user_is_already_on_Bamboo_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        baseUrl = "https://bamboo-gardens.com/";
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
}

@Then("^user enters data name email and phone$")
public void user_enters_data_name_email_and_phone() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.cssSelector("[title=\"Catering\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("Charu Jain");
        Thread.sleep(2000);

        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("ackuselenium@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.id("Phone")).click();
        driver.findElement(By.id("Phone")).clear();
        driver.findElement(By.id("Phone")).sendKeys("4039067731");
        Thread.sleep(2000); 

}

@Then("^user clicks on Schaumburg Location in Select Location Page$")
public void user_clicks_on_Schaumburg_Location_in_Select_Location_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
        new Select(driver.findElement(By.xpath("(//select[@id='Location'])[2]"))).selectByVisibleText("Chicago, IL - Schaumburg");
        driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
        Thread.sleep(2000);
}

@Then("^user enters comments on Catering Page$")
public void user_enters_comments_on_Catering_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("Comment")).click();
        driver.findElement(By.id("Comment")).clear();
        driver.findElement(By.id("Comment")).sendKeys("needs some information");
        Thread.sleep(2000);
}

@Then("^user enters captcha code on Catering Page$")
public void user_enters_captcha_code_on_Catering_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
      driver.findElement(By.name("Captcha")).click();
      driver.findElement(By.name("Captcha")).clear();
      driver.findElement(By.name("Captcha")).sendKeys("6543");
}

@Then("^user clicks on Submit Form$")
public void user_clicks_on_Submit_Form() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//input[@value='Submit Form']")).click();
    
}

@Then("^user closes the catering browser session$")
public void user_closes_the_catering_browser_session() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.close();
}

@Given("^user is already on Login Page$")
public void user_is_already_on_Login_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
         System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--start-maximized");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        baseUrl = "https://www.inchinsonline.com/login";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
}

@When("^login page is loaded$")
public void login_page_is_loaded() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebDriverWait wait = new WebDriverWait(driver, 15);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
    Assert.assertEquals("Login | Inchin's Bamboo Garden - Pan Asian Cuisine", driver.getTitle());
}

@Then("^user enters data username and password$")
public void user_enters_data_username_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("email")).sendKeys("ackuselenium5@gmail.com");
    System.out.println("Email Entered");
    driver.findElement(By.name("password")).sendKeys("itexperts");
    System.out.println("Password entered");
}

@Then("^user clicks on Submit button$")
public void user_clicks_on_Submit_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    System.out.println("Login completed");
}

@Then("^user clicks on Schaumburg Location on Select Location Page$")
public void user_clicks_on_Schaumburg_Location_on_Select_Location_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//*[@id=\"location-list\"]/li[1]/h4/a")).click();
    System.out.println("Schaumburg location selected");
}

@Then("^user clicks on Main Menu option on Menu Page$")
public void user_clicks_on_Main_Menu_option_on_Menu_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li/h5")).click();
    System.out.println("Main Menu selected");
}

@When("^products page is loaded$")
public void products_page_is_loaded() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebDriverWait wait = new WebDriverWait(driver, 15);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"all-categories\"]/ul/li[6]/a")));
    Assert.assertEquals("Products | Inchin's Bamboo Garden - Pan Asian Cuisine", driver.getTitle());
}

@Then("^user clicks Noodles Section$")
public void user_clicks_Noodles_Section() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//*[@id=\"all-categories\"]/ul/li[6]/a")).click();
    System.out.println("Clicked Noodles Section");
}

@Then("^user clicks Selected Hakka Noodles$")
public void user_clicks_Selected_Hakka_Noodles() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebDriverWait wait = new WebDriverWait(driver, 15);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://s3-us-west-2.amazonaws.com/www.gethomesome.com/productimages/ibg-noodles-hakka-mod.jpg']")));
    driver.findElement(By.xpath("//img[@src='https://s3-us-west-2.amazonaws.com/www.gethomesome.com/productimages/ibg-noodles-hakka-mod.jpg']")).click();
    System.out.println("Selected Hakka Noodles");
}

@Then("^user clicks Add to Cart$")
public void user_clicks_Add_to_Cart() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("update-btn")).click();
    System.out.println("Item Added to Cart");
}

@Then("^user clicks Cart$")
public void user_clicks_Cart() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[7]/a/span[2]")).click();
    System.out.println("Cart Selected");
}

@When("^cart page is loaded$")
public void cart_page_is_loaded() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebDriverWait wait = new WebDriverWait(driver, 15);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[2]/div/a")));
    Assert.assertEquals("Cart | Inchin's Bamboo Garden", driver.getTitle());  
}

@Then("^user clicks Checkout$")
public void user_clicks_Checkout() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[2]/div/a")).click();
    System.out.println("Checkout Selected");
}

@Then("^user enters Credit Card Number$")
public void user_enters_Credit_Card_Number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("ccNumber")).sendKeys("234567891234");
    System.out.println("Credit Card Number Entered");
}

@Then("^user enters Credit Card Expiry Date$")
public void user_enters_Credit_Card_Expiry_Date() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("ccExpiry")).sendKeys("10/23");
    System.out.println("Credit Card Expiry Entered");
}

@Then("^user enters Credit Card CVV Number$")
public void user_enters_Credit_Card_CVV_Number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.name("ccCvc")).sendKeys("203");
     System.out.println("Credit Card CVV Number Entered");
}

@Then("^user enters Telephone Number$")
public void user_enters_Telephone_Number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("phoneUS")).sendKeys("4029067731");
    System.out.println("Phone Number Entered");
}

@Then("^user clikcs Place Order$")
public void user_clikcs_Place_Order() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[4]/div[2]/div/ul/li[7]/div/a")).click();
    System.out.println("Order Placed");
    Thread.sleep(1000);
}

@When("^order successfully placed$")
public void order_successfully_placed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebDriverWait wait = new WebDriverWait(driver, 15);    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"checkout-error\"]")));
    String bodyText = driver.findElement(By.xpath("//*[@id=\"checkout-error\"]")).getText();
    Assert.assertEquals("There was an error validating the payment information, please make sure your credit card details and billing address are correct and try again.", bodyText);
       
}

@Then("^user clicks on ACKU Menu on main page$")
public void user_clicks_on_ACKU_Menu_on_main_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//b[@class='caret']")).click();
    System.out.println("ACKU Menu Selected");
}

@Then("^user clicks on Logoff$")
public void user_clicks_on_Logoff() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[6]/ul/li[4]/a")).click();
    System.out.println("Logout completed");
}

@Then("^user closes the browser$")
public void user_closes_the_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.close();
}

@Given("^user is already in login Test Page$")
public void user_is_already_in_login_Test_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    options.addArguments("--window-size=1920,1080");
    options.addArguments("--start-maximized");
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    baseUrl = "https://bamboo-gardens.com/";
    WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
}

@Then("^user gives email address on newsletter section$")
public void user_gives_email_address_on_newsletter_section() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.get(baseUrl);
    driver.findElement(By.id("newsletter")).click();
    driver.findElement(By.id("newsletter")).clear();
    driver.findElement(By.id("newsletter")).sendKeys("ackuselenium@gmail.com");
}

@Then("^user selects Schamburg location$")
public void user_selects_Schamburg_location() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("Location")).click();
    new Select(driver.findElement(By.id("Location"))).selectByVisibleText("Chicago, IL - Schaumburg");
    driver.findElement(By.id("Location")).click();
    Thread.sleep(2000);
}

@Then("^user clicks Order Online link to test login feature$")
public void user_clicks_Order_Online_link_to_test_login_feature() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.linkText("Order Online")).click();
}

@Then("^user selects Location and Main Options$")
public void user_selects_Location_and_Main_Options() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.linkText("Select This Location")).click();
    driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li/h5")).click();
    driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a")).click();
    Thread.sleep(2000);
}

@Then("^user enters username and password$")
public void user_enters_username_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("ackuselenium@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("itexperts");
    Thread.sleep(2000);
}

@Then("^user clicks submit$")
public void user_clicks_submit() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
}

@Then("^user closes brower for login test session$")
public void user_closes_brower_for_login_test_session() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.close();
}

    
}

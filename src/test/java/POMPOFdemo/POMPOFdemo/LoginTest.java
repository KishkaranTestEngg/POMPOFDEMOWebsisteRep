package POMPOFdemo.POMPOFdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Objectrepository.Addtocartbuyedproduct;
import Objectrepository.Aftercheckoutmovetobillingdetailspage;
import Objectrepository.Buynewproductpage;
import Objectrepository.Finallybuyingproductshoppingcartpage;
import Objectrepository.LoginPage;
import Objectrepository.MyAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginTest 
{

WebDriver driver;	
ExtentReports extent;
@BeforeTest
public void startreport() {
	extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
	extent.attachReporter(spark);

}
@AfterTest
public void closeTest() {
	extent.flush();
}

@Test	
public void login()
{
	ExtentTest test = extent.createTest("Homepage");
	WebDriverManager.chromedriver().setup();
	ChromeOptions Options = new ChromeOptions();
	Options.addArguments("--remote-allow-origin=*");
	driver = new ChromeDriver(Options);
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	test.log(Status.PASS, "HomepagenaviagtedSuccessfully");
	
	ExtentTest test1 = extent.createTest("Loginpage");
	LoginPage lp = new LoginPage(driver);
	lp.emailfield().sendKeys("venkatakishore@cashlinkglobal.com");
	lp.Passwordfield().sendKeys("Tester@123");
	lp.Submitbtn().click();
	test.log(Status.PASS,"UserloginSuccessfully");
	
	ExtentTest test2 = extent.createTest("Myaccountpage");
	MyAccountPage MAP = new MyAccountPage(driver);
	Assert.assertTrue(MAP.Accountbreadcrumb().isDisplayed());
	test.log(Status.PASS,"Usernaviagted toAccountpageSuccessfully");
	
	ExtentTest test3 = extent.createTest("Bynewproductpage");
	Buynewproductpage bnp = new Buynewproductpage(driver);
	bnp.clickphonemenu().click();
	String Actual = driver.getTitle();
    String Expected = "Phones & PDAs";

    if (Actual.equals(Expected)) {
               System.out.println("Test Passed!");
    } else {
               System.out.println("Test Failed");
    }
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,250)", "");
    bnp.clickaddtocart().click();
    System.out.println("Selecting the product as mobile");
    js.executeScript("window.scrollBy(0,-250)", "");
    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    bnp.checkalertmessage().click();
    bnp.clickalertmessagebuyshoppingcartpage().click();
    js.executeScript("window.scrollBy(0,250)", "");
    test.log(Status.PASS, "NewproductpurchasedSuccessfully");
    
    ExtentTest test4 = extent.createTest("Addtocartnewproductbuy");
    Addtocartbuyedproduct acbp = new  Addtocartbuyedproduct(driver);
    acbp.checkquantitybox().click();
    acbp.checkquantitybox().clear();
    System.out.println("Product mobile choosed with 2 quantity");
    acbp.clearandaddquantity().sendKeys("2");
    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);;
    acbp.Finallyaddproducttocart().click();
    System.out.println("Finally mobile product added to the cart");
    test.log(Status.PASS, "Product added to cart details scuccessfully");
    
    ExtentTest test5 = extent.createTest("Finallybuyingproductshoppingcartpage");
    Finallybuyingproductshoppingcartpage fbps = new Finallybuyingproductshoppingcartpage(driver); 
    js.executeScript("window.scrollBy(0,250)", ""); 
    WebElement Mouseoverelementshoppingcart=driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]/a[2]"));
    Actions action = new Actions(driver);	   
    action.moveToElement(Mouseoverelementshoppingcart);
    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    //fbps.Movemouseovershoppigcart().click();
    fbps.Productgettingaddedshoppingpage().click();
    fbps.changeproductquantityasneeded().click();
    fbps.changeproductquantityasneeded().clear();
    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    fbps.changeproductquantityasneeded().sendKeys("2");
    fbps.updatequantityasneeded().click();
    System.out.println("Product Getting paid and moved for shipment");
    fbps.clickcheckoutforshipping().click();
    test.log(Status.PASS,"Productbuyed Successfully!");
    
    ExtentTest test6 = extent.createTest("Aftercheckoutmovetobillingdetailspage");
    Aftercheckoutmovetobillingdetailspage acob = new Aftercheckoutmovetobillingdetailspage(driver);
    js.executeScript("window.scrollBy(0,250)", "");
    //acob.clickthedvdropdownbutton().click();
    acob.clickcontinuebuttonbillingdetails().click();
    System.out.println("Checked the UserDeliveryaddress ready to Deliver");
    test.log(Status.PASS,"Productbilled  Successfully!");
    
    
}
//@AfterMethod
//public void closure()
//{
//	driver.close();
//}

	

}

package Objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage 
{

WebDriver driver;

public MyAccountPage(WebDriver driver)
{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}

//private By Accountbreadcrumb = By.xpath("//ul[@class='breadcrumb']//a[text()='Account']");

 @FindBy (xpath="//ul[@class='breadcrumb']//a[text()='Account']")
 private WebElement Accountbreadcrumb;

public WebElement Accountbreadcrumb()
{
	//return driver.findElement(Accountbreadcrumb);
	
	return Accountbreadcrumb;
}

	
}
package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  WebDriver driver;
  
  public LoginPage(WebDriver driver) 
  {
	  this.driver=driver;
	  
	  PageFactory.initElements(driver, this);
  }
  
// private By Emailaddress =By.id("input-email"); it an POM  implemented here
// 
// private By Passwordfield=By.name("password");
// 
// private By Submitbtn =By.xpath("//input[@type='submit']");
  
  @FindBy(id="input-email")
  private WebElement email;
  
  @FindBy(name="password")
  private WebElement password;
  
  @FindBy(xpath="//input[@type='submit']")
  private WebElement submitbtn;
  

public WebElement emailfield()
{
	//return driver.findElement(Emailaddress);  As already webelemnt is returing driver.findelement (POM technique)
	
	return email;
}

public WebElement Passwordfield()
{
	return password;
}

public WebElement Submitbtn()
{
	return submitbtn;
}
	
}

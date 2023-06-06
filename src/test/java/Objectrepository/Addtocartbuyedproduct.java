package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartbuyedproduct 
{
	WebDriver driver;
	
	public Addtocartbuyedproduct (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"input-quantity\"]")
	
	private WebElement checkquantitybox;
	
	@FindBy(xpath="//*[@id=\"input-quantity\"]")
	
	private WebElement clearandaddquantity;
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	
	private WebElement Finallyaddproductcart;



public WebElement checkquantitybox()
{
	return checkquantitybox;
}

public WebElement clearandaddquantity()
{
	return clearandaddquantity;
}

public WebElement Finallyaddproducttocart()
{
	return Finallyaddproductcart;
}

}

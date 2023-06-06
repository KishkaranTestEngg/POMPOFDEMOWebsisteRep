package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Aftercheckoutmovetobillingdetailspage 
{
	WebDriver driver;
	
	public Aftercheckoutmovetobillingdetailspage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//*[@id=\"accordion\"]/div[3]/div[1]/h4/a")
//	private WebElement clickthedvdropdownbutton;
	
	@FindBy(xpath="//*[@id=\"button-payment-address\"]")
	private WebElement clickcontinueinbillingdetailspage;
	
	
//	public WebElement clickthedvdropdownbutton()
//	{
//		return clickthedvdropdownbutton;
//	}
	
	
	public WebElement clickcontinuebuttonbillingdetails()
	{
		return clickcontinueinbillingdetailspage;
	}
	

}

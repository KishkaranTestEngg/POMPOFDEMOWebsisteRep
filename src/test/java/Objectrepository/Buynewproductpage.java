package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class Buynewproductpage 
{
	WebDriver driver;	
	
	public Buynewproductpage (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy (xpath="//ul[@class='nav navbar-nav']//a[text()='Phones & PDAs']")
	 private WebElement clickphonemenu;
    
    @FindBy (xpath="//ul[@class='breadcrumb']//a[text()='Phones & PDAs']")
    private WebElement checkpagename;
    
    @FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]/i")
    private WebElement clickaddtocart;  // 
    
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
    private WebElement checkalertmessage;
    
    @FindBy(xpath="//*[@id=\"product-category\"]/div[1]/a[1]")
    private WebElement clickalertmessagebuyshoppingcartpage;


	public WebElement clickphonemenu()
	{
		return clickphonemenu;
	}

	public WebElement checkpagename()
	{
		return checkpagename;
	}
	public WebElement clickaddtocart()
	{
		return clickaddtocart;

	}
	public WebElement checkalertmessage()
	{
		return checkalertmessage;
	}
	
	public void Needclickhtctouchid()
	{
		
	}
	public WebElement clickalertmessagebuyshoppingcartpage()
	{
		return clickalertmessagebuyshoppingcartpage;
	}




}




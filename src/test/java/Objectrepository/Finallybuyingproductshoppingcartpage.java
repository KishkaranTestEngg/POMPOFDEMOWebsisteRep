package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finallybuyingproductshoppingcartpage 
{
WebDriver driver;
	
	public Finallybuyingproductshoppingcartpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]/a[2]")
//	
//	private WebElement Movemouseovershoppigcarlink;
	
//	@FindBy(xpath="'//*[@id=\\\"product-product\\\"]/div[1]/a[2]")
//	
//	private WebElement Mouseoverelementshoppingcart;

	
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]/a[2]")
	
	private WebElement Productgettingaddtoshoppingcartpage;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")
	
	private WebElement changeproductquantityasneeded;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]")
	
	private WebElement updatethequantityasneeded;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/a")
	
	private WebElement clickcheckoutforshipping;
	
	
	
	
	
//	public WebElement Movemouseovershoppigcart()
//	{
//	return 	Mouseoverelementshoppingcart;
//	
//	}
	
  public WebElement Productgettingaddedshoppingpage()
   {
	   return Productgettingaddtoshoppingcartpage;
   }
  
  public WebElement changeproductquantityasneeded()
  {
	  return changeproductquantityasneeded;
  }
  
  public WebElement updatequantityasneeded()
  {
	  return updatethequantityasneeded;
  }
  
  public WebElement clickcheckoutforshipping()
  {
	  return clickcheckoutforshipping;
  }
}

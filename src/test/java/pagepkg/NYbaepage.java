package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NYbaepage {
	WebDriver driver;
	
	@FindBy (xpath="//header/section[1]/div[1]/div[1]/div[1]/div[2]/a[2]/i[1]/*[1]")
	WebElement User;
	
	@FindBy (xpath="//a[@id='customer_register_link']")
	WebElement Register;
	
	@FindBy (xpath="//input[@id='FirstName']")
	WebElement Firstname;
	
	@FindBy (xpath="//input[@id='LastName']")
	WebElement Lastname;
	
	@FindBy (xpath="//input[@id='Email']")
	WebElement Email;
	
	@FindBy (xpath="//input[@id='CreatePassword']")
	WebElement Password;
	
	@FindBy (xpath="//body/div[@id='pageContainer']/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/a[1]")
	WebElement Showbtn;
	
	@FindBy (xpath="//body/div[@id='pageContainer']/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/input[1]")
	WebElement CreateBtn;
	
	@FindBy (xpath="//header/section[1]/div[1]/div[1]/div[1]/div[2]/a[2]/i[1]/*[1]")
	WebElement User1;
	
	@FindBy (xpath="//*[@id=\"customer_logout_link\"]")
	WebElement Logout;
	
	@FindBy (xpath="//header/section[1]/div[1]/div[1]/div[1]/div[2]/a[2]/i[1]/*[1]")
	WebElement User2;
	
	@FindBy (xpath="//a[@id='customer_login_link']")
	WebElement Login;
	
	@FindBy (xpath="//input[@id='CustomerEmail']")
	WebElement EmailId;
	
	@FindBy (xpath="//input[@id='CustomerPassword']")
	WebElement Pswd;
	
	@FindBy (xpath="//body/div[@id='pageContainer']/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[3]/input[1]")
	WebElement SigninBtn;
	
	@FindBy (xpath="//span[contains(text(),'Home')]")
	WebElement Home;
	
	@FindBy (xpath="//header/div[1]/div[1]/section[1]/nav[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement Lips;
	
	@FindBy (xpath="//span[contains(text(),'All Lip Products')]")
	WebElement AllLippdts;
	
	@FindBy (xpath="//select[@id='SortBy']")
	WebElement Sort;
	
	@FindBy (xpath="//option[contains(text(),'Price, high to low')]")
	WebElement Sortdetails;
	
	@FindBy (xpath="//a[contains(text(),'Shakti By NY Bae Liquid Lipstick Nude - Fab Free S')]")
	WebElement Product;
	
	@FindBy (xpath="//body[1]/div[3]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]/span[1]")
	WebElement AddtoCart;
	
	@FindBy (xpath="//body/div[@id='pageContainer']/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[3]/input[2]")
	WebElement Checkout;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement Address;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement City;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/select[1]")
	WebElement State;
	
	@FindBy (xpath="//option[contains(text(),'Kerala')]")
	WebElement Kerala;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement Pincode;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement Phoneno;
	
	@FindBy (xpath="//span[contains(text(),'Same as shipping address')]")
	WebElement Shippingaddress;
	
	
	
	public NYbaepage(WebDriver driver)
	{
	    this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	public void AccountCreate() throws Exception
	{
		User.click();
		Register.click();
		Firstname.sendKeys("Chinju");
		Lastname.sendKeys("S");
		Email.sendKeys("chinnu867@gmail.com");
		Password.sendKeys("Chinnu867");
		Showbtn.click();
		CreateBtn.click();
	    Thread.sleep(30000);
		
	}
	public void Logout() throws Exception 
	{
		
		User1.click();
		Logout.click();
		Thread.sleep(10000);
	}
	public void LogIn(String Email,String Password) throws Exception
	{
		User2.click();
		Login.click();
		EmailId.sendKeys(Email);
		Pswd.sendKeys(Password);
		SigninBtn.click();
		Thread.sleep(10000);

	}
	public void Home()
	{
		Home.click();
		Actions act=new Actions(driver);
		act.moveToElement(Lips).perform();
		AllLippdts.click();
	}
	public void Products()
	{
		Sort.click();
	    Sortdetails.click();
	    Product.click();
	    AddtoCart.click();
	    Checkout.click();
	}
	public void Checkout()
	{
		Address.sendKeys("abcd");
		City.sendKeys("Kochi");
		State.click();
		Kerala.click();
		Pincode.sendKeys("678009");
		Phoneno.sendKeys("7890456123");
		Shippingaddress.click();
		
	}
	

}

package testpkg;

import org.testng.annotations.Test;

import basepkg.NYbaebase;
import pagepkg.NYbaepage;

import utilitiespkg.NYbaeUtils;

public class NYbaetest extends NYbaebase {
	@Test
	
	public void test() throws Exception 
	{
		NYbaepage ob=new NYbaepage(driver);
		String title=driver.getTitle();
		String actualtitle="NYBae";
		if(title.equalsIgnoreCase(actualtitle))
		{
		System.out.println("Pass" +title);
		}
		else 
		{
			System.out.println("Fail=" +title);
		}
		ob.AccountCreate();
		Thread.sleep(30000);
		ob.Logout();
		Thread.sleep(10000);
		String xl="C:\\Users\\admin\\Desktop\\Book3.xlsx";
		String sheet="Sheet1";
		int rowCount=NYbaeUtils.getRowCount(xl, sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String Email=NYbaeUtils.getCellValue(xl, sheet, i, 0);
			System.out.println("Email="+Email);
			String Password=NYbaeUtils.getCellValue(xl, sheet, i, 1);
			System.out.println("Password="+Password);
			driver.navigate().refresh();
		    ob.LogIn(Email, Password);
		    Thread.sleep(10000);
		}
		ob.Home();
		ob.Products();
		ob.Checkout();
		
		
	}

}

package ToTestFunctionality;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import classpackage.LoginpomClass;
import classpackage.TolaunchBrowser;

public class LoginLogout {
	WebDriver driver;
	LoginpomClass lpc;
	@BeforeClass
	public void beforeclass()
	{
		TolaunchBrowser.togetBrowser("chrome");
	}
	@BeforeMethod
	public void beforemethod()
	{
		lpc = new LoginpomClass(driver);
		
	}
  @Test
  public void f() {
	  lpc.moveTologin1();
//		lpc.toClickloginbtn2();
//		lpc.toPutusename3();
//		lpc.afterusernamecontinue4();
//		lpc.toEnterpass5();
//		lpc.togoHomepagebtnclick6();
//	  String UN=lpc.togetuserprofileName7();
//	  if(UN.contains("vitthal"))
//	  {
//		  Reporter.log("test pass",true);
//	  }
  }
  @AfterMethod
  public void aftermethod()
  {
//	  lpc.toMouseoveruserprofile8();
//	  lpc.toclicklogout9();
 }
  @AfterClass
  public void afterclass()
  {
	  driver.quit();
  }
}

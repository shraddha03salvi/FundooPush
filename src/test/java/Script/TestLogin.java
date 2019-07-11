package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Lib;
import PomPages.LoginPage;

public class TestLogin extends  BaseTest {
	
	@Test
	public void TestLogin() throws InterruptedException 
	{
		LoginPage l = new LoginPage(driver);
		String un = Lib.getCellValue(EXCEL_PATH, "Sheet1",1, 0);
		String pw = Lib.getCellValue(EXCEL_PATH,"Sheet1", 1, 1);
		l.setUsername(un);
		l.setPassword(pw);
		Thread.sleep(3000);
		l.clickLogin();
		Thread.sleep(3000);
		
	}
	@Test
	public void ADDPost() throws InterruptedException {
		LoginPage l = new LoginPage(driver);
		Thread.sleep(3000);
		l.ClickAddCTA();
		Thread.sleep(3000);
		l.SelectADDPost();
		Thread.sleep(3000);
		l.Enter();
	}
}


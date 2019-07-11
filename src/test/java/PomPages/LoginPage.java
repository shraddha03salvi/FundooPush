package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration 
	
		@FindBy(xpath="//*[@id=\"mat-input-0\"]") 
		private WebElement unTB; 
		@FindBy(xpath="//*[@id=\"mat-input-1\"]") 
		private WebElement pwTB; 
		@FindBy(xpath="//*[text()='Login']") 
		private WebElement loginBtn; 
		@FindBy(xpath="//div//div[3]//div/mat-icon")
		private WebElement ADDCTA;
		
		@FindBy(xpath="//*[text()='ADD POST']")
		private WebElement AddPost;
		
		@FindBy(xpath="//*[@id=\"mat-input-22\"]")
		private WebElement Title;
		
		//initialisation 
		
		public LoginPage(WebDriver driver)
		{ 
		PageFactory.initElements(driver,this); 
		} 
		
		//Utilisation 
		public void setUsername(String un){ 
		unTB.sendKeys(un); 
		} 
		public void setPassword(String pw){ 
		pwTB.sendKeys(pw); 
		} 
		public void clickLogin(){ 
		loginBtn.click(); 
		 
		 } 
		public void ClickAddCTA() {
			
			ADDCTA.click();
		}
	    public void SelectADDPost() {
			
			AddPost.click();
		}
	    public void Enter() {
	    	Title.sendKeys("https://www.youtube.com/watch?v=ZxBx7E6_ttI");
	    }
		 
}

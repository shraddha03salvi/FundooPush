package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPostPage {

	//declaration 
	
	@FindBy(xpath="//*[text()='add']")
	private WebElement ADDCTA;
	
	@FindBy(xpath="//*[text()='ADD POST']")
	private WebElement AddPost;
	
	@FindBy(xpath="//*[@id=\"mat-input-22\"]")
	private WebElement Title;
	
	//initialisation 
	public AddPostPage(WebDriver driver)
	{ 
	PageFactory.initElements(driver,this); 
	} 
	//Utilisation 
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

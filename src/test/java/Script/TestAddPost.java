package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import PomPages.AddPostPage;

public class TestAddPost extends BaseTest {

	@Test
	public void TestAddPost() throws InterruptedException {
		
		AddPostPage A = new AddPostPage(driver);
		A.ClickAddCTA();
		Thread.sleep(3000);
		A.SelectADDPost();
		Thread.sleep(3000);
		A.Enter();
	}

}
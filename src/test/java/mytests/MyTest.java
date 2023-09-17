package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testbase.SetUP;

public class MyTest extends SetUP{
	@Test
	public void test1() {
		launchBrowser();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		tearDown();
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void test3() {
		Assert.assertEquals(true, true);
	}
}

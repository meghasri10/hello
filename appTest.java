import org.testng.Assert;
import org.testng.annotations.Test;

public class APPtest {
	
	@Test
	Run | Debug
	public void testlogin1()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("abc", "abc123"));
	}
	@Test
	Run |Debug
	public void testlogin2()
	{
		App myapp=new App();
	    Assert.assertEquals(1,myapp.userlogin("abc","abc123");
	}
	
}

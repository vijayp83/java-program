package testngpackage;

import org.testng.annotations.Test;

public class Assg183_group {
	
	@Test (groups= {"smoke","system"})
	
	public void test1()
	{
		
	}
	 @Test(groups= {"Regression","system"})
	 public void test2()
	 {
		 
	 }
	 
	 @Test(groups= {"smoke",})
	 public void test3()
	 {
		 
	 }
}

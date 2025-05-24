package testngpackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retrylogic implements IRetryAnalyzer{
	
	int intialcount = 0;
	int retrycount = 2;

	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		if(intialcount<retrycount)
		{
			intialcount++;
			return true;
		}
		return false;
	}
	
	
}



	

package net.openwritings.testng;

import org.testng.annotations.Test;

public class TestException {
	
	@Test(description = "Test catching exception", 
			expectedExceptions = { RuntimeException.class }, 
				expectedExceptionsMessageRegExp = "blabla")
	public void testException() {
		
		try {
			
			throw new RuntimeException("blabla");
		} 
		finally {// Don't catch(){}. Otherwise TestNG will not catch it. Just do finally{}.

			// Clean up code here.
		}
	}

}

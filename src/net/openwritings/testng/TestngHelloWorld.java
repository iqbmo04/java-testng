package net.openwritings.testng;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestngHelloWorld
{
	@Test(description="AssertTrue: Test positive.")
	public void testAssertTruePositive(){
		assertTrue(true, "Positive assertTrue().");
	}
  
	@Test(description="AssertFalse: Test negative.")
	public void testAssertFalseNegative(){
		assertFalse(true, "This will fail.");
	}
	 
	@Test(description="AssertEquals: Test negative.")
	public void testAssertEqualsNegative(){
		String actual="Some very long string.";
		String expected="some string";
		String message = "Error message to display if failed.";
		assertEquals(actual,expected, message);
	}
}

package net.openwritings.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

@Test(singleThreaded = true)
public class NonParallelMethods {

	private int counter;

	  @BeforeClass
	   public void init() {
		  this.counter = 0;
	  }
	@Test(description = "testMethod1")
	public void testMethod1() {
		this.counter += 1;
		System.out.println("testMethod1 "+ this.counter);
	}

	@Test(description = "testMethod2")
	public void testMethod2() {
		this.counter += 1;
		System.out.println("testMethod2 "+ this.counter);
	}
}
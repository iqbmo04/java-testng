package net.openwritings.testng;

import org.testng.annotations.Test;

public class InvocationCountTest
{
  @Test(description="Run this method multiple times.", invocationCount=3)
  public void printTime() {
	  
    System.out.println(System.currentTimeMillis());
    try {
      Thread.sleep(1000); // Pause for 1 second.
    }
    catch(InterruptedException ex) {
      ex.printStackTrace();
    }
  }
}

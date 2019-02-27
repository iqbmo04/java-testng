package net.openwritings.testng;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.testng.annotations.Test;

/**
 * Show how to use hamcrest with TestNG.
 * Note: For less headache, use hamcrest-all-1.3.jar.
 */
public class HamcrestInTestNG
{
  @Test
  public void useHamcrestToAssertStringContains()
  {
    String actual = "Assert string containing something.";
    assertThat(actual, containsString("Not found"));
    
    /**
     * OUTPUT:
          java.lang.AssertionError: 
          Expected: a string containing "Not found"
               but: was "Assert string containing something."
            at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)
            at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)
     */
  }
}

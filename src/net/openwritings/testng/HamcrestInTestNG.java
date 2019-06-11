package net.openwritings.testng;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.testng.annotations.Test;

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

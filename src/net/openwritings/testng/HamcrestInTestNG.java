package net.openwritings.testng;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.testng.annotations.Test;

public class HamcrestInTestNG {
	@Test(description = "Negative test containsString().")
	public void containsStringNegativeTest() {
		String actual = "Assert string containing something.";
		assertThat(actual, containsString("Not found"));
	}

	@Test(description = "Positive test is().")
	public void isPositiveTest() {
		String actual = "Xuan";
		assertThat(actual, is(equalTo("Xuan")));
	}
}
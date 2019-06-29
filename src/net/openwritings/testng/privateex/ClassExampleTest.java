package net.openwritings.testng.privateex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class ClassExampleTest {
	@Test
	public void privateFooTest() throws NoSuchMethodException, 
									IllegalAccessException, InvocationTargetException {
		
		// Get the class of the private method.
		ClassExample oClassExample = new ClassExample();
		Class<?> cNewClassExample = oClassExample.getClass();

		// Change the property of the private method to be accessible.
		Method newPrivateFoo = cNewClassExample.getDeclaredMethod("privateFoo", 
															int.class, String.class);
		newPrivateFoo.setAccessible(true);

		// Run the private method.
		Object oActual = newPrivateFoo.invoke(oClassExample, new Integer(169), new String("_ABC"));

		// Test the private method
		String sActual = oActual.toString();
		String sExpected = "169_ABC";
		assertEquals(sActual, sExpected);

	}
}
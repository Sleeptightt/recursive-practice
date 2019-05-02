import static org.junit.Assert.*;

import org.junit.Test;

public class RecursiveFunctionsTest {
	
	@Test
	public void factorialTest(){
		assertTrue("The factorial is wrong", RecursiveFunctions.factorial(5) == 120);
		assertTrue("The factorial is wrong", RecursiveFunctions.factorial(6) == 720);
		assertTrue("The factorial is wrong", RecursiveFunctions.factorial(7) == 5040);
	}

	@Test
	public void fibonacciTest(){
		assertTrue("The position is wrong", RecursiveFunctions.fibonacci(6) == 8);
		assertTrue("The position is wrong", RecursiveFunctions.fibonacci(7) == 13);
		assertTrue("The position is wrong", RecursiveFunctions.fibonacci(8) == 21);
	}
	
	@Test
	public void arraySummatoryTest(){
		assertTrue("The sum is wrong", RecursiveFunctions.arraySummatory(new int[]{1, 2,3,4}, 0) == 10);
		assertTrue("The sum is wrong", RecursiveFunctions.arraySummatory(new int[]{19,18,25,62,8765}, 0) == 8889);
		assertTrue("The sum is wrong", RecursiveFunctions.arraySummatory(new int[]{312490,382190,3211,9000,8765}, 0) == 715656);
	}
}

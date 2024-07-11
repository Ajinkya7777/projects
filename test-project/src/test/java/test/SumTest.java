package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumTest {

	@Test
	public void sum() {
		int a = 10;
		int b = 30;

		int expectedOutput = 40;

		Sum s = new Sum();
		int actualOutput = s.add(a, b);

		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test 
	public void product() {
		int a=10;
		int b=3;
		int expected=30;
		
		Sum s = new Sum();
		int actual = s.product(a, b);
		
		assertEquals(expected, actual);
	}

}

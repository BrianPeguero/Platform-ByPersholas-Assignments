package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	Calculator calc = new Calculator();
	
	int addResult = calc.adder(1, 2);
	int addExpected = 3;
	
	@Test
	public void testAdd() {
		System.out.println("@Testsum sum(): " + addResult + " == " + addExpected);
		assertEquals(addExpected, addResult);
	}
	
}
import org.junit.*;
import static org.junit.Assert.*;

public class Calculator_v3_test {
	@Test
	public void addTest() {
		Calculator_v2 c = new Calculator_v2();
		int op1 = 1;
		int op2 = 2;
		int result = c.add(op1, op2);
		int expected = 3;
		assertEquals(result, expected);
	}	
	
	@Test
	public void subtract() {
		Calculator_v2 c = new Calculator_v2();
		int op1 = 100;
		int op2 = 75;
		int result = c.subtract(op1, op2);
		int expected = 25;
		assertEquals(result, expected);
	}	

	@Test
	public void divide() {
		Calculator_v2 c = new Calculator_v2();
		int op1 = 20;
		int op2 = 5;
		double result1 = c.divide(op1, op2);
		double expected1 = 4.0;
		assertEquals(result1, expected1, 0);
	}	

	@Test
	public void modulus() {
		Calculator_v2 c = new Calculator_v2();
		int op1 = 22;
		int op2 = 5;
		int result = c.modulus(op1, op2);
		int expected = 2;
		assertEquals(result, expected);
	}	
}
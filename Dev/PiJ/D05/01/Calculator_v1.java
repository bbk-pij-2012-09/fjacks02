public class Calculator_v1 {
	public void add(int op1, int op2){
		System.out.println(op1 + op2);
	}
	public void subtract(int op1, int op2){
		System.out.println(op1 - op2);
	}
	public void multiply(int op1, int op2){
		System.out.println(op1 * op2);
	}
	public void divide(int op1, int op2){
		System.out.println((double) op1 / (double) op2);
	}
	public void modulus(int op1, int op2){
		System.out.println(op1 % op2);
	}

	public static void main(String[] args) {
		Calculator_v1 c = new Calculator_v1();
		c.add(7, 3);
		c.subtract(20, 10);
		c.divide(1, 11);
		c.modulus(10, 4);
	}
}	

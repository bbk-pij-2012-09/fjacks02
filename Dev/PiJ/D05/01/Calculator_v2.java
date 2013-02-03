public class Calculator_v2 {
	public int add(int op1, int op2){
		return op1 + op2;
	}
	public int subtract(int op1, int op2){
		return op1 - op2;
	}
	public int multiply(int op1, int op2){
		return op1 * op2;
	}
	public double divide(int op1, int op2){
		return (double) op1 / (double) op2;
	}
	public int modulus(int op1, int op2){
		return op1 % op2;
	}

	public static void main(String[] args) {
		Calculator_v2 c = new Calculator_v2();
		int op1 = Integer.parseInt(args[0]);
		int op2 = Integer.parseInt(args[2]);
		switch (args[1]) {
		case "+":
			System.out.println(c.add(op1, op2)); break;
		case "-":
			System.out.println(c.subtract(op1, op2)); break;
		case "/":
			System.out.println(c.divide(op1, op2)); break;
		case "%":
			System.out.println(c.modulus(op1, op2)); break;
		default:
			System.out.println("Incorrect call to Calculator");
		}
	}
}	

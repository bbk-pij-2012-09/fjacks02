public class IntegerTreeNode_1_2 {
	private int value;
	private IntegerTreeNode_1_2 left;
	private IntegerTreeNode_1_2 right;
	
	public IntegerTreeNode_1_2(int newNumber) {
		value = newNumber;
		left = null;
		right = null;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode_1_2(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode_1_2(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}
	
	public int getMax() {
		if (right == null) {
			return this.value;
		} else {
			return this.right.getMax();
		}
	}

	public int getMin() {
		if (left == null) {
			return this.value;
		} else {
			return this.left.getMin();
		}
	}

	public String toString() {
		String result;
		result = "";
		result = result + "["; 
		result = result + this.value;
		result = result + " ";
		result = result + "]";
		
		result = result + "L";
		if (left != null) {
			result = result + this.left.toString();
		}
		result = result + "] ";
		
		result = result + "R[";
		if (right != null) {
			result = result + this.right.toString();
		}
		result = result + "]";
		
		return result;
	}
	
	public static void main(String args[]) {
		IntegerTreeNode_1_2 x;
		x = new IntegerTreeNode_1_2(6);
		x.add(9);
/**
		x.add(3);
		x.add(9);
		x.add(8);
		x.add(11);
		x.add(12);
		System.out.println(x.getMax());
		System.out.println(x.getMin());
*/
		System.out.println(x.toString());
	}
}


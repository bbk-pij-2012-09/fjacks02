public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int newNumber) {
		value = newNumber;
		left = null;
		right = null;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
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

	public static void main(String args[]) {
		IntegerTreeNode x;
		x = new IntegerTreeNode(6);
		x.add(5);
		x.add(3);
		x.add(9);
		x.add(8);
		x.add(11);
		x.add(12);
		System.out.println(x.getMax());
		System.out.println(x.getMin());
	}
}


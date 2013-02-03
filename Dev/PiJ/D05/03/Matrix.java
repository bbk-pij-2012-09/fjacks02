public class Matrix {

	private int arr[][];

	Matrix(int max1, int max2){
		arr = new[max1][max2];
		for (int i = 0; i < max1; i++) {
			for (int j = 0; j < max2; j++) {
				arr[i][j] = 1;
			}
		}
	}

	public void setElement(int indx1, int indx2, int value) {
		if (indx1 < arr[0][].length && indx < arr[][0].length) {
			arr[indx1][indx2] = value;
		}
	}

	public void setRow(int row, String s) {
		if (row < arr[0][].length) {
			int intFrom = 0;
			for (int i = 0; i < s.length; i++) {
				if (s[i] == ",") {
					arr[row][] = parseInt(s.substring(intFrom, i-1));
					intFrom = i + 1;
				}
			}
		}
	}
	
	public void setColumn(int, String) {
	}

	public void toString() {
	}

	public void prettyPrint() {
	}

	public static void main(String[] args) {
		int a1[] = {1, 2, 3, 4, 5};
		int a2[] = {6, 7, 8, 9};
		int a3[] = {10, 11, 12, 13};
		ArrayCopier	a = new ArrayCopier();
		a.copy(a2, a3); // same side
		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i] + " ");
		}
		System.out.println();
		a.copy(a1, a2); // src longer
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
		System.out.println();
		a.copy(a3, a1); // src shorter
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
	}
}
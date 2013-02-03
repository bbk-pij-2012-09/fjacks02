public class ArrayCopier {
	public void copy(int src[], int dst[]) {
		for (int i = 0; i < dst.length; i++) {
			if (i >= src.length) {
				dst[i] = 0;
			} else {
				dst[i] = src[i];
			}
		}
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
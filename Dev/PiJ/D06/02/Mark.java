public class Mark {
	private int total = 0;
	private int distinction = 0;
	private int pass = 0;
	private int fail = 0;
	private int invalid = 0;
	
	public Mark() {
		int mark;
		do {
			System.out.print("Input a mark: ");
			mark = Integer.parseInt(System.console().readLine());
			total++;
			if (mark >= 70 && mark <= 100) {
				distinction++;
			} else if (mark >= 50 && mark <= 69) {
				pass++;
			} else if (mark >= 0 && mark <= 49) {
				fail++;
			} else {
				invalid++;
			}
		} while (mark != -1);
	}

	public void results() {
		System.out.println("There are " + total + " students: " + distinction + " distinctions, " + pass + " pass, " + fail + " fails (plus " + invalid + " invalid).");
	}
	
	public static void main(String[] args) {
		Mark m1 = new Mark();
		m1.results();
	}
}
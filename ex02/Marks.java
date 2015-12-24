public class Marks {
	

	public static void main(String[] args) {
		Marks count = new Marks();
		count.markCounter();
	}

	public void markCounter(){
		int studentCount = 0;
		int distinctionCount = 0;
		int passCount = 0;
		int failCount = 0;
		int invalidCount = -1;
		int mark;
		int count;
		System.out.println("Enter marks <0-100> one per line");
		System.out.println("Enter -1 when finished");
		do {
			System.out.print("Enter a mark: ");
			mark = Integer.parseInt(System.console().readLine());
			studentCount++;
			if (mark >= 70 && mark <= 100) {
				distinctionCount++;
			} else if (mark >= 50 && mark <= 69) {
				passCount++;
			} else if (mark >= 0 && mark <= 49) {
				failCount++;
			} else if (mark >= 100 || mark < 0) {
				studentCount--;
				invalidCount++;
			}
		} while (mark != -1);
		System.out.println("There are " + studentCount + " students: "
				 + distinctionCount + " distinctions, " + passCount + " passes, "
				  + failCount + " fails (plus " + invalidCount + " invalid)");
	}
}
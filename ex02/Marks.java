public class Marks {
	private final static int STOP = -1;
	private final static int MIN = 0;
	private final static int MAX = 100;
	private final static int PASS = 50;
	private final static int DISTINCTION = 70;

	int studentCount = 0;
	int distinctionCount = 0;
	int passCount = 0;
	int failCount = 0;
	int invalidCount = -1;
	int mark;
	
	public static void main(String[] args) {
		Marks count = new Marks();
		count.markCounter();
	}

	public void markCounter(){
		System.out.println("Enter marks <0-100> one per line");
		System.out.println("Enter -1 when finished");
		do {
			System.out.print("Enter a mark: ");
			mark = Integer.parseInt(System.console().readLine());
			studentCount++;
			if (mark >= DISTINCTION && mark <= MAX) {
				distinctionCount++;
			} else if (mark >= PASS && mark < DISTINCTION) {
				passCount++;
			} else if (mark >= MIN && mark < PASS) {
				failCount++;
			} else if (mark > MAX || mark < MIN) {
				studentCount--;
				invalidCount++;
			}
		} while (mark != -1);
		System.out.println("There are " + studentCount + " students: "
				 + distinctionCount + " distinctions, " + passCount + " passes, "
				  + failCount + " fails (plus " + invalidCount + " invalid)");
	}
}
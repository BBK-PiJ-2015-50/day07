public class Marks {
	private static int studentCount = 0;
	private static int distinctionCount = 0;
	private static int passCount = 0;
	private static int failCount = 0;
	private static int invalidCount = 0;
	private int mark;
	private int count;

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
				if (mark >= 70 && mark <= 100) {
					distinctionCount++;
				} else if (mark >= 50 && mark <= 69) {
					passCount++;
				} else if (mark >= 0 && mark <= 49) {
					failCount++;
				} else if (mark >= 100 || mark < -1) {
					invalidCount++;
				}
			} while (mark!=-1);
			System.out.println("There are " + (studentCount-1) + " students: "
					 + distinctionCount + " distinctions, " + passCount + " passes, "
					  + failCount + " fails (plus " + invalidCount + " invalid).");
	}
}
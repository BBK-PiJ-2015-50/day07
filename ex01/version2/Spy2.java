public class Spy2 {
	private static int spyCount = 0;
	private int spyID;

	public Spy2(int spyID) {
		this.spyID = spyID;
		spyCount++;
		System.out.println("New spy is Spy " + spyID);
		System.out.println("Total number of spies is " + spyCount);
	}

	public static int getNumberOfSpies() {
		return spyCount;
	}

	public void die() {
		spyCount--;
		System.out.println("Spy " + spyID + " has been detected and eliminated");
		System.out.println("Total number of spies is " + spyCount);
	}

	public static void main(String[] args) {
		// Spy2 spyLife = new Spy2();
		// spyLife.launch();
	//}

	// private void launch() {
		System.out.println("");

		Spy2 bond = new Spy2(7);
		Spy2 bourne = new Spy2(5);
		Spy2 smith = new Spy2(3);
		Spy2 snowden = new Spy2(111);

		System.out.println("");
		System.out.println("Current number of spies using getNumberOfSpies method is " + Spy.getNumberOfSpies());
		System.out.println("");

		bourne.die();
		smith.die();

		System.out.println("");

	}
}
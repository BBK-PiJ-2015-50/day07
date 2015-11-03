public class Spy {
	private static int spyCount = 0;
	private int spyID;

	public Spy(int spyID) {
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
		System.out.println("");

		Spy bond = new Spy(7);
		Spy bourne = new Spy(5);
		Spy smith = new Spy(3);
		Spy snowden = new Spy(111);

		System.out.println("\nCurrent number of spies using getNumberOfSpies method is "
							 + Spy.getNumberOfSpies() +"\n");;

		bourne.die();
		smith.die();

		System.out.println("");

	}
}
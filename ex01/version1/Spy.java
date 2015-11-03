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
}
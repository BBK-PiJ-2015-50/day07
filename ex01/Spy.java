public class Spy {
	private static int spyCount = 0;
	private int spyID;

	public Spy(int spyID) {
		this.spyID = spyID;
		spyCount++;
		System.out.println("Spy ID: " + spyID);
		System.out.println("Spy count = " + spyCount);
	}

	public void die() {
		spyCount--;
		System.out.println("Spy " + spyID + " has been detected and eliminated");
		System.out.println("Spy count = " + spyCount);
	}

	public static void main(String[] args) {
		Spy spy1 = new Spy(7);
		Spy spy2 = new Spy(5);
		Spy spy3 = new Spy(3);
		Spy spy4 = new Spy(111);

		spy2.die();
		spy4.die();
	}
}
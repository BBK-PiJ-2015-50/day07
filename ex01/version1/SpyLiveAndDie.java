public class SpyLiveAndDie {
	
	public static void main(String[] args) {
		SpyLiveAndDie mySpyLives = new SpyLiveAndDie();
		mySpyLives.launch();
	}

	private void launch() {
		System.out.println("");

		Spy bond = new Spy(7);
		Spy bourne = new Spy(5);
		Spy smith = new Spy(3);
		Spy snowden = new Spy(111);

		System.out.println("");
		System.out.println("Current number of spies using getNumberOfSpies method is " + Spy.getNumberOfSpies());
		System.out.println("");

		bourne.die();
		smith.die();

		System.out.println("");

	}

}
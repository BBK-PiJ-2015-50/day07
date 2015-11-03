public class ArrayToList {
    private Element listStart;

    public static void main(String[] args) {
       ArrayToList arrayConverter = new ArrayToList();
		arrayConverter.launch();	
    }
	
	private void launch(){
		int[] intArray = {1,3,5,7,9,11,13,15,17,19,2,4,6,8,10,12,14,16,18,20};
		Element listStart = new Element(intArray[0]);
		for (int i=1;i<intArray.length;i++) {
			listStart.addElement(intArray[i]);
		}
	System.out.println("");
	listStart.printList();
	System.out.println("\n");
	}
}
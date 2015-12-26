/**
 * Created by chris on 12/26/15.
 */
public class TestArrayToList {
    private ListUtilities.Node listStart = null;

    public static void main(String[] args) {
        TestArrayToList test = new TestArrayToList();
        test.launch();
    }

    private void launch() {
        int[] intArray = {9,3,6,34,-23,1023,99,5,7,2,4,0,101253,7,12,7,34,2,9,45,2};
        System.out.print("Array: \t\t");
        for (int number: intArray) {
            System.out.print(number + " ");
        }
        listStart = ListUtilities.arrayToList(intArray);
        System.out.print("\nUnsorted List: \t" + listStart + "\n");
        listStart = ListUtilities.arrayToSortedList(intArray);
        System.out.print("Sorted List: \t" + listStart + "\n");
    }
}
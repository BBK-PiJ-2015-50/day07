/**
 * Created by chris on 12/26/15.
 */
public class ListUtilities {
    public static Node arrayToList(int[] intArray) {
        Node start = new Node(intArray[0]);
        for (int i=1;i<intArray.length;i++) {
            Node node = new Node(intArray[i]);
            start.addNode(node);
        }
        return start;
    }

    public static Node arrayToSortedList(int[] intArray) {
        Node start = new Node(intArray[0]);
        for (int i=1;i<intArray.length;i++) {
            Node node = new Node(intArray[i]);
            start.addNodeToSortedList(node);
        }
        return start;
    }

    public static void addValueToSortedList(Node existingList, int newValue) {
        existingList.addNodeToSortedList(new Node(newValue));
    }

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public void addNode(Node newNode) {
            if (next == null) {
                next = newNode;
            } else {
                next.addNode(newNode);
            }
        }

        public void addNodeToSortedList(Node newNode) {
            // If newNode.value < listStart (this) value swap values
            Node currentNode = this;
            if (newNode.value < currentNode.value) {
                int tempValue = newNode.value;
                newNode.value = currentNode.value;
                currentNode.value = tempValue;
            } else { /* Look for correct position to insert newNode*/
                while (currentNode.next != null) {
                    if (newNode.value < currentNode.next.value) {
                        break;
                    }
                    currentNode = currentNode.next;
                }
            }	/* Correct position found, so insert newNode*/
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            return;
        }

        public String toString() {
            return (next != null) ? (value + " " + next.toString()) : ("" + value);
        }
    }
}
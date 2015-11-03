public class Element {
    private int value;
    private Element nextElement;

    public Element(int value) {
        this.value = value;
        this.nextElement = null;
    }

    public void addElement(int value) {
        if (this.nextElement == null) {
            Element newElement = new Element(value);
            this.nextElement = newElement;
        } else {
            this.nextElement.addElement(value);
        }
    }

    public void printList() {
        System.out.print(value + ",");
        if (this.nextElement != null) {
            this.nextElement.printList();
        }
    }
}
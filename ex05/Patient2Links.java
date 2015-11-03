
public class Patient2Links {
    private String name;
    private int age;
    private String illness;
    private Patient2Links nextPatient;
    private Patient2Links previousPatient;
    private static int length = 0;
    private Patient2Links temp;

    public Patient2Links(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
        this.previousPatient = null;
    }

    public void addPatient(Patient2Links newPatient) {
        if (this.nextPatient == null) {
            this.nextPatient = newPatient;
            newPatient.previousPatient = this;
        } else {
            this.nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(Patient2Links patient) {
        if (this.nextPatient == null) {
            return false;
        } else if (this.nextPatient.name.equals(patient.name)) {
            if (this.nextPatient.nextPatient == null) {
                this.nextPatient = null;
            } else {
                this.nextPatient.nextPatient.previousPatient = this.nextPatient.previousPatient;
                this.nextPatient = this.nextPatient.nextPatient;
            }
            return true;
        } else {
            return this.nextPatient.deletePatient(patient);
        }
    }

    public void deleteStart() {
        this.name = nextPatient.name;
        this.age = nextPatient.age;
        this.illness = nextPatient.illness;
        this.nextPatient = nextPatient.nextPatient;
        this.previousPatient = null;
        this.nextPatient.previousPatient = this;
    }

    public void printList() {
        System.out.println(this.name + "\t" + this.age + "\t" + this.illness);
        if (this.previousPatient != null) {
            System.out.println("\tPREV\t" + this.previousPatient.name);
        }
        if (this.nextPatient != null) {
            System.out.println("\tNEXT\t" + this.nextPatient.name);
            this.nextPatient.printList();
        } else {
            System.out.println("••••••• & back down •••••••");
            this.printBackDownList();
        }
    }

    public void printBackDownList() {
        System.out.println(this.name + "\t" + this.age + "\t" + this.illness);
        if (this.nextPatient != null) {
            System.out.println("\tNEXT\t" + this.nextPatient.name);
        }
        if (this.previousPatient != null) {
            System.out.println("\tPREV\t" + this.previousPatient.name);
            this.previousPatient.printBackDownList();
        }
    }

    public void listLength() {
        length++;
        if (this.nextPatient != null) {
            this.nextPatient.listLength();
        } else {
            System.out.println("\n(recursively) The length of the list is " + length + "\n");
            length = 0;
        }
    }

    public void iterativeLength() {
        Patient2Links temp = this;
        length = 1;
        do {
            temp = temp.nextPatient;
            length++;
        } while (temp.nextPatient != null);
        System.out.println("(iteratively) The length of the list is " + length  + "\n");
        length = 0;
    }
}
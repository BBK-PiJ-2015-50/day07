
public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    private static int length = 0;
    private Patient temp;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
    }

    public void addPatient(Patient newPatient) {
        if (this.nextPatient == null) {
            this.nextPatient = newPatient;
        } else {
            this.nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(Patient patient) {
        if (this.nextPatient == null) {
            return false;
        } else if (this.nextPatient.name.equals(patient.name)) {
            this.nextPatient = nextPatient.nextPatient;
            return true;
        } else {
            return this.nextPatient.deletePatient(patient);
        }
    }

    public void printList() {
        System.out.println(this.name + "\t" + this.age + "\t" + this.illness);
        if (this.nextPatient != null) {
            this.nextPatient.printList();
        }
    }

    public void listLength() {
        length++;
        if (this.nextPatient != null) {
            this.nextPatient.listLength();
        } else {
            System.out.println("\n(recursively) The length of the list is " + length);
            length = 0;
        }
    }

    public void iterativeLength() {
        Patient temp = this;
        length = 1;
        do {
            temp = temp.nextPatient;
            length++;
        } while (temp.nextPatient != null);
        System.out.println("(iteratively) The length of the list is " + (length));
        length = 0;
    }
}

public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    private static int length = 0;
    private Patient temp;
    private boolean first;

    public Patient(String name, int age, String illness, Patient start) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = start;
        this.first = false;
    }

    public Patient(String name, int age, String illness, boolean first) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = this;
        this.first = true;
    }

    public void addPatient(Patient newPatient) {
        if (nextPatient.first) {
            this.nextPatient = newPatient;
        } else {
            this.nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(Patient patient) {
        if (nextPatient.first) {
            return false;
        } else if (this.nextPatient.name.equals(patient.name)) {
            this.nextPatient = nextPatient.nextPatient;
            return true;
        } else {
            return this.nextPatient.deletePatient(patient);
        }
    }

    public void printList() {
        System.out.println
        (this.name + "\tNEXT: " + this.nextPatient.name);
        if (!this.nextPatient.first) {
                this.nextPatient.printList();
        }
    }

    public void listLength() {
        length++;
        if (this.nextPatient.first) {
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
        } while (temp.nextPatient.first);
        System.out.println("(iteratively) The length of the list is " + (length));
        length = 0;
    }
}
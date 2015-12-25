
public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    private static int patientCount = 1;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = this;
    }

    public static int getPatientCount() {
        return patientCount;
    }

    // For updating patientCount when deleting first patient in list
    public static void decPatientCount() {
        patientCount--;
    }

    public Patient getNextPatient() {
        return nextPatient;
    }

    public void setNextPatient(Patient p) {
        nextPatient = p;
    }

    public void addPatient(Patient newPatient) {
        Patient temp = this;
        while (true) {
            if (temp.nextPatient == this) {
                temp.nextPatient = newPatient;
                newPatient.nextPatient = this;
                patientCount++;
                break;
            } else {
                temp = temp.nextPatient;
            }
        }  
    }

    public boolean deletePatient(String name) {
        if (nextPatient == this) {
            return false;
        } else if (nextPatient.name.equals(name)) {
            nextPatient = nextPatient.nextPatient;
            System.out.println("Deleted " + name);
            patientCount--;
            return true;
        } else {
            return nextPatient.deletePatient(name);
        }
    }

    public String toString() {
        return "Name: " + name + "\tAge: " + age + "\t\tIllness: " + illness;
    }
}
// Doubly-linked list

public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    private Patient previousPatient;
    private static int patientCount = 1;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
        this.previousPatient = null;
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

    public Patient getPreviousPatient() {
        return previousPatient;
    }

    public void setPreviousPatient(Patient p) {
        previousPatient = p;
    }

    public void addPatient(Patient newPatient) {
        if (nextPatient == null) {
            nextPatient = newPatient;
            newPatient.previousPatient = this;
            patientCount++;
        } else {
            nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(String name) {
        if (nextPatient == null) {
            return false;
        } else if (nextPatient.name.equals(name)) {
            nextPatient = nextPatient.nextPatient;
            if (nextPatient != null) {
                nextPatient.previousPatient = this;
            }
            System.out.println("Deleted " + name);
            patientCount--;
            return true;
        } else {
            return this.nextPatient.deletePatient(name);
        }
    }     

    public String toString() {
        return "Name: " + name + "\tAge: " + age + "\t\tIllness: " + illness;
    }
}
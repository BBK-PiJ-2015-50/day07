
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
        this.nextPatient = null;
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

    public void addPatient(Patient newPatient) {
        if (this.nextPatient == null) {
            this.nextPatient = newPatient;
            patientCount++;
        } else {
            this.nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(String name) {
        if (this.nextPatient == null) {
            return false;
        } else if (this.nextPatient.name.equals(name)) {
            this.nextPatient = nextPatient.nextPatient;
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
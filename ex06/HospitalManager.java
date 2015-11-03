public class HospitalManager {
    private Patient patientListStart;

    public static void main(String[] args) {
       HospitalManager hm = new HospitalManager();
		hm.launch();	
    }
	
	private void launch(){
		Patient firstPatient = new Patient("Eric", 33, "Tuberculosis", true);
		patientListStart = firstPatient;
		Patient p2 = new Patient("Ed", 40, "Cancer", patientListStart);
		patientListStart.addPatient(p2);
		Patient p3 = new Patient("Simon", 40, "Lurgy", patientListStart);
		patientListStart.addPatient(p3);
		Patient p4 = new Patient("Bill", 80, "Measles", patientListStart);
		patientListStart.addPatient(p4);
		Patient p5 = new Patient("Luke", 18, "Typhoid", patientListStart);
		patientListStart.addPatient(p5);
		Patient p6 = new Patient("John", 40, "Leprosy", patientListStart);
		patientListStart.addPatient(p6);
		Patient p7 = new Patient("Mark", 50, "Bronchitis", patientListStart);
		patientListStart.addPatient(p7);
		Patient p8 = new Patient("Derek", 33, "Asthma", patientListStart);
		patientListStart.addPatient(p8);
		Patient p9 = new Patient("Nigel", 40, "Eczema", patientListStart);
		patientListStart.addPatient(p9);
		Patient p10 = new Patient("Susan", 40, "Mumps", patientListStart);
		patientListStart.addPatient(p10);
		
		patientListStart.printList();

		System.out.println("\nDelete a couple of patients");
		System.out.println((patientListStart.deletePatient(p8)) ? "Derek deleted" : "not there");
		System.out.println((patientListStart.deletePatient(p3)) ? "Simon deleted" : "not there");
		System.out.println("");
		patientListStart.printList();
		
		System.out.println("\nAdd another patient");
		Patient p20 = new Patient("Jimi", 33, "Bad Cough", patientListStart);
		patientListStart.addPatient(p20);
		System.out.println("");
		patientListStart.printList();

		Patient p15 = new Patient("Fred", 40, "Broken Leg", patientListStart);

		System.out.println("\nDelete a non-existent patient");
		System.out.println((patientListStart.deletePatient(p15)) ? "Derek deleted" : "not there");
		System.out.println("");
		patientListStart.printList();
	}
	
}
public class HospitalManager {
    private Patient patientListStart = null;

    public static void main(String[] args) {
       HospitalManager hm = new HospitalManager();
		hm.launch();	
    }
	
	private void launch(){
		Patient firstPatient = new Patient("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
		Patient p2 = new Patient("Ed", 40, "Cancer");
		patientListStart.addPatient(p2);
		Patient p3 = new Patient("Simon", 40, "Lurgy");
		patientListStart.addPatient(p3);
		Patient p4 = new Patient("Bill", 80, "Measles");
		patientListStart.addPatient(p4);
		Patient p5 = new Patient("Luke", 18, "Typhoid");
		patientListStart.addPatient(p5);
		Patient p6 = new Patient("John", 40, "Leprosy");
		patientListStart.addPatient(p6);
		Patient p7 = new Patient("Mark", 50, "Bronchitis");
		patientListStart.addPatient(p7);
		Patient p8 = new Patient("Derek", 33, "Asthma");
		patientListStart.addPatient(p8);
		Patient p9 = new Patient("Nigel", 40, "Eczema");
		patientListStart.addPatient(p9);
		Patient p10 = new Patient("Susan", 40, "Mumps");
		patientListStart.addPatient(p10);
		
		printList();
		//patientListStart.listLength();
		System.out.println("Number of patients: " + Patient.getPatientCount());
		patientListStart.iterativeLength();

		// Delete a couple of patients
		patientListStart.deletePatient(p8);
		patientListStart.deletePatient(p3);
		printList();
		//patientListStart.listLength();
		//System.out.println(Patient.getPatientCount());
		patientListStart.iterativeLength();
		// Delete 1st patient by changing patientListStart to p2
		patientListStart = p2;
		printList();
		//patientListStart.listLength();
		//System.out.println(Patient.getPatientCount());
		patientListStart.iterativeLength();
		// Delete last patient in list
		patientListStart.deletePatient(p10);
		printList();
		//patientListStart.listLength();
		//System.out.println(Patient.getPatientCount());
		patientListStart.iterativeLength();
		
	}

	private void printList() {
		Patient patientToPrint = patientListStart;
		do {
			System.out.println(patientToPrint);
			patientToPrint = patientToPrint.getNextPatient();
		} while (patientToPrint != null);
	}
	
}

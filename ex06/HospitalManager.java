public class HospitalManager {
    private Patient patientListStart = null;

    public static void main(String[] args) {
       HospitalManager hm = new HospitalManager();
		hm.launch();	
    }
	
	private void launch() {
		System.out.println("=====================================================");
		System.out.println("\t\tCIRCULAR SINGLY-LINKED LIST");
		System.out.println("=====================================================");
		System.out.println("Add 1st patient - patientListStart");
		Patient firstPatient = new Patient("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
		printVarious();
		
		System.out.println("Add 9 patients");
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
		
		printVarious();

		patientListStart.deletePatient("Derek");
		patientListStart.deletePatient("Simon");
		printVarious();

		System.out.println("Delete 1st patient");
		deleteFirstPatient();
		printVarious();

		System.out.println("Delete last patient in list");
		patientListStart.deletePatient("Susan");
		printVarious();

		System.out.println("Add 2 more patients");
		Patient p11 = new Patient("Godfrey", 92, "Flatulence");
		patientListStart.addPatient(p11);
		Patient p12 = new Patient("Sandra", 52, "Pneumonia");
		patientListStart.addPatient(p12);
		printVarious();

		patientListStart.deletePatient("Bill");
		patientListStart.deletePatient("Luke");
		patientListStart.deletePatient("John");
		patientListStart.deletePatient("Mark");
		patientListStart.deletePatient("Nigel");
		patientListStart.deletePatient("Sandra");
		patientListStart.deletePatient("Godfrey");
		printVarious();

		System.out.println("Delete 1st patient");
		deleteFirstPatient();
		printVarious();
	}

	private void printList() {
		if (patientListStart == null) {
			System.out.println("List is empty");
			return;
		}
		Patient patientToPrint = patientListStart;
		do {
			System.out.println(patientToPrint);
			patientToPrint = patientToPrint.getNextPatient();
		} while (patientToPrint != patientListStart);
	}

	private void printVarious() {
		System.out.println("=====================================================");
		printList();
		System.out.println("=====================================================");
		System.out.println("List length (patientCount):\t" + Patient.getPatientCount());
		System.out.println("=====================================================");
	}

	private void deleteFirstPatient() {
		if (patientListStart.getNextPatient() == patientListStart) {
			patientListStart = null;
		} else {
			Patient temp = patientListStart;
        	while (true) {
	            if (temp.getNextPatient() == patientListStart) {
	                temp.setNextPatient(patientListStart.getNextPatient());
	                patientListStart = patientListStart.getNextPatient();
	                break;
	            }
            	temp = temp.getNextPatient();
        	}  
		}
		
		System.out.println("Deleted patientListStart");
		Patient.decPatientCount();
	}
}

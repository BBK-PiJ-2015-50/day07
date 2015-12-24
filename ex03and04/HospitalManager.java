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
		
		System.out.println("=====================================================");
		System.out.println("\t\tSINGLY-LINKED LIST");
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

		patientListStart.deletePatient("Bill");
		patientListStart.deletePatient("Luke");
		patientListStart.deletePatient("John");
		patientListStart.deletePatient("Mark");
		patientListStart.deletePatient("Nigel");
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
		while (patientToPrint != null) {
			System.out.println(patientToPrint);
			patientToPrint = patientToPrint.getNextPatient();
		}
	}

	private void printVarious() {
		System.out.println("=====================================================");
		printList();
		System.out.println("=====================================================");
		System.out.println("List length (patientCount):\t" + Patient.getPatientCount());
		System.out.println("List length (recursive method):\t" + listLengthRecursive(patientListStart));
		System.out.println("List length (iterative method):\t" + listLengthIterative());
		System.out.println("=====================================================");
	}

	private void deleteFirstPatient() {
		patientListStart = patientListStart.getNextPatient();
		System.out.println("Deleted patientListStart");
		Patient.decPatientCount();
	}

	public int listLengthRecursive(Patient p) {
		if (p == null) {
			return 0;
		}
		int length = 1;
        if (p.getNextPatient() == null) {
        	return length;
        } else {
        	return (1 + listLengthRecursive(p.getNextPatient()));
        }
    }

    public int listLengthIterative() {
    	int length = 0;
        Patient temp = patientListStart;
        while (temp != null) {
        	length++;
            temp = temp.getNextPatient();
        }
    	return length;
    }
}

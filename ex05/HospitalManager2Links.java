public class HospitalManager2Links {
    private Patient2Links patientListStart = null;

    public static void main(String[] args) {
       HospitalManager2Links hm = new HospitalManager2Links();
		hm.launch();	
    }
	
	private void launch(){
		Patient2Links firstPatient = new Patient2Links("Bert", 33, "Tuberculosis");
		patientListStart = firstPatient;
		Patient2Links p2 = new Patient2Links("Ed", 40, "Cancer");
		patientListStart.addPatient(p2);
		Patient2Links p3 = new Patient2Links("Simon", 40, "Lurgy");
		patientListStart.addPatient(p3);
		Patient2Links p4 = new Patient2Links("Bill", 80, "Measles");
		patientListStart.addPatient(p4);
		Patient2Links p5 = new Patient2Links("Luke", 18, "Typhoid");
		patientListStart.addPatient(p5);
		Patient2Links p6 = new Patient2Links("John", 40, "Leprosy");
		patientListStart.addPatient(p6);
		Patient2Links p7 = new Patient2Links("Mark", 50, "Bronchitis");
		patientListStart.addPatient(p7);
		Patient2Links p8 = new Patient2Links("Derek", 33, "Asthma");
		patientListStart.addPatient(p8);
		Patient2Links p9 = new Patient2Links("Nigel", 40, "Eczema");
		patientListStart.addPatient(p9);
		Patient2Links p10 = new Patient2Links("Susan", 40, "Mumps");
		patientListStart.addPatient(p10);
		
		patientListStart.printList();
		patientListStart.listLength();
		patientListStart.iterativeLength();

		System.out.println("Delete a couple of patients");
		System.out.println((patientListStart.deletePatient(p8)) ? "Derek deleted" : "not there");
		System.out.println((patientListStart.deletePatient(p3)) ? "Simon deleted" : "not there");
		System.out.println("");
		patientListStart.printList();
		patientListStart.listLength();
		patientListStart.iterativeLength();

		System.out.println("Delete 1st patient by calling deleteStart");
		patientListStart.deleteStart();
		System.out.println("");
		patientListStart.printList();
		patientListStart.listLength();
		patientListStart.iterativeLength();

		System.out.println("Delete last patient in list");
		System.out.println((patientListStart.deletePatient(p10)) ? "Susan deleted" : "not there");
		System.out.println("");
		patientListStart.printList();
		patientListStart.listLength();
		patientListStart.iterativeLength();
	}
}
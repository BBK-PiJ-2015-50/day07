public class HospitalManager {

	public static void main(String[] args) {
    	HospitalManager hm = new HospitalManager();
		hm.launch();	
    }
	
	private void launch() {
		PatientList pList = new PatientList();

		pList.addPatient("John", 33, "Tuberculosis");
		pList.addPatient("Ed", 40, "Cancer");
		pList.addPatient("Simon", 40, "Lurgy");
		pList.addPatient("Bill", 80, "Measles");
		pList.addPatient("Luke", 18, "Typhoid");
		pList.addPatient("John", 40, "Leprosy");
		pList.addPatient("Mark", 50, "Bronchitis");
		pList.addPatient("Derek", 33, "Asthma");
		pList.addPatient("Nigel", 40, "Eczema");
		pList.addPatient("Susan", 40, "Mumps");
		pList.printListAndCount(pList);

		System.out.println("Delete 2 patients: Derek & Simon");
		pList.deletePatient("Derek");
		pList.deletePatient("Simon");
		pList.printListAndCount(pList);

		System.out.println("Try to delete a non-existent patient: Sharon");
		pList.deletePatient("Sharon");
		pList.printListAndCount(pList);

		System.out.println("Delete 1st patient: John");
		pList.deletePatient("John");
		pList.printListAndCount(pList);

		System.out.println("Delete last patient in list: Susan");
		pList.deletePatient("Susan");
		pList.printListAndCount(pList);

		System.out.println("Delete 5 patients: Bill - Nigel");
		pList.deletePatient("Bill");
		pList.deletePatient("Luke");
		pList.deletePatient("John");
		pList.deletePatient("Mark");
		pList.deletePatient("Nigel");
		pList.printListAndCount(pList);

		System.out.println("Delete 1st patient: Ed");
		pList.deletePatient("Ed");
		pList.printListAndCount(pList);

		System.out.println("Try to delete from an empty list!");
		pList.deletePatient("Jimi");
		pList.printListAndCount(pList);
	}
}
public class PatientList {
    private Patient patientListStart = null;

    public PatientList () {
    	patientListStart = null;
    }

	public void addPatient(String name, int age, String illness) {
	    Patient newPatient = new Patient(name, age, illness);
	    // If list is empty head (patientListStart) will point to new patient
	    if (patientListStart == null) {
	    	patientListStart = newPatient;
	    } else {
	    	Patient temp = patientListStart;
	    	while (temp.next != null) {
	    		temp = temp.next;
	    	}
	    	temp.next = newPatient;
	    }
	    Patient.patientCount++;
	}

	public boolean deletePatient(String name) {
		// If list is empty 
		if (patientListStart == null) {
			return false;
		}
		// If name matches 1st patient 
	    if (patientListStart.name.equals(name)) {
	    	patientListStart = patientListStart.next;
			Patient.patientCount--;
	        return true;
		}
		// Check name against each patient in list
		Patient temp = patientListStart;
		while ((!temp.next.name.equals(name)) && (temp.next.next != null)) {
			temp = temp.next;
		}
		if (temp.next.name.equals(name)) {
			System.out.println("deleted: " + temp.next.name);
			temp.next = temp.next.next;
			Patient.patientCount--;
			return true;
		} else {
			System.out.println(name + " was not found in the list");
			return false;
		}	
	}

	public int listLengthRecursive(Patient p) {
		if (p == null) {
			return 0;
		}
		int length = 1;
	    if (p.next == null) {
	        return length;
	    } else {
	        return (1 + listLengthRecursive(p.next));
	    }
    }

    public int listLengthIterative() {
    	int length = 0;
       	Patient temp = patientListStart;
        while (temp != null) {
        	length++;
            temp = temp.next;
        }
    	return length;
    }

    public String toString() {
    	if (patientListStart == null) {
			return "List is empty";
		}
		Patient patientToPrint = patientListStart;
		String str = "";
		while (patientToPrint.next != null) {
			str += patientToPrint + "\n";
			patientToPrint = patientToPrint.next;
		}
		return str + patientToPrint;
        }

    // Convenient printout for testing
	public void printListAndCount(PatientList list) {
		System.out.println("=====================================================");
		System.out.println(list);
		System.out.println("=====================================================");
		System.out.print("PATIENT COUNT:" + Patient.patientCount);
		System.out.print(" LENGTH(iterative):" + listLengthIterative());
		System.out.println(" (recursive):" + listLengthRecursive(patientListStart));
		System.out.println("=====================================================");
	}

	private static class Patient {
	    private String name;
	    private int age;
	    private String illness;
	    private Patient next = null;
	    private static int patientCount = 0;

	    public Patient(String name, int age, String illness) {
	        this.name = name;
	        this.age = age;
	        this.illness = illness;
	        this.next = null;
	    }

	    public String toString() {
	        return "Name: " + name + "\tAge: " + age + "\t\tIllness: " + illness;
	    }
	}
}

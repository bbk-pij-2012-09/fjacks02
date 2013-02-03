public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, Sting illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			//this means this is the last patient in the list
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
}

public class HospitalManager {

	private Patient patientList = null;
	
	public void output() {
		do {
			System.out.print(this.patientList.name)////Complete list
		} while { (this.patientList.nextPatient != null)
	}
	
	public void run() {
		patientList = new Patient("John", 33, "Tuberculosis");
		patientList.addPatient(new Patient("Mary", 12, "Cold"))
		patientList.addPatient(new Patient("Shiela", 10, "Flu"))
		patientList.addPatient(new Patient("Mike", 5, "Migraine"))
		patientList.addPatient(new Patient("Brenda", 21, "Elephantitis"))
		patientList.addPatient(new Patient("Julie", 18, "Exhaustion"))
	}
	
	public static void main(String[] args) {
		HosptialManager hm = new HosptialManager();
		hm.run();
		hm.output();
		}
}

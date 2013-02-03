public class Person {
	private String firstname;
	private String lastname;
	private int age;
	private Person nextPerson;
	
	public Person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.nextPerson = null;
	}

	public void addPerson(Person newPerson) {
		if (this.nextPerson == null) {
			//this means this is the last patient in the list
			this.nextPerson = newPerson;
		} else {
			this.nextPerson.addPerson(newPerson);
		}
	}

	/**
	public boolean deletePerson(Person person) {
		if (this.nextPerson == null) {
			// person to remove was not found
			return false;
		} else if (this.nextPerson.name.equals(person.name)) {
			// We found it! It is the next one!
			// Now link this patient to the one after the next
			this.nextPerson = nextPerson.nextPerson;
			return true;
		} else {
			return this.nextPerson.deletePerson(person);
		}
	}
	*/

	public void deletePerson() {
		this.nextPerson = nextPerson.nextPerson;
	}
}
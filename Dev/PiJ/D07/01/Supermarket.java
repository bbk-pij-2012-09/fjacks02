public class Supermarket {
	
	private sq SupermarketQueue;
	
	addPerson(Person newPerson) {
		sq.insert(newPerson);
	}
	
	servePerson() {
		sq.retrieve();
	}
}
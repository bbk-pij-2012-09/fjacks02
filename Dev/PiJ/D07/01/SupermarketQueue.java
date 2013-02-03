public class SupermarketQueue implements PersonQueue {

	private Person pq;
	
	void insert(Person newPerson) {
		pq.addPerson(newPerson);
	}
	
	/**
	* Remove a person from the queue.
	*/
	Person retrieve() {
		pq.deletePerson();
	}
}
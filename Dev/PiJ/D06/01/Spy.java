public class Spy {
	private static int spyCount = 0;
	private int ID;
	
	public Spy(int ID) {
		spyCount++;
		this.ID = ID;
		System.out.println(this.ID);
		System.out.println(getNumberOfspies());
	}
	
	public static int getNumberOfspies() {
		return spyCount;
	}
	
	public void die() {
		System.out.println("Spy " + this.ID + " has been detected and eliminated");
		spyCount--;
	}
	
	public static void main(String[] args) {
		Spy spy1 = new Spy(10);
		Spy spy2 = new Spy(20);
		spy2.die();
		Spy spy3 = new Spy(30);
		spy3.die();
		System.out.println(Spy.getNumberOfspies());
	}
}
	
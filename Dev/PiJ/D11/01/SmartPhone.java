public class SmartPhone extends MobilePhone {
	
	private String gps;
	
	public void browseWeb(String url) {
		System.out.println("You are browsing " + url) 
	}

	public String findPosition() {
		gps = "123.45";
		return gps;
	}
}
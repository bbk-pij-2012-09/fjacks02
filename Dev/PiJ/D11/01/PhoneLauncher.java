public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		SmartPhone iPhone =  new SmartPhone;
		iPhone.browseWeb("http://www.google.com");
		System.out.println("Your Smartphone is at this location " + iPhone.findPosition());
		iPhone.call("020 7868 0001");
		iPhone.call("020 7868 0002");
		iPhone.call("020 7868 0003");
		iPhone.call("020 7868 0004");
		iPhone.call("020 7868 0005");
		iPhone.call("020 7868 0006");
		iPhone.call("020 7868 0007");
		iPhone.call("020 7868 0008");
		iPhone.call("020 7868 0009");
		iPhone.call("020 7868 0010");
		iPhone.printLastNumbers();
		
	}
}
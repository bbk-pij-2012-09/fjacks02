/** 
* A mobilephone makes calls anywhere there's a cellular signal
*/
//import.
public class MobilePhone implements Phone {
	private int i;
	private String[] numbers;

	public MobilePhone() {
		i = 0;
	}
	
	/**
	* Calls a number
	*/
	public void call(String number) {
		if (i > 9) {
			i = 0;
		}
		numbers[i] = number;
		i++;
		/* code to call the specified number */
		System.out.println("Calling <" + number + ">...");
	}

	/**
	* Rings the alarm
	*/
	public void ringAlarm(String alarm) {
		System.out.println("Alarm is ringing...");
	}
	
	/**
	* Plays a game? Do you wish to play a game... 
	*/
	public void playGame(String game) {
		System.out.println("You are playAlarm is ringing...");
	}
	
	/**
	* Prints the last ten numbers
	*/
	public void printLastNumbers() {
		for (i = 0; i < 10; i++) {
			System.out.println("Called number <" + numbers[i] + ">...");
		}
	}
}
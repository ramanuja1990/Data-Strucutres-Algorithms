/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 */


import java.util.Scanner;

public class TimeConversion {

	/**
	 * Check string for AM/PM. If it is PM, add 12 to the string.
	 * @param time - Input Time String
	 * @return time String in 24hr format
	 */
	public static String timeConversion(String time) {
		boolean morning = true;
		if(time.contains("PM")) {
			morning = false;
		}
		String[] timeSplit = time.split("[^0-9]");
		if(!morning) {
			if(!timeSplit[0].equals("12"))
				timeSplit[0] = Integer.toString((Integer.parseInt(timeSplit[0]) + 12));
			return timeSplit[0]+":"+timeSplit[1]+":"+timeSplit[2];
		}else {
			if(timeSplit[0].equals("12")) {
				timeSplit[0] = "00";
			}
			return timeSplit[0]+":"+timeSplit[1]+":"+timeSplit[2];
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String time = input.nextLine();

		System.out.println(timeConversion(time));
	}
}

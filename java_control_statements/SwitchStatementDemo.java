package java_control_statements;

/**
 * @author shekhar 02-Aug-2018 2018 7:02:26 AM
 */
public class SwitchStatementDemo {

	public static void main(String[] args) {
		int day = 3;
		String dayName;

		// switch statement with int data type
		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid day";
			break;
		}
		System.out.println(dayName);
	}

}

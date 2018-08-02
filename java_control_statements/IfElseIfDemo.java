package java_control_statements;

/**
 * @author shekhar 02-Aug-2018 2018 7:10:26 AM
 */
public class IfElseIfDemo {
	public static void main(String[] args) {

		int number = 0;

		if (number > 0) {
			System.out.println("number is positive.");
		} else if (number < 0) {
			System.out.println("number is negative.");
		} else {
			System.out.println("number is 0.");
		}
	}
}

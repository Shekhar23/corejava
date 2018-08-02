package java_control_statements;

/**
 * @author shekhar 02-Aug-2018 2018 7:02:26 AM
 */
public class ContinueDemo {
	public static void main(String[] args) {
		int[] arr = { 3, 0, 23, 30, 8, 45, 2, 0, 19, 10, 15, 0, 20, 44 };

		// Continue in for loop
		for (int len = 0; len < arr.length; len++) {
			if (arr[len] == 0) {
				continue;
			}
			System.out.println(" number is " + arr[len]);
		}

		// Continue in while loop
		int len = 0;
		while (len < arr.length) {
			if (arr[len] == 0) {
				continue;
			}
			System.out.println(" number is " + arr[len]);
			len++;
		}

		len = 0;
		// Continue in do-while
		do {
			if (arr[len] == 0) {
				continue;
			}
			System.out.println(" number is " + arr[len]);
			len++;
		} while (len < arr.length);
	}

}

package java_control_statements;

/**
 * @author shekhar 02-Aug-2018 2018 7:02:26 AM
 */
public class BreakLabelDemo {
	public static void main(String[] args) {
		String[] arr = { "A", "E", "I", "O", "U" };

		// Break in for loop
		for (int len = 0; len < arr.length; len++) {
			if (arr[len].equals("O")) {
				System.out.println("Array contains 'O' at index: " + len);
				// break the loop as we found what we are looking for
				break;
			}
		}

		// Break in while loop
		int len = 0;
		while (len < arr.length) {
			if (arr[len].equals("E")) {
				System.out.println("Array contains 'E' at index: " + len);
				// break the while loop as we found what we are looking for
				break;
			}
			len++;
		}

		len = 0;
		// Break in do-while
		do {
			if (arr[len].equals("U")) {
				System.out.println("Array contains 'U' at index: " + len);
				// break the while loop as we found what we are looking for
				break;
			}
			len++;
		} while (len < arr.length);
	}

}

package java_control_statements;

/**
 * @author shekhar 02-Aug-2018 2018 7:02:26 AM
 */

public class WhileDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int len = 0;
		while (len < arr.length) {
			System.out.println(" number is " + arr[len]);
			len++;
		}
	}
}

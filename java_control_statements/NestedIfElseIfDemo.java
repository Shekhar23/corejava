package java_control_statements;

public class NestedIfElseIfDemo {
	/**
	 * @author shekhar 02-Aug-2018 2018 7:02:26 AM
	 */
	public static void main(String[] args) {

		Double n1 = -2.0, n2 = 6.5, n3 = -7.3, largestNumber;

		if (n1 >= n2) {
			if (n1 >= n3) {
				largestNumber = n1;
			} else {
				largestNumber = n3;
			}
		} else {
			if (n2 >= n3) {
				largestNumber = n2;
			} else {
				largestNumber = n3;
			}
		}

		System.out.println("Large number is " + largestNumber);
	}
}

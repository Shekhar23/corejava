package java_control_statements;

/**
 * @author shekhar 02-Aug-2018 2018 7:02:26 AM
 */
public class ReturnDemo {
	public static void main(String args[]) {
		boolean t = true;
		System.out.println("Before the return.");
		if (t)
			return; // return to caller
		System.out.println("This won't execute.");
	}
}

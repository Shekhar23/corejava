package java_operator;

/* shekhar 20188:14:43 AM
 * This class is used for show use of assignment operator.
 * there are three type of assignment operator use that are
 * assign value to variable 
 * */
public class AssignmentOperator {
	public static void main(String args[]) {
		AssignmentOperator assignmentOperator = new AssignmentOperator();
		System.out.println("------------------Three type of assign ment opration ---------------------");
		System.out.println("1. assign direct vaule.");
		assignmentOperator.assignDirectValue();
		System.out.println("2. assign vaule of other varibale.");
		assignmentOperator.assignVariableValue();
		System.out.println("3. assign value of expression vaule.");
		assignmentOperator.assignExpressrionValue();
		System.out.println("------------------------------------------------------------");

	}

	// used for assign direct value to variable.
	private void assignDirectValue() {
		int x = 5;
		System.out.println("value of x " + x);
	}

	// used for assign value of other variable value to variable.
	private void assignVariableValue() {
		int y = 5;
		int x = y;
		System.out.println("value of x " + x);
	}

	// used for assign value of expression to variable.
	private void assignExpressrionValue() {
		int a = 20;
		int b = 3;
		int d = 12;
		int y = a + b * d - 5;
		System.out.println("value of x " + y);
	}
	// used for assign value of expression to variable.
	private void compactNotation() {
		
	}

}

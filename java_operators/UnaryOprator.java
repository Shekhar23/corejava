package java_operator;

/* 
 * This program is used to show usage of unary operator
 * there are three type of unary operator that are
 * -  unary minus
 * ++ unary increment.
 * -- unary decrement.
 * **/
public class UnaryOprator {

	
	public static void main(String args[]) {
		UnaryOprator oprator = new UnaryOprator();
		System.out.println("------------------simple unary operato ---------------------");
		System.out.println("Unary minus of -20    : " + oprator.unaryMinus(-20));
		System.out.println("Unary minus of 34     : " + oprator.unaryMinus(34));
		System.out.println("Unary Increment of 4  : " + oprator.unaryIncrement(4));
		System.out.println("Unary Decrement of 67 : " + oprator.unaryDecrement(67));
		System.out.println("------------------------------------------------------------");
		System.out.println("---Differance between in pre and post increment/decrement---");
		System.out.println("---Pre increment---");
		int x = 1,y = 2;
		System.out.println(" x = "+x+" and  y = "+y);
		x = ++y;
		System.out.println("after x = ++y x = "+x+" and  y = "+y);
		System.out.println("---Post increment---");
		int a = 5,b = 8;
		System.out.println(" a = "+a+" and  b = "+b);
		a = b++;
		System.out.println("after a = b++ a = "+a+" and  b = "+b);
		System.out.println("------------------------------------------------------------");

	}

	// this method used for unary minus.
	public int unaryMinus(int number) {
		return -number;
	}

	// this method used for unary minus.
	public int unaryIncrement(int number) {
		return ++number;
	}

	// this method used for unary minus.
	public int unaryDecrement(int number) {
		return --number;
	}
}

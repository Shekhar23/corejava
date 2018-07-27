package java_operator;

/*
 * this class is used for show usage of simple arithmetic operator.
 * 
 * */
public class SimapleArithmeticOperators {
	public static void main(String[] args) {
		System.out.println("------------------simple arathamatic operato ---------------------");
		SimapleArithmeticOperators operators = new SimapleArithmeticOperators();
		System.out.println("Addation of 2 number       : " + operators.add(5, 8));
		System.out.println("Subtraction of 2 number   : " + operators.sub(10, 8));
		System.out.println("Multiplication of 2 number : " + operators.mul(5, 2));
		System.out.println("Devison of 2 number        : " + operators.div(35, 5));
		System.out.println("Remender of 2 number       : " + operators.div(35, 6));
		System.out.println("------------------simple arathamatic operato ---------------------");
	}

	// method return addition of two number
	private int add(int numberFirst, int numberSecond) {
		return numberFirst + numberSecond;
	}

	// method return Subtraction of two number
	private int sub(int numberFirst, int numberSecond) {
		return numberFirst - numberSecond;
	}

	// method return multiplication of two number
	private int mul(int numberFirst, int numberSecond) {
		return numberFirst * numberSecond;
	}

	// method return devision of two number
	private int div(int numberFirst, int numberSecond) {
		return numberFirst / numberSecond;
	}

	// method return mod of two number
	private int remider(int numberFirst, int numberSecond) {
		return numberFirst % numberSecond;
	}

}

package java_input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shekhar
 *
 */
public class ReadDoubleFromKeyBoard {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// read String using buffer reader and type cast it into double .
		System.out.println("enter number which you want to display.");
		double number = Double.parseDouble(br.readLine());
		System.out.println("You entered " + number);

	}
}

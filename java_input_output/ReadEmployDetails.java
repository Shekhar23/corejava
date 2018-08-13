package java_input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shekhar
 *
 */
public class ReadEmployDetails {
	// Main function for perform operations.
	public static void main(String args[]) throws IOException {
		// Object of buffer reader, read input from keyboard.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employe name.");
		// read string type data from keyboard.
		String empName = br.readLine();
		System.out.println("Enter employe id.");
		// read int type data from keyboard.
		int empId = Integer.parseInt(br.readLine());
		System.out.println("Enter employe gender M/F.");
		// read char type data from keyboard.
		char gen = (char) br.read();
		// printing data.
		System.out.println("----------------Employe Details--------------------");
		System.out.println("Employe name     : " + empName);
		System.out.println("Employe id       : " + empId);
		System.out.println("Employe gender   : " + gen);
		System.out.println("---------------------------------------------------");
	}
}

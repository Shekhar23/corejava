package java_input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//this class read date from the keyboard.

public class ReadCharFromKeyBoard {
	//main method for read data from the class.
	public static void main(String args[]) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		System.out.println("Enter charecter fro display.");
		char d = (char)br.read();
		System.out.println("Entered charater is "+d);
	}
}

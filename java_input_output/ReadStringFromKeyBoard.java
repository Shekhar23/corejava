package java_input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shekhar
 *
 */
public class ReadStringFromKeyBoard {

	public static void main(String[] args) throws IOException {
		
		// Created obbjcet of bufter reader class for read data.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// read string usinng buffer reader.
		System.out.println("enter string which you want to display.");
		String str = br.readLine();
		System.out.println("You entered "+str);
	}

}

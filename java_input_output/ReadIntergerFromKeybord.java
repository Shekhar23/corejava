package java_input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shekhar
 *
 */
public class ReadIntergerFromKeybord {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// read String using buffer reader and type cast it into int  .
		System.out.println("enter number which you want to display.");
		int number  = Integer.parseInt(br.readLine());
		System.out.println("You entered "+number);
	}

}

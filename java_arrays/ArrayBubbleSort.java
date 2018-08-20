package java_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shekhar
 *
 */
public class ArrayBubbleSort {

	public static void main(String args[]) {
		int[] number;
		int numberOfElelment;
		System.out.println("Please enter how meny number, you wants to sort.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = false;
		try {
			numberOfElelment = Integer.parseInt(br.readLine());
			number = new int[numberOfElelment];
			int limit = numberOfElelment-1;
			for (int i = 0; i < numberOfElelment; i++) {
				System.out.println("Please enter number, you wants to sort.");
				number[i] = Integer.parseInt(br.readLine());
			}
			
			for (int i = 0; i < limit; i++) {
				System.out.println("element : " + i + " " + number[i]);
				for (int j = 0; j < limit - i; j++) {
					System.out.println("comp : " + number[j] + " to " + number[j+1]);	
					if (number[j] > number[j+1]) {
						int temp = number[j];
						number[j] = number[j+1];
						number[j+1] = temp;
						System.out.println("swap");
						flag = true;
					}
				}
				if(!flag){
					System.out.println("break");
					break;
				}
			}
			System.out.println("Final OutPut: ");
			for (int i = 0; i < numberOfElelment; i++) {
				System.out.println("element : " + i + " " + number[i]);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package java_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shekhar
 *
 */
// this program read the number of subject from student and then show avarage
// number.
public class AvgOfArrayElement {
	private int[] masrks;
	private int subjects;

	public static void main(String args[]) {
		AvgOfArrayElement avg = new AvgOfArrayElement();
		avg.getNumberOfSubject();
		avg.readMarks();
		avg.displayResult();
	}

	// This method is used for read number of subject from user.
	private void getNumberOfSubject() {
		System.out.println("Enter number of subject");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			subjects = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		masrks = new int[subjects];
		System.out.println("number of subject are " + masrks.length);
	}

	// this method read marks of student and store into arrays.
	private void readMarks() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter marks for subjects");
		for (int i = 0; i < subjects; i++) {
			System.out.println("Enter for subjects " + (i + 1));
			try {
				masrks[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// this method used for show total marks and avrage.
	private void displayResult() {
		int totalMarks = 0;
		if (masrks.length <= 0) {
			System.out.println("Please add marks");
			return;
		}
		for (int i = 0; i < subjects; i++) {
			int mark = masrks[i];
			totalMarks += mark;
			System.out.println("Mark of subjects " + (i + 1) + " is : " + mark);
		}
		System.out.println("Total Marks are " + totalMarks);
		float avg = totalMarks / subjects;
		System.out.println("Avarage Marks are " + avg);

	}
}

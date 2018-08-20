package java_arrays;

/**
 * @author shekhar
 *
 */
/**
 * This program is example for 3d array this program calculate total marks of
 * students we have array of 3 dept each dept have 2 student and every student
 * have 3 subject so need to calculate the marks of that students.
 */
public class Array3DDisplayMarksAndTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arra[][][] = { { { 60, 60, 70 }, { 90, 67, 66 } }, { { 54, 65, 76 }, { 89, 60, 54 } },
				{ { 66, 57, 90 }, { 78, 78, 55 } } };
		for (int i = 0; i < 3; i++) {
			System.out.println("This is dept " + (i + 1));
			for (int j = 0; j < 2; j++) {
				System.out.println("Student " + (j + 1));
				int total = 0;
				for (int k = 0; k < 3; k++) {
					System.out.print("\t Subject Marks " + (k + 1) + " are " + arra[i][j][k]);
					total = +arra[i][j][k] + total;
				}
				System.out.println("\n Total : " + total);
			}
		}
	}

}

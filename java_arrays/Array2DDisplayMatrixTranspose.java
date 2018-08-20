package java_arrays;

import java.util.Scanner;

/**
 * @author shekhar
 *
 */
// This program is used for calculate the transpose of matrix
public class Array2DDisplayMatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and coloumn");
		System.out.println("Enter col");
		int c = sc.nextInt();
		System.out.println("Enter row");
		int r = sc.nextInt();
		// init the 2d array
		int matrix[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				// input the metrix.
				System.out.println("Enter element row = " + i + " coloumn = " + j);
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print(matrix[j][i] + "\t");
			}
			System.out.println("\n");
		}
	}

}

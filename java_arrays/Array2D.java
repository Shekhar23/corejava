package java_arrays;
/**
 * @author shekhar
 *
 */
// this class prints the 2d array.
public class Array2D {

	public static void main(String[] args) {
		//multi d array
		int marksOfStudent [] [] = {
				{87,82,39,82,76},
				{68,67,80,90,66},
				{10,10,9,7,8}
		};
		// for loop for print 2d array
		for(int i = 0; i< marksOfStudent.length; i++ ){
			for( int j = 0; j < 5; j ++){
				System.out.print(marksOfStudent[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}
	
}



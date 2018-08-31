package java_string;
/**
 * @author shekhar
 * this class shows all methods of string class and their usage.
 */
public class StringClassAndMethods {

	public static void main(String[] args) {
		String s= "shekharnarayanpande";
        // or String s= new String ("shekharnarayanpande");
 
        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());
 
        // Returns the character at ith index.
        System.out.println("Character at 3rd position = "
                           + s.charAt(3));
 
        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring " + s.substring(3));
 
        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2,5));
 
        // Concatenates string2 to the end of string1.
        String s1 = "shekhar";
        String s2 = "narayanpande";
        System.out.println("Concatenated string  = " +
                            s1.concat(s2));
 
        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Jay Shivaji Jay Bhavani";
        System.out.println("Index of Shivaji " + 
                           s4.indexOf("Shivaji"));
 
        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + 
                           s4.indexOf('J',3));
 
        // Checking equality of Strings
        Boolean out = "Shivaji".equals("shivaji");
        System.out.println("Checking Equality  " + out);
        out = "Shivaji".equals("Shivaji");
        System.out.println("Checking Equality  " + out);
 
        out = "Shivaji".equalsIgnoreCase("shivaji");
        System.out.println("Checking Equality" + out);
 
        int outOne = s1.compareTo(s2);
        System.out.println("If s1 = s2" + outOne);
 
        // Converting cases
        String wordOne = "JayShiVAji";
        System.out.println("Changing to lower Case " +
                            wordOne.toLowerCase());
 
        // Converting cases
        String wordTwo = "maharashtramaza";
        System.out.println("Changing to UPPER Case " + 
                            wordTwo.toUpperCase());
 
        // Trimming the word
        String wordFour = " Jay Maharashtra ";
        System.out.println("Trim the word " + wordFour.trim());
 
        // Replacing characters
        String strOne = "dayshivajidaybhavani";
        System.out.println("Original String " + strOne);
        String strTwo = strOne.replace('d' ,'J') ;
        System.out.println("Replaced f with g -> " + strTwo);
	}

}

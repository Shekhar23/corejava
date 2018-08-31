package java_string;

/**
 * @author shekhar This class shows usage of string buffer class.
 */
public class StringBufferClassAndMethods {
	public static void main(String[] args) {
		// create StringBuffer object
		StringBuffer sbf = new StringBuffer("Hello World!");
		/*
		 * To convert StringBuffer to String object, use String toString()
		 * method of StringBuffer class.
		 */
		String str = sbf.toString();
		System.out.println("StringBuffer to String: " + str);

		// create StringBuffer object
		StringBuffer sb = new StringBuffer("Java StringBuffer SubString Example");
		System.out.println("Original Text : " + sb);

		/*
		 * SubString method is overloaded in StringBuffer class 1. String
		 * substring(int start) returns new String which contains sequence of
		 * characters contined in StringBuffer starting from start index to
		 * StringBuffer.length() - 1 index
		 */
		String strPart1 = sb.substring(5);
		System.out.println("Substring 1 : " + strPart1);

		/*
		 * 2. String substring(int start, int end) returns new String which
		 * contains sequence of characters contined in StringBuffer starting
		 * from start index to end index
		 */
		String strPart2 = sb.substring(0, 17);
		System.out.println("Substring 2 : " + strPart2);

		/*
		 * Please note that both the methods can throw a
		 * StringIndexOutOfBoundsException if start or end is invalid.
		 */

		// create StringBuffer object
		StringBuffer sbRev = new StringBuffer("Java StringBuffer Reverse Example");
		System.out.println("Original StringBuffer Content : " + sbRev);

		// To reverse the content of the StringBuffer use reverse method
		sbRev.reverse();
		System.out.println("Reversed StringBuffer Content : " + sbRev);

		// Create the StringBuffer object
		StringBuffer sbRep = new StringBuffer("Hello World");
		System.out.println("Original Text : " + sbRep);

		/*
		 * To replace the contents of Java StringBuffer use StringBuffer
		 * replace(int start, int end, String str) method. It replaces the
		 * content from StringBuffer string from start index to end - 1 index by
		 * the content of the String str.
		 */
		sbRep.replace(0, 5, "Hi");
		System.out.println("Replaced Text : " + sbRep);
		
		/*
	     int length() method of Java StringBuffer class returns the length 
	     of a StringBuffer object.
	    */
	    StringBuffer sbLength = new StringBuffer("Hello World");
	    int len = sbLength.length();
	    System.out.println("Length of a StringBuffer object is : " + len);
	    
	    
	    
	    /* 
	     Java StringBuffer class provides following methods to insert various
	     primitive values and objects to StringBuffer object at specified offset.
	    */
	    
	    /*
	     StringBuffer insert(int offset, boolean b) method inserts
	     boolean to StringBuffer object at specified offset
	    */
	    boolean b = true;
	    StringBuffer sb1 =  new StringBuffer("Hello  World");
	    sb1.insert(6,b);
	    System.out.println(sb1);
	 
	    /*
	     StringBuffer insert(int offset, char c) method inserts
	     character to StringBuffer object at specified offset
	    */
	    char c = 'Y';
	    StringBuffer sb2 =  new StringBuffer("Hello  World");
	    sb2.insert(6,c);
	    System.out.println(sb2);
	 
	 
	    /*
	     StringBuffer insert(int offset, char[] c1) method inserts
	     character array to StringBuffer object at specified offset
	    */
	    char[] c1 = new char[] {'Y','e','s'};
	    StringBuffer sb3 =  new StringBuffer("Hello  World");
	    sb3.insert(6,c1);
	    System.out.println(sb3);
	 
	 
	    /*
	     StringBuffer insert(int offset, double d) method inserts
	     double to StringBuffer object at specified offset
	    */
	    double d = 1.0;
	    StringBuffer sb4 =  new StringBuffer("Hello  World");
	    sb4.insert(6,d);
	    System.out.println(sb4);
	 
	 
	    /*
	     StringBuffer insert(int offset, float f) method inserts
	     float to StringBuffer object at specified offset
	    */
	    float f = 2.0f;
	    StringBuffer sb5 =  new StringBuffer("Hello  World");
	    sb5.insert(6,f);
	    System.out.println(sb5);
	 
	 
	    /*
	     StringBuffer insert(int offset, int i) method inserts
	     integer to StringBuffer object at specified offset
	    */
	    int i = 5;
	    StringBuffer sb6 =  new StringBuffer("Hello  World");
	    sb6.insert(6,i);
	    System.out.println(sb6);
	 
	 
	    /*
	     StringBuffer insert(int offset, long l) method inserts
	     long to StringBuffer object at specified offset
	    */
	    long l = 10;
	    StringBuffer sb7 =  new StringBuffer("Hello  World");
	    sb7.insert(6,l);
	    System.out.println(sb7);
	    
	    /*
	     StringBuffer insert(int offset, Object obj) method inserts
	     Object to StringBuffer object at specified offset
	    */
	    Object obj = new String("My");
	    StringBuffer sb8 =  new StringBuffer("Hello  World");
	    sb8.insert(6,obj);
	    System.out.println(sb8);
	 
	    /*
	     StringBuffer insert(int offset, String str) method inserts
	     String to StringBuffer object at specified offset
	    */
	    String str2 = "New";
	    StringBuffer sb9 =  new StringBuffer("Hello  World");
	    sb9.insert(6,str2);
	    System.out.println(sb9);
	    
	    /*
	     NOTE: Above all method throws StringIndexOutOfBoundsException if the 
	     offset is less than 0 or grater than length of StringBuffer object.  
	    */
	    StringBuffer sbObj1 = new StringBuffer();
	    
	    /*
	    2. StringBuffer StringBuffer(int length)
	    Constructs empty StringBuffer with initial capacity of length
	    */
	    StringBuffer sbObj2 = new StringBuffer(10);
	    
	    /*
	    3. StringBuffer StringBuffer(String str)
	    constructs StringBuffer with the contents same as argument String
	    */
	    StringBuffer sbObj3 = new StringBuffer("Hello World");
	    System.out.println(sbObj3);
	}

}

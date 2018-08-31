package java_string;
/**
 * @author shekhar
 * Basic example of string buffer class.
 */
public class StringBufferExp {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		int sbLength = sb.length();
		int sbCapacity = sb.capacity();
		System.out.println("String Length of " + sb + " is " + sbLength);
		System.out.println("Capacity of " + sb + " is " + sbCapacity);
	}

}

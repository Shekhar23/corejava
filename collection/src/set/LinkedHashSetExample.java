package set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a HashSet
		LinkedHashSet<String> daysOfWeek = new LinkedHashSet<>();

		// Adding new elements to the HashSet
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");

		// Adding duplicate elements will be ignored
		daysOfWeek.add("Monday");

		System.out.println(daysOfWeek);
	}

}

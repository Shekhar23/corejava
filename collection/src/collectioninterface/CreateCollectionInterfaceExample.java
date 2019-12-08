package collectioninterface;

import java.util.ArrayList;
import java.util.Collection;

public class CreateCollectionInterfaceExample {

	 public static void main(String[] args) {
	        // Creating an ArrayList of String using 
	     Collection<String> animals = new ArrayList<>();
	        // Adding new elements to the ArrayList
	        animals.add("Lion");
	        animals.add("Tiger");
	        animals.add("Cat");
	        animals.add("Dog");
	        System.out.println(animals);
	        
	        String[] arrayOfAnimals = new String[4];
	        System.out.println(arrayOfAnimals.length);
	        arrayOfAnimals[0] = "Lion";
	        arrayOfAnimals[1] = "Tiger";
	        arrayOfAnimals[2] = "Cat";
	        arrayOfAnimals[3] = "Dog";
	        for (String string : arrayOfAnimals) {
	            System.out.println(string);
	        }        
	    }
}

package hasmapexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
/*
 * @author - HashMap will be not in order and it will store key and value 
 */
public class HashMapExample {
	public static void main(String[] args) {

		HashMap<String, Long> phonebook = new HashMap<String, Long>();
		phonebook.put("Kelly", 5736901214L);
		phonebook.put("John", 5736901214L);
		phonebook.put("Tony", 5736901214L);
		phonebook.put("Jennifer", 5736901214L);
		phonebook.put("Cap", 5736901214L);

		System.out.println(phonebook.values());

		/*
		 * There is a numerous number of ways to iterate over HashMap of which 5 are
		 * listed as below:
		 * Iterate through a HashMap EntrySet using Iterators.
		 * Iterate through HashMap KeySet using Iterator.
		 * Iterate HashMap using for-each loop.
		 * Iterating through a HashMap using Lambda Expressions.
		 * Loop through a HashMap using Stream API.
		 * 
		 */
		
		/*
		 * Method 1: Using a for loop to iterate through a HashMap. Iterating a HashMap
		 * through a for loop to use getValue() and getKey() functions.
		 * 
		 * Implementation: In the code given below, entrySet() is used to return a set
		 * view of mapped elements. From the code given below:
		 * 
		 * set.getValue() to get value from the set.
		 * set.getKey() to get key from the set.
		 */
		
		
		//Iterating HashMap through for loop
		for(Map.Entry<String, Long> set : phonebook.entrySet())
		{
			//printing all elements of a Map
			System.out.println("Iterating HashMap through for loop:"+set.getKey()+"=" + set.getValue());
		}
		
		
		/*
		 * Method 2: Using a forEach to iterate through a HashMap. In the second method,
		 * the forEach function to iterate the key-value pairs.
		 */
		// Iterating HashMap through forEach and
        // Printing all. elements in a Map
		
		phonebook.forEach((key,value)->System.out.println("Iterating HashMap through forEach: "+key+"="+value));
		
		//Method 3: Using an iterator to iterate through a HashMap. In this method, iterator is being used to iterate each mapped pair in HashMap as shown in below java program.
		
		//Iterator
		Iterator<Entry<String, Long>> iterator = phonebook.entrySet().iterator();
		
		//Iterating eery set of entry in the HashMap
		while (iterator.hasNext()) {
			Map.Entry<java.lang.String, java.lang.Long> entry = (Map.Entry<java.lang.String, java.lang.Long>) iterator
					.next();
			
			//Displaying hashMap
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		/*
		 * Method 4: Iterating through a HashMap using Lambda Expressions
		 * 
		 * A lambda expression is a short block of code that takes in parameters and
		 * returns a value. Lambda expressions are similar to methods, but they do not
		 * need a name, and they can be implemented right in the body of a method. The
		 * simplest lambda expression contains a single parameter and an expression:
		 */
		//Iterating through forEach and printing the elements
		
		phonebook.forEach((key,value)->System.out.println(key +"= " + value));
		
		/*
		 * Method 5: Loop through a HashMap using Stream API
		 * 
		 * The below example iterates over a HashMap with the help of the stream API.
		 * 
		 * Stream API is used to process collections of objects.
		 * 
		 * Streams don’t change the original data structure, they only provide the
		 * result as per the pipelined methods
		 * 
		 * Steps :
		 * 
		 * First invoke entrySet().stream() method which inturn returns Stream object.
		 * Next forEach method, which iterates the input objects that are in the
		 * entrySet(). See the below code.
		 */
		
		// Iterating every set of entry in the HashMap, and
        // printing all elements of it
		phonebook.entrySet().stream().forEach(
            input
            -> System.out.println(input.getKey() + " : "
                                  + input.getValue()));
	}
}
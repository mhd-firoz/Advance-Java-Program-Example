package linkedhashmapexample;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * LinkedHashmap will be in order 
 */
public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Long> phonebook = new LinkedHashMap<String, Long>();
		
		phonebook.put("Kelly", 5736901214L);
		phonebook.put("John", 5736901214L);
		phonebook.put("Tony", 5736901214L);
		phonebook.put("Jennifer", 5736901214L);
		phonebook.put("Cap", 5736901214L);

		
		for (Map.Entry<String, Long> entry : phonebook.entrySet()) {
			String key = entry.getKey();
			Long val = entry.getValue();
			
			System.out.println("values of phone key and values "+key+" = "+val);
		}
	}

}

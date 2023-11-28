package linkedlistexample;

import java.util.LinkedList;

/*
 * @author Firoz
 */

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add(1, "C");
		
		System.out.println("print my list"+myList);
		
		myList.remove("B");
		System.out.println("list afterremoving list"+myList);
		
	}

}

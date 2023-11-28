package queueexample;
/*
 * @author - firoz
 * Implementing a queue with linked list
 * Queue - First in and first out from the list is called Queue
 */

import java.util.LinkedList;

public class Store {
	
	public static void main(String[] args) {
		
		LinkedList<Customer> queue = new LinkedList<>();
		queue.add(new Customer("Sally"));
		queue.add(new Customer("Ben"));
		queue.add(new Customer("Emma"));
		queue.add(new Customer("Fred"));
		System.out.println("list of all customer: "+queue );		
		
		serveCustomer(queue);
		System.out.println("list of all customer: "+queue );		
		
	}
	
	
	static void serveCustomer(LinkedList<Customer> queue)
	{
		
		Customer c = queue.poll(); //Retrieves and removes the head (first element) of this list.
		c.serve();
		
	}

}

package functionalinterfaceexample;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
Functional interface in java 8 - There are four functional interface 
1.Predicate - boolean result
2.Consumer - no result
3.function - input and output
4.Supplier
*/

public class FunctionalInterfaceExample {
	public static void main(String[] args) {

		GreetingMessage gm = new GreetingMessage() {

			@Override
			public void greet(String name) {
				// TODO Auto-generated method stub
				System.out.println("My name is " + name);

			}
		};

		gm.greet("Bethan");
	

		// lambdas expression
		GreetingMessage gm1 = name -> System.out.println("My name is " + name);
		gm1.greet("Tony");

		//	1. Predicate - boolean result
		
		Predicate<String> checklenght =str->str.length()>5;
		
		String strlenght ="Checklength";
		
		System.out.println(checklenght.test(strlenght));
		

		// 2. Consumer -modifies data - no output
		
		Person p = new Person();
		
		Consumer<Person> consumer = t->t.setName("Candece");
		
		consumer.accept(p);
		
		System.out.println("Consumer test :"+p.getName());
		
		// 3. Function -both input and output
		
		Function<Integer, String> getInt =t->t*2 +"data multiplied by 10";
		String result =getInt.apply(20);
		System.out.println(result);
		
		
		// 4. Supplier -only output 
		
		Supplier<Double> getRandomDouble=()->Math.random();
		System.out.println(getRandomDouble.get());
		
				
	}

}

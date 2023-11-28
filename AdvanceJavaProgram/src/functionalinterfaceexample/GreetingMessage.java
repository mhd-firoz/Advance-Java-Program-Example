package functionalinterfaceexample;
/*
 * @author -Firoz
 * 
 * Functional interface is interface which has one and only one abstract menthod
 */


@FunctionalInterface
public interface GreetingMessage {
	
	public abstract void greet(String name);

}

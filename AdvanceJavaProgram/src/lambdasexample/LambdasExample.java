package lambdasexample;

public class LambdasExample {
	
	public static void main(String[] args) {
		
		// without lambda
		
		PrintMessage print = new PrintMessage() {
			
			@Override
			public void pringmessage(String message) {
				// TODO Auto-generated method stub
				System.out.println("Hello "+ message);
				
			}
			
		};
		print.pringmessage("Jennifer");
		
		
		// with lambda
		PrintMessage p = (message)->System.out.println("pringt the message using lambda expression" + message);
		p.pringmessage("Tony");
		
	}

}

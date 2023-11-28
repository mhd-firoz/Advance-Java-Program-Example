package methodreferencesexample;

public class MethodReferencesExample {
	
	public static void main(String[] args) {
		
		Square square = new Square(4);
		
		
		//Without lambda
		Shapes s = new Shapes() {
			
			@Override
			public int getArea(Square person) {
				// TODO Auto-generated method stub
			
				return person.calculaterArea();
			}
		};
		
		s.getArea(square);
		
		
		//With lambda
		
		Shapes shapesOne =person->person.calculaterArea();
		System.out.println("Area of Square is: "+shapesOne.getArea(square));
		
		//different way of writing is 
		Shapes shapes =(Square person)->{
			return person.calculaterArea();
		};
		
		System.out.println("Area of Square is: "+shapes.getArea(square));
		
		//method as reference - replace lambda expression as method reference 
		
		Shapes shapesAsReference = Square::calculaterArea; 
		System.out.println("metheod as reference ::"+shapesAsReference.getArea(square));
		
	}

}

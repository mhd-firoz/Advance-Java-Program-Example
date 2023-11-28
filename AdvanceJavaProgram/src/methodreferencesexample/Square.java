package methodreferencesexample;

public class Square {

	int sideLength;

	public Square(int sideLength) {
		super();
		this.sideLength = sideLength;
	}

	public int calculaterArea() {
		int area;
		area = sideLength * sideLength;
		return area;
	}

	
}

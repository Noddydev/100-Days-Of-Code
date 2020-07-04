// Using abstract methods and classes.
abstract class Figure {
	double dim1;
	double dim2;

	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	// area is now an abstract method
	abstract double area();
}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}

	// override area for rectangle
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	}
} 

class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}

	// overrode area for right triangle
	double area() {
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
	}
}

class AbstractAreas {
	public static void main(String args[]) {
		// Figure f = new Figure(10, 20);
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Figure figrtef;

		figrtef = r;
		System.out.println("Area is " + figrtef.area());

		figrtef = t;
		System.out.println("Area is " + figrtef.area());
	}
}
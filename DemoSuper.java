// A complete implementation of BoxWeight.
class Box {
	private double width;
	private double height;
	private double depth;

	// Constructor clone of an object
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// constructor used when all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// constructor used whan no dimension specified
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// constructor used when cube is created
	Box(double len) {
		width = height = depth = len;
	}

	// compute and return volume 
	double volume() {
		return width * height * depth;
	}
}

// boxWeight now fully implements all constructors.
class BoxWeight extends Box {
	double weight;	

	BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}

	// constructor when all parameters are specified
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}

	// default constructor
	BoxWeight() {
		super();
		weight = -1;
	}

	// Constructor used when cube is created
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}

class DemoSuper {
	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight mybox3 = new BoxWeight();
		BoxWeight mycube = new BoxWeight(3, 2);
		BoxWeight myclone = new BoxWeight(mybox1);
		double vol;

		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();

		vol = mybox2.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox2.weight);
		System.out.println();

		vol = mybox3.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox3.weight);
		System.out.println();

		vol = myclone.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + myclone.weight);
		System.out.println();

		vol = mycube.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mycube.weight);
		System.out.println();
	
	}
}
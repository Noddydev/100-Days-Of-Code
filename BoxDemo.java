/* A Program that uses the Box class.
   Call this file BoxDemo.java
*/
class Box {
	double width;
	double height;
	double depth;
}   

// This class declares an object of type Box.
class BoxDemo {
	public static void main(String args[]) {
		Box mybox = new Box();
		double vol;

		// Assign values to mybox's instance vaiables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;

		// compute volume of box
		vol = mybox.width * mybox.height * mybox.depth;

		System.out.println("Volume is "+ vol); 
	}
}
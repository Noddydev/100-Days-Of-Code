// Demonstrate lifetime of a variable.
class LIfeTime {
	public static void main(String args[]) {
		int x;

		for(x=0; x<3; x++) {
			int y = -1;		// Y is initalized each time block is entered
			System.out.println("Y is: " + y);	// this always prints -1
			y = 100;
			System.out.println("Y is Now : " + y);
		}
	}
}
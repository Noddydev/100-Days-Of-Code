// This program will not compile.
class Outer {
	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	// this is an inner class 
	class inner {
		int y = 10;		// Y is local to inner

		void display() {
			System.out.println("display: outer_x = " + outer_x);
		} 
	}

	void showy() {
		System.out.println(y);		// error, y not known here!
	}
}

class InnerClassDemo2 {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();
	}
}
// Demonstrate method overloading.
class OverloadDemo {
	void test() {
		System.out.println("No Parameters");
	}

	// Overload test for on integer parameter.
	void test(int a) {
		System.out.println("a: " + a);
	}

	// Overoad test for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	// Overload test for a double parameter
	double test(double a) {
		System.out.println("Double a: " + a);
		return a*a;
	}
}

class Overload {
	public static void main(String args[]) {
		OverloadDemo ob = new OverloadDemo();
		double result;

		// call all version of test()
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		result = ob.test(123.25);
		System.out.println("Result of ob.test(23.25): " + result);
	}
}
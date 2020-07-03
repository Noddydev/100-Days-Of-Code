// Automatic type conversions apply to overloading.
class overloadDemo {
	void test() {
		System.out.println("No Parameters");
	}

	// overload tyest for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	// overload test for a double parameter
	void test(double a) {
		System.out.println("Inside test(double) a: " + a);
	}
}

class Overload2 {
	public static void main(String args[]) {
		overloadDemo ob = new overloadDemo();
		int i = 88;

		ob.test();
		ob.test(10, 20);

		ob.test(i);		// this will invoke tset(double)
		ob.test(123.2);	// this will invoke test(double)
	}
}
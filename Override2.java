// Method with differing type signatures are overloaded - not overrides
class A {
	int i, j;

	A(int a, int b) {
		i = a; 
		j = b;
	}

	// display i and j
	void show() {
		System.out.println("i and j : " + i + " " + j);
	}
}

// Create a subclass by extending class A.
clss B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// overload show() 
	void show(String msg) {
		System.out.println(msg + k);
	}
}

class Override2 {
	public static void main(String args[]) {
		B subOb = new B(1, 2, 3);

		subOb.show("This is k: ");
		subOb.show();
	}
}
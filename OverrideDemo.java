// Overriding a generic method in a generic class.
class Gen<T> {
	T ob;	// declare an object of tyep T

	// Pass the constructor a refernce to 
	// an object of type T.
	Gen(T o) {
		ob = o;
	}

	// Return ob.
	T getob() {
		System.out.println("gen's getob(): " );
		return ob;
	}
}

// A subclass of Gen thta overrides getob().
class Gen2<T> extends Gen<T> {
	
	Gen2(T o) {
		super(o);
	}

	// Override getob().
	T getob() {
		System.out.println("Gen2's getob(): ");
		return ob;
	}
}

// Demonstrate generic method override.
class OverrideDemo {
	public static void main(String args[]) {

		// Create a Gen object for Integers.
		Gen<Integer> iOb = new Gen<Integer>(88);

		// Create a Gen2 object for Integers.
		Gen2<Integer> iOb2 = new Gen2<Integer>(99);

		// Create a Gen2 object for Strings.
		Gen2<String> strOb2 = new Gen2<String> ("Generic Test");


		System.out.println(iOb.getob());
		System.out.println(iOb2.getob());
		System.out.println(strOb2.getob());
	}
}
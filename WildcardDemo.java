// Use a wildcard.
class Stats<T extends Number> {
	T[] nums;	// array of number or subclass

	// Pass the constructor a reference to 
	// an aray of type Number or subclass.
	Stats(T[] o) {
		nums = o;
	}

	// Return type double in all cases.
	double average() {
		double sum = 0.0;

		for(int i=0; i<nums.length; i++)
			sum += nums[i].doubleValue();

		return sum / nums.length;	
	}

	// Determine if two averages are the same.
	// Notice the use of the wildcard.
	boolean sameAvg(Stats<?> ob) {
		if(average() == ob.average())
			return true;

		return false;	
	}
}

// Demonstrate wildcard.
class WildcardDemo {
	public static void main(String args[]) {
		Integer inums[] = { 1, 2, 3, 4, 5 };
		Stats<Integer> iOb = new Stats<Integer>(inums);
		double v = iOb.average();
		System.out.println("iOb average is " + v);

		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("dob average is " + w);

		Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
		Stats<Float> fob = new Stats<Float>(fnums);
		double x = fob.average();
		System.out.println("fob average is " + x);

		// see which arrays have same average.
		System.out.println("Average of iOb and dob ");
		if(iOb.sameAvg(dob))
			System.out.print("are the same.");
		else 
			System.out.println("differ.");


		System.out.println("Average of iOb and fob ");
		if(iOb.sameAvg(fob))
			System.out.print("are the same.");
		else 
			System.out.print("differ.");			
	}
}
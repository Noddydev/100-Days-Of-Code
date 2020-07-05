// Another version of IntStack that has a provate interface
// method that i sused by two default methods.
interface IntStack {
	void push(int item);	// store an item
	int pop();	// retrieve an item

	// A default method that returns an array that contains 
	// the top n elements on the stack.
	default int[] popNElements(int n) {
		// Return the requested elements.
		return getElements(n);
	}

	// A default method that return an array that contains
	// the next n elements on the stack skipping elements.
	default int[] skipAndNElements(int skip, int n) {

		// Skip the specified number of elements/
		getElements(skip);

		// Return the requested elements.
		return getElements(n);
	}

	// A private method that returns an array constaining
	// the top n elements on the stack
	private int[] getElements(int n) {
		int[] elements = new int[n];

		for(int i=0; i<n; i++)	elements[i] = pop();
		return elements;
	}
}
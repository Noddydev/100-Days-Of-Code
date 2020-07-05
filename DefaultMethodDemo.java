interface MyIF {
	// This is a "normal" interface methid declaration.
	// It does NOTdefine a default implementation.
	int getNumber();

	// This is a default method. Notice that it provides a default implementation.
	default String getString() {
		return "Default String";
	}
}

// Implement MyIF.
class MyIFImp implements MyIF {
	// Only getNumber() define by MyIF needs to be implemented.
	// getString() can be allowed to default.
	public int getNumber() {
		return 100;
	}
}

// Use the dafault method.
class DefaultMethodDemo {
	public static void main(String args[]) {
		MyIFImp obj = new MyIFImp();

		// can call getNumber(), because it is explicitly 
		// implemented by MyIFImp.
		System.out.println(obj.getNumber());

		// can also call getString(), because of default 
		// implementation: 
		System.out.println(obj.getString());
	}
}
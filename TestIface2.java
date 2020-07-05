interface Callback {
	void callback(int param);
}

class Client implements Callback {
	// Implements Callback's interface
	public void callback(int p) {
		System.out.println("Callback called with " + p);
	}

	void nonIfaceMeth() {
		System.out.println("Classes that impement interface " + " may also define other member, too.");
	}
}

// Another implements of Callback.
class AnotherClient implements Callback {
	// Another callback's interface
	public void callback(int p) {
		System.out.println("Another version of callback");
		System.out.println("p squarad is " + (p*p));
	}
}

class TestIface2 {
	public static void main(String[] args) {
		Callback c = new Client();
		AnotherClient ob = new AnotherClient();

		c.callback(42);

		c = ob;	// c now refers to AnotherClient object
		c.callback(42);
	}
}
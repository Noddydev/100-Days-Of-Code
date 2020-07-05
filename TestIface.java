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

class TestIface {
	public static void main(String args[]) {
		Callback c = new Client();
		c.callback(42);
	}
}
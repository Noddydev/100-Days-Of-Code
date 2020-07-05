// One interface can extends another.
interface A {
	void meth1();
	void meth2();
}

// B now include meth1() and meth2() -- it adds meth3()
interface B extends A {
	void meth3();
}

// This class must implements all A and B
class MyClass implements B {
	public void meth1() {
		System.out.println("Implements meth1().");
	}

	public void meth2() {
		System.out.println("Implements meth2().");
	}

	public void meth3() {
		System.out.println("Implements meth3().");
	}
}

class IFExtends {
	public static void main(String args[]) {
		MyClass ob = new MyClass();

		ob.meth1();
		ob.meth2();
		ob.meth3();
	}
}
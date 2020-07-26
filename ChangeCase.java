// Demonstrate toUpperCase() and toLowerCase().
class ChangeCase {
	public static void main(String args[]) 
	{
		String s = "This is a Test.";

		System.out.println("Original: " + s);

		String upper = s.toUpperCase();
		String lower = s.toLowerCase();

		System.out.println("UpperCase: " + upper);
		System.out.println("LowerCase: " + lower);
	}
}
// Ue a string to control a switch statement.
class StringSwitch {
	public static void main(String args[]) {

		String str = "two";

		switch(str) {
			case "one" :
				System.out.println("One");
				break;
			case "two" :
				System.out.println("Two");
				break;
			case "three":
				System.out.println("Three");
				break;
			default	:
				System.out.println("No Match");
				break;
		}
	}
}
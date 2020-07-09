// Use an enum construyctor, instance variable, and methos
enum Apple {
	Jonathan(10), GoldenDen(9), RedDel(12), Winesap(15), Cortland(8);

	private int price;

	Apple(int p) { price = p; }

	int getPrice() { return price; }
}





class EnumDemo3 {
	public static void main(String args[]) {
		Apple ap;

		// Display proce of winesap.
		System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents. \n");

		// Display all apples and prices.
		System.out.println("All Apple Prices: ");
		for(Apple a : Apple.values())
			System.out.println(a + " costs " + a.getPrice() + " cents.");
	}
}
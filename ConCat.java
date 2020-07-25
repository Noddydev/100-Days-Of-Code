// Using concatenation to prevent long lines.
class ConCat {
	public static void main(String args[]) 
	{
		String longstr = "This could have been " + "a very long line that would have " +
						 "wrapped around. But string concatenation " + "prevent this.";


		System.out.println(longstr);				 
	}
}
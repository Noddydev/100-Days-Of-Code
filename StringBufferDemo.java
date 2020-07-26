// StringBuffer length vs. capacity.
class StringBufferDemo {
	public static void main(String args[]) 
	{
		StringBuffer sb = new StringBuffer("Hello");

		System.out.println("buffer = " + sb);
		System.out.println("langth = " + sb.length());
		System.out.println("capacity = " + sb.capacity());
	}
}
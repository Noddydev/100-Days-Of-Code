// A tiny editor.
import java.io.*;

class TinyEdit {
	public static void main(String args[]) throws IOException
	{
		// create a BufferedReader using System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		System.out.println("Enter Lines Of Text.");
		System.out.println("Enter 'STOP' to quit.");
		for(int i=0; i<100; i++) {
			str[i] = br.readLine();
			if(str[i].equals("stop")) break;
		}

		System.out.println("\nHere is your file: ");
		// display the lines
		for(int i=0; i<100; i++) {
			if(str[i].equals("stop")) break;
			System.out.println(str[i]);
		}
	}
}
/* A version of CopyFile that uses try-with-resources.
   It demonstrate two resources (in this case files) being
   managed by a single try statement.
*/   

import java.io.*;

class CopyFile2 {
	public static void main(String args[]) throws IOException
	{
		int i;

		// First, confirm that both files have been specified.
		if(args.length != 2) {
			System.out.println("Usage: CopyFile from to");
			return;
		}

		// Open and manage two files via the try statement.
		try(FileInputStream fin = new FileInputStream(args[0]); 
			FileOutputStream fout = new FileOutputStream(args[1]))
			{
				do {
					i = fin.read();
					if(i != -1) fout.write(i);
				} while(i != -1);

			} catch(IOException e) {
				System.out.println("I/O Error: " + e);
			}
	}
}
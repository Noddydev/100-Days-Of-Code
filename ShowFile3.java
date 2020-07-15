/* This version of the ShowFile program uses a try-with-resources
   Statement to automatically close a file after it is no longer nedded.
*/
import java.io.*;

class ShowFile3 {
	public static void main(String args[]) 
	{
		int i;

		// First, confirm that a filename has been specified.
		if(args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}

		// The following code uses a try-with-resources statements to open
		// a file and then automatically cose it when the try block is left.
		try(FileInputStream fin = new FileInputStream(args[0])) {

			do {
				i = fin.read();
				if(i != -1) 	System.out.println((char) i);
			} while(i != -1);

		} catch(FileNotFoundException e) {
			System.out.println("File Not Found.");
		} catch(IOException e) {
			System.out.println("An I/O Error Occured");
		}
	}
}   
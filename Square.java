import java.io.*;

class Square {
	static int gcd(int a, int b)
	{
		if(a==0 || b==0)
			return 0;


		if(a==b)
			return a;

		if(a > b)
			return gcd(a-b, b);
		return gcd(a, b-a);			
	}


	static int No(int x, int y)
	{
		int s = gcd(x, y);

		int ans = (x*y) / (s*s);

		return ans;
	}

	public static void main(String args[]) 
	{
		int m=30, n=21;

		System.out.println(No(m, n));
	}
}
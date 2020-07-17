import java.util.*;
public class Main {
	static final float round = 10000000.0f;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float x1, x2, y1, y2, f;
		x1 = Math.round(sc.nextFloat() * round) / round;
		y1 = Math.round(sc.nextFloat() * round) / round;
		x2 = Math.round(sc.nextFloat() * round) / round;
		y2 = Math.round(sc.nextFloat() * round) / round;
		f = Math.round(sc.nextFloat() * round) / round;


		float lb = Math.min(x1, x2);
		float ub = Math.max(x1, x2);
		while(lb < ub) {
			float mid = Math.round(((lb+ub)/2)*round) / round;
			float mid1 = Math.round(((lb+mid)/2)*round) / round;
			float mid2 = Math.round(((mid+ub)/2)*round) / round;

			float t1 = dist(x1, y1, mid1, 0) / (Math.round(f*round) / round) + dist(mid1, 0, x2, y2);
			float t2 = dist(x1, y1, mid2, 0) / (Math.round(f*round) / round) + dist(mid2, 0, x2, y2);

			if(t1 <= t2)
				ub = mid;
			else 
				lb = mid;	
		}  
		System.out.printf("%.6f", ub);
	}
	static float dist(float x1, float y1, float x2, float y2) {
		return Math.round(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)) * round) / round;
	}
}
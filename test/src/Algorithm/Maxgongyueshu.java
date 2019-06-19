package Algorithm;

public class Maxgongyueshu {
	public static int gcd(int x,int y) {
		if (y==0) {
			return x;
		}
		int z=x%y;
		return gcd(y, z);
	}
}

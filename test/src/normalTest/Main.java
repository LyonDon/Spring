package normalTest;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i = 0;
		int a = i++;
		int b = ++a;
		int c = a + b;
		int d = (a == 1) ? b : c;
		System.out.println(i);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int count=0;
		count=count++;
		System.out.println("count="+count);
	}

}

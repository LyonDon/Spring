package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Ex07 {
	static double t=0.9;
	public static void main(String[] args) {
		while(Math.abs(t-9.0/t)>.001){
			t=(9.0/t+t)/2.0;
		}
		StdOut.printf("%.5f\n",t);
		
		int sum=0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 0; j < i; j++) {
				sum++;
			}
		}
		StdOut.println(sum);
	}
}
package normalTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {

		try {
			File textFile = new File("E:\\MyeclipseWorkspace\\test\\src\\normalTest\\text.txt");
			BufferedWriter outBufferedWriter = new BufferedWriter(new FileWriter(textFile));
				for (int i = 0; i < 1000000; i++) {
					outBufferedWriter.write(String.valueOf(getNum(i)));
					outBufferedWriter.newLine();	
				}
				outBufferedWriter.close();
				
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Scanner scanner = new Scanner(System.in);
		// int n = scanner.nextInt();
		// long[] array = new long[n];
		// for (int i = 0; i < n; i++) {
		// array[i] = scanner.nextLong();
		//
		// }
		// for (int i = 0; i < n; i++) {
		//
		// if (array[i] <= 5000) {
		// System.out.println(0);
		// }
		// System.out.println(getNum(array[i]-5000));
		// }
	}

	public static long getNum(long num) {
		if (num<=5000) {
			return 0;
		}else
		if (num <= 8000) {	
			return (long) Math.floor(((num-5000) * 0.03) + 0.5);
		} else if (num <= 17000) {
			return (long) Math.floor((90 + (num - 8000) * 0.1) + 0.5);
		} else if (num <= 30000) {
			return (long) Math.floor((90 + 900 + (num - 17000) * 0.2) + 0.5);
		} else if (num <= 40000) {
			return (long) Math.floor((90 + 900 + 2600 + (num - 30000) * 0.25) + 0.5);
		} else if (num <= 60000) {
			return (long) Math.floor((90 + 900 + 2600 + 2500 + (num - 40000) * 0.3) + 0.5);
		} else if (num <= 85000) {
			return (long) Math.floor((90 + 900 + 2600 + 2500 + 6000 + (num - 60000) * 0.35) + 0.5);
		} else {
			return (long) Math.floor((90 + 900 + 2600 + 2500 + 6000 + 8750 + (num - 85000) * 0.45) + 0.5);
		}
	}
}

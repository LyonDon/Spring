package SortTest;

import java.util.Scanner;

/**
 * 每步将一个待排序的记录，按其关键码值的大小插入前面已经排序的文件中的适当位置，直到全部插入为止。O（n^2）
 * 稳定排序
 * @author Administrator
 *
 */
public class InsertSort {
	
	public static void insertsort(int[]	array){
		int tmp;//将当前位置的数字存储为tmp	
		for (int i = 1; i < array.length; i++) {
			tmp=array[i];
			int j=i;
			for ( ; j>0&&tmp<array[j-1]; j--) {
				array[j]=array[j-1];
			}
			array[j]=tmp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] string=scanner.nextLine().split("");
		int[] array=new int[string.length];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)string[i].charAt(0)-(int)'0';
			System.out.println(array[i]);
		}
		
	}
}

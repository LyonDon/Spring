package normalTest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class Test12 {
    public static void main(String[] args) {
    	ArrayList<Integer> arrayList=new ArrayList<Integer>();
    	arrayList.add(1);
    	arrayList.add(2);
    	arrayList.add(3);
    	arrayList.add(4);
    	arrayList.add(5);
    	System.out.println(Arrays.toString(arrayList.toArray()));
    }
 
    private static void process(String c, int a, int b, int[] score) {
        int begin,end;     
         
        if(c.equals("Q")){
            end = Math.max(a, b);
            begin = Math.min(a, b)-1;
            int max = score[begin];
            for(int i=begin;i<end;i++){
                if(max<score[i]){
                    max = score[i];
                }
            }
            System.out.println(max);
        }else if(c.equals("U")){
            score[a-1] = b;
        }
    }
}
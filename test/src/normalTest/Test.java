package normalTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws IOException {
		 
        String timeStamp = "1531782000000";//直接是时间戳
        long l=Long.parseLong(timeStamp);
        // long timeStamp = System.currentTimeMillis();  //获取当前时间戳,也可以是你自已给的一个随机的或是别人给你的时间戳(一定是long型的数据)
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//这个是你要转成后的时间的格式
        String sd = sdf.format(new Date(l));   // 时间戳转换成时间
        System.out.println(sd);//打印出你要的时间
        
        System.out.println(Math.log(10)/Math.log(2));
        char s=(char)1000000000;
        
//        Scanner scanner=new Scanner(System.in);
////        long sss=scanner.nextLong();
//        String sss=scanner.nextLine();
//        System.out.println(sss);
//        
//        BufferedReader brBufferedReader=new BufferedReader(new InputStreamReader(System.in));
//        String sss1=brBufferedReader.readLine();
//        System.out.println(sss1);
        
        byte s21=10;
        int b=(int)s21;
        System.out.println(b);
        
        int s22=10;
        byte b1=(byte)s21;
        System.out.println(b1);
        
        double s23=(double)s22;
        System.out.println(s23);
        System.out.println();
        
        int[] arr1=new int[]{1,2,3};
        int[] arr2=new int[]{4,5,6};
        System.arraycopy(arr1, 0, arr2, 1,2);
        for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr1[i]);
		}
        
        Integer xInteger=new Integer(123);
        Integer yInteger=Integer.valueOf(123);
        Integer zInteger=Integer.valueOf(123);
        System.out.println(zInteger==yInteger);
        
        String string1="abc";
        String string2=String.valueOf("abc");
        System.out.println(string1==string2);
	}
}

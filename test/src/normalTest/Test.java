package normalTest;

import java.io.BufferedReader;
import java.io.IOException;
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
        
        Scanner scanner=new Scanner(System.in);
//        long sss=scanner.nextLong();
        String sss=scanner.nextLine();
        System.out.println(sss);
        
        BufferedReader brBufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String sss1=brBufferedReader.readLine();
        System.out.println(sss1);
	}
}

package normalTest;

import java.util.Scanner;
public class Coin {
    private static  int n;  //支付数
    private static int count=0;  
    private static int[][]res=null;
    
    //初始化数组
    private static void init(){
        double lo=Math.log(n)/Math.log(2);
        int length=(int)lo+1;
        res=new int[n+1][length];
        for(int i=0;i<res[0].length;i++){
            res[0][i]=1;
            res[1][i]=1;
        }
        
        res[1][0]=1;
        res[2][0]=1;
    }

    //动态规划
    private static final int solve(){
        if(n==0) return 1;
        if(n==1) return 1;
        
        init();
        for(int i=1;i<n+1;i++){
            for(int j=1;j<res[0].length;j++){
                int sum=0;
                for(int m=0;m<3;m++){
                    int rest=(int) (i-Math.pow(2, j)*m);
                    if(rest>=0)
                    {
                        sum+=res[rest][j-1];
                    }
                }
                res[i][j]=sum;
            }
        }
        return res[n][res[0].length-1];
    }
    
    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        scanner.close();
        double start=System.currentTimeMillis();
        int result=solve();
        System.out.println(result);
        System.out.println("use time="+(System.currentTimeMillis()-start));
    }
}
package pencilTest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Zijie3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		String string2=scanner.nextLine();

		ArrayList<String> arrayList=Permutation(string2);
		
		if (get(string, arrayList)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	
	public static boolean get(String string,ArrayList<String> arrayList){
		for (int i = 0; i < arrayList.size(); i++) {
			if (!string.contains(arrayList.get(i).toString())) {
				continue;
			}else {
				return true;
			}
		}
		return false;
	}
	
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<String>();
        if(str==null||str.length()==0){
            return res;
        }
        char[] charArray = str.toCharArray();
        //输出按照输入字典顺序
        TreeSet<String> tempRes = new TreeSet<String>();
        PermutationCore(charArray,tempRes,0);
        res.addAll(tempRes);
        return res;
        
    }
    private static void PermutationCore( char[] charArray,TreeSet<String> tempRes,int loc)
    {
        if(charArray==null || charArray.length==0 || loc<0 || loc>charArray.length-1)
        {
            return ;
        }
        if(loc==charArray.length-1)
        {
            tempRes.add(String.valueOf(charArray));//递归的出口
        }
        else
        {
            for(int i=loc;i<charArray.length;i++)
            {
                swap(charArray,i,loc);//将第一个字符与后面的字符交换
                PermutationCore(charArray,tempRes,loc+1);//对后面所有的字符进行全排列
                swap(charArray,i,loc);//再将之前交换的字符交换回来，以便第一个字符再与其他字符交换
            }
        }
    }
    private static void swap(char[] charArray,int i,int j)
    {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}


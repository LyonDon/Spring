package SwordOffer;

import java.util.Arrays;
 
public class Solution28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int x=array[array.length/2];
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                count++;
            }
        }
        if(count<=array.length/2){
            return 0;
        }
        return x;
    }
}
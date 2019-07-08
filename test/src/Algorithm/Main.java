package Algorithm;

import java.util.Scanner;

public class Main {
	public String removeDuplicate2(String s)
	{
	    int len = s.length();
	    if(len < 2) 
	        return s;
	    String str = "";
	    for(int i=0; i<len; ++i)
	    {
	        if(s.charAt(i) != ' ')
	        {
	            str += s.charAt(i);
	            for(int j=i+1; j<len; ++j)
	            {
	                if(s.charAt(j)==s.charAt(i))
	                {
	                    s[j] = ' ';
	                }                                            
	            }
	        }
	    }
	    return str;
	}
}

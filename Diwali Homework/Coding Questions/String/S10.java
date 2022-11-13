import java.io.*;
import java.util.*;

public class S10 {
    
    public static void permutation(String a, String b)
    {
        if(a.length() == 0)
        {
            System.out.println(b);
            return;
        }
        for(int i = 0; i < a.length(); i++)
		{
			char ch = a.charAt(i);
			String str1 = a.substring(0, i);
			String str2 = a.substring(i + 1);           
			String roq = str1 + str2;
			permutation(roq, b + ch);
		}
	}

    public static void main(String args[]) 
	{
        Scanner sc = new Scanner (System.in);
		System.out.print("Input : ");
        String str = sc.next();
        permutation(str,"");
        
        
	}
}
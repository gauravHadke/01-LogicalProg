package StringMixed;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FindLonestWord_inStringWithTokenizer {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		StringTokenizer st=new StringTokenizer(s);//it is use for divide string into token.
		int m=0;
		String res=" ";
		
		while(st.hasMoreTokens())
		{
			String token=st.nextToken();
			if(token.length()>m)
			{
				m=token.length();
				res=token;
			}
		}
		System.out.println(res);
	}

}

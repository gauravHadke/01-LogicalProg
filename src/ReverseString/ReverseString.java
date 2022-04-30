package ReverseString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		//System.out.println("Hiii");
		String s1="hello";
		
		/*  Approach 1 (Using toCharArray())**/
		char[] ch=s1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		/*Apporach 2 (Using chatAt() )*/
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		
		/*Apporach 3 (Using reverse() method )*/
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb.reverse());
		
		/*Approach 4*/
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	}
}

package ReverseString;

import java.util.Scanner;

public class ValidZipCodeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter zip code :");
		String s=sc.nextLine();
		int count=0;
		int ch=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				count++;
			
		}
		if(count==5)
			System.out.println("Valid Zip");
		else 
			System.out.println("Invalid Zip,should be length 5");
		
	}

}

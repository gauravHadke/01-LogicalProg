package StringMixed;

import java.util.Scanner;

public class FindMiddleCharacterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if length is odd then return middle 1 char 
		//if length is even then return middle 2 char (We cant find middle char in even length)

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int sLength=s.length();
		if(sLength%2==0)
			System.out.println(s.charAt(sLength/2-1)+" "+s.charAt(sLength/2));
		else
			System.out.println(s.charAt(sLength/2));
	}

}

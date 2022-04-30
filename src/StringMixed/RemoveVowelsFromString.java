package StringMixed;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*vowels : a e i o u*/
		String s="jaevm";//here a e vowels we have to remove
			
		/*Approach 1 using replaceAll()*/
		System.out.println(s.replaceAll("[aeiou]",""));
		
		/*Approach 2 without using any function*/
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				continue;
			else
				System.out.print(s.charAt(i));
				
		}
	}

}

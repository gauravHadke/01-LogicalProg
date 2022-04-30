package StringMixed;

public class ReplaceVowelWithCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="hello";
		String ch="*";
		
		/*with using replaceAll()*/
		System.out.println(s.replaceAll("[aeiou]",ch));
		
		/*Without Using Replace*/
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='e'||s.charAt(i)=='o')
				System.out.print(ch);
			else
				System.out.print(s.charAt(i));
		}
	}

}

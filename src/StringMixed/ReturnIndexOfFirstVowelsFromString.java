package StringMixed;

public class ReturnIndexOfFirstVowelsFromString {
	
	public static void main(String[] args) {
		
		String s="Hello";
		//Approach 1
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='e'||ch=='o')
				System.out.println(i);
			else
				continue;
		}
		//Apporach 2
		for(int i=0;i<s.length();i++)
		{
			//char ch=s.charAt(i);
			if(s.charAt(i)=='e'||s.charAt(i)=='o')
				System.out.print(i+" ");
				
		}
	}

}

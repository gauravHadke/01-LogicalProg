package StringMixed;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="gaurav Hadke";
	
	/* Approach 1(Using replaceAll() )*/
	System.out.println(s.replaceAll(" ",""));
	System.out.println("------------------------");
	
	
	
	/*Approach 2 (without using function)*/
	char[] ch=s.toCharArray();
	for(int i=0;i<=ch.length-1;i++)
	{
		if(ch[i]==' ')
			continue;
		else
			System.out.print(ch[i]);
		
	}
	
	/*Approach 3 (without using function)*/
	for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)==' ')
			continue;
		else
			System.out.print(s.charAt(i));
	}
	}

}

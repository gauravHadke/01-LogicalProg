package StringMixed;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="he*&llo";
		System.out.println(s.replaceAll("[^A-Za-z0-9]",""));
	}

}

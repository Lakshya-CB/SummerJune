package Lec_15;

public class String_2 {
	public static void main(String[] args) {
		String str = "lol";
		String str1 = "lol";
		String str2 = "lol";
		
		System.out.println(str==str2);
		
		String str00 = new String("lol");
		System.out.println(str2==str00);
		
		System.out.println(str00.equals(str2));

		String str001 = new String("lol");
		System.out.println(str001==str00);
		str1.substring(0);
	} 
}

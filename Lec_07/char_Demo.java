package Lec_07;

import java.util.Scanner;

public class char_Demo {
	public static void main(String[] args) {
		char ch = 'A';
		int i = ch;
		int LL  = 'A'+25;
		System.out.println(i);
		System.out.println((char)LL);
		char ch2 = (char)LL;
		System.out.println(ch2);
		System.out.println((int)'~');
		System.out.println((int)'a');
		System.out.println((int)'A');
		Scanner scn = new Scanner(System.in);
		char chh = scn.next().charAt(0);
		System.out.println(chh);
		
	}
}

package Lec_07;

import java.util.Scanner;

public class lower_upper {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("lower");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("UPPER");
			
		}
	}
}

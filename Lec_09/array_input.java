package Lec_09;

import java.util.Scanner;

public class array_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}
		disp(arr);
	}
	public static void disp(int[]arr) {
		for(int ali: arr) {
			System.out.print(ali+" ");
		}
		System.out.println();
	}
	public static int Max(int[] arr) {
//		int jeb = arr[0];
		int jeb = Integer.MIN_VALUE;
		for(int aam: arr) {
			if(aam>jeb) {
				jeb=aam;
			}
		}
		return jeb;
	}
}

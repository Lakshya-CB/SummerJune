package Lec_34;

import java.util.Arrays;

public class Client {
	public static void main(String[] args) {
		int[] lvl = {10,20,30,40,50,-1,70,-1,-1,100};
		BST BT = new BST(lvl,false);
//		BT.Disp();
		
//		BT.lvlChange();
//		BT.verticalTrav();
		String str = "poamdq";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);
	}
}

package Lec_30;


public class Client {
	public static void main(String[] args) {
		int[] lvl = {10,20,30,40,50,-1,70,-1,-1,100};
		BST BT = new BST(lvl,false);
//		BT.Disp();
		
		BT.lvlChange();
	}
}

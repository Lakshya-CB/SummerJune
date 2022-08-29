package Lec_28_29_pract;

public class CLient {
	public static void main(String[] args) {
//		int[] in = {40,20,50,10,30,70};
//		int[] pre = {10,20,40,50,30,70};
//		BTree BT = new BTree(in, pre);
//		BT.Disp();
//		System.out.println(BT.find(30));
//		System.out.println(BT.Ht());
//		int[] pre = {10,20,40,-1,-1,50,-1,-1,30,-1,70,-1,-1};
//		BTree BT = new BTree(pre);
//		BT.Disp();
		int[] lvl = {10,20,30,40,50,-1,70,-1,-1,100};
		BTree BT = new BTree(lvl,false);
		BT.Disp();
		
		BT.Lvl();
	}
}

package Lec_28;

public class CLient {
	public static void main(String[] args) {
		int[] in = {40,20,50,10,30,70};
		int[] pre = {10,20,40,50,30,70};
		BTree BT = new BTree(in, pre);
		BT.Disp();
//		System.out.println(BT.find(30));
		System.out.println(BT.Ht());
	}
}

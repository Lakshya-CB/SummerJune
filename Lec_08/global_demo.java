package Lec_08;

public class global_demo {
	static int val = 10;

	public static void main(String[] args) {
		System.out.println(val);
		int val = 100;
		System.out.println(val);
		System.out.println(global_demo.val);
	}
}

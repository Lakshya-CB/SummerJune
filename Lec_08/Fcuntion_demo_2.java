package Lec_08;

public class Fcuntion_demo_2 {
	static int gulab_jamun=2;
	public static void main(String[] args) {
		
		int a = 1;
		int b = 20;
		System.out.println(a + " : " + b);
		swap(a, b);
		System.out.println(a + " : " + b);
	}

	public static void swap(int a, int b) {
		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
	}
}

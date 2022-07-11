package Lec_07;

public class demo {
	public static void main(String[] args) {
		boolean b = 3 <= 2 && 1 > 0;
		if (!b) {
			System.out.println("dangal");
		} else {
			System.out.println("masti");
		}
		byte k = (byte) 128;
		System.out.println(k);

		System.out.println("Hello" + 10);
		System.out.println("Hello" + 10 + 20);
		System.out.println(10 + "Hello" + 10 + 20);
		System.out.println(20 + 10 + "Hello" + 10 + 20);
		System.out.println(20 + 10 + "Hello" + (10 + 20));

	}
}

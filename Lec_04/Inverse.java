package Lec_04;

public class Inverse {
	public static void main(String[] args) {
		int num = 53124;
		int pos = 1;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			System.out.println(digit + " , " + pos);
//			pos to digit place
//			pos*10^(digit-1);
			int mult = (int)Math.pow(10, digit-1);
			sum = sum + pos *mult;
			pos++;
		}
		System.out.println(sum);
	}
}

package Lec_04;

public class chewbacca {
	public static void main(String[] args) {
		int num = 99999999;
		int mult = 1;
		int ans = 0;
		while (num > 0) {
			int digit = num % 10;
			if (num!=9 && 9 - digit < digit) {
				digit = 9-digit;
			}
			num = num / 10;
			ans = ans + digit * mult;

			mult = mult * 10;

		}
		System.out.println(ans);
	}
}

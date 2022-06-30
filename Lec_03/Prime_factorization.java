package Lec_03;

public class Prime_factorization {
	public static void main(String[] args) {
		int num = 364;
		int div = 2;
		while (num>1) {
			if (num % div == 0) {
				System.out.println(div);
				num = num / div;
			} else {
				div++;
			}
		}
	}
}

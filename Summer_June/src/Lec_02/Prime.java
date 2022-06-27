package Lec_02;

public class Prime {
	public static void main(String[] args) {
		int num = 97;
		int div = 1;
		int factor = 0;
		while (div <= num) {
			int rem = num % div;
			if (rem == 0) {
//				System.out.println(div);
				factor++;
			}
//			div = div +1;
			div++;
		}
//		System.out.println(factor);
		if(factor==2) {
			System.out.println("PRIME");
		}else {
			System.out.println("NOT PRIME");
		}

	}
}

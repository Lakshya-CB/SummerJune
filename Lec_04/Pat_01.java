package Lec_04;

public class Pat_01 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int tst = 1;
		while (row <= n) {

			int star = 0;
			while (star < tst) {
				System.out.print("*");
				star++;

			}
			row++;
			System.out.println();
			tst++;
		}
	}
}

package Lec_04;

public class Pat_02 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int tst = n; // total star in each row!!
		while (row <= n) {
//			
			int star = 0;
			while (star < tst) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			row++;
		}
	}
}

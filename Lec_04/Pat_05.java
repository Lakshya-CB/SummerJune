package Lec_04;

public class Pat_05 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int t_st = 1;
		int t_sp = n - 1;
		while (row <= n) {
			int space = 0;
			while (space < t_sp) {
				System.out.print(" ");
				space++;
			}
			int star = 0;
			while (star < t_st) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			row++;
			t_st++;
			t_sp--;
		}
	}
}

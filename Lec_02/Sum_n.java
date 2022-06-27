package Lec_02;

public class Sum_n {
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		int count = 1;
		while (count <= n) {
			sum = sum + count;
			count = count + 1;
		}
		System.out.println(sum);
	}
}

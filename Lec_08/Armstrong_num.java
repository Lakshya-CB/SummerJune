package Lec_08;

public class Armstrong_num {
	public static void main(String[] args) {
		printArmTill(1000);
	}

	public static void printArmTill(int num) {
		for (int i = 1; i <= num; i++) {
			if (isArm(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isArm(int n) {
		int nod = nod(n);
		int ans = 0;
		int copy = n;
		while (n > 0) {
			int digit = n % 10;
			ans = ans + (int) Math.pow(digit, nod);// digit^nod;
			n = n / 10;
		}
		if (ans == copy) {
			return true;
		} else {
			return false;
		}
	}

	public static int nod(int n) {
		int ans = 0;
		while (n > 0) {
			ans++;
			n = n / 10;
		}
		return ans;

	}
}

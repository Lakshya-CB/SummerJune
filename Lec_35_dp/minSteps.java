package Lec_35_dp;

public class minSteps {
	public static void main(String[] args) {

	}

	public static int sol(int n, int[] dp) {
		if (n == 1) {
			return 0;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		if (n % 2 == 0) {
			int curr = sol(n / 2, dp) + 1;
			dp[n] = curr;
			return dp[n];
		} else {
			int sp1 = 1 + sol(n + 1, dp);
			int sp2 = 1 + sol(n - 1, dp);
			dp[n] = Math.min(sp1, sp2);
			return Math.min(sp1, sp2);
		}
	}

	public static int BU(int num) {
		int[] dp = new int[num+1];
		for (int n = 2; n <= num; n++) {
//			dp[n]!!
			if (n % 2 == 0) {
				int curr = dp[n / 2] + 1;
				dp[n] = curr;

			} else {
				int sp1 = 1 + (dp[(n + 1) / 2] + 1);
//				int sp1 = 1 + dp[n + 1];
				
				int sp2 = 1 + dp[n - 1];
				dp[n] = Math.min(sp1, sp2);
			}
		}
		return dp[num];
	}

}

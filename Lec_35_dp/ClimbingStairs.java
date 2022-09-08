package Lec_35_dp;

public class ClimbingStairs {

	public int solve(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		int sp1 = solve(n - 1);
		int sp2 = solve(n - 2);
		return sp1 + sp2;

	}

	public int solveTD(int n, int[] dp) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		int sp1 = solveTD(n - 1, dp);
		int sp2 = solveTD(n - 2, dp);
		dp[n] = sp1 + sp2;
		return sp1 + sp2;

	}

	public static int solveBU(int Nth) {
		int[] dp = new int[Nth+1];
		dp[0] = 1;
		dp[1] = 1;
		for (int n = 2; n <= Nth; n++) {
//			dp[n]!!
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
			dp[n] = sp1 + sp2;
		}
		return dp[Nth];
	}
}

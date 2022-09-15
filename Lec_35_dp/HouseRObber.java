package Lec_37_DP;

public class HouseRObber {

	public static int rob(int[] arr, int idx) {
		if (idx >= arr.length) {
			return 0;
		}
		int sp1 = arr[idx] + rob(arr, idx + 2);
		int sp2 = rob(arr, idx + 1);
		return Math.max(sp1, sp2);
	}

	public static int robTD(int[] arr, int idx, Integer[] dp) {
		if (idx >= arr.length) {
			return 0;
		}
		if (dp[idx] != null) {
			return dp[idx];
		}
		int sp1 = arr[idx] + robTD(arr, idx + 2, dp);
		int sp2 = robTD(arr, idx + 1, dp);
		dp[idx] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public static int BU(int[] arr) {
		int[] dp = new int[arr.length+2];
		for (int idx = arr.length - 1; idx >= 0; idx--) {
//			dp[idx]!!
			int sp1 = arr[idx] + dp[idx + 2];
			int sp2 = dp[idx + 1];
			dp[idx] = Math.max(sp1, sp2);
		}
		return dp[0];
	}
}

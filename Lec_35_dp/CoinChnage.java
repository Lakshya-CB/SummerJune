package Lec_35_dp;

import java.util.Scanner;

public class CoinChnage {
	public static int sol(int[] coins, int A, int idx) {
		if (A == 0) {
			return 1;
		}
		if (idx == coins.length || A < 0) {
			return 0;
		}

		int sp1 = sol(coins, A - coins[idx], idx);
		int sp2 = sol(coins, A, idx + 1);
		return sp1 + sp2;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int S = scn.nextInt();
		int[] coins = new int[S];
		for (int i = 0; i < S; i++) {
			coins[i] = scn.nextInt();
		}
		System.out.println(sol(coins, A, 0, new Integer[A + 1][S]));

	}

	public static int sol(int[] coins, int A, int idx, Integer[][] dp) {
		if (A == 0) {
			return 1;
		}
		if (idx == coins.length || A < 0) {
			return 0;
		}
		if (dp[A][idx] != null) {
			return dp[A][idx];
		}
		int sp1 = sol(coins, A - coins[idx], idx, dp);
		int sp2 = sol(coins, A, idx + 1, dp);
		dp[A][idx] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int BU(int[] coins, int amount) {
		int[][] dp = new int[amount + 1][coins.length + 1];
		for (int A = 0; A <= amount; A++) {
			for (int idx = coins.length - 1; idx >= 0; idx--) {
//    			dp[A][idx]!!
				if (A == 0) {
					dp[A][idx] = 1;
					continue;
//					break;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[A - coins[idx]][idx];
				}
				int sp2 = dp[A][idx + 1];
				dp[A][idx] = sp1 + sp2;
			}
		}
		return dp[amount][0];
	}
}

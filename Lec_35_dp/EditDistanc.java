package Lec_37_DP;

public class EditDistanc {
	public static void main(String[] args) {
	}

	public int solve(String word1, String word2, int idx1, int idx2) {
		if (idx1 == word1.length() || idx2 == word2.length()) {
			int rem2 = word2.length() - idx2;
			int rem1 = word1.length() - idx1;
			return Math.max(rem2, rem1);
		}
		if (word1.charAt(idx1) == word2.charAt(idx2)) {
			return solve(word1, word2, idx1 + 1, idx2 + 1);
		} else {
			int Del = 1 + solve(word1, word2, idx1 + 1, idx2);
			int Rep = 1 + solve(word1, word2, idx1 + 1, idx2 + 1);
			int Ins = 1 + solve(word1, word2, idx1, idx2 + 1);
			return Math.min(Del, Math.min(Rep, Ins));
		}
	}

	public int solveTD(String word1, String word2, int idx1, int idx2, Integer[][] dp) {
		if (idx1 == word1.length() || idx2 == word2.length()) {
			int rem2 = word2.length() - idx2;
			int rem1 = word1.length() - idx1;
			return Math.max(rem2, rem1);
		}
		if (dp[idx1][idx2] != null) {
			return dp[idx1][idx2];
		}
		if (word1.charAt(idx1) == word2.charAt(idx2)) {
			dp[idx1][idx2] = solveTD(word1, word2, idx1 + 1, idx2 + 1, dp);
			return dp[idx1][idx2];
		} else {
			int Del = 1 + solveTD(word1, word2, idx1 + 1, idx2, dp);
			int Rep = 1 + solveTD(word1, word2, idx1 + 1, idx2 + 1, dp);
			int Ins = 1 + solveTD(word1, word2, idx1, idx2 + 1, dp);
			dp[idx1][idx2] = Math.min(Del, Math.min(Rep, Ins));
			return Math.min(Del, Math.min(Rep, Ins));
		}
	}

	public static int BU(String word1, String word2) {
		int[][] dp = new int[word1.length() + 1][word2.length() + 1];

		for (int idx1 = word1.length(); idx1 >= 0; idx1--) {
			for (int idx2 = word2.length(); idx2 >= 0; idx2--) {
//				dp[idx1][idx2]
				if (idx1 == word1.length() || idx2 == word2.length()) {
					int rem2 = word2.length() - idx2;
					int rem1 = word1.length() - idx1;
					dp[idx1][idx2] = Math.max(rem2, rem1);
					continue;
				}
				if (word1.charAt(idx1) == word2.charAt(idx2)) {
					dp[idx1][idx2] = dp[idx1 + 1][idx2 + 1];

				} else {
					int Del = 1 + dp[idx1 + 1][idx2];
					int Rep = 1 + dp[idx1 + 1][idx2 + 1];
					int Ins = 1 + dp[idx1][idx2 + 1];
					dp[idx1][idx2] = Math.min(Del, Math.min(Rep, Ins));
				}
			}
		}
		return dp[0][0];
	}

	public static int BUSE(String word1, String word2) {
		int[][] dp = new int[2][word2.length() + 1];

		for (int idx1 = word1.length(); idx1 >= 0; idx1--) {
			for (int idx2 = word2.length(); idx2 >= 0; idx2--) {
//				dp[idx1][idx2]
				if (idx1 == word1.length() || idx2 == word2.length()) {
					int rem2 = word2.length() - idx2;
					int rem1 = word1.length() - idx1;
					dp[0][idx2] = Math.max(rem2, rem1);
					continue;
				}
				if (word1.charAt(idx1) == word2.charAt(idx2)) {
					dp[0][idx2] = dp[1][idx2 + 1];

				} else {
					int Del = 1 + dp[1][idx2];
					int Rep = 1 + dp[1][idx2 + 1];
					int Ins = 1 + dp[0][idx2 + 1];
					dp[0][idx2] = Math.min(Del, Math.min(Rep, Ins));
				}
			}
			dp[1] = dp[0];
			dp[0] = new int[word2.length() + 1];

		}
		return dp[0][0];
	}
}
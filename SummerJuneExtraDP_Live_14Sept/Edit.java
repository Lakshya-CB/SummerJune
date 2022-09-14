package SummerJuneExtraDP_Live_14Sept;

public class Edit {
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
}

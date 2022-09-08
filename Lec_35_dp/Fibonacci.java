package Lec_35_dp;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 1000000;
		Integer[] dp = new Integer[n + 1];
		System.out.println(fib(n, dp));
		System.out.println(Arrays.toString(dp));
		System.out.println(fibBU(n));
//		ArrayList<Integer> AL = new ArrayList<>();
//		int[] arr = { 1,3,2,2,2,3,4,3,1 };
//		for (int ali : arr) {
//			AL.add(ali);
//		}
//		System.out.println(solve(AL));
	}

//	Top DOwn 
	public static int fib(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != null) {
			return dp[n];
		}
		int sp1 = fib(n - 1, dp);
		int sp2 = fib(n - 2, dp);
		dp[n] = sp1 + sp2;// memorization!!
		return sp1 + sp2;
	}

//	tabulation !! ya bottom up!!
	public static int fibBU(int nth) {
		int[] dp = new int[nth + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int n = 2; n <= nth; n++) {
//			fill ya create dp[n]
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
			dp[n] = sp1 + sp2;
		}
		return dp[nth];
	}

//	[1,3,2,2,2,2,2,2]
	public static int solve(ArrayList<Integer> AL) {
		if (AL.isEmpty()) {
			return 0;
		}
		int ans = 0;
		for (int i = 0; i < AL.size();) {
			int e = i;
			ArrayList<Integer> SP = new ArrayList<>(AL);

			while (e < AL.size() && AL.get(e) == AL.get(i)) {
				SP.remove(i);
				e++;
			}
//			System.out.println(SP + "--" + AL.get(i));
			int sp = (e - i) * (e - i) + solve(SP);
			ans = Math.max(ans, sp);
			i = e;
//			cutt off i to e-1, in the SP
		}
		return ans;
	}
}

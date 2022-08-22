package Lec_25;

public class Coin_denom {
	public static void main(String[] args) {
		int[] coins = { 3, 2, 1, 4, 5 };
		int A = 10;
//		solve(coins, 0, A, "");
		sovle(coins, 0, A, "");

	}

//wrt user
	public static void solve(int[] coins, int last, int A, String path) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0) {
			return;
		}
		for (int i = last; i < coins.length; i++) {
			solve(coins, i, A - coins[i], path + coins[i]);
		}
	}

//	wrt coin
	public static void sovle(int[] coins, int curr, int A, String path) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0 || curr == coins.length) {
			return;
		}
		sovle(coins, curr, A - coins[curr], path + coins[curr]);
		sovle(coins, curr + 1, A, path);
	}
}

package Lec_23;

public class words_parenth {
	public static void main(String[] args) {
		solve("asdsa(asdfas)asdaf", "", false);
	}

	public static void solve(String str, String solm, boolean st) {
		if (str.isEmpty()) {
			System.out.println(solm);
			return;
		}
		if (str.charAt(0) == '(') {
			solve(str.substring(1), solm, true);
		} else if (str.charAt(0) != '(' && st == false) {
			solve(str.substring(1), solm, st);
		} else if (st && str.charAt(0) != ')') {
			solve(str.substring(1), solm + str.charAt(0), st);
		} else if (st && str.charAt(0) == ')') {
			solve(str.substring(1), solm, false);
		}
	}
}

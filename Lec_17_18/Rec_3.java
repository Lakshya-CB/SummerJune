package Lec_17_18;

import java.util.ArrayList;
import java.util.List;

public class Rec_3 {
	public static void main(String[] args) {
//		CT(3, "");
//		SubSeq("abc","");
//		LKC("532", "");
		Gen(3, 3, "");
	}

	public static void CT(int n, String path) {
		if (n == 0) {
			System.out.println(path);
			return;
		}
//		BP (n, "")
		CT(n - 1, path + "H");
		CT(n - 1, path + "T");

	}

	public static void SubSeq(String word, String team) {
		if (word.isEmpty()) {
			System.out.println("```" + team);
			return;
		}
		char ch = word.charAt(0);
		SubSeq(word.substring(1), team + ch); // include
		SubSeq(word.substring(1), team + "-"); // exclude

	}

	public static void LKC(String digits, String path) {
		if (digits.isEmpty()) {
			System.out.println(path);
			return;
		}
		// 632 ,//_
		char ch = digits.charAt(0);// 6
		String ops = Options(ch); // mno
		for (int i = 0; i < ops.length(); i++) {
			LKC(digits.substring(1), path + ops.charAt(i));
		}

	}

	public static String Options(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {
			return "def";
		} else if (ch == '4') {
			return "ghi";
		} else if (ch == '5') {
			return "jkl";
		} else if (ch == '6') {
			return "mno";
		} else if (ch == '7') {
			return "pqrs";
		} else if (ch == '8') {
			return "tuv";
		} else if (ch == '9') {
			return "wxyz";
		} else {
			return "";
		}
	}

	public List<String> letterCombinations(String digits) {
		List<String> AL = new ArrayList<String>();
		LKC(digits, "", AL);
		return AL;

	}

	public static void LKC(String digits, String path, List<String> AL) {
		if (digits.isEmpty()) {
			// System.out.println(path);
			if (!path.isEmpty()) {
				AL.add(path);
			}
			return;
		}
		// 632 ,//_
		char ch = digits.charAt(0);// 6
		String ops = Options(ch); // mno
		for (int i = 0; i < ops.length(); i++) {
			LKC(digits.substring(1), path + ops.charAt(i), AL);
		}

	}

	public static void Gen(int op, int cl, String path) {
		if(op>cl) {
			return;
		}
		if (0 == cl && op == 0) {
			System.out.println(path);
			
		}
		if (op > 0) {
			Gen(op - 1, cl, path + "(");
		}
		if (cl > 0) {
			Gen(op, cl - 1, path + ")");

		}
	}

}

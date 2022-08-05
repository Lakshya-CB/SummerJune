package Lec_20;

public class Sudoku {
	public static void main(String[] args) {
		char[][] arr = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		solve(arr, 0, 0);
	}

	public static void solve(char[][] board, int r, int c) {
		if (c == 9) {
			r++;
			c = 0;
		}

		if (r == 9) {
			disp(board);
			return;
		}
		if (board[r][c] != '.') {
			solve(board, r, c + 1);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (isSafe(board, r, c, i)) {
					board[r][c] = (char) ('0' + i);
					solve(board, r, c + 1);
				}
			}
			board[r][c] = '.';
		}
	}

	private static boolean isSafe(char[][] board, int r, int c, int i) {
		// TODO Auto-generated method stub
		for (int R = 0; R < 9; R++) {
			if (board[R][c] == (char) ('0' + i)) {
				return false;
			}
		}
		for (int C = 0; C < 9; C++) {
			if (board[r][C] == (char) ('0' + i)) {
				return false;
			}
		}
		int boxr = r / 3;
		int boxc = c / 3;

		for (int R = boxr * 3; R < boxr * 3 + 3; R++) {
			for (int C = boxc * 3; C < boxc * 3 + 3; C++) {
				if (board[R][C] == (char) ('0' + i)) {
					return false;
				}
			}
		}

		return true;
	}

	public static void disp(char[][] board) {
		for (char[] row : board) {
			System.out.println(row);
		}
		System.out.println("=========");
	}
}

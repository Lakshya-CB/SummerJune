package Lec_20;

public class Maze {
	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		MazePath(0, 0, "", arr, new boolean[arr.length][arr[0].length]);
	}

	public static void MazePath(int r, int c, String path, int[][] board, boolean[][] visited) {
		if (r == board.length - 1 && c == board[0].length - 1) {
			System.out.println(path);
			return;
		}
//		if (board[r][c]==1||r<0||c<0||r == board.length || c== board[0].length) {

		if (r < 0 || c < 0 || r == board.length || c == board[0].length || board[r][c] == 1 || visited[r][c]) {
			return;
		}
		visited[r][c] = true;
		MazePath(r - 1, c, path + "U", board, visited);
		MazePath(r + 1, c, path + "D", board, visited);

		MazePath(r, c + 1, path + "R", board, visited);
		MazePath(r, c - 1, path + "L", board, visited);
		visited[r][c] = false;
	}
}

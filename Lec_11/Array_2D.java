package Lec_11;

public class Array_2D {
	public static void main(String[] args) {
		int[][] mat = new int[3][4];
		System.out.println(mat);
		System.out.println(mat.length);
		System.out.println(mat[0]);
		System.out.println(mat[1]);
		System.out.println(mat[2]);

		System.out.println(mat[0].length);
		for (int[] row : mat) {
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
		System.out.println("=====");
		int num = 1;
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[r].length; c++) {
				mat[r][c] = num;
				num++;
//				System.out.print(mat[r][c] + " ");
			}
//			System.out.println();
		}
		for (int[] row : mat) {
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
	}
}

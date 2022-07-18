package Lec_11;

public class Array_2D_Q {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
//		neche_print(arr);
		zig_zag(arr);
	}

	public static void neche_print(int[][] mat) {

		for (int c = 0; c < mat[0].length; c++) {
			for (int r = 0; r < mat.length; r++) {
				System.out.print(mat[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static void zig_zag(int[][] mat) {

		for (int c = 0; c < mat[0].length; c++) {
			for (int r = 0; r < mat.length; r++) {
				if (c % 2 == 0) {
					System.out.print(mat[r][c] + " ");
				}else {
					int rtp = mat.length-1-r;
					System.out.print(mat[rtp][c] + " ");
		
				}
				
			}
			System.out.println();
		}
	}
}

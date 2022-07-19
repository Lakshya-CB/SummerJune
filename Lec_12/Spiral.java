package Lec_12;

public class Spiral {
	public static void main(String[] args) {
		int[][] mat = { { 11, 12, 13, 14 } };
		int minr = 0;
		int maxr = mat.length - 1;
		int minc = 0;
		int maxc = mat[0].length - 1;
		int count = 0;
		int pro = mat.length * mat[0].length;

		while (minr <= maxr && minc <= maxc) {
			for (int r = minr; r <= maxr && pro > count ; r++) {
				System.out.print(mat[r][minc] + " ");
				count++;

			}
			System.out.println();
			for (int c = minc + 1; c <= maxc && pro > count; c++) {
				System.out.print(mat[maxr][c] + " ");
				count++;

			}

			System.out.println();
			for (int r = maxr - 1; r >= minr && pro > count; r--) {
				System.out.print(mat[r][maxc] + " ");
				count++;

			}

			System.out.println();
			for (int c = maxc - 1; c >= minc + 1 && pro > count; c--) {
				System.out.print(mat[minr][c] + " ");
				count++;

			}
			System.out.println();
			minr++;
			minc++;
			maxr--;
			maxc--;
			System.out.println("opopopoop");
		}
	}
}

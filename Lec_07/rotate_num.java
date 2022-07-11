package Lec_07;

public class rotate_num {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 40000001;

		int copy = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = copy;
		rot = rot % nod;
		for (int r = 1; r <= rot; r++) {
			int digit = num % 10;
			int remain = num / 10;

//			System.out.println(nod + " , " + digit + " , " + remain);

			int mult = (int) Math.pow(10, nod - 1);
			num = mult * digit + remain;
			System.out.println(num);
		}
	}
}

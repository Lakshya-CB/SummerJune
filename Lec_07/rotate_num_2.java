package Lec_07;

public class rotate_num_2 {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 3;

		int copy = num;//12345
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = copy; //12345
		rot = rot % nod; //3

		int div = (int) Math.pow(10, rot);//1000
		int P1 = num / div; //12
		int P2 = num % div; //345

//		System.out.println(P1 + " , " + P2);
		int mult = (int) Math.pow(10, nod - rot);//100
		System.out.println(P2 * mult + P1);
	}
}

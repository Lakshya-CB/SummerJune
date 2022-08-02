package Lec_17;

public class Rec_2 {
	public static void main(String[] args) {
		int ans = Pow(2, 3);
		System.out.println(ans);
	}

	public static int Pow(int x, int a) {
		if(a==0) {
			return 1;
		}
		int sp = Pow(x, a - 1);
		return x * sp;
	}
}

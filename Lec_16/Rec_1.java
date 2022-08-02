package Lec_16;

public class Rec_1 {
	public static void main(String[] args) {
//		PD(4);
//		PDI(3);
//		PID(1,4);
//		int soln = Fac(4);
//		System.out.println(soln);
		System.out.println(Fib(4));
	}

	public static void PD(int n) {
		if (n == 0) {
			return;
		}
//		BP : PD(n)
//		SP : PD(n-1)
		System.out.println(n);
		PD(n - 1);
	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
//		BP : PDI(n)
//		SP : PDI(n-1)
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PID(int s, int e) {
		if (s > e) {
			return;
		}
//		BP : PID(s,e)
//		SP : PID(s+1,e)
		System.out.println(s);
		PID(s + 1, e);
		System.out.println(s);
	}

	public static int Fac(int n) {
		if (n == 0) {
			return 1;
		}
//		BP : Fac(n)
//		SP : Fac(n-1)
		int sp = Fac(n - 1);
		return sp * n;
	}

	public static int Fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
//		BP :  Fib(n)
//		SP :  Fib(n-1) Fib(n-2)
		int sp1 = Fib(n - 1);
		int sp2 = Fib(n - 2);
		return sp1 + sp2;

	}
}

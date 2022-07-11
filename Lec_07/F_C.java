package Lec_07;

public class F_C {
	public static void main(String[] args) {
		int min_F = 0;
		int max_F = 100;
		int step = 20;
//	int F = min_F; // Initialization
//	while(F<=max_F) { // condition
//		
//		F=F+step;// update
//	}
		for (int F = min_F; F <= max_F; F = F + step) {
			int C = 5*(F-32)/9;
			System.out.println(F+"\t"+C);
		}
	}
}

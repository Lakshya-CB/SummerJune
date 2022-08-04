package Lec_19;

public class Permutation {
	public static void main(String[] args) {
//		QueenPerm(3, 2, "", new boolean[3]);
		QueenComb(3, -1, 2, "");
	}

	public static void QueenPerm(int total_seats, int Q_tp, String path, boolean[] seats) {
		if (Q_tp == 0) {
			System.out.println(path);
			return;
		}
		for (int s = 0; s < total_seats; s++) {
//		place current queen at index s
			if (!seats[s]) {
				seats[s] = true; // prep
				QueenPerm(total_seats, Q_tp - 1, path + "b" + s, seats);
				seats[s] = false; // undo
			}
		}
	}
//	wrt Queen
	public static void QueenComb(int total_seats, int last,int Q_tp, String path) {
		if(Q_tp==0) {
			System.out.println(path);
			return;
		}
		for(int i=last+1;i<total_seats;i++) {
//			place wueen at ith index!!
			QueenComb(total_seats, i, Q_tp-1, path+"b"+i);
		}
	}
}

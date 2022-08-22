package Lec_25;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		System.out.println(Q);
		revPrint(Q, 0);
		System.out.println(Q);
		System.out.println("--==--=-=-=-=-=-=-");
		int[] arr = { -20, 10, -5, 4, 6, -9, -80, 60, 50 };
		firstNegWinK(arr, 3);
	}

	public static void revPrint(Queue<Integer> Q, int count) {
		if (count == Q.size()) {
			return;
		}
		int temp = Q.poll();
		Q.add(temp);

		revPrint(Q, count + 1);
		System.out.println(temp);
	}

	public static void firstNegWinK(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<>();

		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
		}
		System.out.println(arr[Q.peek()]);
		for(int s =1;s<=arr.length-k;s++) {
			int last = s+k-1;
			if(arr[last]<0) {
				Q.add(last);
			}
			if(Q.peek()==s-1) {
				Q.poll();
			}
			System.out.println(arr[Q.peek()]);
		}
	}
}

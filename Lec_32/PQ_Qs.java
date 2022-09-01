package Lec_32;

import java.util.PriorityQueue;

public class PQ_Qs {
	public static void main(String[] args) {
		int[] arr = { 20, 30, 60, 50, 10, 55, 57, 40 };
		kLargest(arr, 3);

	}
	public static void kLargest(int[] arr, int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for(int ali : arr) {
			PQ.add(ali);
			if(PQ.size()==k+1) {
				PQ.poll();
			}
		}
		System.out.println(PQ);
	}
}

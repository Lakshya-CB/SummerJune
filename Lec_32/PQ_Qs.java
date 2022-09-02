package Lec_32;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_Qs {
	public static void main(String[] args) {
//		int[] arr = { 20, 30, 60, 50, 10, 55, 57, 40 };
//		kLargest(arr, 3);
		int[][] arr = {{10,20,30}, {15,35}, {5,7,12,25} , {17, 22, 40}};
		mergeKSroted(arr);
	}

	public static void kLargest(int[] arr, int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for (int ali : arr) {
			PQ.add(ali);// log(k)
			if (PQ.size() == k + 1) {
				PQ.poll();// log(k)
			}
		}
		System.out.println(PQ);
	}

	static class pair {
		public pair(int da, int arr, int ali) {
			// TODO Auto-generated constructor stub
			data = da;
			arr_idx = arr;
			ali_idx = ali;
		}

		int data;
		int arr_idx;
		int ali_idx;
//		@Override
//		public int compareTo(pair o) {
//			// TODO Auto-generated method stub
//			return this.data -o.data;
//		}
	}
	static class com implements Comparator<pair>{

		@Override
		public int compare(pair o1, pair o2) {
			// TODO Auto-generated method stub
			return o1.data-o2.data;
		}
		
	}

	public static void mergeKSroted(int[][] mat) {
		PriorityQueue<pair> PQ = new PriorityQueue<>(new com());
		for (int i = 0; i < mat.length; i++) {
			PQ.add(new pair(mat[i][0], i, 0));
		}
		ArrayList<Integer> AL = new ArrayList<>();
		while(!PQ.isEmpty()) {
			pair curr = PQ.poll();
			AL.add(curr.data);
//			PQ.add
			curr.ali_idx =curr.ali_idx+1;
			if(curr.ali_idx<mat[curr.arr_idx].length) {
				curr.data = mat[curr.arr_idx][curr.ali_idx];
				PQ.add(curr);
			}
		}
		System.out.println(AL);
	}
}

package Lec_21;

import java.util.Arrays;

public class Quick_sort {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
		QuickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void QuickSort(int[] arr, int s, int e) {

//		System.out.println(s+" "+e);
		if (s >= e) {
			return;
		}
		int mid = (s + e) / 2;
		int pivot = arr[mid];
		int L = s;
		int R = e;

		while (L <= R) {
			while (arr[L] < pivot) {
				L++;
			}
			while (arr[R] > pivot) {
				R--;
			}
			if (L <= R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				L++;
				R--;
			}
		}
		QuickSort(arr, s, R);
		QuickSort(arr, L, e);
	}
}

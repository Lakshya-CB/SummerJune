package Lec_11;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = { 420, 20, 10, 1000, 17, 88 };
		System.out.println(Arrays.toString(arr));
//		bubble(arr);
		Insertion(arr);
//		System.out.println(Arrays.toString(arr));

	}

	public static void bubble(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
			for (int s = 0; s <= arr.length - 2; s++) {
//			S ad S+1
				if (arr[s] > arr[s + 1]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
		}
	}

	public static void selection(int[] arr) {
		for (int last = arr.length - 1; last >= 1; last--) {
			int max_idx = 0;
			// {50,40,30,20,10}
			for (int i = 0; i <= last; i++) {
				if (arr[max_idx] < arr[i]) {
					max_idx = i;
				}
			}

			int temp = arr[max_idx];
			arr[max_idx] = arr[last];
			arr[last] = temp;
		}
	}

	public static void Insertion(int[] arr) {
		for (int last = 1; last < arr.length; last++) {
			// int last = -1 + arr.length;
			int ali = arr[last];
			int idx = last - 1;
//			while (arr[idx] > ali && idx >= 0) {
			while (idx >= 0 && arr[idx] > ali) {
				arr[idx + 1] = arr[idx];
				idx--;
			}

//			System.out.println(Arrays.toString(arr));
			arr[idx + 1] = ali;
//			System.out.println(Arrays.toString(arr));
//			System.out.println("=========");
		}

	}
}

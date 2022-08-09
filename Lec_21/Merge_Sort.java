package Lec_21;

import java.util.Arrays;

public class Merge_Sort {
	public static void main(String[] args) {
//		int[] arr1 = { 10, 30, 50, 80, 100 };
//		int[] arr2 = { 15, 20, 25, 40, 90 };
		int[] arr = { 50, 40, 30, 20, 10 };
		System.out.println(Arrays.toString(MergeSort(arr, 0, arr.length-1)));
	}

	public static int[] MergeSort(int[] arr, int s, int e) {
		if(s==e) {
			int ans[] = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s + e) / 2;
		int[] sp1 = MergeSort(arr, s, mid);
		int[] sp2 = MergeSort(arr, mid + 1, e);
		return Merge(sp1, sp2);
	}

	public static int[] Merge(int[] arr1, int[] arr2) {
		int i1 = 0;
		int i2 = 0;
		int[] ans = new int[arr1.length + arr2.length];
		int iA = 0;
		while (i1 < arr1.length && i2 < arr2.length) {
			if (arr1[i1] <= arr2[i2]) {
				ans[iA] = arr1[i1];
				i1++;
				iA++;
			} else {
				ans[iA] = arr2[i2];
				i2++;
				iA++;
			}
		}
		while (i1 < arr1.length) {
			ans[iA] = arr1[i1];
			i1++;
			iA++;
		}
		while (i2 < arr2.length) {
			ans[iA] = arr2[i2];
			i2++;
			iA++;
		}
		return ans;
	}
}
